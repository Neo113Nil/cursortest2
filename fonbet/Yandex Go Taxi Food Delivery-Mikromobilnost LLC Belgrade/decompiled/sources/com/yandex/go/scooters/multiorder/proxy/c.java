package com.yandex.go.scooters.multiorder.proxy;

import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zda;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.scooters.utils.timers.h;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zda b;

    public c(vpr vprVar, zda zdaVar) {
        this.a = vprVar;
        this.b = zdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1 scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof ScootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1) {
            scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1 = (ScootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1) continuation;
            int i2 = scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<zuo0> list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (zuo0 zuo0Var : list) {
                        zda zdaVar = this.b;
                        arrayList.add(new g(((h) zdaVar.e).d(zuo0Var), zdaVar, zuo0Var));
                    }
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.L$0 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.L$1 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.L$2 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.L$3 = null;
                    scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(arrayList, scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1) == coroutineSingletons) {
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
        scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1 = new ScootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1(this, continuation);
        Object obj22 = scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderTrackingInteractor$listenOrders$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
