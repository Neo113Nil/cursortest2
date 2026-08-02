package com.yandex.go.chargers.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class p implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;

    public p(kotlinx.coroutines.flow.internal.g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersOrdersStateRepositoryImpl$special$$inlined$map$1$1 chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersOrdersStateRepositoryImpl$special$$inlined$map$1$1) {
            chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1 = (ChargersOrdersStateRepositoryImpl$special$$inlined$map$1$1) continuation;
            int i2 = chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar);
                    chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.L$0 = null;
                    chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.L$1 = null;
                    chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.L$2 = null;
                    chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1 = new ChargersOrdersStateRepositoryImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrdersStateRepositoryImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
