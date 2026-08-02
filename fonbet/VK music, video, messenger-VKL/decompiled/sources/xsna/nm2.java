package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes11.dex */
public final class nm2 extends Lambda implements izs<tra0.a, s3q0> {
    final /* synthetic */ tra0 $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm2(tra0 tra0Var) {
        super(1);
        this.$placeable = tra0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tra0.a aVar) {
        aVar.q(this.$placeable, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return s3q0.a;
    }
}
