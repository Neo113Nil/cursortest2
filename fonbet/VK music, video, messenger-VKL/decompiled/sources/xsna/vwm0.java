package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Share.kt */
@b6l(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, 426}, m = "onSubscription")
/* loaded from: classes8.dex */
public final class vwm0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wwm0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwm0(wwm0 wwm0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wwm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
