package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.f9;
import defpackage.lb7;
import defpackage.lnt;
import defpackage.qoi0;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class j extends lnt {
    public static final j f = new j();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m.INSTANCE.serializer(), qoi0.a(m.class));
    }

    @Override // defpackage.h9
    public final List f() {
        RoadObjectSettingsExperiment.RoadObjectType roadObjectType = RoadObjectSettingsExperiment.RoadObjectType.TRAFFIC_LIGHT;
        return Arrays.asList(new f9((String) h().invoke(roadObjectType), RoadObjectSettingsExperiment.TrafficLight.Companion.serializer(), qoi0.a(RoadObjectSettingsExperiment.TrafficLight.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return RoadObjectSettingsExperiment.RoadObjectType.Companion.serializer();
    }
}
