package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ChatInviteVC.kt */
/* loaded from: classes2.dex */
public final class hsb extends AnimatorListenerAdapter {
    public final /* synthetic */ gzs<s3q0> b;

    public hsb(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invoke();
    }
}
