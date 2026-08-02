package com.yandex.go.superapp.orders.card.experiments;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardRepository", f = "SuperappTrackingCardRepository.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_CONTAINER_EXTENSION_DEL}, m = "trackingCardColors", v = 2)
/* loaded from: classes14.dex */
final class SuperappTrackingCardRepository$trackingCardColors$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardRepository$trackingCardColors$1(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.P(null, this);
    }
}
