package com.yandex.go.navigator.gas_stations.filters;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2", f = "GasStationsFiltersPresenter.kt", l = {HProv.PP_SIGNATUREOID}, m = "emit", v = 2)
/* loaded from: classes12.dex */
public final class GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
