package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
@b6l(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", l = {64, 197, 67, 207, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "aggregateFallback")
/* loaded from: classes12.dex */
public final class gzu extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public gzu() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kzu.c(null, null, this);
    }
}
