package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class fwt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;

    public fwt0(View view) {
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.b;
        twt0.a(view, view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), 1);
    }
}
