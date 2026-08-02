package com.yandex.go.superapp.discovery.map.impl.experiments;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperimentRepository", f = "SuperAppDiscoveryMapExperimentRepository.kt", l = {44}, m = "getSettlementFocusingConfig", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
