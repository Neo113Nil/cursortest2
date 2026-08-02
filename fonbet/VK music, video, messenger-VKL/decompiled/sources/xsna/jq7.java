package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingGroupServiceInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingGroupServiceInteractor", f = "BookingGroupServiceInteractor.kt", l = {30}, m = "getServiceResponse")
/* loaded from: classes18.dex */
public final class jq7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kq7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq7(kq7 kq7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
