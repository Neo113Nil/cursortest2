package com.yandex.go.scooters.mosru.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.mosru.domain.ScootersMosRuInteractor", f = "ScootersMosRuInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 59}, m = "shouldShowModalWindowForRemainingRides", v = 2)
/* loaded from: classes13.dex */
final class ScootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, null, this);
    }
}
