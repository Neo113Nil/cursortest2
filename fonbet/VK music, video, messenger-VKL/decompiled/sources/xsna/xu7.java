package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingRecordInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.common.domain.BookingRecordInteractor", f = "BookingRecordInteractor.kt", l = {38}, m = "loadRecord")
/* loaded from: classes18.dex */
public final class xu7 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zu7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu7(zu7 zu7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zu7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, null, null, this);
    }
}
