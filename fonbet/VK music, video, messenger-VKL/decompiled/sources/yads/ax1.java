package yads;

import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ax1 implements q11 {
    public final xw1 a;

    public ax1(xw1 xw1Var) {
        this.a = xw1Var;
    }

    @Override // yads.q11
    public final void a(ic2 ic2Var, Map map) {
        q11 q11Var;
        xw1 xw1Var = this.a;
        ic2 ic2Var2 = xw1Var.a;
        d63 d63Var = new d63(ic2Var2);
        xw1Var.d.getClass();
        vm3 vm3Var = new vm3(rm3.a(ic2Var2));
        cq0 a = xw1Var.f.a(xw1Var.a);
        eq0 eq0Var = new eq0(a.a, a.b);
        km3 km3Var = km3.c;
        xw1Var.q = km3Var;
        xw1Var.b.a(km3Var, vm3Var, eq0Var, d63Var);
        xw1Var.b.b("notifyReadyEvent();");
        jx1 jx1Var = xw1Var.l;
        if (jx1Var == null || (q11Var = (q11) jx1Var.a.get()) == null) {
            return;
        }
        q11Var.a(ic2Var, map);
    }

    @Override // yads.q11
    public final void a(String str) {
        this.a.b(str);
    }

    @Override // yads.q11
    public final void a() {
        this.a.a();
    }

    @Override // yads.q11
    public final void a(boolean z) {
        xw1 xw1Var = this.a;
        xw1Var.getClass();
        xw1Var.b.a(new vm3(z));
        if (z) {
            gq0 gq0Var = xw1Var.j;
            if (gq0Var.e == null) {
                fq0 fq0Var = new fq0(gq0Var.d, gq0Var.a, gq0Var.b, gq0Var.c);
                gq0Var.e = fq0Var;
                gq0Var.d.post(fq0Var);
                return;
            }
            return;
        }
        gq0 gq0Var2 = xw1Var.j;
        gq0Var2.d.removeCallbacksAndMessages(null);
        gq0Var2.e = null;
        cq0 a = xw1Var.f.a(xw1Var.a);
        if (epx.f(a, xw1Var.r)) {
            return;
        }
        xw1Var.r = a;
        xw1Var.b.a(new eq0(a.a, a.b));
    }
}
