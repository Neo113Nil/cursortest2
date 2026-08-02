package androidx.compose.ui.layout;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.gkl0;
import defpackage.j73;
import defpackage.wls;

/* loaded from: classes.dex */
public final class j extends o.a {
    public final LookaheadCapablePlaceable b;

    public j(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.b = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.o.a
    public final float b(r rVar) {
        int H;
        wls wlsVar = rVar.a;
        if (wlsVar != null) {
            return ((Number) wlsVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this.b;
        if (lookaheadCapablePlaceable.D) {
            return Float.NaN;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable2 = lookaheadCapablePlaceable;
        while (true) {
            gkl0 gkl0Var = lookaheadCapablePlaceable2.F;
            float f = (gkl0Var == null || (H = j73.H(gkl0Var.b, rVar)) < 0) ? Float.NaN : gkl0Var.c[H];
            if (!Float.isNaN(f)) {
                lookaheadCapablePlaceable2.A0(lookaheadCapablePlaceable.Q(), rVar);
                return rVar.a(f, lookaheadCapablePlaceable2.H0(), lookaheadCapablePlaceable.H0());
            }
            LookaheadCapablePlaceable K0 = lookaheadCapablePlaceable2.K0();
            if (K0 == null) {
                lookaheadCapablePlaceable2.A0(lookaheadCapablePlaceable.Q(), rVar);
                return Float.NaN;
            }
            lookaheadCapablePlaceable2 = K0;
        }
    }

    @Override // androidx.compose.ui.layout.o.a
    public final LayoutDirection d() {
        return this.b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.o.a
    public final int e() {
        return this.b.n0();
    }

    @Override // androidx.compose.ui.layout.o.a, defpackage.fwi
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // androidx.compose.ui.layout.o.a, defpackage.fwi
    public final float u0() {
        return this.b.u0();
    }
}
