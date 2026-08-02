package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MaterialSideContainerBackHelper.java */
/* loaded from: classes13.dex */
public final class rm10 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sm10 d;

    public rm10(sm10 sm10Var, boolean z, int i) {
        this.d = sm10Var;
        this.b = z;
        this.c = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sm10 sm10Var = this.d;
        sm10Var.b.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        sm10Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, this.b);
    }
}
