package xsna;

/* compiled from: MarketAllReviewsItemShimmers.kt */
/* loaded from: classes18.dex */
public final class ss00 implements hfz {
    public final int b;

    public ss00(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss00) && this.b == ((ss00) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MarketAllReviewsReviewShimmerItem(backgroundResId="), this.b, ')');
    }
}
