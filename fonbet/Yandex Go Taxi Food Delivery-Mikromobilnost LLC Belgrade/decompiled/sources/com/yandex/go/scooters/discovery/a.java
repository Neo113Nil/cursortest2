package com.yandex.go.scooters.discovery;

import defpackage.ny61;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1 scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1) {
            scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1 = (ScootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(uh6.z((sqm0) obj));
                    scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1 = new ScootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryPresenter$listenActiveOrders$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
