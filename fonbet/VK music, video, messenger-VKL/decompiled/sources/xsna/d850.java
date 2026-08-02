package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: Animator.kt */
/* loaded from: classes6.dex */
public final class d850 implements Animator.AnimatorListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ zo8 c;

    public d850(View view, zo8 zo8Var) {
        this.b = view;
        this.c = zo8Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(8);
        this.c.invoke(animator);
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
