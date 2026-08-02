package com.yandex.go.promocodes.base.impl.promo_codes.data.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.PromoCodesRepositoryImpl", f = "PromoCodesRepositoryImpl.kt", l = {HProv.PP_HASHOID, HProv.PP_CIPHEROID, HProv.PP_CIPHEROID, HProv.PP_DHOID}, m = "promoCodesList-0E7RQCE", v = 2)
/* loaded from: classes8.dex */
final class PromoCodesRepositoryImpl$promoCodesList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodesRepositoryImpl$promoCodesList$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object l = this.this$0.l(null, null, this);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : new Result(l);
    }
}
