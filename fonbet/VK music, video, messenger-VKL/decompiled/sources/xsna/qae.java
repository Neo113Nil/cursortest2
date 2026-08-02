package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ClipsGridBlockAnimationDelegate.kt */
/* loaded from: classes17.dex */
public final class qae extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ sae c;
    public final /* synthetic */ n0 d;

    public qae(View view, sae saeVar, n0 n0Var) {
        this.b = view;
        this.c = saeVar;
        this.d = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        sae saeVar = this.c;
        float f = saeVar.i;
        View view = this.b;
        view.setScaleX(f);
        view.setScaleY(saeVar.i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.invoke();
    }
}
