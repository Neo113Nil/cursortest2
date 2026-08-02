package com.yandex.go.safety.center;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.bms;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class SafetyCenterButtonDisplayInteractorImpl$stateObservableFlow$1 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        return ((b) this.receiver).a((OrderStatusInfo) obj, (SafetyCenterExperiment) obj2, booleanValue);
    }
}
