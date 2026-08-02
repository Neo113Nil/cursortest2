package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingGroupsCalendarInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.domain.BookingGroupsCalendarInteractor", f = "BookingGroupsCalendarInteractor.kt", l = {62}, m = "getAvailableTimeSlotsForDate")
/* loaded from: classes18.dex */
public final class nq7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mq7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq7(mq7 mq7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, false, this);
    }
}
