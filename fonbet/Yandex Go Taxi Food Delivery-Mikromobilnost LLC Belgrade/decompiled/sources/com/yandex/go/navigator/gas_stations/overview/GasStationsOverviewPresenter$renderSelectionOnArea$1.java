package com.yandex.go.navigator.gas_stations.overview;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter", f = "GasStationsOverviewPresenter.kt", l = {173}, m = "renderSelectionOnArea", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$renderSelectionOnArea$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsOverviewPresenter$renderSelectionOnArea$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.Lg(this.this$0, null, this);
    }
}
