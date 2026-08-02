package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ThreadUtils.kt */
/* loaded from: classes15.dex */
public final class oro0 {
    public static final bpn0 a = new bpn0(new o2a0(12));

    public static void a(Runnable runnable) {
        if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            ((Handler) a.getValue()).post(runnable);
        }
    }
}
