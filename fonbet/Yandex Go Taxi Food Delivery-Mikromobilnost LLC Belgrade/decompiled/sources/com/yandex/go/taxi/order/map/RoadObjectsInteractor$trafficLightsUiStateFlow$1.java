package com.yandex.go.taxi.order.map;

import defpackage.bms;
import defpackage.e901;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "La901;", "trafficLights", "Le901;", "cacheState", "", "isTrafficLightsWithSignalExperiment", "Lkotlin/Triple;", "<anonymous>", "(Ljava/util/List;Le901;Z)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trafficLightsUiStateFlow$1", f = "RoadObjectsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsInteractor$trafficLightsUiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        RoadObjectsInteractor$trafficLightsUiStateFlow$1 roadObjectsInteractor$trafficLightsUiStateFlow$1 = new RoadObjectsInteractor$trafficLightsUiStateFlow$1(4, (Continuation) obj4);
        roadObjectsInteractor$trafficLightsUiStateFlow$1.L$0 = (List) obj;
        roadObjectsInteractor$trafficLightsUiStateFlow$1.L$1 = (e901) obj2;
        roadObjectsInteractor$trafficLightsUiStateFlow$1.Z$0 = booleanValue;
        return roadObjectsInteractor$trafficLightsUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        e901 e901Var = (e901) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(list, e901Var, Boolean.valueOf(z));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
