package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnalyticsSendingTimestampDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.data.source.AnalyticsSendingTimestampDataSource", f = "AnalyticsSendingTimestampDataSource.kt", l = {13}, m = "setTimestampPushCountEventSending-gIAlu-s")
/* loaded from: classes5.dex */
public final class hy1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ iy1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy1(iy1 iy1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
