package com.yandex.go.taxi.order.map;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;

    public p(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RoadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1 roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Boolean valueOf;
        if (continuation instanceof RoadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1) {
            roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1 = (RoadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    RoadObjectSettingsExperiment.TrafficLight trafficLight = (RoadObjectSettingsExperiment.TrafficLight) pair.getFirst();
                    float floatValue = ((Number) pair.getSecond()).floatValue();
                    if (trafficLight == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(trafficLight.a <= floatValue && floatValue <= trafficLight.b);
                    }
                    if (valueOf != null) {
                        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(valueOf, roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1 = new RoadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectsOverlayPresenter$visibilityFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
