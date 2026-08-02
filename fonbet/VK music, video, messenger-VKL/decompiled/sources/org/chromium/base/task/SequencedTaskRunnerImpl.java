package org.chromium.base.task;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public class SequencedTaskRunnerImpl extends TaskRunnerImpl implements SequencedTaskRunner {
    private final AtomicInteger mPendingTasks;
    private volatile boolean mReadyToCreateNativeTaskRunner;

    public SequencedTaskRunnerImpl(int i) {
        super(i, "SequencedTaskRunnerImpl", 1);
        this.mPendingTasks = new AtomicInteger();
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void initNativeTaskRunner() {
        this.mReadyToCreateNativeTaskRunner = true;
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.initNativeTaskRunner();
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void runPreNativeTask() {
        super.runPreNativeTask();
        if (this.mPendingTasks.decrementAndGet() > 0) {
            if (this.mReadyToCreateNativeTaskRunner) {
                super.initNativeTaskRunner();
            } else {
                super.schedulePreNativeTask();
            }
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.schedulePreNativeTask();
        }
    }
}
