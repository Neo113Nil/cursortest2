package xsna;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: IdleTaskHandler.kt */
/* loaded from: classes.dex */
public final class wvv {
    public static final wvv a = new wvv();
    public static final rvv b = new rvv(1000);

    public static void a(Runnable runnable) {
        rvv rvvVar = b;
        rvvVar.d.remove(runnable);
        rvvVar.c.removeCallbacksAndMessages(runnable);
    }

    public static void b(wvv wvvVar, Runnable runnable, long j, long j2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = 1000;
        }
        rvv rvvVar = b;
        rvvVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        Handler handler = rvvVar.c;
        handler.postAtTime(new ovv(rvvVar, runnable), runnable, uptimeMillis);
        handler.postAtTime(new qvv(rvvVar, runnable), runnable, uptimeMillis + j2);
    }
}
