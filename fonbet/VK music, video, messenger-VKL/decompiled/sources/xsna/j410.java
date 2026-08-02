package xsna;

import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.writebar.WriteBar;
import xsna.l310;
import xsna.xn50;

/* compiled from: MarketItemReviewsFragment.kt */
/* loaded from: classes18.dex */
public final class j410 implements s1y0 {
    public final /* synthetic */ MarketItemReviewsFragment b;

    public j410(MarketItemReviewsFragment marketItemReviewsFragment) {
        this.b = marketItemReviewsFragment;
    }

    @Override // xsna.s1y0
    public final void a(f1y0 f1y0Var) {
        MarketItemReviewsFragment marketItemReviewsFragment = this.b;
        WriteBar writeBar = marketItemReviewsFragment.Z;
        if (writeBar != null) {
            e2g0 e2g0Var = marketItemReviewsFragment.R;
            String a = e2g0Var != null ? e2g0Var.a() : null;
            if (a == null) {
                a = "";
            }
            xn50.a.c(marketItemReviewsFragment, new l310.q.h(a, writeBar.getAttachments()));
        }
    }

    @Override // xsna.s1y0
    public final void b(f1y0 f1y0Var) {
        a(f1y0Var);
    }

    @Override // xsna.s1y0
    public final boolean c() {
        return false;
    }
}
