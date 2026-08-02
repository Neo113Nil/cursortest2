package com.yandex.go.scooters.offers.v2.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersBehaviourStateHeightsInteractor", f = "ScootersBehaviourStateHeightsInteractor.kt", l = {36, 38, 42, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "calculateBehaviourStateHeights", v = 2)
/* loaded from: classes13.dex */
final class ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
