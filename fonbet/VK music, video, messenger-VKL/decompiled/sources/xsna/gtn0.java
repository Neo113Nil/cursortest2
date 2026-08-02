package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TabRecyclerItemAnimator.kt */
/* loaded from: classes6.dex */
public final class gtn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ftn0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ViewPropertyAnimator e;

    public gtn0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, ftn0 ftn0Var) {
        this.b = ftn0Var;
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
        ftn0 ftn0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        ftn0Var.h(e0Var);
        ftn0Var.A.remove(e0Var);
        ftn0Var.I();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
