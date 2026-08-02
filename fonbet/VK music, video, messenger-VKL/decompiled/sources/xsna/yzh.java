package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;

/* compiled from: CommunityReviewsView.kt */
/* loaded from: classes18.dex */
public final class yzh extends RecyclerView.n {
    public final /* synthetic */ CommunityReviewsView b;

    public yzh(CommunityReviewsView communityReviewsView) {
        this.b = communityReviewsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        fyh fyhVar = this.b.d;
        if (fyhVar == null) {
            fyhVar = null;
        }
        if (childAdapterPosition == e43.h(fyhVar.h) && !(childViewHolder instanceof je90) && !(childViewHolder instanceof iig0)) {
            rect.bottom = iah0.a(15) + rect.bottom;
        } else if (childAdapterPosition == 0 && (childViewHolder instanceof wxh)) {
            rect.top = iah0.a(12) + rect.top;
        }
    }
}
