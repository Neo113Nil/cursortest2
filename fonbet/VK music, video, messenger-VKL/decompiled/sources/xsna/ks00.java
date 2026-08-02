package xsna;

import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import xsna.xn50;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class ks00 implements Runnable {
    public final /* synthetic */ MarketAllReviewsFragment b;
    public final /* synthetic */ CreateCommunityReviewResult c;

    public ks00(MarketAllReviewsFragment marketAllReviewsFragment, CreateCommunityReviewResult createCommunityReviewResult) {
        this.b = marketAllReviewsFragment;
        this.c = createCommunityReviewResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn50.a.c(this.b, new a.h(this.c));
    }
}
