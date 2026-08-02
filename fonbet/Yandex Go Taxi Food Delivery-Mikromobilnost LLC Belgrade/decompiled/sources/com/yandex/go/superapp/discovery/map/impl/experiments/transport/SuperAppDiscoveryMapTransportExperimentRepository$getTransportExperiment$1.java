package com.yandex.go.superapp.discovery.map.impl.experiments.transport;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperimentRepository", f = "SuperAppDiscoveryMapTransportExperimentRepository.kt", l = {30}, m = "getTransportExperiment", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
