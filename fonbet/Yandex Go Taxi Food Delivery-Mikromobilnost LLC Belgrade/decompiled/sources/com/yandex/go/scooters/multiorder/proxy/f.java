package com.yandex.go.scooters.multiorder.proxy;

import defpackage.avj0;
import defpackage.e3n;
import defpackage.ea90;
import defpackage.f501;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.lrj0;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.q6o0;
import defpackage.qje;
import defpackage.s6o0;
import defpackage.se90;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zda;
import defpackage.zuj0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes13.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zda b;
    public final /* synthetic */ zuo0 c;

    public f(vpr vprVar, zda zdaVar, zuo0 zuo0Var) {
        this.a = vprVar;
        this.b = zdaVar;
        this.c = zuo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1 scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1;
        int i;
        Pair pair;
        if (continuation instanceof ScootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1) {
            scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1 = (ScootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1) continuation;
            int i2 = scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) obj;
                    s6o0 s6o0Var = (s6o0) this.b.f;
                    s6o0Var.getClass();
                    zuo0 zuo0Var = this.c;
                    String m = zuo0Var.m();
                    zuj0 zuj0Var = s6o0Var.a;
                    if (zuo0Var instanceof ea90) {
                        ea90 ea90Var = (ea90) zuo0Var;
                        pair = new Pair(Integer.valueOf(kyh0.scooters_in_the_parking), s6o0Var.a(ea90Var.v, ea90Var.w, ea90Var.x));
                    } else if (zuo0Var instanceof se90) {
                        se90 se90Var = (se90) zuo0Var;
                        pair = new Pair(Integer.valueOf(kyh0.scooters_ontheway_parking), s6o0Var.a(se90Var.u, se90Var.v, se90Var.x));
                    } else if (zuo0Var instanceof nrk0) {
                        nrk0 nrk0Var = (nrk0) zuo0Var;
                        pair = new Pair(Integer.valueOf(kyh0.scooters_on_the_way), s6o0Var.a(nrk0Var.u, nrk0Var.w, nrk0Var.q));
                    } else {
                        if (!(zuo0Var instanceof lrj0)) {
                            w511.b();
                            return null;
                        }
                        Integer valueOf = Integer.valueOf(kyh0.scooters_ontheway_reservation);
                        int i3 = kyh0.scooters_reservation_free_until;
                        o430 o430Var = e3n.b;
                        pair = new Pair(valueOf, ((avj0) zuj0Var).i(i3, Long.valueOf(e3n.o(kp50.U(((lrj0) zuo0Var).x, DurationUnit.SECONDS), DurationUnit.MINUTES))));
                    }
                    int intValue = ((Number) pair.getFirst()).intValue();
                    String str2 = (String) pair.getSecond();
                    avj0 avj0Var = (avj0) zuj0Var;
                    int t = qje.t(xng0.textMain, avj0Var.a);
                    if (str == null) {
                        str = "";
                    }
                    q6o0 q6o0Var = new q6o0(m, f501.a, avj0Var.i(intValue, str), str2, t, t, zuo0Var);
                    scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.L$0 = null;
                    scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.L$1 = null;
                    scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.L$2 = null;
                    scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.L$3 = null;
                    scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q6o0Var, scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1 = new ScootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderTrackingInteractor$mapSessionToOrder$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
