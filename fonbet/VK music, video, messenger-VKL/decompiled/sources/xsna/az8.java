package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CachingPushMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver", f = "CachingPushMessagesReceiver.kt", l = {112, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "sendPushMessagesCountAnalyticsIfNeeded")
/* loaded from: classes5.dex */
public final class az8 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bz8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az8(bz8 bz8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bz8.k(this.this$0, this);
    }
}
