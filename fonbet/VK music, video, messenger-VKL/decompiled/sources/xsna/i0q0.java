package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: UiThreadUtils.kt */
/* loaded from: classes.dex */
public final class i0q0 {
    public static final bpn0 a = new bpn0(new sw1(17));

    public static final Handler a() {
        return (Handler) a.getValue();
    }

    public static final boolean b() {
        return epx.f(Looper.getMainLooper(), Looper.myLooper());
    }

    public static final void c(RuntimeException runtimeException) {
        d(0L, new n52(runtimeException, 16));
    }

    public static final void d(long j, Runnable runnable) {
        a().postDelayed(runnable, j);
    }

    public static final void e(Runnable runnable) {
        a().post(runnable);
    }

    public static final void f(gzs<s3q0> gzsVar) {
        a().post(new em80(gzsVar, 1));
    }

    public static final void g(Runnable runnable) {
        a().removeCallbacks(runnable);
    }

    public static final void h(Runnable runnable) {
        a().removeCallbacksAndMessages(runnable);
    }

    public static final void i(long j, Runnable runnable) {
        if (epx.f(Looper.myLooper(), Looper.getMainLooper()) && j == 0) {
            runnable.run();
        } else {
            a().postDelayed(runnable, j);
        }
    }

    public static final void j(Runnable runnable) {
        i(0L, runnable);
    }
}
