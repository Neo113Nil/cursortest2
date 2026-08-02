package com.yandex.go.account.upgrade;

import defpackage.hl3;
import defpackage.kj;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public b(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1 accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1) {
            accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1 = (AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1) continuation;
            int i2 = accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hl3 hl3Var = (hl3) obj;
                    kj Ig = this.b.a.Ig();
                    Pair pair = new Pair(hl3Var, Ig != null ? Boolean.valueOf(Ig.n) : null);
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.L$0 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.L$1 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.L$2 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.L$3 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1) == coroutineSingletons) {
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
        accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1 = new AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1(this, continuation);
        Object obj22 = accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
