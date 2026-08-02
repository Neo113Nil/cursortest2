package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.TaxiOrderHolderRepositoryImpl", f = "TaxiOrderHolderRepositoryImpl.kt", l = {HProv.PP_BIO_STATISTICA_LEN, 101}, m = "markMostActive", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderHolderRepositoryImpl$markMostActive$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderHolderRepositoryImpl$markMostActive$1(e0 e0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.w(null, this);
    }
}
