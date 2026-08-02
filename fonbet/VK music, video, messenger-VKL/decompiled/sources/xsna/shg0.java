package xsna;

import xsna.phg0;

/* compiled from: ReviewFriendsReducer.kt */
/* loaded from: classes18.dex */
public final class shg0 extends dm50<uhg0, phg0, thg0> {
    @Override // xsna.dm50
    public final thg0 c(thg0 thg0Var, phg0 phg0Var) {
        thg0 thg0Var2 = thg0Var;
        phg0 phg0Var2 = phg0Var;
        if (phg0Var2 instanceof phg0.c) {
            phg0.c cVar = (phg0.c) phg0Var2;
            return new thg0(cVar.c, cVar.b, null, false, false, false, cVar.d, cVar.e);
        }
        if (!(phg0Var2 instanceof phg0.f)) {
            return phg0Var2 instanceof phg0.d ? thg0.a(thg0Var2, null, null, false, true, false, 207) : phg0Var2 instanceof phg0.a ? thg0.a(thg0Var2, thg0Var2.c, null, false, false, true, 1) : phg0Var2 instanceof phg0.e ? thg0.a(thg0Var2, null, null, true, false, false, 195) : phg0Var2 instanceof phg0.b ? thg0.a(thg0Var2, null, ((phg0.b) phg0Var2).b, false, false, false, 3) : thg0Var2;
        }
        phg0.f fVar = (phg0.f) phg0Var2;
        return new thg0(fVar.c, j5g.u0(fVar.b, thg0Var2.c), null, false, false, false, fVar.d, fVar.e);
    }

    @Override // xsna.dm50
    public final uhg0 d() {
        return new uhg0(e(new qhg0(this, 0)), e(new or50(this, 18)), e(new ulz(22)));
    }

    @Override // xsna.dm50
    public final void h(thg0 thg0Var, uhg0 uhg0Var) {
        thg0 thg0Var2 = thg0Var;
        uhg0 uhg0Var2 = uhg0Var;
        if (thg0Var2.e) {
            f(uhg0Var2.c, thg0Var2);
        } else if (thg0Var2.d != null) {
            f(uhg0Var2.b, thg0Var2);
        } else {
            f(uhg0Var2.a, thg0Var2);
        }
    }
}
