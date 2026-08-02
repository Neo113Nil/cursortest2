package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2ExperimentRepository", f = "SuperAppDiscoveryMapV2ExperimentRepository.kt", l = {34}, m = "getSearchBarV2Config", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
