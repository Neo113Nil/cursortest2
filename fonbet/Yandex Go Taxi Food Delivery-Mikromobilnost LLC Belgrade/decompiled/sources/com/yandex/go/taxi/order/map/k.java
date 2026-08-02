package com.yandex.go.taxi.order.map;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;

    public k(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RoadObjectsInteractor$settingsFlow$$inlined$map$1$1 roadObjectsInteractor$settingsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RoadObjectsInteractor$settingsFlow$$inlined$map$1$1) {
            roadObjectsInteractor$settingsFlow$$inlined$map$1$1 = (RoadObjectsInteractor$settingsFlow$$inlined$map$1$1) continuation;
            int i2 = roadObjectsInteractor$settingsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectsInteractor$settingsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roadObjectsInteractor$settingsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectsInteractor$settingsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    roadObjectsInteractor$settingsFlow$$inlined$map$1$1.L$0 = null;
                    roadObjectsInteractor$settingsFlow$$inlined$map$1$1.L$1 = null;
                    roadObjectsInteractor$settingsFlow$$inlined$map$1$1.L$2 = null;
                    roadObjectsInteractor$settingsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, roadObjectsInteractor$settingsFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        roadObjectsInteractor$settingsFlow$$inlined$map$1$1 = new RoadObjectsInteractor$settingsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = roadObjectsInteractor$settingsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectsInteractor$settingsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
