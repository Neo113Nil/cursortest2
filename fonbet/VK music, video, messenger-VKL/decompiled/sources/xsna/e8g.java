package xsna;

import xsna.u4j;

/* compiled from: ColorSpace.kt */
/* loaded from: classes11.dex */
public final class e8g {
    public static d8g a(d8g d8gVar) {
        blx0 blx0Var = crx0.j;
        if (x6g.a(d8gVar.b, x6g.a)) {
            njg0 njg0Var = (njg0) d8gVar;
            blx0 blx0Var2 = njg0Var.d;
            if (!c(blx0Var2, blx0Var)) {
                return new njg0(njg0Var.a, njg0Var.h, blx0Var, f(b(bj0.b.a, blx0Var2.a(), blx0Var.a()), njg0Var.i), njg0Var.k, njg0Var.n, njg0Var.e, njg0Var.f, njg0Var.g, -1);
            }
        }
        return d8gVar;
    }

    public static final float[] b(float[] fArr, float[] fArr2, float[] fArr3) {
        g(fArr, fArr2);
        g(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] e = e(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return f(e, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final boolean c(blx0 blx0Var, blx0 blx0Var2) {
        if (blx0Var == blx0Var2) {
            return true;
        }
        return Math.abs(blx0Var.a - blx0Var2.a) < 0.001f && Math.abs(blx0Var.b - blx0Var2.b) < 0.001f;
    }

    public static final u4j d(d8g d8gVar, d8g d8gVar2) {
        if (d8gVar == d8gVar2) {
            return new t4j(d8gVar, d8gVar, 1);
        }
        long j = d8gVar.b;
        long j2 = x6g.a;
        return (x6g.a(j, j2) && x6g.a(d8gVar2.b, j2)) ? new u4j.a((njg0) d8gVar, (njg0) d8gVar2) : new u4j(d8gVar, d8gVar2, 0);
    }

    public static final float[] e(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = yq.a(f2, f9, f3 * f8, f13);
        fArr2[4] = yq.a(f3, f7, f9 * f, f13);
        fArr2[5] = yq.a(f, f8, f7 * f2, f13);
        fArr2[6] = yq.a(f3, f5, f2 * f6, f13);
        fArr2[7] = yq.a(f, f6, f3 * f4, f13);
        fArr2[8] = yq.a(f2, f4, f * f5, f13);
        return fArr2;
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }
}
