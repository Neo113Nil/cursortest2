package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;

/* compiled from: VideoCommentsTreeInPlayerFragment.kt */
/* loaded from: classes4.dex */
public final class tcs0 extends RecyclerView.y {
    public final /* synthetic */ VideoCommentsTreeInPlayerFragment b;

    public tcs0(VideoCommentsTreeInPlayerFragment videoCommentsTreeInPlayerFragment) {
        this.b = videoCommentsTreeInPlayerFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.T) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
