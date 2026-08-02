package com.yandex.go.taxi.order.map;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RoadObjectsInteractor$trackTrafficLightWithSignalExperiment$1 extends AdaptedFunctionReference implements zls {
    public static final RoadObjectsInteractor$trackTrafficLightWithSignalExperiment$1 a = new RoadObjectsInteractor$trackTrafficLightWithSignalExperiment$1(3, 4, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return new Pair(bool, (RoadObjectSettingsExperiment.TrafficLight) obj2);
    }
}
