package xsna;

/* compiled from: ReviewsRatingSnippetCellModel.kt */
/* loaded from: classes18.dex */
public final class xig0 {
    public final float a;
    public final int b;

    public xig0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xig0)) {
            return false;
        }
        xig0 xig0Var = (xig0) obj;
        return Float.compare(this.a, xig0Var.a) == 0 && this.b == xig0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewsRatingSnippetCellModel(rating=");
        sb.append(this.a);
        sb.append(", reviewsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
