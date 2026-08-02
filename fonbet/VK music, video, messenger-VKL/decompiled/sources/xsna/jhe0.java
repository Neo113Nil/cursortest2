package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushDeliveryComponent.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent", f = "PushDeliveryComponent.kt", l = {162, 166, 167, 169, 172, 180}, m = "sendMessagesToClient-0E7RQCE")
/* loaded from: classes5.dex */
public final class jhe0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nhe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhe0(nhe0 nhe0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nhe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = nhe0.c(this.this$0, null, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
