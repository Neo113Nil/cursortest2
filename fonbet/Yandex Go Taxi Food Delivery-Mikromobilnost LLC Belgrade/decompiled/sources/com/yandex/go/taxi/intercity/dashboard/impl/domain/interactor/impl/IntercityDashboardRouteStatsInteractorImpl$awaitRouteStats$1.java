package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.IntercityDashboardRouteStatsInteractorImpl", f = "IntercityDashboardRouteStatsInteractorImpl.kt", l = {30}, m = "awaitRouteStats", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
