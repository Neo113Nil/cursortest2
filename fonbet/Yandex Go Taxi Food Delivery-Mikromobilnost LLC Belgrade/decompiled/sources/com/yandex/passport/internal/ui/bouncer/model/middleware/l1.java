package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.ny61;
import defpackage.tpr;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class l1 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.usecase.ui.e a;

    public l1(com.yandex.passport.internal.usecase.ui.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l1 l1Var, com.yandex.passport.internal.ui.bouncer.model.g1 g1Var, ContinuationImpl continuationImpl) {
        SortAccountsMiddleware$sortAccounts$1 sortAccountsMiddleware$sortAccounts$1;
        int i;
        l1Var.getClass();
        if (continuationImpl instanceof SortAccountsMiddleware$sortAccounts$1) {
            sortAccountsMiddleware$sortAccounts$1 = (SortAccountsMiddleware$sortAccounts$1) continuationImpl;
            int i2 = sortAccountsMiddleware$sortAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sortAccountsMiddleware$sortAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sortAccountsMiddleware$sortAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sortAccountsMiddleware$sortAccounts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.ui.e eVar = l1Var.a;
                    com.yandex.passport.internal.usecase.ui.d dVar = new com.yandex.passport.internal.usecase.ui.d(g1Var.b, g1Var.c);
                    sortAccountsMiddleware$sortAccounts$1.L$0 = g1Var;
                    sortAccountsMiddleware$sortAccounts$1.label = 1;
                    obj = eVar.a(dVar, sortAccountsMiddleware$sortAccounts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g1Var = (com.yandex.passport.internal.ui.bouncer.model.g1) sortAccountsMiddleware$sortAccounts$1.L$0;
                    kotlin.b.b(obj);
                }
                return new com.yandex.passport.internal.ui.bouncer.model.y(com.yandex.passport.internal.ui.bouncer.model.g1.a(g1Var, null, (List) obj, 61));
            }
        }
        sortAccountsMiddleware$sortAccounts$1 = new SortAccountsMiddleware$sortAccounts$1(l1Var, continuationImpl);
        Object obj2 = sortAccountsMiddleware$sortAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sortAccountsMiddleware$sortAccounts$1.label;
        if (i != 0) {
        }
        return new com.yandex.passport.internal.ui.bouncer.model.y(com.yandex.passport.internal.ui.bouncer.model.g1.a(g1Var, null, (List) obj2, 61));
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 21), this, 11);
    }
}
