package com.yandex.go.zone.repository;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ZoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1 zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        Integer num;
        if (continuation instanceof ZoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1) {
            zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1 = (ZoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ZoneAnticrisisAmExperiment zoneAnticrisisAmExperiment = (ZoneAnticrisisAmExperiment) obj;
                    if (zoneAnticrisisAmExperiment.b) {
                        int i3 = zoneAnticrisisAmExperiment.d;
                        if (i3 < 100) {
                            i3 = 100;
                        }
                        num = new Integer(i3);
                    } else {
                        num = null;
                    }
                    zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(num, zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1 = new ZoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneAnticrisisInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
