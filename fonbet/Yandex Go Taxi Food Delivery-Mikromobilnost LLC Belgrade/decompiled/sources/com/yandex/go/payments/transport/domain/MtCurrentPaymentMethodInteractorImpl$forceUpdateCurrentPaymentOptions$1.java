package com.yandex.go.payments.transport.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.transport.domain.MtCurrentPaymentMethodInteractorImpl", f = "MtCurrentPaymentMethodInteractorImpl.kt", l = {164, HProv.PP_FAST_CODE, HProv.PP_CONTAINER_EXTENSION_DEL}, m = "forceUpdateCurrentPaymentOptions", v = 2)
/* loaded from: classes13.dex */
final class MtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, false, this);
    }
}
