package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: VoipCallView.kt */
/* loaded from: classes7.dex */
public final class sjw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ mjw0 b;

    public sjw0(mjw0 mjw0Var) {
        this.b = mjw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mjw0 mjw0Var = this.b;
        mjw0Var.R.clearAnimation();
        mjw0Var.S.clearAnimation();
        mjw0Var.postDelayed(new tsk(mjw0Var, 12), 600L);
    }
}
