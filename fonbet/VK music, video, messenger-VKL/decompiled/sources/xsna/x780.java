package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: OnMediaAudioViewDelegate.kt */
/* loaded from: classes4.dex */
public final class x780 implements b780 {
    public final /* synthetic */ y780 b;

    public x780(y780 y780Var) {
        this.b = y780Var;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        d3m.c(this.b.k, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        d3m.c(this.b.k, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
