package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.core.util.parallelrunner.stat.tacker.TaskExecutorType;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ParallelTaskExecutionTracker.kt */
/* loaded from: classes.dex */
public final class kh90 implements k5o0 {
    public final j5o0 a;
    public final boolean b;
    public final TaskExecutorType c;
    public final AtomicLong d;

    public kh90(int i, j5o0 j5o0Var, boolean z, TaskExecutorType taskExecutorType) {
        int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) - 1;
        this.a = j5o0Var;
        this.b = z;
        this.c = taskExecutorType;
        this.d = new AtomicLong(i > availableProcessors ? 5000 * availableProcessors : 5000L);
    }

    @Override // xsna.k5o0
    public final void a(ParallelTaskRunner.f fVar, RunStep runStep) {
        if (!this.b) {
            fVar.run();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        fVar.run();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long addAndGet = this.d.addAndGet(-currentTimeMillis2);
        if (currentTimeMillis2 < 20) {
            return;
        }
        String name = fVar.getName();
        this.a.b.put(name, new i5o0((int) currentTimeMillis2, name, (int) addAndGet, runStep.h(), "parallel", this.c.h()));
    }
}
