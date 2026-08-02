package com.yandex.go.taxi.order.promo_plaques.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xpf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ xpf0 b;

    public g(tpr tprVar, xpf0 xpf0Var) {
        this.a = tprVar;
        this.b = xpf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1 promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1;
        int i;
        if (continuation instanceof PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1) {
            promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1 = (PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1) continuation;
            int i2 = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.L$0 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.L$1 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.L$2 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1) == coroutineSingletons) {
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
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1 = new PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1(this, continuation);
        Object obj2 = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
