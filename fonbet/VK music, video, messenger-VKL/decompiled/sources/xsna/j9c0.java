package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;

/* compiled from: PostViewFragment.kt */
/* loaded from: classes4.dex */
public final class j9c0 extends RecyclerView.y {
    public final /* synthetic */ PostViewFragment b;

    public j9c0(PostViewFragment postViewFragment) {
        this.b = postViewFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.K0) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
