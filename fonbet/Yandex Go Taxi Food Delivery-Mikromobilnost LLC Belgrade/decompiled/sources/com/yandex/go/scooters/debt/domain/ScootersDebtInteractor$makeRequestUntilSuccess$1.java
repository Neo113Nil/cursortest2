package com.yandex.go.scooters.debt.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.debt.domain.ScootersDebtInteractor", f = "ScootersDebtInteractor.kt", l = {HProv.PP_SIGNATUREOID, HProv.PP_BIO_STATISTICA_LEN}, m = "makeRequestUntilSuccess", v = 2)
/* loaded from: classes13.dex */
final class ScootersDebtInteractor$makeRequestUntilSuccess$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDebtInteractor$makeRequestUntilSuccess$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, 0L, this);
    }
}
