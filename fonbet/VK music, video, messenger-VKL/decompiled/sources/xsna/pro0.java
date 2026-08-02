package xsna;

import com.vk.core.apps.BuildInfo;

/* compiled from: ThreadUtils.kt */
@ozl
/* loaded from: classes.dex */
public final class pro0 {
    public static final void a() {
        if (i0q0.b()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not a UI-thread " + Thread.currentThread().getName());
        if (BuildInfo.h()) {
            com.vk.metrics.eventtracking.b.a.q(illegalStateException);
        }
    }

    public static final void b() {
        if (i0q0.b()) {
            IllegalStateException illegalStateException = new IllegalStateException("Ui thread");
            if (BuildInfo.h()) {
                com.vk.metrics.eventtracking.b.a.q(illegalStateException);
            }
        }
    }

    public static final void c(Runnable runnable) {
        i0q0.d(0L, runnable);
    }

    public static final void d(Runnable runnable) {
        if (runnable != null) {
            i0q0.g(runnable);
        }
    }

    public static final void e(Runnable runnable) {
        i0q0.i(0L, runnable);
    }

    public static final void f(gzs<s3q0> gzsVar) {
        i0q0.i(0L, new tnf(gzsVar, 12));
    }
}
