package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.stikers.ClipsStickerDeleteAreaView;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class idc extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ idc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.b) {
            case 1:
                onAnimationEnd(animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationEnd(animator);
                jdc jdcVar = (jdc) this.c;
                jdcVar.a();
                lf2 lf2Var = jdcVar.j;
                if (lf2Var != null) {
                    lf2Var.a(jdcVar.a);
                    break;
                }
                break;
            case 1:
                ((ClipsStickerDeleteAreaView) this.c).i = null;
                break;
            default:
                com.vk.attachpicker.screen.l lVar = (com.vk.attachpicker.screen.l) this.c;
                lVar.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Activity d = lVar.d();
                if (d != null) {
                    lVar.j.b(d);
                }
                fne0 fne0Var = lVar.F;
                if (fne0Var == null) {
                    fne0Var = null;
                }
                fne0Var.setVisibility(0);
                break;
        }
    }
}
