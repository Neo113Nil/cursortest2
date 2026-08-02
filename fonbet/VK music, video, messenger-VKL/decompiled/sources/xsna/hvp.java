package xsna;

/* compiled from: MarketAllReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class hvp {
    public final int a;
    public final int b;
    public final int c;

    public hvp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvp)) {
            return false;
        }
        hvp hvpVar = (hvp) obj;
        return this.a == hvpVar.a && this.b == hvpVar.b && this.c == hvpVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorData(titleResId=");
        sb.append(this.a);
        sb.append(", descriptionResId=");
        sb.append(this.b);
        sb.append(", retryButtonResId=");
        return vu5.b(sb, this.c, ')');
    }
}
