package yads;

import android.os.Handler;
import android.os.SystemClock;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.xqc;

/* loaded from: classes10.dex */
public final class ad2 implements xc2 {
    public final boolean a;
    public final Handler b;
    public zc2 c = zc2.b;
    public bd2 d;
    public a83 e;
    public long f;
    public long g;
    public long h;

    public ad2(boolean z, Handler handler) {
        this.a = z;
        this.b = handler;
    }

    public final void a(long j, bd2 bd2Var) {
        a();
        this.d = bd2Var;
        this.f = j;
        this.g = j;
        if (this.a) {
            this.b.post(new xqc(this, 16));
        } else {
            c();
        }
    }

    public final void b() {
        if (zc2.c == this.c) {
            this.c = zc2.d;
            this.b.removeCallbacksAndMessages(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.h;
            this.h = elapsedRealtime;
            long j2 = this.f - j;
            this.f = j2;
            long max = (long) Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, j2);
            a83 a83Var = this.e;
            if (a83Var != null) {
                a83Var.a(max, this.g - max);
            }
        }
    }

    public final void c() {
        this.c = zc2.c;
        this.h = SystemClock.elapsedRealtime();
        long min = (long) Math.min(200.0d, this.f);
        if (min > 0) {
            this.b.postDelayed(new yc2(this), min);
            return;
        }
        bd2 bd2Var = this.d;
        if (bd2Var != null) {
            bd2Var.a();
        }
        a();
    }

    public final void d() {
        if (zc2.d == this.c) {
            c();
        }
    }

    public static final void a(ad2 ad2Var) {
        ad2Var.c();
    }

    public final void a() {
        zc2 zc2Var = zc2.b;
        if (zc2Var == this.c) {
            return;
        }
        this.c = zc2Var;
        this.d = null;
        this.b.removeCallbacksAndMessages(null);
    }
}
