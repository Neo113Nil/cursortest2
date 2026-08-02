package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingGroupsEditInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.domain.BookingGroupsEditInteractor", f = "BookingGroupsEditInteractor.kt", l = {60}, m = "confirmBooking")
/* loaded from: classes18.dex */
public final class pq7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qq7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq7(qq7 qq7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, this);
    }
}
