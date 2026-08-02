package xsna;

import com.vk.core.util.parallelrunner.stat.tacker.TaskExecutorType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

/* compiled from: ParallelTaskExecutorFactory.kt */
/* loaded from: classes.dex */
public final class mh90 implements wzs<Boolean, Boolean, lh90> {
    public final nh90 b;
    public final izs<Boolean, ForkJoinPool> c;
    public final izs<Boolean, ExecutorService> d;
    public final TaskExecutorType e;

    public mh90(nh90 nh90Var, v1w v1wVar, o8r o8rVar, TaskExecutorType taskExecutorType) {
        this.b = nh90Var;
        this.c = v1wVar;
        this.d = o8rVar;
        this.e = taskExecutorType;
    }

    public final lh90 a(boolean z, boolean z2) {
        nh90 nh90Var = this.b;
        return !z ? new vli0(nh90Var) : this.e == TaskExecutorType.FORK_JOIN_PRIORITY ? new b8s(nh90Var, this.c.invoke(Boolean.valueOf(z2))) : new rbd0(nh90Var, this.d.invoke(Boolean.valueOf(z2)));
    }

    @Override // xsna.wzs
    public final /* bridge */ /* synthetic */ lh90 invoke(Boolean bool, Boolean bool2) {
        return a(bool.booleanValue(), bool2.booleanValue());
    }
}
