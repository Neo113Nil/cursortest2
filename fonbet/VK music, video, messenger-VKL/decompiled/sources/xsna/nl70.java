package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: NowView.kt */
/* loaded from: classes16.dex */
public final class nl70 extends AnimatorListenerAdapter {
    public final /* synthetic */ pl70 b;

    public nl70(pl70 pl70Var) {
        this.b = pl70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVa(null);
    }
}
