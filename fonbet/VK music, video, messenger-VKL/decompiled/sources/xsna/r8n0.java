package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SuperAppItemAnimatorV2.kt */
/* loaded from: classes6.dex */
public final class r8n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l8n0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public r8n0(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, l8n0 l8n0Var) {
        this.b = l8n0Var;
        this.c = e0Var;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        this.e.setAlpha(1.0f);
        l8n0 l8n0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        l8n0Var.A(e0Var);
        l8n0Var.q.remove(e0Var);
        l8n0Var.F();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
