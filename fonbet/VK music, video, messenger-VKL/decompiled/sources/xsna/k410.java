package xsna;

/* compiled from: MarketItemReviewsHeaderItem.kt */
/* loaded from: classes18.dex */
public final class k410 implements hfz {
    public final mig0 b;
    public final boolean c;

    public k410(mig0 mig0Var, boolean z) {
        this.b = mig0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k410)) {
            return false;
        }
        k410 k410Var = (k410) obj;
        return epx.f(this.b, k410Var.b) && this.c == k410Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewsHeaderItem(ratingViewData=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
