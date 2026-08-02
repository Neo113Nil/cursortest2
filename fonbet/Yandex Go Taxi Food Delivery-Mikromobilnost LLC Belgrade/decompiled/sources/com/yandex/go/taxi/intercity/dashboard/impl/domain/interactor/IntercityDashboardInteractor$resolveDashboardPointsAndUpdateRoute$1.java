package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardInteractor", f = "IntercityDashboardInteractor.kt", l = {193}, m = "resolveDashboardPointsAndUpdateRoute", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.o(null, this);
    }
}
