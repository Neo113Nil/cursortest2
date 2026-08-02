package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: MarketAllReviewsReviewShimmerViewHolder.kt */
/* loaded from: classes18.dex */
public final class et00 extends vfz<ss00> {
    public final View l;

    public et00(ViewGroup viewGroup) {
        super(R.layout.market_all_reviews_review_shimmer_view_holder, viewGroup);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.market_all_reviews_shimmer_view);
        this.l = this.itemView.findViewById(R.id.review_view_placeholder);
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) ((Shimmer.a) new Shimmer.a().c(true).h()).i()).d()).g(0.08f).a());
    }

    @Override // xsna.vfz
    public final void W5(ss00 ss00Var) {
        this.l.setBackgroundResource(ss00Var.b);
    }
}
