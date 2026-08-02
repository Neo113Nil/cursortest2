package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersSubscriptionUpsaleBookHandler", f = "ScootersSubscriptionUpsaleBookHandler.kt", l = {HProv.ALG_SID_SHA3_256, 81, HProv.ALG_SID_NO_HASH}, m = "startNativePurchaseFlow", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(null, this);
    }
}
