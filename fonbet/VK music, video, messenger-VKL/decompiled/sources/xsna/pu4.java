package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AudioRecordAnimator.kt */
/* loaded from: classes2.dex */
public final class pu4 extends ymp0 {
    public final /* synthetic */ qu4 b;

    public pu4(qu4 qu4Var) {
        this.b = qu4Var;
    }

    @Override // xsna.ymp0, xsna.vlp0.i
    public final void onTransitionEnd(vlp0 vlp0Var) {
        ViewPropertyAnimator c;
        ViewPropertyAnimator c2;
        qu4 qu4Var = this.b;
        View view = qu4Var.e;
        io.reactivex.rxjava3.disposables.b bVar = qu4Var.n;
        by6 by6Var = qu4Var.p;
        long j = qu4Var.q;
        View view2 = qu4Var.d;
        float f = bwt0.K(view2) ? 1.0f : 0.8f;
        view2.setScaleX(f);
        view2.setScaleY(f);
        long j2 = 2 * j;
        c = d3m.c(qu4Var.d, (r15 & 1) != 0 ? 300L : j2, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (c != null) {
            c.scaleX(1.0f);
            c.scaleY(1.0f);
            c.setInterpolator(by6Var);
            xo2.b(c, bVar);
        }
        view.setScaleX(f);
        view.setScaleY(f);
        c2 = d3m.c(qu4Var.e, (r15 & 1) != 0 ? 300L : j2, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (c2 != null) {
            c2.scaleX(1.0f);
            c2.scaleY(1.0f);
            c2.setInterpolator(by6Var);
            xo2.b(c2, bVar);
        }
    }
}
