package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushDeliveryComponent.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent", f = "PushDeliveryComponent.kt", l = {237, 238, 248}, m = "deleteExpiredMessages")
/* loaded from: classes5.dex */
public final class fhe0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nhe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhe0(nhe0 nhe0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nhe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return nhe0.b(this.this$0, null, null, this);
    }
}
