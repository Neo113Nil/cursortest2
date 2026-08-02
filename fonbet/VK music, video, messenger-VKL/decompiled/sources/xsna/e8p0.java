package xsna;

import android.animation.Animator;
import com.vk.core.ui.TopBottomAnimView;

/* compiled from: TopBottomAnimView.kt */
/* loaded from: classes17.dex */
public final class e8p0 implements Animator.AnimatorListener {
    public final /* synthetic */ TopBottomAnimView b;

    public e8p0(TopBottomAnimView topBottomAnimView) {
        this.b = topBottomAnimView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        TopBottomAnimView topBottomAnimView = this.b;
        topBottomAnimView.setScaleY(topBottomAnimView.c);
        topBottomAnimView.c *= -1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
