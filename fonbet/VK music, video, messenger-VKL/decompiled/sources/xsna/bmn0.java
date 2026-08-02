package xsna;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes12.dex */
public final class bmn0 implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout b;

    public bmn0(SwipeRefreshLayout swipeRefreshLayout) {
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        if (swipeRefreshLayout.s) {
            return;
        }
        swipeRefreshLayout.k(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
