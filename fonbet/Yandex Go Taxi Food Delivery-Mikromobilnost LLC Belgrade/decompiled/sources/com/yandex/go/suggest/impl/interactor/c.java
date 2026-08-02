package com.yandex.go.suggest.impl.interactor;

import defpackage.ny61;
import defpackage.q4v0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q4v0 b;

    public c(vpr vprVar, q4v0 q4v0Var) {
        this.a = vprVar;
        this.b = q4v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1 superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1) {
            superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1 = (SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q4v0 q4v0Var = ((Boolean) obj).booleanValue() ? this.b : null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q4v0Var, superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1 = new SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
