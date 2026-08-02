package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;

/* compiled from: MarketItemCommentsFragment.kt */
/* loaded from: classes17.dex */
public final class t010 extends RecyclerView.y {
    public final /* synthetic */ MarketItemCommentsFragment b;

    public t010(MarketItemCommentsFragment marketItemCommentsFragment) {
        this.b = marketItemCommentsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && (gestureDetector = this.b.h0) != null && gestureDetector.onTouchEvent(motionEvent);
    }
}
