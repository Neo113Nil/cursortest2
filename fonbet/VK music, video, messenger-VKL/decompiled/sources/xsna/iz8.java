package xsna;

/* compiled from: CadreSize.kt */
/* loaded from: classes16.dex */
public final class iz8 {
    public static final int j = iah0.a(16);
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final Float g;
    public final float h;
    public final boolean i;

    public iz8(int i, int i2, float f, float f2, boolean z, boolean z2, Float f3, float f4, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = f3;
        this.h = f4;
        this.i = z3;
    }

    public final float a() {
        return this.d;
    }

    public final int b() {
        return this.b;
    }

    public final float c() {
        return this.h;
    }

    public final float d() {
        return this.c;
    }

    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz8)) {
            return false;
        }
        iz8 iz8Var = (iz8) obj;
        return this.a == iz8Var.a && this.b == iz8Var.b && Float.compare(this.c, iz8Var.c) == 0 && Float.compare(this.d, iz8Var.d) == 0 && this.e == iz8Var.e && this.f == iz8Var.f && epx.f(this.g, iz8Var.g) && Float.compare(this.h, iz8Var.h) == 0 && this.i == iz8Var.i;
    }

    public final boolean f() {
        return this.i;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
        Float f = this.g;
        return Boolean.hashCode(this.i) + io.reactivex.rxjava3.subjects.b.a(this.h, (b + (f == null ? 0 : f.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CadreSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", topOffset=");
        sb.append(this.c);
        sb.append(", bottomOffset=");
        sb.append(this.d);
        sb.append(", needTopRadius=");
        sb.append(this.e);
        sb.append(", needBottomRadius=");
        sb.append(this.f);
        sb.append(", cadreTop=");
        sb.append(this.g);
        sb.append(", startOffset=");
        sb.append(this.h);
        sb.append(", isVertical=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
