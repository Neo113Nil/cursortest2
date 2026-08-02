package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: pagerStateInternal.kt */
/* loaded from: classes17.dex */
public final class qc90 extends mc90 {
    public final /* synthetic */ gzs<Integer> G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc90(int i, gzs gzsVar) {
        super(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 0);
        this.G = gzsVar;
    }

    @Override // xsna.mc90
    public final int o() {
        return this.G.invoke().intValue();
    }
}
