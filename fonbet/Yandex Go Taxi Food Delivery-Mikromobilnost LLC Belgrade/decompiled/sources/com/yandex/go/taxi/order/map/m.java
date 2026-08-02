package com.yandex.go.taxi.order.map;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;

    public m(kotlinx.coroutines.flow.internal.g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RoadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1 roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof RoadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1) {
            roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1 = (RoadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar);
                    roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1 = new RoadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectsInteractor$trackDataFromExperiment$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
