package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class lx1 implements q11 {
    public final ix1 a;
    public final yw1 b;
    public final pi3 c;
    public final dp3 d;
    public final vw1 e;
    public final l11 f;
    public final qu2 g;
    public ev h;
    public boolean i;

    public /* synthetic */ lx1(ix1 ix1Var, yw1 yw1Var) {
        this(ix1Var, yw1Var, new pi3(), new dp3(ix1Var), new vw1(), new l11(), gx2.a().a(ix1Var.f()));
    }

    @Override // yads.q11
    public final void a(ic2 ic2Var, Map map) {
    }

    @Override // yads.q11
    public final void a(boolean z) {
    }

    @Override // yads.q11
    public final void a(String str) {
        qu2 qu2Var = this.g;
        if (qu2Var == null || !qu2Var.E0 || this.i) {
            ev evVar = this.h;
            if (evVar != null) {
                ix1 ix1Var = this.a;
                sw1 sw1Var = (sw1) evVar;
                jg1 jg1Var = sw1Var.a;
                jg1 jg1Var2 = new jg1(jg1Var.a, jg1Var.b, jg1Var.c, str, jg1Var.e);
                hv hvVar = sw1Var.b;
                m22 m22Var = hvVar.c;
                iv ivVar = m22Var.a;
                oi oiVar = hvVar.a;
                y3 y3Var = hvVar.b;
                lo2 lo2Var = hvVar.d;
                kx0 kx0Var = hvVar.e;
                ivVar.getClass();
                new u02(kx0Var, lo2Var, y3Var, m22Var, oiVar, jg1Var2).onClick(ix1Var);
            }
            this.i = false;
        }
    }

    public lx1(ix1 ix1Var, yw1 yw1Var, pi3 pi3Var, dp3 dp3Var, vw1 vw1Var, l11 l11Var, qu2 qu2Var) {
        this.a = ix1Var;
        this.b = yw1Var;
        this.c = pi3Var;
        this.d = dp3Var;
        this.e = vw1Var;
        this.f = l11Var;
        this.g = qu2Var;
    }

    @Override // yads.q11
    public final void a() {
        this.i = true;
    }
}
