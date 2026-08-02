package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MaterialBottomContainerBackHelper.java */
/* loaded from: classes13.dex */
public final class ql10 extends AnimatorListenerAdapter {
    public final /* synthetic */ rl10 b;

    public ql10(rl10 rl10Var) {
        this.b = rl10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rl10 rl10Var = this.b;
        rl10Var.b.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        rl10Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
