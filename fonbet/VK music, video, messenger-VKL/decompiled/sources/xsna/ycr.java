package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: FilterItemAnimator.kt */
/* loaded from: classes4.dex */
public final class ycr extends AnimatorListenerAdapter {
    public final /* synthetic */ xcr b;
    public final /* synthetic */ rtm0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ViewPropertyAnimator e;

    public ycr(xcr xcrVar, rtm0 rtm0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.b = xcrVar;
        this.c = rtm0Var;
        this.d = view;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.d;
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        xcr xcrVar = this.b;
        rtm0 rtm0Var = this.c;
        xcrVar.h(rtm0Var);
        xcrVar.x.remove(rtm0Var);
        if (!xcrVar.n()) {
            xcrVar.i();
        }
        View view = this.d;
        view.setAlpha(1.0f);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.getClass();
    }
}
