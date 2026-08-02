package com.yandex.go.taxi.order.map;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.e901;
import defpackage.hgr0;
import defpackage.mo6;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public h(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d0, code lost:
    
        if (r11.emit(r0, r7) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1 roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        e901 e901Var;
        vpr vprVar2;
        RoadObjectSettingsExperiment.TrafficLight trafficLight;
        mo6 mo6Var;
        if (continuation instanceof RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1) {
            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1 = (RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1) continuation;
            int i2 = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1 roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12 = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1;
                Object obj2 = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e901 e901Var2 = (e901) obj;
                    boolean z = e901Var2.e.a;
                    vprVar = this.a;
                    if (z) {
                        RoadObjectSettingsExperiment.TrafficLight trafficLight2 = e901Var2.d;
                        if (trafficLight2 != null) {
                            n nVar = this.b;
                            ru.yandex.taxi.design.utils.b bVar = nVar.f;
                            int u = tje.u(14, nVar.a);
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$0 = null;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$1 = null;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$2 = null;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$3 = null;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$4 = vprVar;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$5 = null;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$6 = e901Var2;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$7 = trafficLight2;
                            roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.label = 1;
                            Object e = ru.yandex.taxi.design.utils.b.e(bVar, u, hgr0.e, false, roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12, 12);
                            if (e != coroutineSingletons) {
                                e901Var = e901Var2;
                                vprVar2 = vprVar;
                                obj2 = e;
                                trafficLight = trafficLight2;
                            }
                            return coroutineSingletons;
                        }
                        mo6Var = mo6.g;
                    } else {
                        mo6Var = mo6.g;
                    }
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$0 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$1 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$2 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$3 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$4 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$5 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$6 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$7 = null;
                    roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    trafficLight = (RoadObjectSettingsExperiment.TrafficLight) roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$7;
                    e901Var = (e901) roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$6;
                    vprVar2 = (vpr) roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                String str = e901Var.e.c;
                float f = trafficLight.a;
                float f2 = trafficLight.b;
                ThemeType themeType = ThemeType.LIGHT;
                mo6Var = new mo6(str, (Drawable) obj2, f, f2, themeType, themeType);
                vprVar = vprVar2;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$0 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$1 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$2 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$3 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$4 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$5 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$6 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.L$7 = null;
                roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$12.label = 2;
            }
        }
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1 = new RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1(this, continuation);
        RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1 roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122 = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1;
        Object obj22 = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        String str2 = e901Var.e.c;
        float f3 = trafficLight.a;
        float f22 = trafficLight.b;
        ThemeType themeType2 = ThemeType.LIGHT;
        mo6Var = new mo6(str2, (Drawable) obj22, f3, f22, themeType2, themeType2);
        vprVar = vprVar2;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$0 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$1 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$2 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$3 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$4 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$5 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$6 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.L$7 = null;
        roadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$122.label = 2;
    }
}
