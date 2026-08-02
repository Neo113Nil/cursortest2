package com.yandex.go.tariffcard.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.m0 a;

    public q(kotlinx.coroutines.flow.m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1 tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1) {
            tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1 = (TariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar);
                    tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1 = new TariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$deliveryBadgesFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
