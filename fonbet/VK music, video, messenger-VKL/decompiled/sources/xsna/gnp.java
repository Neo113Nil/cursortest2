package xsna;

import androidx.compose.animation.EnterExitState;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;
import xsna.wlp0;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class gnp extends Lambda implements izs<wlp0.b<EnterExitState>, phr<lkp0>> {
    public static final gnp i = new gnp(1);

    @Override // xsna.izs
    public final phr<lkp0> invoke(wlp0.b<EnterExitState> bVar) {
        return jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
    }
}
