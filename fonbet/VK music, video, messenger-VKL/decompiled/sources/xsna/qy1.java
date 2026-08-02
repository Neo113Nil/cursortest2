package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnalyticsWebSocketListener.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.AnalyticsWebSocketListener", f = "AnalyticsWebSocketListener.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "requireConfig")
/* loaded from: classes5.dex */
public final class qy1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ oy1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy1(oy1 oy1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return oy1.a(this.this$0, this);
    }
}
