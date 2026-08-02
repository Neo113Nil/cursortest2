package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BaseBookingEditInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.domain.BaseBookingEditInteractor", f = "BaseBookingEditInteractor.kt", l = {28}, m = "getPhoneInfo$suspendImpl")
/* loaded from: classes18.dex */
public final class e76 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g76 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e76(g76 g76Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = g76Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g76.c(this.this$0, this);
    }
}
