package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingCalendarInteractorBase.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.domain.BookingCalendarInteractorBase", f = "BookingCalendarInteractorBase.kt", l = {39, 53}, m = "initialize$suspendImpl")
/* loaded from: classes18.dex */
public final class wm7<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vm7<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm7(vm7 vm7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vm7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return vm7.b(this.this$0, null, this);
    }
}
