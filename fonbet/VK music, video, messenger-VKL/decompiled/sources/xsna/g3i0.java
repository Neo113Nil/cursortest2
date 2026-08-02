package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class g3i0 implements Animator.AnimatorListener {
    public final /* synthetic */ View b;

    public g3i0(View view) {
        this.b = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f4m.j(this.b);
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
