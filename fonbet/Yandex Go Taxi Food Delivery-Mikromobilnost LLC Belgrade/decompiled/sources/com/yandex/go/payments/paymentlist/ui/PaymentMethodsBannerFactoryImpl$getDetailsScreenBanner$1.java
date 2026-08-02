package com.yandex.go.payments.paymentlist.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.ui.PaymentMethodsBannerFactoryImpl", f = "PaymentMethodsBannerFactoryImpl.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "getDetailsScreenBanner", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
