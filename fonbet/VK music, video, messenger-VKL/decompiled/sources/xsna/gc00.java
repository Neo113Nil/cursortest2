package xsna;

import xsna.ic00;
import xsna.ywo0;

/* compiled from: MagnetController.kt */
/* loaded from: classes18.dex */
public final class gc00 {
    public final dck0 a;
    public final bpn0 b = new bpn0(new xyh(this, 27));
    public final bpn0 c = new bpn0(new p6y(this, 5));
    public final hc00 d;
    public ic00 e;

    public gc00(dck0 dck0Var, vd7 vd7Var) {
        this.a = dck0Var;
        this.d = new hc00(vd7Var);
    }

    public final void a(gp6 gp6Var) {
        ic00 b = b(gp6Var);
        if (b == null) {
            return;
        }
        gp6Var.B().set(b.c);
    }

    public final ic00 b(gp6 gp6Var) {
        float f;
        ic00 ic00Var = this.e;
        ic00 ic00Var2 = epx.f(ic00Var != null ? ic00Var.a : null, gp6Var.m()) ? this.e : null;
        jc00 c = c();
        if (c == null) {
            return null;
        }
        ic00 a = c.a(gp6Var);
        this.e = a;
        float q = gp6Var.q();
        hc00 hc00Var = this.d;
        vd7 vd7Var = hc00Var.a;
        if (ic00Var2 == null) {
            hc00Var.b = null;
            vd7Var.e();
            return a;
        }
        if (ic00Var2.b != a.b) {
            hc00Var.b = null;
            vd7Var.e();
            return a;
        }
        if (!ic00Var2.e.equals(a.e)) {
            hc00Var.b = null;
            vd7Var.e();
            return a;
        }
        Float f2 = hc00Var.b;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            hc00Var.b = Float.valueOf(q);
            f = q;
        }
        if (Math.abs(f - q) > hc00.c) {
            hc00Var.b = Float.valueOf(q);
            vd7Var.e();
        }
        return a;
    }

    public final jc00 c() {
        ywo0.b bVar = ((mwo0) this.a.c).d.n;
        if (bVar instanceof ywo0.b.a) {
            return (kc00) this.b.getValue();
        }
        if (bVar instanceof ywo0.b.C4142b) {
            return (lc00) this.c.getValue();
        }
        return null;
    }

    public final ic00.a d(gp6 gp6Var, boolean z) {
        if (z) {
            ic00 b = b(gp6Var);
            if (b != null) {
                return b.a();
            }
            return null;
        }
        jc00 c = c();
        if (c != null) {
            return c.a(gp6Var).a();
        }
        return null;
    }
}
