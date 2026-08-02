package com.yandex.plus.pay.inapp.google.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.inapp.google.internal.GoogleBilling7PlusPayInAppPaymentFacade", f = "GoogleBilling7PlusPayInAppPaymentFacade.kt", l = {HProv.PP_NK_SYNC}, m = "getConfig")
/* loaded from: classes8.dex */
final class GoogleBilling7PlusPayInAppPaymentFacade$getConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleBilling7PlusPayInAppPaymentFacade$getConfig$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
