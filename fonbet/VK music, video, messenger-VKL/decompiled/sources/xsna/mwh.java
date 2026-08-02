package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;

/* compiled from: CommunityRepliesFragment.kt */
/* loaded from: classes18.dex */
public final class mwh extends RecyclerView.y {
    public final /* synthetic */ CommunityRepliesFragment b;

    public mwh(CommunityRepliesFragment communityRepliesFragment) {
        this.b = communityRepliesFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.b0) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
