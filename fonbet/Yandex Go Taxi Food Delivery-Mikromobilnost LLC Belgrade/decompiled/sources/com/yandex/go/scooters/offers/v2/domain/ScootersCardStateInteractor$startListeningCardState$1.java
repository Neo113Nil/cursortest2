package com.yandex.go.scooters.offers.v2.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor", f = "ScootersCardStateInteractor.kt", l = {HProv.ALG_SID_SHA3_224}, m = "startListeningCardState", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardStateInteractor$startListeningCardState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardStateInteractor$startListeningCardState$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.c(this.this$0, this);
    }
}
