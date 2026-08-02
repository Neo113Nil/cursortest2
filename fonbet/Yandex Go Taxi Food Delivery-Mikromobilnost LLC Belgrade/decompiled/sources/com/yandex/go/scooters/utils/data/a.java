package com.yandex.go.scooters.utils.data;

import defpackage.dvw;
import defpackage.g8m0;
import defpackage.gtq0;
import defpackage.j18;
import defpackage.lse;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.ru8;
import defpackage.tj;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public abstract class a {
    public final tse a;
    public final ru8 b = new ru8(lse.a, 5);
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public a(tse tseVar) {
        this.a = tseVar;
        gtq0.t(tseVar, new g8m0(27, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersCoroutineBridgeRepository$launch$1 scootersCoroutineBridgeRepository$launch$1;
        int i;
        if (continuationImpl instanceof ScootersCoroutineBridgeRepository$launch$1) {
            scootersCoroutineBridgeRepository$launch$1 = (ScootersCoroutineBridgeRepository$launch$1) continuationImpl;
            int i2 = scootersCoroutineBridgeRepository$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCoroutineBridgeRepository$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCoroutineBridgeRepository$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCoroutineBridgeRepository$launch$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersCoroutineBridgeRepository$launch$1.L$0 = tlsVar;
                    scootersCoroutineBridgeRepository$launch$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersCoroutineBridgeRepository$launch$1));
                    j18Var.u();
                    tje.N(this.a, null, null, new ScootersCoroutineBridgeRepository$continuationLaunch$1(tlsVar, j18Var, null), 3);
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersCoroutineBridgeRepository$launch$1 = new ScootersCoroutineBridgeRepository$launch$1(this, continuationImpl);
        Object obj2 = scootersCoroutineBridgeRepository$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCoroutineBridgeRepository$launch$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersCoroutineBridgeRepository$launchWithSave$1 scootersCoroutineBridgeRepository$launchWithSave$1;
        int i;
        if (continuationImpl instanceof ScootersCoroutineBridgeRepository$launchWithSave$1) {
            scootersCoroutineBridgeRepository$launchWithSave$1 = (ScootersCoroutineBridgeRepository$launchWithSave$1) continuationImpl;
            int i2 = scootersCoroutineBridgeRepository$launchWithSave$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCoroutineBridgeRepository$launchWithSave$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCoroutineBridgeRepository$launchWithSave$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCoroutineBridgeRepository$launchWithSave$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersCoroutineBridgeRepository$launchWithSave$1.L$0 = str;
                    scootersCoroutineBridgeRepository$launchWithSave$1.L$1 = tlsVar;
                    scootersCoroutineBridgeRepository$launchWithSave$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersCoroutineBridgeRepository$launchWithSave$1));
                    j18Var.u();
                    tje.N(this.a, null, null, new ScootersCoroutineBridgeRepository$continuationLaunch$1(tlsVar, j18Var, null), 3).w(new tj(22, this, str));
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersCoroutineBridgeRepository$launchWithSave$1 = new ScootersCoroutineBridgeRepository$launchWithSave$1(this, continuationImpl);
        Object obj2 = scootersCoroutineBridgeRepository$launchWithSave$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCoroutineBridgeRepository$launchWithSave$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final pzt0 c(tls tlsVar) {
        return tje.N(this.a, this.b, null, new ScootersCoroutineBridgeRepository$safeLaunch$1(tlsVar, null), 2);
    }
}
