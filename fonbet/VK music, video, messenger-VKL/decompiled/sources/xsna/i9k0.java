package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SnapFlingBehavior.kt */
@b6l(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "fling", v = 1)
/* loaded from: classes11.dex */
public final class i9k0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m9k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9k0(m9k0 m9k0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = m9k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this);
    }
}
