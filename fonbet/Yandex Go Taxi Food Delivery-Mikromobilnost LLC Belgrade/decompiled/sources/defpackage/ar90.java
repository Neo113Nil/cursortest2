package defpackage;

/* loaded from: classes10.dex */
public final class ar90 extends tr90 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public ar90(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar90)) {
            return false;
        }
        ar90 ar90Var = (ar90) obj;
        return Float.compare(this.c, ar90Var.c) == 0 && Float.compare(this.d, ar90Var.d) == 0 && Float.compare(this.e, ar90Var.e) == 0 && this.f == ar90Var.f && this.g == ar90Var.g && Float.compare(this.h, ar90Var.h) == 0 && Float.compare(this.i, ar90Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + g8e.c(this.h, unr0.e(unr0.e(g8e.c(this.e, g8e.c(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return n.n(sb, this.i, ')');
    }
}
