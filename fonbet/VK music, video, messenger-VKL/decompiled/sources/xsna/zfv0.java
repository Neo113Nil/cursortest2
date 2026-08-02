package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.tra0;

/* compiled from: VkResizablePicture.kt */
/* loaded from: classes17.dex */
public final class zfv0 implements izs<tra0.a, s3q0> {
    public final /* synthetic */ tra0 b;

    public zfv0(tra0 tra0Var) {
        this.b = tra0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tra0.a aVar) {
        aVar.q(this.b, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return s3q0.a;
    }
}
