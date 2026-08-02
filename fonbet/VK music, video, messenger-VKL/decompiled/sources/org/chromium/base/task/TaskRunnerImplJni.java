package org.chromium.base.task;

import internal.J.N;
import org.chromium.base.task.TaskRunnerImpl;
import xsna.dyx;

/* loaded from: classes8.dex */
class TaskRunnerImplJni implements TaskRunnerImpl.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static TaskRunnerImpl.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new TaskRunnerImplJni() : (TaskRunnerImpl.Natives) obj;
    }

    public static void setInstanceForTesting(TaskRunnerImpl.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void destroy(long j) {
        N.MERCiIV8(j);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public long init(int i, int i2) {
        return N.M5_IQXaH(i, i2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void postDelayedTask(long j, long j2, int i) {
        N.MGnQU$47(j, j2, i);
    }
}
