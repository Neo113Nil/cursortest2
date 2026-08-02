package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SetupUncaughtExceptionHandlerTaskLogic.kt */
/* loaded from: classes11.dex */
public final class d4j0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "ThreadUncaught";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        nbr0 nbr0Var = new nbr0();
        AtomicBoolean atomicBoolean = d4k.a;
        d4k.a(nbr0Var);
        return s3q0.a;
    }
}
