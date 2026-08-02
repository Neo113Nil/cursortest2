package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: ViewExt.kt */
/* loaded from: classes4.dex */
public final class hwt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;

    public hwt0(View view) {
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.b;
        view.setVisibility(4);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.clearAnimation();
        view.setAlpha(1.0f);
        view.setTranslationY(translationY);
        view.setTranslationX(translationX);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setListener(null).setUpdateListener(null);
    }
}
