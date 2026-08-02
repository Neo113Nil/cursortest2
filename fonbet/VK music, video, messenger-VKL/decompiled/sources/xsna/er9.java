package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CanvasDrawScope.kt */
/* loaded from: classes11.dex */
public final class er9 implements oio {
    public final a b;
    public final b c;
    public va2 d;
    public va2 e;

    /* compiled from: CanvasDrawScope.kt */
    public static final class a {
        public azl a;
        public LayoutDirection b;
        public yq9 c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && mxj0.b(this.d, aVar.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) mxj0.e(this.d)) + ')';
        }
    }

    /* compiled from: CanvasDrawScope.kt */
    public static final class b {
        public final fr9 a = new fr9(this);
        public mdu b;

        public b() {
        }

        public final yq9 a() {
            return er9.this.b.c;
        }

        public final azl b() {
            return er9.this.b.a;
        }

        public final LayoutDirection c() {
            return er9.this.b.b;
        }

        public final long d() {
            return er9.this.b.d;
        }

        public final void e(yq9 yq9Var) {
            er9.this.b.c = yq9Var;
        }

        public final void f(azl azlVar) {
            er9.this.b.a = azlVar;
        }

        public final void g(LayoutDirection layoutDirection) {
            er9.this.b.b = layoutDirection;
        }

        public final void h(long j) {
            er9.this.b.d = j;
        }
    }

    public er9() {
        dzl dzlVar = fto0.j;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        a aVar = new a();
        aVar.a = dzlVar;
        aVar.b = layoutDirection;
        aVar.c = zep.a;
        aVar.d = 0L;
        this.b = aVar;
        this.c = new b();
    }

    public static fg90 c(er9 er9Var, long j, qio qioVar, float f, d6g d6gVar, int i) {
        fg90 k = er9Var.k(qioVar);
        if (f != 1.0f) {
            j = l5g.c(14, j, l5g.e(j) * f);
        }
        va2 va2Var = (va2) k;
        if (!l5g.d(va2Var.c(), j)) {
            va2Var.d(j);
        }
        if (va2Var.c != null) {
            va2Var.f(null);
        }
        if (!epx.f(va2Var.d, d6gVar)) {
            va2Var.j(d6gVar);
        }
        if (va2Var.b != i) {
            va2Var.i(i);
        }
        if (va2Var.a.isFilterBitmap()) {
            return k;
        }
        va2Var.k(1);
        return k;
    }

    @Override // xsna.oio
    public final void B1(Path path, yk8 yk8Var, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.c.k(path, e(yk8Var, qioVar, f, d6gVar, i, 1));
    }

    @Override // xsna.oio
    public final void C(yk8 yk8Var, float f, long j, long j2, frm0 frm0Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.b.c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), f, 90.0f, e(yk8Var, frm0Var, 1.0f, null, 3, 1));
    }

    @Override // xsna.oio
    public final void D0(long j, float f, float f2, long j2, long j3, float f3, qio qioVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.b.c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, c(this, j, qioVar, f3, null, 3));
    }

    @Override // xsna.oio
    public final void G(long j, long j2, qio qioVar) {
        int i = (int) 0;
        int i2 = (int) 0;
        this.b.c.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), c(this, j, qioVar, 1.0f, null, 3));
    }

    @Override // xsna.oio
    public final void M1(agw agwVar, long j, long j2, long j3, long j4, float f, qio qioVar, d6g d6gVar, int i, int i2) {
        this.b.c.q(agwVar, j, j2, j3, j4, e(null, qioVar, f, d6gVar, i, i2));
    }

    @Override // xsna.oio
    public final void T0(yk8 yk8Var, long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.b.c.l(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), e(yk8Var, qioVar, f, d6gVar, i, 1));
    }

    @Override // xsna.oio
    public final void U1(long j, float f, long j2, float f2, qio qioVar, d6g d6gVar, int i) {
        this.b.c.d(f, j2, c(this, j, qioVar, f2, d6gVar, i));
    }

    @Override // xsna.oio
    public final void V(Path path, long j, float f, qio qioVar) {
        this.b.c.k(path, c(this, j, qioVar, f, null, 3));
    }

    @Override // xsna.oio
    public final void V0(yk8 yk8Var, long j, long j2, float f, float f2) {
        yq9 yq9Var = this.b.c;
        va2 va2Var = this.e;
        if (va2Var == null) {
            va2Var = new va2();
            va2Var.q(1);
            this.e = va2Var;
        }
        yk8Var.a(f2, d(), va2Var);
        if (!epx.f(va2Var.d, null)) {
            va2Var.j(null);
        }
        if (va2Var.b != 3) {
            va2Var.i(3);
        }
        if (va2Var.a.getStrokeWidth() != f) {
            va2Var.p(f);
        }
        if (va2Var.a.getStrokeMiter() != 4.0f) {
            va2Var.o(4.0f);
        }
        if (va2Var.g() != 0) {
            va2Var.m(0);
        }
        if (va2Var.h() != 0) {
            va2Var.n(0);
        }
        if (!epx.f(va2Var.e, null)) {
            va2Var.l(null);
        }
        if (!va2Var.a.isFilterBitmap()) {
            va2Var.k(1);
        }
        yq9Var.u(j, j2, va2Var);
    }

    @Override // xsna.oio
    public final b a0() {
        return this.c;
    }

    @Override // xsna.oio
    public final void b1(float f, int i, int i2, long j, long j2, long j3) {
        yq9 yq9Var = this.b.c;
        va2 va2Var = this.e;
        if (va2Var == null) {
            va2Var = new va2();
            va2Var.q(1);
            this.e = va2Var;
        }
        if (!l5g.d(va2Var.c(), j)) {
            va2Var.d(j);
        }
        if (va2Var.c != null) {
            va2Var.f(null);
        }
        if (!epx.f(va2Var.d, null)) {
            va2Var.j(null);
        }
        if (va2Var.b != i2) {
            va2Var.i(i2);
        }
        if (va2Var.a.getStrokeWidth() != f) {
            va2Var.p(f);
        }
        if (va2Var.a.getStrokeMiter() != 4.0f) {
            va2Var.o(4.0f);
        }
        if (va2Var.g() != i) {
            va2Var.m(i);
        }
        if (va2Var.h() != 0) {
            va2Var.n(0);
        }
        if (!epx.f(va2Var.e, null)) {
            va2Var.l(null);
        }
        if (!va2Var.a.isFilterBitmap()) {
            va2Var.k(1);
        }
        yq9Var.u(j2, j3, va2Var);
    }

    @Override // xsna.oio
    public final void d0(long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.b.c.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), c(this, j, qioVar, f, d6gVar, i));
    }

    public final fg90 e(yk8 yk8Var, qio qioVar, float f, d6g d6gVar, int i, int i2) {
        fg90 k = k(qioVar);
        if (yk8Var != null) {
            yk8Var.a(f, d(), k);
        } else {
            va2 va2Var = (va2) k;
            if (va2Var.c != null) {
                va2Var.f(null);
            }
            long c = va2Var.c();
            long j = l5g.b;
            if (!l5g.d(c, j)) {
                va2Var.d(j);
            }
            if (va2Var.a() != f) {
                va2Var.b(f);
            }
        }
        va2 va2Var2 = (va2) k;
        if (!epx.f(va2Var2.d, d6gVar)) {
            va2Var2.j(d6gVar);
        }
        if (va2Var2.b != i) {
            va2Var2.i(i);
        }
        if (va2Var2.a.isFilterBitmap() == i2) {
            return k;
        }
        va2Var2.k(i2);
        return k;
    }

    @Override // xsna.oio
    public final void e0(agw agwVar, long j, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.c.v(agwVar, j, e(null, qioVar, f, d6gVar, i, 1));
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b.a.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.b.a.getFontScale();
    }

    @Override // xsna.oio
    public final LayoutDirection getLayoutDirection() {
        return this.b.b;
    }

    public final fg90 k(qio qioVar) {
        if (epx.f(qioVar, qbr.a)) {
            va2 va2Var = this.d;
            if (va2Var != null) {
                return va2Var;
            }
            va2 va2Var2 = new va2();
            va2Var2.q(0);
            this.d = va2Var2;
            return va2Var2;
        }
        if (!(qioVar instanceof frm0)) {
            throw new NoWhenBranchMatchedException();
        }
        va2 va2Var3 = this.e;
        if (va2Var3 == null) {
            va2Var3 = new va2();
            va2Var3.q(1);
            this.e = va2Var3;
        }
        float strokeWidth = va2Var3.a.getStrokeWidth();
        frm0 frm0Var = (frm0) qioVar;
        float f = frm0Var.a;
        db2 db2Var = frm0Var.e;
        if (strokeWidth != f) {
            va2Var3.p(f);
        }
        int g = va2Var3.g();
        int i = frm0Var.c;
        if (g != i) {
            va2Var3.m(i);
        }
        float strokeMiter = va2Var3.a.getStrokeMiter();
        float f2 = frm0Var.b;
        if (strokeMiter != f2) {
            va2Var3.o(f2);
        }
        int h = va2Var3.h();
        int i2 = frm0Var.d;
        if (h != i2) {
            va2Var3.n(i2);
        }
        if (!epx.f(va2Var3.e, db2Var)) {
            va2Var3.l(db2Var);
        }
        return va2Var3;
    }

    @Override // xsna.oio
    public final void t0(yk8 yk8Var, long j, long j2, float f, qio qioVar, d6g d6gVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.b.c.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), e(yk8Var, qioVar, f, d6gVar, i, 1));
    }

    @Override // xsna.oio
    public final void w0(long j, long j2, long j3, long j4, qio qioVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.b.c.l(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), c(this, j, qioVar, 1.0f, null, i));
    }
}
