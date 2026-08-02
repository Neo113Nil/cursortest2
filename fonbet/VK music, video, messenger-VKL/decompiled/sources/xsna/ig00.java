package xsna;

import android.os.Trace;
import com.ironsource.X3;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.core.util.parallelrunner.stat.tacker.TaskExecutorType;

/* compiled from: MainThreadTaskExecutionTracker.kt */
/* loaded from: classes.dex */
public final class ig00 implements k5o0 {
    public final j5o0 a;

    public ig00(j5o0 j5o0Var) {
        this.a = j5o0Var;
    }

    @Override // xsna.k5o0
    public final void a(ParallelTaskRunner.f fVar, RunStep runStep) {
        boolean e = ndp0.e();
        if (e) {
            ndp0.b("ParallelTaskRunner " + fVar.getName());
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            fVar.run();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 < 10) {
                if (e) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            j5o0 j5o0Var = this.a;
            String name = fVar.getName();
            j5o0Var.b.put(name, new i5o0((int) currentTimeMillis2, name, (int) (5000 - currentTimeMillis2), runStep.h(), X3.i.Z, TaskExecutorType.SEQUENTIAL.h()));
            s3q0 s3q0Var = s3q0.a;
            if (e) {
                Trace.endSection();
            }
        } finally {
        }
    }
}
