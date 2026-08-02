package xsna;

/* compiled from: MarketAllReviewsEmptyListItem.kt */
/* loaded from: classes18.dex */
public final class as00 implements hfz {
    public final int b;
    public final Integer c;

    public as00(int i, Integer num) {
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as00)) {
            return false;
        }
        as00 as00Var = (as00) obj;
        return this.b == as00Var.b && epx.f(this.c, as00Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAllReviewsEmptyListItem(title=");
        sb.append(this.b);
        sb.append(", description=");
        return uqi.b(sb, this.c, ')');
    }
}
