package com.laozhao.swaggerui.swaggeruidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value={"/","hello"},method= RequestMethod.GET)
    public String hello(String  name){
        return "hello :"+name;
    }
}
