package com.yandex.go.account.upgrade;

import com.yandex.go.account.upgrade.ForceAccountUpgradeExperiment;
import com.yandex.passport.api.PassportAccountUpgradeStatus;
import defpackage.d6z;
import defpackage.e3n;
import defpackage.e921;
import defpackage.g921;
import defpackage.j921;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o921;
import defpackage.p921;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ForceAccountUpgradeExperiment b;
    public final /* synthetic */ f c;

    public d(vpr vprVar, ForceAccountUpgradeExperiment forceAccountUpgradeExperiment, f fVar) {
        this.a = vprVar;
        this.b = forceAccountUpgradeExperiment;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1 accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1;
        int i;
        Object p921Var;
        e921 e921Var;
        g921 g921Var;
        if (continuation instanceof AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1) {
            accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1 = (AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (com.yandex.passport.internal.ui.c.p((PassportAccountUpgradeStatus) obj)) {
                        ForceAccountUpgradeExperiment forceAccountUpgradeExperiment = this.b;
                        ForceAccountUpgradeExperiment.MenuItem menuItem = forceAccountUpgradeExperiment.e;
                        f fVar = this.c;
                        if (menuItem != null) {
                            fVar.getClass();
                            e921Var = new e921(d6z.Y(forceAccountUpgradeExperiment, menuItem.a), d6z.Y(forceAccountUpgradeExperiment, menuItem.b));
                        } else {
                            e921Var = null;
                        }
                        ForceAccountUpgradeExperiment.ModalView modalView = forceAccountUpgradeExperiment.f;
                        if (modalView != null) {
                            j921 j921Var = fVar.f;
                            double d = modalView.d;
                            long d2 = j921Var.a.d();
                            long longValue = ((Number) j921Var.b.getValue(j921Var, j921.c[0])).longValue();
                            o430 o430Var = e3n.b;
                            if (d2 > e3n.e(kp50.T(d, DurationUnit.SECONDS)) + longValue) {
                                g921Var = new g921(d6z.Y(forceAccountUpgradeExperiment, modalView.a), d6z.Y(forceAccountUpgradeExperiment, modalView.b), d6z.Y(forceAccountUpgradeExperiment, modalView.c));
                                p921Var = new p921(e921Var, g921Var);
                            }
                        }
                        g921Var = null;
                        p921Var = new p921(e921Var, g921Var);
                    } else {
                        p921Var = o921.a;
                    }
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.L$0 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.L$1 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.L$2 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.L$3 = null;
                    accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(p921Var, accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
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
        accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1 = new AccountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountUpgradeInteractorImpl$shouldUpgradeAccount$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
