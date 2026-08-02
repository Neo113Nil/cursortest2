package com.yandex.go.scooters.offers.v2;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter", f = "ScootersCardV2Presenter.kt", l = {346}, m = "changeVehicleOnMap", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardV2Presenter$changeVehicleOnMap$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardV2Presenter$changeVehicleOnMap$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.Kg(this.this$0, null, this);
    }
}
