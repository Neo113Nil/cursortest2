package org.chromium.base.task;

import org.chromium.base.ThreadUtils;

/* loaded from: classes8.dex */
public class UiThreadTaskRunnerImpl extends TaskRunnerImpl implements SequencedTaskRunner {
    public UiThreadTaskRunnerImpl(int i) {
        super(i, "UiThreadTaskRunner", 2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public boolean schedulePreNativeDelayedTask(Runnable runnable, long j) {
        if (!PostTask.canRunUiTaskBeforeNativeInit(this.mTaskTraits)) {
            return false;
        }
        ThreadUtils.getUiThreadHandler().postDelayed(runnable, j);
        return true;
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        if (PostTask.canRunUiTaskBeforeNativeInit(this.mTaskTraits)) {
            ThreadUtils.getUiThreadHandler().post(this.mRunPreNativeTaskClosure);
        }
    }
}
