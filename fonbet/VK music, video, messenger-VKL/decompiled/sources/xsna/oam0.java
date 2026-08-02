package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import xsna.nam0;

/* compiled from: StoryProgressAnimator.kt */
/* loaded from: classes4.dex */
public final class oam0 extends AnimatorListenerAdapter {
    public final /* synthetic */ nam0 b;

    public oam0(nam0 nam0Var) {
        this.b = nam0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        nam0 nam0Var = this.b;
        nam0Var.d = true;
        nam0Var.e = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nam0.a aVar;
        nam0 nam0Var = this.b;
        if (nam0Var.d || (aVar = nam0Var.c) == null || !aVar.a()) {
            return;
        }
        nam0Var.e = true;
        nam0Var.setStartDelay(nam0Var.b);
        nam0Var.start();
        nam0.a aVar2 = nam0Var.c;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        nam0 nam0Var = this.b;
        nam0Var.d = false;
        if (nam0Var.e) {
            nam0.a aVar = nam0Var.c;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        nam0.a aVar2 = nam0Var.c;
        if (aVar2 != null) {
            aVar2.onStart();
        }
    }
}
