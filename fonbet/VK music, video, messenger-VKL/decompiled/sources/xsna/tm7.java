package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingCalendarInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.domain.BookingCalendarInteractor", f = "BookingCalendarInteractor.kt", l = {54}, m = "getAvailableTimeSlotsForDate")
/* loaded from: classes18.dex */
public final class tm7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sm7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm7(sm7 sm7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sm7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, false, this);
    }
}
