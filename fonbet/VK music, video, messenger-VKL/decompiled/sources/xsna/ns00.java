package xsna;

import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;

/* compiled from: MarketAllReviewsFragmentClassHolder.kt */
/* loaded from: classes.dex */
public final class ns00 extends fqa {
    public final /* synthetic */ int c;

    public /* synthetic */ ns00(int i) {
        this.c = i;
    }

    @Override // xsna.fqa
    public final Class f() {
        switch (this.c) {
            case 0:
                return MarketAllReviewsFragment.class;
            default:
                return MarketItemReviewsFragment.class;
        }
    }
}
