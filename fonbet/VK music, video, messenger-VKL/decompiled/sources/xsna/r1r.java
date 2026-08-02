package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;
import xsna.om10;

/* compiled from: FeedLikesProgressHelper.kt */
/* loaded from: classes18.dex */
public final class r1r extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s1r c;

    public r1r(boolean z, s1r s1rVar) {
        this.b = z;
        this.c = s1rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z = this.b;
        s1r s1rVar = this.c;
        if (!z) {
            om10 om10Var = s1rVar.b;
            if (om10Var != null) {
                om10Var.stop();
                return;
            }
            return;
        }
        om10 om10Var2 = s1rVar.b;
        if (om10Var2 != null) {
            om10.b bVar = om10Var2.c;
            bVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar.a();
        }
        if (om10Var2 != null) {
            om10.b bVar2 = om10Var2.c;
            bVar2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar2.a();
            bVar2.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar2.a();
        }
        if (om10Var2 != null) {
            om10Var2.start();
        }
    }
}
