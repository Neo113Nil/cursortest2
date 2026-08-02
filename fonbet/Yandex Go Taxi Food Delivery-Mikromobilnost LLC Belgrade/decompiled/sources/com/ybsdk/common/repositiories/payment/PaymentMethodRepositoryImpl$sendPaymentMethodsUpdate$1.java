package com.ybsdk.common.repositiories.payment;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl", f = "PaymentMethodRepositoryImpl.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "sendPaymentMethodsUpdate")
/* loaded from: classes2.dex */
final class PaymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
