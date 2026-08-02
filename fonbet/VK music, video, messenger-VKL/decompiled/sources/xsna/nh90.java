package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.TaskExecutorType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nh90 implements wzs {
    public final /* synthetic */ ParallelTaskRunner b;
    public final /* synthetic */ TaskExecutorType c;

    public /* synthetic */ nh90(ParallelTaskRunner parallelTaskRunner, TaskExecutorType taskExecutorType) {
        this.b = parallelTaskRunner;
        this.c = taskExecutorType;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ParallelTaskRunner parallelTaskRunner = this.b;
        return !booleanValue ? parallelTaskRunner.l : new kh90(intValue, parallelTaskRunner.k, parallelTaskRunner.d, this.c);
    }
}
