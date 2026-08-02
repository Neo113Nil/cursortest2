package xsna;

import xsna.q630;

/* compiled from: ResizablePictureContentImpl.kt */
/* loaded from: classes17.dex */
public final class u9g0 implements loy {
    public final float a;
    public final float b;
    public final long c;

    public u9g0(long j, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    @Override // xsna.q630.b, xsna.q630
    public final <R> R a(R r, wzs<? super R, ? super q630.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // xsna.loy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((((1 << (18 - i2)) - 1) & ((int) (j >> (i2 + 46)))) - 1 == 0) | ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) ? 0 : o6j.e(j) ? o6j.i(j) : o6j.k(j);
        float f = this.b;
        boolean isNaN = Float.isNaN(f);
        float f2 = this.a;
        int I0 = !isNaN ? (int) ep10Var.I0(f * f2) : Integer.MAX_VALUE;
        if (i3 > I0) {
            i3 = I0;
        }
        int i4 = (int) (i3 / f2);
        if (!((i3 >= 0) & (i4 >= 0))) {
            wzw.a("width and height must be >= 0");
        }
        tra0 N = zo10Var.N(s6j.h(i3, i3, i4, i4));
        return ep10Var.Q(N.b, N.c, jgp.b, new bnc0(N, 5));
    }

    @Override // xsna.loy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return r(fVar);
    }

    public final int r(androidx.compose.ui.node.f fVar) {
        float density;
        float f = this.b;
        if (Float.isNaN(f)) {
            float b = uco.b(this.c);
            pco pcoVar = new pco(b);
            if (Float.isNaN(b)) {
                pcoVar = null;
            }
            if (pcoVar == null) {
                return 0;
            }
            f = pcoVar.b;
            density = fVar.getDensity();
        } else {
            density = fVar.getDensity();
        }
        return (int) (density * f);
    }

    public final int s(androidx.compose.ui.node.f fVar) {
        float c = uco.c(this.c);
        pco pcoVar = new pco(c);
        if (Float.isNaN(c)) {
            pcoVar = null;
        }
        int density = pcoVar != null ? (int) (fVar.getDensity() * pcoVar.b) : 0;
        float f = this.b;
        int I0 = !Float.isNaN(f) ? (int) fVar.I0(f * this.a) : Integer.MAX_VALUE;
        return density > I0 ? I0 : density;
    }

    @Override // xsna.loy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return s(fVar);
    }

    @Override // xsna.loy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return r(fVar);
    }

    @Override // xsna.loy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return s(fVar);
    }
}
