package xsna;

/* compiled from: ParticlesConfig.kt */
/* loaded from: classes6.dex */
public final class tye0 {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final double p;
    public final double q;
    public final double r;
    public final double s;

    public tye0() {
        this(524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tye0)) {
            return false;
        }
        tye0 tye0Var = (tye0) obj;
        return this.a == tye0Var.a && this.b == tye0Var.b && this.c == tye0Var.c && Float.compare(this.d, tye0Var.d) == 0 && this.e == tye0Var.e && Float.compare(this.f, tye0Var.f) == 0 && Float.compare(this.g, tye0Var.g) == 0 && Float.compare(this.h, tye0Var.h) == 0 && Float.compare(this.i, tye0Var.i) == 0 && Float.compare(this.j, tye0Var.j) == 0 && Float.compare(this.k, tye0Var.k) == 0 && Float.compare(this.l, tye0Var.l) == 0 && Float.compare(this.m, tye0Var.m) == 0 && Float.compare(this.n, tye0Var.n) == 0 && Float.compare(this.o, tye0Var.o) == 0 && Double.compare(this.p, tye0Var.p) == 0 && Double.compare(this.q, tye0Var.q) == 0 && Double.compare(this.r, tye0Var.r) == 0 && Double.compare(this.s, tye0Var.s) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.s) + zjh0.b(this.r, zjh0.b(this.q, zjh0.b(this.p, io.reactivex.rxjava3.subjects.b.a(this.o, io.reactivex.rxjava3.subjects.b.a(this.n, io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, io.reactivex.rxjava3.subjects.b.a(this.k, io.reactivex.rxjava3.subjects.b.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RayConfig(count=");
        sb.append(this.a);
        sb.append(", maxAlpha=");
        sb.append(this.b);
        sb.append(", endAlpha=");
        sb.append(this.c);
        sb.append(", blurRadius=");
        sb.append(this.d);
        sb.append(", blurPaddingMult=");
        sb.append(this.e);
        sb.append(", initialSpeed=");
        sb.append(this.f);
        sb.append(", targetSpeed=");
        sb.append(this.g);
        sb.append(", speedLerpFactor=");
        sb.append(this.h);
        sb.append(", holeRadiusPct=");
        sb.append(this.i);
        sb.append(", screenMarginPct=");
        sb.append(this.j);
        sb.append(", tipWidthRatio=");
        sb.append(this.k);
        sb.append(", bellyWidthRatio=");
        sb.append(this.l);
        sb.append(", baseWidthRatio=");
        sb.append(this.m);
        sb.append(", gradientStop=");
        sb.append(this.n);
        sb.append(", angleJitter=");
        sb.append(this.o);
        sb.append(", minWidthScale=");
        sb.append(this.p);
        sb.append(", maxWidthScale=");
        sb.append(this.q);
        sb.append(", minLengthScale=");
        sb.append(this.r);
        sb.append(", maxLengthScale=");
        return ojp0.a(sb, this.s, ')');
    }

    public tye0(int i) {
        int i2 = (i & 1) != 0 ? 9 : 7;
        int i3 = (i & 2) != 0 ? 50 : 200;
        int i4 = (i & 4) != 0 ? 0 : 100;
        float f = (i & 256) != 0 ? 0.06f : 0.1f;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = 60.0f;
        this.e = 4;
        this.f = 7.0f;
        this.g = 0.15f;
        this.h = 0.05f;
        this.i = f;
        this.j = 0.05f;
        this.k = 0.06f;
        this.l = 0.28f;
        this.m = 0.02f;
        this.n = 0.33f;
        this.o = 0.25f;
        this.p = 0.6d;
        this.q = 1.0d;
        this.r = 0.95d;
        this.s = 1.05d;
    }
}
