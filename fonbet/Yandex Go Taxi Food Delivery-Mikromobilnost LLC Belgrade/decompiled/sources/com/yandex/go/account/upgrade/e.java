package com.yandex.go.account.upgrade;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ ForceAccountUpgradeExperiment b;
    public final /* synthetic */ f c;

    public e(rol0 rol0Var, ForceAccountUpgradeExperiment forceAccountUpgradeExperiment, f fVar) {
        this.a = rol0Var;
        this.b = forceAccountUpgradeExperiment;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1 accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1;
        int i;
        if (continuation instanceof AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1) {
            accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1 = (AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1) continuation;
            int i2 = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b, this.c);
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.L$0 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.L$1 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.L$2 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1) == coroutineSingletons) {
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
        accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1 = new AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1(this, continuation);
        Object obj2 = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
