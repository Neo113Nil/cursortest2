package com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionViewModel", f = "QrPaymentsSubscriptionViewModel.kt", l = {82, HProv.PP_HASHOID}, m = "getSubscriptionStatusesV2")
/* loaded from: classes3.dex */
final class QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b0(this.this$0, null, this);
    }
}
