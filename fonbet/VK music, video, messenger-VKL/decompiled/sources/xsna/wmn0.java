package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SwipeableV2.kt */
@b6l(c = "com.vk.core.compose.utils.swipable.SwipeableV2State", f = "SwipeableV2.kt", l = {Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE}, m = "animateTo")
/* loaded from: classes17.dex */
public final class wmn0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ymn0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmn0(ymn0 ymn0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ymn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
