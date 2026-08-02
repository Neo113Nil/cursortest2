package xsna;

import android.animation.Animator;
import android.widget.ImageView;

/* compiled from: Animator.kt */
/* loaded from: classes5.dex */
public final class wjq implements Animator.AnimatorListener {
    public final /* synthetic */ ImageView b;

    public wjq(ImageView imageView) {
        this.b = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
