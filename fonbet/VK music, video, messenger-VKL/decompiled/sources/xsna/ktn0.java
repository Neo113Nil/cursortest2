package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TabRecyclerItemAnimator.kt */
/* loaded from: classes6.dex */
public final class ktn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ftn0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public ktn0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, ftn0 ftn0Var) {
        this.b = ftn0Var;
        this.c = e0Var;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        this.e.setAlpha(1.0f);
        ftn0 ftn0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        ftn0Var.A(e0Var);
        ftn0Var.C.remove(e0Var);
        ftn0Var.I();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
