package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ChannelMsgSearchHintVh.kt */
/* loaded from: classes16.dex */
public final class l5b extends vfz<k5b> {
    public static final /* synthetic */ int l = 0;

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(k5b k5bVar) {
        bwt0.p0(this.itemView, false);
        d3m.c(this.itemView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
