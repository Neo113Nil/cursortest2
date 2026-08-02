package xsna;

/* compiled from: MarketAllReviewsItemsForReviewItem.kt */
/* loaded from: classes18.dex */
public final class us00 implements hfz {
    public final String b;
    public final h610 c;

    public us00(String str, h610 h610Var) {
        this.b = str;
        this.c = h610Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us00)) {
            return false;
        }
        us00 us00Var = (us00) obj;
        return epx.f(this.b, us00Var.b) && epx.f(this.c, us00Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MarketAllReviewsItemsForReviewItem(reviewsCount=" + this.b + ", itemForReviewStateModel=" + this.c + ')';
    }
}
