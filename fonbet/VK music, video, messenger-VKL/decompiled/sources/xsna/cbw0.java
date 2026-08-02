package xsna;

import android.animation.Animator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Animator.kt */
/* loaded from: classes6.dex */
public final class cbw0 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dbw0 c;

    public cbw0(boolean z, dbw0 dbw0Var) {
        this.b = z;
        this.c = dbw0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.b;
        dbw0 dbw0Var = this.c;
        if (!z) {
            bwt0.p0(dbw0Var.c, false);
            bwt0.p0(dbw0Var.b, false);
            dbw0Var.c.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            dbw0Var.b.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        dbw0Var.h = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
