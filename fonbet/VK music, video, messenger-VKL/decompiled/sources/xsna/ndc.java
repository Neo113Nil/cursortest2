package xsna;

import android.animation.Animator;
import com.unity3d.services.UnityAdsConstants;
import xsna.odc;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes12.dex */
public final class ndc implements Animator.AnimatorListener {
    public final /* synthetic */ odc.a b;
    public final /* synthetic */ odc c;

    public ndc(odc odcVar, odc.a aVar) {
        this.c = odcVar;
        this.b = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        odc odcVar = this.c;
        odc.a aVar = this.b;
        odcVar.a(1.0f, aVar, true);
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        if (!odcVar.g) {
            odcVar.f += 1.0f;
            return;
        }
        odcVar.g = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.n) {
            aVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
