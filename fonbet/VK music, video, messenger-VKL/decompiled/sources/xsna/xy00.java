package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MarketFilterItemAnimator.kt */
/* loaded from: classes18.dex */
public final class xy00 extends AnimatorListenerAdapter {
    public final /* synthetic */ wy00 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ViewPropertyAnimator e;

    public xy00(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, wy00 wy00Var) {
        this.b = wy00Var;
        this.c = e0Var;
        this.d = view;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.d;
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        View view = this.d;
        view.setPivotY(0.5f);
        view.setScaleY(1.0f);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        wy00 wy00Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        wy00Var.h(e0Var);
        wy00Var.p.remove(e0Var);
        wy00Var.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
