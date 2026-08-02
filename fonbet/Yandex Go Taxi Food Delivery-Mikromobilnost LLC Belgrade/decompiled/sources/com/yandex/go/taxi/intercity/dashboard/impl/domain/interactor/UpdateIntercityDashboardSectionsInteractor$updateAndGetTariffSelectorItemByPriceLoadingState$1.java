package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.UpdateIntercityDashboardSectionsInteractor", f = "UpdateIntercityDashboardSectionsInteractor.kt", l = {56}, m = "updateAndGetTariffSelectorItemByPriceLoadingState", v = 2)
/* loaded from: classes14.dex */
final class UpdateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.a(this.this$0, null, null, this);
    }
}
