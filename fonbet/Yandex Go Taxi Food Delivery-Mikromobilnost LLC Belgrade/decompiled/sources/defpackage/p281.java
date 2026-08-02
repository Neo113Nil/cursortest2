package defpackage;

import android.os.SystemClock;
import android.view.View;
import yads.ve3;

/* loaded from: classes7.dex */
public final class p281 implements z971, bg71 {
    public final js81 a;
    public final hv81 b;
    public final i971 c;
    public final aj31 d;
    public Long e;
    public boolean f;

    public p281(i581 i581Var, i971 i971Var, js81 js81Var, hv81 hv81Var, i971 i971Var2) {
        aj31 aj31Var = new aj31(28, i971Var);
        this.a = js81Var;
        this.b = hv81Var;
        this.c = i971Var2;
        this.d = aj31Var;
    }

    @Override // defpackage.bg71
    public final void a() {
        this.e = null;
    }

    @Override // defpackage.bg71
    public final void b() {
        this.e = null;
    }

    @Override // defpackage.z971
    public final void c(long j, long j2) {
        hlx0 hlx0Var = (hlx0) this.c.b;
        if (this.f) {
            return;
        }
        View d = ((yp61) ((i971) this.d.b).b).d();
        zy11 zy11Var = null;
        if (d != null && !sj71.e(d) && sj71.b(d) >= 50) {
            js81 js81Var = this.a;
            if (((ve3) js81Var.b.getValue(js81Var, js81.c[0])) == ve3.e) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l = this.e;
                if (l != null) {
                    if (elapsedRealtime - l.longValue() >= 2000) {
                        this.f = true;
                        ((bl61) hlx0Var.c).h();
                        this.b.q();
                    }
                    zy11Var = zy11.a;
                }
                if (zy11Var == null) {
                    this.e = Long.valueOf(elapsedRealtime);
                    ((bl61) hlx0Var.c).d();
                    return;
                }
                return;
            }
        }
        this.e = null;
    }
}
