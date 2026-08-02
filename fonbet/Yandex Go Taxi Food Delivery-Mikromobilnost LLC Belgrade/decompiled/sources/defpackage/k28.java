package defpackage;

import android.graphics.Paint;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class k28 implements qam {
    public final j28 a;
    public final nfh b;
    public eb2 c;
    public eb2 w;

    public k28() {
        iwi iwiVar = cma1.b;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        j28 j28Var = new j28();
        j28Var.a = iwiVar;
        j28Var.b = layoutDirection;
        j28Var.c = ivn.a;
        j28Var.d = 0L;
        this.a = j28Var;
        nfh nfhVar = new nfh();
        nfhVar.c = this;
        nfhVar.a = new cot(11, nfhVar);
        this.b = nfhVar;
    }

    public static ka90 a(k28 k28Var, long j, ram ramVar, float f, wec wecVar, int i) {
        ka90 e = k28Var.e(ramVar);
        if (f != 1.0f) {
            j = ldc.b(j, ldc.d(j) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        eb2 eb2Var = (eb2) e;
        Paint paint = eb2Var.a;
        if (!ldc.c(rzo.d(paint.getColor()), j)) {
            eb2Var.f(j);
        }
        if (eb2Var.c != null) {
            eb2Var.j(null);
        }
        if (!jl40.l(eb2Var.d, wecVar)) {
            eb2Var.g(wecVar);
        }
        if (eb2Var.b != i) {
            eb2Var.e(i);
        }
        if (paint.isFilterBitmap()) {
            return e;
        }
        eb2Var.h(1);
        return e;
    }

    @Override // defpackage.qam
    public final void B0(long j, long j2, long j3, float f, wec wecVar, int i) {
        i28 i28Var = this.a.c;
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.i(intBitsToFloat, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i3), a(this, j, i3r.a, f, wecVar, i));
    }

    @Override // defpackage.qam
    public final void C(l8v l8vVar, long j, long j2, long j3, long j4, float f, wec wecVar, int i, int i2) {
        this.a.c.a(l8vVar, j, j2, j3, j4, b(null, i3r.a, f, wecVar, i, i2));
    }

    @Override // defpackage.qam
    public final void F(long j, float f, float f2, boolean z, long j2, long j3, ram ramVar, int i) {
        i28 i28Var = this.a.c;
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.l(intBitsToFloat, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i3), f, f2, z, a(this, j, ramVar, 1.0f, null, i));
    }

    @Override // defpackage.qam
    public final void J(long j, float f, long j2, float f2, ram ramVar, int i) {
        this.a.c.t(f, j2, a(this, j, ramVar, f2, null, i));
    }

    @Override // defpackage.qam
    public final void L(long j, long j2, long j3, long j4, ram ramVar, int i) {
        i28 i28Var = this.a.c;
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.e(intBitsToFloat, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), a(this, j, ramVar, 1.0f, null, i));
    }

    @Override // defpackage.qam
    public final nfh N() {
        return this.b;
    }

    @Override // defpackage.qam
    public final void a0(rq90 rq90Var, long j, ram ramVar) {
        this.a.c.p(rq90Var, a(this, j, ramVar, 1.0f, null, 3));
    }

    public final ka90 b(ml6 ml6Var, ram ramVar, float f, wec wecVar, int i, int i2) {
        ka90 e = e(ramVar);
        if (ml6Var != null) {
            ml6Var.a(f, c(), e);
        } else {
            eb2 eb2Var = (eb2) e;
            Paint paint = eb2Var.a;
            if (eb2Var.c != null) {
                eb2Var.j(null);
            }
            long d = rzo.d(paint.getColor());
            long j = ldc.b;
            if (!ldc.c(d, j)) {
                eb2Var.f(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                eb2Var.c(f);
            }
        }
        eb2 eb2Var2 = (eb2) e;
        if (!jl40.l(eb2Var2.d, wecVar)) {
            eb2Var2.g(wecVar);
        }
        if (eb2Var2.b != i) {
            eb2Var2.e(i);
        }
        if (eb2Var2.a.isFilterBitmap() == i2) {
            return e;
        }
        eb2Var2.h(i2);
        return e;
    }

    @Override // defpackage.qam
    public final void c0(ml6 ml6Var, long j, long j2, float f, ram ramVar, int i) {
        i28 i28Var = this.a.c;
        int i2 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.i(intBitsToFloat, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2)) + Float.intBitsToFloat(i3), b(ml6Var, ramVar, f, null, i, 1));
    }

    public final void d(l8v l8vVar, c36 c36Var) {
        this.a.c.m(l8vVar, b(null, i3r.a, 1.0f, c36Var, 3, 1));
    }

    public final ka90 e(ram ramVar) {
        if (jl40.l(ramVar, i3r.a)) {
            eb2 eb2Var = this.c;
            if (eb2Var != null) {
                return eb2Var;
            }
            eb2 eb2Var2 = new eb2();
            eb2Var2.n(0);
            this.c = eb2Var2;
            return eb2Var2;
        }
        if (!(ramVar instanceof jvu0)) {
            w511.b();
            return null;
        }
        eb2 eb2Var3 = this.w;
        if (eb2Var3 == null) {
            eb2Var3 = new eb2();
            eb2Var3.n(1);
            this.w = eb2Var3;
        }
        Paint paint = eb2Var3.a;
        jvu0 jvu0Var = (jvu0) ramVar;
        if (paint.getStrokeWidth() != jvu0Var.d()) {
            eb2Var3.m(jvu0Var.d());
        }
        if (!xhb1.d(eb2Var3.a(), jvu0Var.a())) {
            eb2Var3.k(jvu0Var.a());
        }
        if (paint.getStrokeMiter() != jvu0Var.c()) {
            paint.setStrokeMiter(jvu0Var.c());
        }
        if (!zhb1.c(eb2Var3.b(), jvu0Var.b())) {
            eb2Var3.l(jvu0Var.b());
        }
        if (!jl40.l(eb2Var3.e, null)) {
            eb2Var3.i(null);
        }
        return eb2Var3;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.qam
    public final LayoutDirection getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.qam
    public final void h(long j, long j2, long j3, float f, int i, kb2 kb2Var) {
        i28 i28Var = this.a.c;
        eb2 eb2Var = this.w;
        if (eb2Var == null) {
            eb2Var = new eb2();
            eb2Var.n(1);
            this.w = eb2Var;
        }
        Paint paint = eb2Var.a;
        if (!ldc.c(rzo.d(paint.getColor()), j)) {
            eb2Var.f(j);
        }
        if (eb2Var.c != null) {
            eb2Var.j(null);
        }
        if (!jl40.l(eb2Var.d, null)) {
            eb2Var.g(null);
        }
        if (eb2Var.b != 3) {
            eb2Var.e(3);
        }
        if (paint.getStrokeWidth() != f) {
            eb2Var.m(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (!xhb1.d(eb2Var.a(), i)) {
            eb2Var.k(i);
        }
        if (!zhb1.c(eb2Var.b(), 0)) {
            eb2Var.l(0);
        }
        if (!jl40.l(eb2Var.e, kb2Var)) {
            eb2Var.i(kb2Var);
        }
        if (!paint.isFilterBitmap()) {
            eb2Var.h(1);
        }
        i28Var.d(j2, j3, eb2Var);
    }

    @Override // defpackage.qam
    public final void k(long j, long j2, long j3, ram ramVar) {
        i28 i28Var = this.a.c;
        int i = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.h(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i2), a(this, j, ramVar, 1.0f, null, 3));
    }

    @Override // defpackage.qam
    public final void q0(rq90 rq90Var, ml6 ml6Var, float f, ram ramVar, int i) {
        this.a.c.p(rq90Var, b(ml6Var, ramVar, f, null, i, 1));
    }

    @Override // defpackage.qam
    public final void r(ml6 ml6Var, long j, float f) {
        this.a.c.t(f, j, b(ml6Var, i3r.a, 1.0f, null, 3, 1));
    }

    @Override // defpackage.qam
    public final void s(zfr0 zfr0Var, float f, float f2, long j, long j2, jvu0 jvu0Var) {
        i28 i28Var = this.a.c;
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.l(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i2), f, f2, false, b(zfr0Var, jvu0Var, 1.0f, null, 3, 1));
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.a.u0();
    }

    @Override // defpackage.qam
    public final void v0(ml6 ml6Var, long j, long j2, long j3, float f, ram ramVar) {
        i28 i28Var = this.a.c;
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.e(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), b(ml6Var, ramVar, f, null, 3, 1));
    }
}
