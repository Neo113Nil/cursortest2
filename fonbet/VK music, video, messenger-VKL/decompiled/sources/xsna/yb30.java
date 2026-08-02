package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MouseWheelScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollingLogic.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 273}, m = "dispatchMouseWheelScroll", v = 1)
/* loaded from: classes11.dex */
public final class yb30 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xb30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb30(xb30 xb30Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xb30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return xb30.c(this.this$0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
