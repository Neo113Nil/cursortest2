package xsna;

/* compiled from: ActionData.kt */
/* loaded from: classes16.dex */
public final class a00 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public a00(float f, float f2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    public static a00 a(a00 a00Var, int i, int i2, int i3, int i4) {
        float f = a00Var.a;
        float f2 = a00Var.b;
        if ((i4 & 4) != 0) {
            i = a00Var.c;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = a00Var.d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = a00Var.e;
        }
        return new a00(f, f2, i5, i6, i3, a00Var.f, a00Var.g, a00Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        return Float.compare(this.a, a00Var.a) == 0 && Float.compare(this.b, a00Var.b) == 0 && this.c == a00Var.c && this.d == a00Var.d && this.e == a00Var.e && this.f == a00Var.f && this.g == a00Var.g && this.h == a00Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionData(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", startX=");
        sb.append(this.c);
        sb.append(", endX=");
        sb.append(this.d);
        sb.append(", centerX=");
        sb.append(this.e);
        sb.append(", maxY=");
        sb.append(this.f);
        sb.append(", minY=");
        sb.append(this.g);
        sb.append(", width=");
        return vu5.b(sb, this.h, ')');
    }
}
