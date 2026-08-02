package xsna;

import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;

/* compiled from: MarketAllReviewsTabsItem.kt */
/* loaded from: classes18.dex */
public final class gt00 implements hfz {
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final MarketAllReviewsTabTypes f;

    public gt00(boolean z, int i, String str, String str2, MarketAllReviewsTabTypes marketAllReviewsTabTypes) {
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = marketAllReviewsTabTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt00)) {
            return false;
        }
        gt00 gt00Var = (gt00) obj;
        return this.b == gt00Var.b && this.c == gt00Var.c && epx.f(this.d, gt00Var.d) && epx.f(this.e, gt00Var.e) && this.f == gt00Var.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(shy.a(this.c, Boolean.hashCode(this.b) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "MarketAllReviewsTabsItem(isTitleVisible=" + this.b + ", backgroundResId=" + this.c + ", goodReviewsCount=" + this.d + ", communityReviewsCount=" + this.e + ", selectedTab=" + this.f + ')';
    }
}
