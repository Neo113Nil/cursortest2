package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CategoryItemAnimator.kt */
/* loaded from: classes16.dex */
public final class ala extends AnimatorListenerAdapter {
    public final /* synthetic */ wka b;
    public final /* synthetic */ hla c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ViewPropertyAnimator g;

    public ala(wka wkaVar, hla hlaVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.b = wkaVar;
        this.c = hlaVar;
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
        wka wkaVar = this.b;
        wkaVar.h.c();
        hla hlaVar = this.c;
        wkaVar.h(hlaVar);
        wkaVar.u.remove(hlaVar);
        wkaVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.h.b();
    }
}
