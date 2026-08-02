package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;

/* compiled from: MarketItemReviewsFragment.kt */
/* loaded from: classes18.dex */
public final class h410 extends RecyclerView.y {
    public final /* synthetic */ MarketItemReviewsFragment b;

    public h410(MarketItemReviewsFragment marketItemReviewsFragment) {
        this.b = marketItemReviewsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.S) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
