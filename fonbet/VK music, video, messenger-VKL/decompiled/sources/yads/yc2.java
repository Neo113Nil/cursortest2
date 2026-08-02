package yads;

import android.os.SystemClock;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class yc2 implements Runnable {
    public final /* synthetic */ ad2 b;

    public yc2(ad2 ad2Var) {
        this.b = ad2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad2 ad2Var = this.b;
        ad2Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - ad2Var.h;
        ad2Var.h = elapsedRealtime;
        long j2 = ad2Var.f - j;
        ad2Var.f = j2;
        long max = (long) Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, j2);
        a83 a83Var = ad2Var.e;
        if (a83Var != null) {
            a83Var.a(max, ad2Var.g - max);
        }
        this.b.c();
    }
}
