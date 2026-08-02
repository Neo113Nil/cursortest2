package com.yandex.go.scooters.mosru.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.mosru.domain.ScootersMosRuInteractor", f = "ScootersMosRuInteractor.kt", l = {HProv.ALG_SID_SHA3_224}, m = "shouldShowInfoPanelOnDiscoveryForRemainingRides", v = 2)
/* loaded from: classes13.dex */
final class ScootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
