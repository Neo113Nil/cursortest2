package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.interactor.MakeTariffRequestInteractor", f = "MakeTariffRequestInteractor.kt", l = {MSException.ERROR_INVALID_PARAMETER, 90}, m = "routeStatsWithoutETA", v = 2)
/* loaded from: classes14.dex */
final class MakeTariffRequestInteractor$routeStatsWithoutETA$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeTariffRequestInteractor$routeStatsWithoutETA$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
