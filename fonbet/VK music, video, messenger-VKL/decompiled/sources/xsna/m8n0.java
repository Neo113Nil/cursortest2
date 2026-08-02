package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SuperAppItemAnimatorV2.kt */
/* loaded from: classes6.dex */
public final class m8n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l8n0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ViewPropertyAnimator e;

    public m8n0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, l8n0 l8n0Var) {
        this.b = l8n0Var;
        this.c = e0Var;
        this.d = view;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        l8n0 l8n0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        l8n0Var.h(e0Var);
        l8n0Var.o.remove(e0Var);
        l8n0Var.F();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
