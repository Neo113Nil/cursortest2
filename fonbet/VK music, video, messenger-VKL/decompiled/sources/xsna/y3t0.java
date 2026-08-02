package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VideoPlayerAdsPanelButtonStyleDelegate.kt */
/* loaded from: classes3.dex */
public final class y3t0 extends AnimatorListenerAdapter {
    public final /* synthetic */ z3t0 b;
    public final /* synthetic */ dv0 c;

    public y3t0(z3t0 z3t0Var, dv0 dv0Var) {
        this.b = z3t0Var;
        this.c = dv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0, 300, null);
        this.c.run();
    }
}
