package com.zheng.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhenglian on 2016/10/9.
 */
public class TaskServiceTest extends BaseServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    public void testTask() throws Exception {
        taskService.doTaskOne();
        taskService.doTaskTwo();
        taskService.doTaskThree();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
