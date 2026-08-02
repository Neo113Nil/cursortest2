package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingCalendarInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.domain.BookingCalendarInteractor", f = "BookingCalendarInteractor.kt", l = {23}, m = "loadDays")
/* loaded from: classes18.dex */
public final class um7 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sm7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um7(sm7 sm7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sm7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, false, this);
    }
}
