package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimationAdDialogController.kt */
/* loaded from: classes5.dex */
public final class wm2 extends AnimatorListenerAdapter {
    public final /* synthetic */ xm2 b;
    public final /* synthetic */ boolean c;

    public wm2(xm2 xm2Var, boolean z) {
        this.b = xm2Var;
        this.c = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xm2 xm2Var = this.b;
        io2 io2Var = xm2Var.a;
        if (io2Var != null) {
            io2Var.D0();
        }
        xm2Var.b.a().b().setHasTransientState(false);
        xm2Var.d.invoke(Boolean.valueOf(this.c));
    }
}
