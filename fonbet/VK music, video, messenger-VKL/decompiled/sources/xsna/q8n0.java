package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SuperAppItemAnimatorV2.kt */
/* loaded from: classes6.dex */
public final class q8n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l8n0 b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ViewPropertyAnimator h;

    /* compiled from: SuperAppItemAnimatorV2.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;
        public final /* synthetic */ l8n0 d;
        public final /* synthetic */ RecyclerView.e0 e;

        public a(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.e0 e0Var, l8n0 l8n0Var) {
            this.b = view;
            this.c = viewPropertyAnimator;
            this.d = l8n0Var;
            this.e = e0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.c.setListener(null);
            l8n0 l8n0Var = this.d;
            RecyclerView.e0 e0Var = this.e;
            l8n0Var.h(e0Var);
            l8n0Var.p.remove(e0Var);
            l8n0Var.F();
        }
    }

    public q8n0(l8n0 l8n0Var, RecyclerView.e0 e0Var, int i, View view, int i2, long j, ViewPropertyAnimator viewPropertyAnimator) {
        this.b = l8n0Var;
        this.c = e0Var;
        this.d = i;
        this.e = view;
        this.f = i2;
        this.g = j;
        this.h = viewPropertyAnimator;
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
        int i = this.d;
        View view = this.e;
        if (i != 0) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.f != 0) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        view.animate().alpha(1.0f).setDuration(this.g / 2).setStartDelay(0L).setListener(new a(view, this.h, this.c, this.b));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
