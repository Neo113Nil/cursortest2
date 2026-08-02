package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingServicesInteractor", f = "BookingServicesInteractor.kt", l = {29, 52}, m = "getServiceResponse")
/* loaded from: classes18.dex */
public final class ix7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hx7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix7(hx7 hx7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hx7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
