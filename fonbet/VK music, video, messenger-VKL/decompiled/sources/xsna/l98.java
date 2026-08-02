package xsna;

import android.view.animation.Animation;
import com.vk.core.ui.refresh.BottomSwipeRefreshLayout;

/* compiled from: BottomSwipeRefreshLayout.java */
/* loaded from: classes17.dex */
public final class l98 implements Animation.AnimationListener {
    public final /* synthetic */ BottomSwipeRefreshLayout b;

    public l98(BottomSwipeRefreshLayout bottomSwipeRefreshLayout) {
        this.b = bottomSwipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int[] iArr = BottomSwipeRefreshLayout.M;
        this.b.k(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
