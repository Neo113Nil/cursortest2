package xsna;

import android.animation.Animator;
import com.unity3d.services.UnityAdsConstants;
import xsna.xl3;

/* compiled from: ArrowProgressDrawable.java */
/* loaded from: classes17.dex */
public final class wl3 implements Animator.AnimatorListener {
    public final /* synthetic */ xl3.a b;
    public final /* synthetic */ xl3 c;

    public wl3(xl3 xl3Var, xl3.a aVar) {
        this.c = xl3Var;
        this.b = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        xl3 xl3Var = this.c;
        xl3.a aVar = this.b;
        xl3Var.i(1.0f, aVar, true);
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        if (!xl3Var.h) {
            xl3Var.g += 1.0f;
            return;
        }
        xl3Var.h = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.n) {
            aVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
