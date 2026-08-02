package com.yandex.go.scooters.domain;

import defpackage.ny61;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1 scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1) {
            scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1 = (ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List C = uh6.C((sqm0) obj);
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(C, scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1 = new ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
