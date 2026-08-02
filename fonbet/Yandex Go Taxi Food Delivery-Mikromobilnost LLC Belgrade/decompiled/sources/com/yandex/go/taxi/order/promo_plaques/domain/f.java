package com.yandex.go.taxi.order.promo_plaques.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.xpf0;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xpf0 b;

    public f(vpr vprVar, xpf0 xpf0Var) {
        this.a = vprVar;
        this.b = xpf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1 promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1) {
            promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1 = (PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1) continuation;
            int i2 = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xpf0 xpf0Var = this.b;
                    ru.yandex.taxi.communications.b bVar = xpf0Var.b;
                    Set set = (Set) xpf0Var.a.b.a.getValue();
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$0 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$1 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$2 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$4 = vprVar;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$5 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$6 = null;
                    promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.a((List) obj, set, promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$0 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$1 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$2 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$3 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$4 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$5 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$6 = null;
                promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label = 2;
            }
        }
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1 = new PromoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1(this, continuation);
        Object obj22 = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$0 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$1 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$2 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$3 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$4 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$5 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.L$6 = null;
        promoPlaqueStyleInteractor$filterByShowPolicy$$inlined$map$1$2$1.label = 2;
    }
}
