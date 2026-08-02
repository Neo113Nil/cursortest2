package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.TarifficatorGooglePaymentSession", f = "TarifficatorGooglePaymentSession.kt", l = {MSException.ERROR_BUSY, 184}, m = "performPurchase")
/* loaded from: classes2.dex */
final class TarifficatorGooglePaymentSession$performPurchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorGooglePaymentSession$performPurchase$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
