package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class f3c0 extends RecyclerView.y {
    public final /* synthetic */ PostFragment b;

    public f3c0(PostFragment postFragment) {
        this.b = postFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.L0) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
