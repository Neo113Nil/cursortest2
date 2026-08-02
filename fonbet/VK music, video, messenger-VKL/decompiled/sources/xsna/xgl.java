package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: DefaultItemAnimatorDelegate.kt */
/* loaded from: classes4.dex */
public final class xgl extends AnimatorListenerAdapter {
    public final /* synthetic */ jxq b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ List<RecyclerView.e0> f;

    public xgl(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, List list, jxq jxqVar) {
        this.b = jxqVar;
        this.c = e0Var;
        this.d = view;
        this.e = viewPropertyAnimator;
        this.f = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        jxq jxqVar = this.b;
        RecyclerView.e0 e0Var = this.c;
        jxqVar.h(e0Var);
        this.f.remove(e0Var);
        jxqVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
