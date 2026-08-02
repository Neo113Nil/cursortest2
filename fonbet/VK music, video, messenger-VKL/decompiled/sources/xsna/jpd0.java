package xsna;

/* compiled from: ProductItemRating.kt */
/* loaded from: classes18.dex */
public final class jpd0 {
    public final float a;
    public final int b;
    public final String c;

    public jpd0(float f, int i, String str) {
        this.a = f;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpd0)) {
            return false;
        }
        jpd0 jpd0Var = (jpd0) obj;
        return Float.compare(this.a, jpd0Var.a) == 0 && this.b == jpd0Var.b && epx.f(this.c, jpd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductItemRating(rating=");
        sb.append(this.a);
        sb.append(", reviewsCount=");
        sb.append(this.b);
        sb.append(", reviewsCountText=");
        return ho8.a(sb, this.c, ')');
    }
}
