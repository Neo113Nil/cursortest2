package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.interests.NextButton;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;

/* compiled from: ButtonController.kt */
/* loaded from: classes16.dex */
public final class mp8 extends hrl {
    public final long e;
    public final long f;
    public final NextButton g;
    public final float h;

    /* compiled from: ButtonController.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ mp8 c;
        public final /* synthetic */ gzs<s3q0> d;

        public a(gzs<s3q0> gzsVar, mp8 mp8Var, gzs<s3q0> gzsVar2) {
            this.b = gzsVar;
            this.c = mp8Var;
            this.d = gzsVar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.c.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs<s3q0> gzsVar = this.d;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public mp8(NextButton nextButton, pkn0 pkn0Var) {
        super(pkn0Var);
        this.e = 300L;
        this.f = 600L;
        this.g = nextButton;
        this.h = iah0.a(44);
    }

    @Override // xsna.hrl
    public final void c(gzs gzsVar) {
        NextButton nextButton = this.g;
        nextButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        nextButton.setTranslationY(this.h);
        nextButton.animate().alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(this.e).setInterpolator(this.b).setListener(new lp8(this, gzsVar)).start();
    }

    @Override // xsna.hrl
    public final void d(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.g.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationYBy(this.h).setDuration(this.f).setInterpolator(this.b).setListener(new a(gzsVar, this, gzsVar2)).start();
    }

    @Override // xsna.hrl
    public final void e(ClipsInterestsViewState.d dVar) {
        this.g.setButtonText(dVar.e.a);
    }

    @Override // xsna.hrl
    public final boolean f(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        return !epx.f(dVar.e, dVar2.e);
    }
}
