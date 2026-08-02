package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TabRecyclerItemAnimator.kt */
/* loaded from: classes6.dex */
public final class jtn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ftn0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ViewPropertyAnimator g;

    public jtn0(ftn0 ftn0Var, RecyclerView.e0 e0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.b = ftn0Var;
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
        ftn0 ftn0Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        ftn0Var.h(e0Var);
        ftn0Var.B.remove(e0Var);
        ftn0Var.I();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
