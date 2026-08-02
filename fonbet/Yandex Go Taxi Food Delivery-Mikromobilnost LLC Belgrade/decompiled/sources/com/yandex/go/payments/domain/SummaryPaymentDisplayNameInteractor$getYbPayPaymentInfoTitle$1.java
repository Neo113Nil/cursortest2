package com.yandex.go.payments.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.domain.SummaryPaymentDisplayNameInteractor", f = "SummaryPaymentDisplayNameInteractor.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "getYbPayPaymentInfoTitle", v = 2)
/* loaded from: classes13.dex */
final class SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$1(p0 p0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, false, this);
    }
}
