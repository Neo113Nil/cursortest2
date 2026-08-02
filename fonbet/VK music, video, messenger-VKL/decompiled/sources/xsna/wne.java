package xsna;

import android.animation.Animator;
import com.unity3d.services.UnityAdsConstants;
import xsna.une;

/* compiled from: ClipsOverscrollEdgeEffectFactory.kt */
/* loaded from: classes4.dex */
public final class wne implements Animator.AnimatorListener {
    public final /* synthetic */ une b;
    public final /* synthetic */ une.b c;

    public wne(une uneVar, une.b bVar) {
        this.b = uneVar;
        this.c = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        une uneVar = this.b;
        une.c(uneVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        uneVar.g.clear();
        this.c.a = null;
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
