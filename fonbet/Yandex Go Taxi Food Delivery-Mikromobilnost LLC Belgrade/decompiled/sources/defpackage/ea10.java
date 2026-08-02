package defpackage;

import kotlin.Pair;

/* loaded from: classes10.dex */
public final class ea10 {
    public final jdf a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ fa10 e;

    public ea10(fa10 fa10Var, jdf jdfVar, float f, float f2) {
        this.e = fa10Var;
        this.a = jdfVar;
        if (f2 < f) {
            ny61.g("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        this.b = fa10Var.a.c(jdfVar);
        this.c = f;
        this.d = f2;
    }

    public final Pair a(float f) {
        float c = y6i0.c(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (c - f3) / (f2 - f3);
        fa10 fa10Var = this.e;
        iq31 iq31Var = fa10Var.a;
        float f5 = f4 * this.b;
        iq31Var.getClass();
        jdf jdfVar = this.a;
        float[] fArr = jdfVar.a;
        float f6 = fArr[0];
        float f7 = iq31Var.a;
        float f8 = fArr[1];
        float f9 = iq31Var.b;
        float a = ex21.a(f6 - f7, f8 - f9);
        float f10 = 1.0f;
        float f11 = 0.0f;
        while (f10 - f11 > 1.0E-5f) {
            float f12 = ((2.0f * f11) + f10) / 3.0f;
            float f13 = ((2.0f * f10) + f11) / 3.0f;
            long c2 = jdfVar.c(f12);
            float a2 = ex21.a(pw91.j(c2) - f7, pw91.k(c2) - f9) - a;
            float f14 = ex21.c;
            float abs = Math.abs(ex21.d(a2, f14) - f5);
            long c3 = jdfVar.c(f13);
            if (abs < Math.abs(ex21.d(ex21.a(pw91.j(c3) - f7, pw91.k(c3) - f9) - a, f14) - f5)) {
                f10 = f13;
            } else {
                f11 = f12;
            }
        }
        float f15 = (f11 + f10) / 2.0f;
        if (0.0f > f15 || f15 > 1.0f) {
            ny61.g("Cubic cut point is expected to be between 0 and 1");
            return null;
        }
        Pair d = jdfVar.d(f15);
        return new Pair(new ea10(fa10Var, (jdf) d.getFirst(), this.c, c), new ea10(fa10Var, (jdf) d.getSecond(), c, this.d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
