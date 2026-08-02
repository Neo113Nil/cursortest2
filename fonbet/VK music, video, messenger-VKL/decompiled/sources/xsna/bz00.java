package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MarketFilterItemAnimator.kt */
/* loaded from: classes18.dex */
public final class bz00 extends AnimatorListenerAdapter {
    public final /* synthetic */ wy00 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public bz00(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, wy00 wy00Var) {
        this.b = wy00Var;
        this.c = e0Var;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        View view = this.e;
        view.setAlpha(1.0f);
        view.setPivotY(0.5f);
        view.setScaleY(1.0f);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        wy00 wy00Var = this.b;
        RecyclerView.e0 e0Var = this.c;
        wy00Var.A(e0Var);
        wy00Var.r.remove(e0Var);
        wy00Var.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
