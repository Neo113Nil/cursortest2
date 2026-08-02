package com.yandex.go.places.impl.ui.payments.processing;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.payments.processing.PaymentsProcessingPresenter", f = "PaymentsProcessingPresenter.kt", l = {85, MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_224}, m = "processResult", v = 2)
/* loaded from: classes13.dex */
final class PaymentsProcessingPresenter$processResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsProcessingPresenter$processResult$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Ng(null, null, this);
    }
}
