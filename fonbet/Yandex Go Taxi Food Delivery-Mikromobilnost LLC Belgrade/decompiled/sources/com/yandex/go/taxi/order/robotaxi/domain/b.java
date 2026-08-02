package com.yandex.go.taxi.order.robotaxi.domain;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.uvk0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ uvk0 b;

    public b(rol0 rol0Var, uvk0 uvk0Var) {
        this.a = rol0Var;
        this.b = uvk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1 robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1) {
            robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1 = (RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1 = new RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
