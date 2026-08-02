package com.yandex.go.taxi.order.multi.tracking;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter", f = "TaxiOrderTrackingPresenter.kt", l = {157}, m = "subscribePresenceMonitoring", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderTrackingPresenter$subscribePresenceMonitoring$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingPresenter$subscribePresenceMonitoring$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.Kg(this.this$0, this);
    }
}
