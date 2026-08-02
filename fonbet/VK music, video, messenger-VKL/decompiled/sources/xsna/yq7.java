package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingMastersInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.masters.domain.BookingMastersInteractor", f = "BookingMastersInteractor.kt", l = {17}, m = "initialize")
/* loaded from: classes18.dex */
public final class yq7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zq7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq7(zq7 zq7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
