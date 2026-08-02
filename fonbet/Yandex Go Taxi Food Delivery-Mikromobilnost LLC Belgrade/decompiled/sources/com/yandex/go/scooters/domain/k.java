package com.yandex.go.scooters.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class k implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.j0 a;

    public k(kotlinx.coroutines.flow.j0 j0Var) {
        this.a = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1 scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1) {
            scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1 = (ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1) continuation;
            int i2 = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.L$0 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.L$1 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.L$2 = null;
                    scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(jVar, scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1) == coroutineSingletons) {
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
        scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1 = new ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1(this, continuation);
        Object obj2 = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
