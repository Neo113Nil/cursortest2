package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ReactionsItemAnimator.kt */
/* loaded from: classes2.dex */
public final class q5f0 extends AnimatorListenerAdapter {
    public final /* synthetic */ n5f0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public q5f0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, n5f0 n5f0Var) {
        this.b = n5f0Var;
        this.c = e0Var;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        View view = this.e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        n5f0 n5f0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        n5f0Var.A(e0Var);
        n5f0Var.q.remove(e0Var);
        if (n5f0Var.n()) {
            return;
        }
        n5f0Var.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
