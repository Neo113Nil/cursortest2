package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.ny61;
import defpackage.o370;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c0 implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;
    public final /* synthetic */ o370 b;

    public c0(com.yandex.go.navigation.screen.b bVar, o370 o370Var) {
        this.a = bVar;
        this.b = o370Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$1 routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$1) {
            routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1 = (RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$1) continuation;
            int i2 = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = new b0(vprVar, this.b);
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.L$0 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.L$1 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.L$2 = null;
                    routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(b0Var, routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1 = new RouteStatsModeInteractor$rsModeFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStatsModeInteractor$rsModeFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
