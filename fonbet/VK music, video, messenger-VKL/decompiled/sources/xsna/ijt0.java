package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: VideoTabsBadgeRenderer.kt */
/* loaded from: classes16.dex */
public final class ijt0 implements Animator.AnimatorListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ jjt0 e;

    public ijt0(View view, int i, int i2, jjt0 jjt0Var) {
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = jjt0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.b;
        f4m.j(view);
        bwt0.r0(this.c, view);
        f4m.s(this.d, view);
        this.e.a = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.b;
        f4m.j(view);
        bwt0.r0(this.c, view);
        f4m.s(this.d, view);
        this.e.a = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
