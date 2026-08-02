package xsna;

import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StoryGeoPickView.kt */
/* loaded from: classes6.dex */
public final class s3m0 implements df90 {
    public final zj20 b;
    public final /* synthetic */ t3m0 c;

    public s3m0(t3m0 t3m0Var) {
        this.c = t3m0Var;
        this.b = new zj20(t3m0Var.f);
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        t3m0 t3m0Var = this.c;
        if (i4 != 0) {
            mhy.d(t3m0Var);
        }
        int computeVerticalScrollOffset = t3m0Var.e.getRecyclerView().computeVerticalScrollOffset();
        int i5 = t3m0.g;
        zj20 zj20Var = this.b;
        if (computeVerticalScrollOffset >= i5) {
            ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) zj20Var.b;
            if (zj20Var.a) {
                return;
            }
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.alpha(1.0f).setDuration(100L).setInterpolator(qq2.f).start();
            zj20Var.a = true;
            return;
        }
        if (computeVerticalScrollOffset < i5) {
            ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) zj20Var.b;
            if (zj20Var.a) {
                viewPropertyAnimator2.cancel();
                viewPropertyAnimator2.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).setInterpolator(qq2.c).start();
                zj20Var.a = false;
            }
        }
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
