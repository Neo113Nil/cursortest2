package com.yandex.go.taxi.order.map;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RoadObjectSettingsRepository$special$$inlined$map$2$2$1 roadObjectSettingsRepository$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof RoadObjectSettingsRepository$special$$inlined$map$2$2$1) {
            roadObjectSettingsRepository$special$$inlined$map$2$2$1 = (RoadObjectSettingsRepository$special$$inlined$map$2$2$1) continuation;
            int i2 = roadObjectSettingsRepository$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectSettingsRepository$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = roadObjectSettingsRepository$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectSettingsRepository$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((TaxiOrder) obj).V().f(SimpleBooleanExperiment.TRAFFIC_LIGHTS_WITH_SIGNAL_ENABLED));
                    roadObjectSettingsRepository$special$$inlined$map$2$2$1.L$0 = null;
                    roadObjectSettingsRepository$special$$inlined$map$2$2$1.L$1 = null;
                    roadObjectSettingsRepository$special$$inlined$map$2$2$1.L$2 = null;
                    roadObjectSettingsRepository$special$$inlined$map$2$2$1.L$3 = null;
                    roadObjectSettingsRepository$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, roadObjectSettingsRepository$special$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        roadObjectSettingsRepository$special$$inlined$map$2$2$1 = new RoadObjectSettingsRepository$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = roadObjectSettingsRepository$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectSettingsRepository$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
