package com.yandex.go.suggest.impl.interactor;

import defpackage.ny61;
import defpackage.q4v0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ q4v0 b;

    public d(tpr tprVar, q4v0 q4v0Var) {
        this.a = tprVar;
        this.b = q4v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1 superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1) {
            superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1 = (SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1 = new SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
