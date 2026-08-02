package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersSuperPassesUpsaleBookHandler", f = "ScootersSuperPassesUpsaleBookHandler.kt", l = {HProv.PP_CONTAINER_EXTENSION, HProv.PP_ENUM_LOG}, m = "showSuccessNotification", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.c(this.this$0, this);
    }
}
