package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ReactionsItemAnimator.kt */
/* loaded from: classes2.dex */
public final class o5f0 extends AnimatorListenerAdapter {
    public final /* synthetic */ n5f0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ViewPropertyAnimator e;

    public o5f0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, n5f0 n5f0Var) {
        this.b = n5f0Var;
        this.c = e0Var;
        this.d = view;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.d;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        n5f0 n5f0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        n5f0Var.h(e0Var);
        n5f0Var.o.remove(e0Var);
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
