package com.yandex.go.navigator.gas_stations.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository", f = "GasStationsFocusRectReadyRequestRepository.kt", l = {18}, m = "awaitFocusRectReady", v = 2)
/* loaded from: classes12.dex */
final class GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GasStationsFocusRectReadyRequestRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1(GasStationsFocusRectReadyRequestRepository gasStationsFocusRectReadyRequestRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gasStationsFocusRectReadyRequestRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(this);
    }
}
