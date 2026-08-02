package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import yads.ja2;

/* loaded from: classes7.dex */
public final class gm71 {
    public final boolean a;
    public final Handler b;
    public ja2 c = ja2.b;
    public ap71 d;
    public long e;
    public long f;
    public long g;

    public gm71(boolean z, Handler handler) {
        this.a = z;
        this.b = handler;
    }

    public final void a() {
        ja2 ja2Var = ja2.b;
        if (ja2Var == this.c) {
            return;
        }
        this.c = ja2Var;
        this.d = null;
        this.b.removeCallbacksAndMessages(null);
    }

    public final void b(long j, ap71 ap71Var) {
        a();
        this.d = ap71Var;
        this.e = j;
        this.f = j;
        if (!this.a) {
            c();
        } else {
            this.b.post(new jy31(25, this));
        }
    }

    public final void c() {
        this.c = ja2.c;
        this.g = SystemClock.elapsedRealtime();
        long min = (long) Math.min(200.0d, this.e);
        if (min > 0) {
            this.b.postDelayed(new h3s0(11, this), min);
        } else {
            ap71 ap71Var = this.d;
            if (ap71Var != null) {
                ap71Var.a();
            }
            a();
        }
    }
}
