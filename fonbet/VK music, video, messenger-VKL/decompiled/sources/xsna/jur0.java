package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VhMsgSearchHint.kt */
/* loaded from: classes2.dex */
public final class jur0 extends vfz<nx30> {
    public static final /* synthetic */ int m = 0;
    public final mkr0 l;

    public jur0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
    }

    @Override // xsna.vfz
    public final void W5(nx30 nx30Var) {
        bwt0.p0(this.itemView, false);
        d3m.c(this.itemView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
