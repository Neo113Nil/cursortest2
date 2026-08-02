package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: HideBottomViewOnScrollBehavior.java */
/* loaded from: classes13.dex */
public final class n3v extends AnimatorListenerAdapter {
    public final /* synthetic */ HideBottomViewOnScrollBehavior b;

    public n3v(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.i = null;
    }
}
