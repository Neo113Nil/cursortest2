package xsna;

import androidx.work.DirectExecutor;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WorkerWrapper.kt */
/* loaded from: classes.dex */
public final class bzx0 {
    public static final String a = m100.d("WorkerWrapper");

    public static final Object a(ugz ugzVar, androidx.work.b bVar, SuspendLambda suspendLambda) {
        V v;
        try {
            if (!ugzVar.isDone()) {
                lq9 lq9Var = new lq9(1, s7s0.c(suspendLambda));
                lq9Var.o();
                ugzVar.addListener(new c0p0(ugzVar, lq9Var), DirectExecutor.INSTANCE);
                lq9Var.r(new azx0(bVar, ugzVar));
                Object n = lq9Var.n();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return n;
            }
            boolean z = false;
            while (true) {
                try {
                    v = ugzVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return v;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
