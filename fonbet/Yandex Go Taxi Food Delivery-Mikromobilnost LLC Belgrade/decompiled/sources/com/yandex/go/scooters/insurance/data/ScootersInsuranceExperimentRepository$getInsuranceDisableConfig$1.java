package com.yandex.go.scooters.insurance.data;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.insurance.data.ScootersInsuranceExperimentRepository", f = "ScootersInsuranceExperimentRepository.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, 83}, m = "getInsuranceDisableConfig", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
