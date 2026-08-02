package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;

/* compiled from: MarketItemReviewRepliesFragment.kt */
/* loaded from: classes18.dex */
public final class v210 extends RecyclerView.y {
    public final /* synthetic */ MarketItemReviewRepliesFragment b;

    public v210(MarketItemReviewRepliesFragment marketItemReviewRepliesFragment) {
        this.b = marketItemReviewRepliesFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.Z) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
