package com.yandex.go.taxi.order.promo_plaques.domain;

import defpackage.ha2;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;

    public k(ha2 ha2Var) {
        this.a = ha2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1 promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1;
        int i;
        if (continuation instanceof PromoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1) {
            promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1 = (PromoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1) continuation;
            int i2 = promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.L$0 = null;
                    promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.L$1 = null;
                    promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.L$2 = null;
                    promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1) == coroutineSingletons) {
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
        promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1 = new PromoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1(this, continuation);
        Object obj2 = promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoPlaqueStyleInteractor$filterTopSectionCommunications$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
