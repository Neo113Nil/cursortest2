package com.yandex.go.scooters.live;

import defpackage.bxn0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ bxn0 b;

    public c(g gVar, bxn0 bxn0Var) {
        this.a = gVar;
        this.b = bxn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1 scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1) {
            scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1 = (ScootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1 = new ScootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLivePresenter$onStartCommand$2$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
