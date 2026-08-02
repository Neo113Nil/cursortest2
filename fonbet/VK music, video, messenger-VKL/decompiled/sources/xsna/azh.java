package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;

/* compiled from: CommunityReviewsFragment.kt */
/* loaded from: classes18.dex */
public final class azh extends RecyclerView.y {
    public final /* synthetic */ CommunityReviewsFragment b;

    public azh(CommunityReviewsFragment communityReviewsFragment) {
        this.b = communityReviewsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.l0) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
