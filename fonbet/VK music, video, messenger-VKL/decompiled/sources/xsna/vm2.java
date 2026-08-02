package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimationAdDialogController.kt */
/* loaded from: classes5.dex */
public final class vm2 extends AnimatorListenerAdapter {
    public final /* synthetic */ xm2 b;

    public vm2(xm2 xm2Var) {
        this.b = xm2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xm2 xm2Var = this.b;
        com.vk.video.ad.e.this.h.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        io2 io2Var = xm2Var.a;
        if (io2Var != null) {
            io2Var.C();
        }
        xm2Var.b.a().b().setHasTransientState(false);
        xm2Var.f.invoke();
    }
}
