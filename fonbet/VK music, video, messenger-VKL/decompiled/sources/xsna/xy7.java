package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingSettingsInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.main.domain.BookingSettingsInteractor", f = "BookingSettingsInteractor.kt", l = {18}, m = "getBookingSettings")
/* loaded from: classes18.dex */
public final class xy7 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yy7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy7(yy7 yy7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yy7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
