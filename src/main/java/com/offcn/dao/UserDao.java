package com.offcn.dao;

import com.offcn.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void save(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    public void update(User user);

    @Delete("delete from user where id=#{id}")
    public void delete(Long id);

    @Select("select * from user")
    public List<User> getAll();

    @Select("select * from user where id=#{id}")
    public User findOne(Long id);

}
