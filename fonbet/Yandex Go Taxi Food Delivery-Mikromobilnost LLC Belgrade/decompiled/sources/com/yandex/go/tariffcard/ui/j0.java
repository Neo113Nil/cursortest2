package com.yandex.go.tariffcard.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j0 implements tpr {
    public final /* synthetic */ tpr a;

    public j0(kotlinx.coroutines.flow.r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1 tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1) {
            tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1 = (TariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i0 i0Var = new i0(vprVar);
                    tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.L$0 = null;
                    tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.L$1 = null;
                    tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.L$2 = null;
                    tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.label = 1;
                    if (this.a.collect(i0Var, tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1 = new TariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1(this, continuation);
        Object obj2 = tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$orderButtonFlow$lambda$0$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
