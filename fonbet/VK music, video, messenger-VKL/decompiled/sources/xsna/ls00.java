package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;

/* compiled from: MarketAllReviewsFragment.kt */
/* loaded from: classes18.dex */
public final class ls00 extends RecyclerView.n {
    public final /* synthetic */ MarketAllReviewsFragment b;

    public ls00(MarketAllReviewsFragment marketAllReviewsFragment) {
        this.b = marketAllReviewsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        int i = MarketAllReviewsFragment.d0;
        this.b.getClass();
        if ((childViewHolder instanceof vs00) || (childViewHolder instanceof ps00) || (childViewHolder instanceof zr00) || (childViewHolder instanceof qs00) || (childViewHolder instanceof et00) || (childViewHolder instanceof bt00) || (childViewHolder instanceof dt00)) {
            rect.bottom = iah0.a(8);
        }
    }
}
