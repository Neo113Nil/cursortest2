package com.yandex.go.chargers.data;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class n implements tpr {
    public final /* synthetic */ gci0 a;

    public n(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1 chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1;
        int i;
        if (continuation instanceof ChargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1) {
            chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1 = (ChargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1) continuation;
            int i2 = chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar);
                    chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.L$0 = null;
                    chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.L$1 = null;
                    chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.L$2 = null;
                    chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.label = 1;
                    if (this.a.a.collect(mVar, chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1) == coroutineSingletons) {
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
        chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1 = new ChargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1(this, continuation);
        Object obj2 = chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrdersStateRepositoryImpl$currentActiveOrdersStateFlow$lambda$1$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
