package com.yandex.go.chargers.offer.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.offer.domain.ChargersCreateOfferInteractor", f = "ChargersCreateOfferInteractor.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "getChargersOffer", v = 2)
/* loaded from: classes12.dex */
final class ChargersCreateOfferInteractor$getChargersOffer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCreateOfferInteractor$getChargersOffer$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, null, this);
    }
}
