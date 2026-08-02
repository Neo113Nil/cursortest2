package com.yandex.go.taxi.order.robotaxi.domain;

import defpackage.ny61;
import defpackage.uvk0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ uvk0 b;

    public a(vpr vprVar, uvk0 uvk0Var) {
        this.a = vprVar;
        this.b = uvk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1 robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1) {
            robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1 = (RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    uvk0 a = uvk0.a(this.b, (UiStateDrawableWrapper) obj);
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1 = new RobotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = robotaxiInteractor$uiStateFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
