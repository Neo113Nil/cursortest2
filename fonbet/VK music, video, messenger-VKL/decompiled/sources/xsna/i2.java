package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.b2;

/* compiled from: AboutAppReducer.kt */
/* loaded from: classes6.dex */
public final class i2 extends dm50<p3, b2, o2> {
    public final bpn0 d;

    public i2() {
        super(new o2(0));
        this.d = new bpn0(new d2(0));
    }

    @Override // xsna.dm50
    public final o2 c(o2 o2Var, b2 b2Var) {
        o2 o2Var2 = o2Var;
        b2 b2Var2 = b2Var;
        if (b2Var2 instanceof b2.c) {
            b2.c cVar = (b2.c) b2Var2;
            ((y1) this.d.getValue()).getClass();
            return o2.a(o2Var2, false, new y0(cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m));
        }
        if (b2Var2.equals(b2.a.b)) {
            return o2.a(o2Var2, true, new y0(0));
        }
        if (b2Var2 instanceof b2.b) {
            return new o2(true, false, ((b2.b) b2Var2).b, new y0(0));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final p3 d() {
        return new p3(e(new c2(0)));
    }

    @Override // xsna.dm50
    public final void h(o2 o2Var, p3 p3Var) {
        f(p3Var.a, o2Var);
    }
}
