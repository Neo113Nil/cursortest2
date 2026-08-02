package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ApiCallRetryPolicy.kt */
@b6l(c = "com.vk.network.eventhub.impl.ApiCallRetryPolicy", f = "ApiCallRetryPolicy.kt", l = {59, 68}, m = "awaitNextAttempt")
/* loaded from: classes3.dex */
public final class dx2 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gx2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx2(gx2 gx2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gx2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0, 0L, this);
    }
}
