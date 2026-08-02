package com.yandex.go.taxi.tariffs.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.FetchTariffFromDeeplinkInteractorImpl", f = "FetchTariffFromDeeplinkInteractorImpl.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "findTariffClassFromPersonalState", v = 2)
/* loaded from: classes14.dex */
final class FetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
