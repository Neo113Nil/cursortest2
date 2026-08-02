package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ReactionsItemAnimator.kt */
/* loaded from: classes2.dex */
public final class p5f0 extends AnimatorListenerAdapter {
    public final /* synthetic */ n5f0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ViewPropertyAnimator g;

    public p5f0(n5f0 n5f0Var, RecyclerView.e0 e0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.b = n5f0Var;
        this.c = e0Var;
        this.d = i;
        this.e = view;
        this.f = i2;
        this.g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.d;
        View view = this.e;
        if (i != 0) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.f != 0) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.setListener(null);
        n5f0 n5f0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        n5f0Var.h(e0Var);
        n5f0Var.p.remove(e0Var);
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
