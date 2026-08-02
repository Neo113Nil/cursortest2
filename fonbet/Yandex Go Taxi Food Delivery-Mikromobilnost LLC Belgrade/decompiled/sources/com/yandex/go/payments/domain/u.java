package com.yandex.go.payments.domain;

import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1;
import defpackage.a2a0;
import defpackage.a30;
import defpackage.b600;
import defpackage.fga0;
import defpackage.gkh;
import defpackage.jb7;
import defpackage.lv90;
import defpackage.lw90;
import defpackage.lz90;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o8h;
import defpackage.qmp;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u {
    public final tt2 a;
    public final b600 b;
    public final lw90 c;
    public final y d;
    public final gkh e;
    public final fga0 f;
    public final lz90 g;
    public final n20 h;
    public final zuj0 i;
    public final a2a0 j;
    public final i0 k;
    public final jb7 l;

    public u(tt2 tt2Var, b600 b600Var, lw90 lw90Var, y yVar, gkh gkhVar, a30 a30Var, fga0 fga0Var, lz90 lz90Var, n20 n20Var, zuj0 zuj0Var, a2a0 a2a0Var, i0 i0Var, jb7 jb7Var) {
        this.a = tt2Var;
        this.b = b600Var;
        this.c = lw90Var;
        this.d = yVar;
        this.e = gkhVar;
        this.f = fga0Var;
        this.g = lz90Var;
        this.h = n20Var;
        this.i = zuj0Var;
        this.j = a2a0Var;
        this.k = i0Var;
        this.l = jb7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(u uVar, lv90 lv90Var, ContinuationImpl continuationImpl) {
        MainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1 mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1;
        Object obj;
        int i;
        uVar.getClass();
        if (continuationImpl instanceof MainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1) {
            mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1 = (MainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1) continuationImpl;
            int i2 = mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.label = i2 - Integer.MIN_VALUE;
                obj = mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jb7 jb7Var = uVar.l;
                    mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.L$0 = lv90Var;
                    mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.label = 1;
                    ((o8h) jb7Var.b).getClass();
                    ((qmp) jb7Var.c).getClass();
                    obj = ((com.yandex.go.payments.experiments.g) jb7Var.w).b(mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                gkh gkhVar = uVar.e;
                gkhVar.a.getClass();
                gkhVar.b.getClass();
                return null;
            }
        }
        mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1 = new MainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1(uVar, continuationImpl);
        obj = mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final tpr b() {
        b600 b600Var = this.b;
        r rVar = new r(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(b600Var.a.a(), new MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1(null, b600Var))));
        tpr t = kotlinx.coroutines.flow.e.t(new t(((com.yandex.go.taxi.order.provider.a) this.h).a()));
        tpr t2 = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.k.b(), kotlinx.coroutines.flow.e.t(new o(kotlinx.coroutines.flow.e.I(this.f.z(), new MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$1()))), new MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3(this, null)));
        y yVar = this.d;
        kotlinx.coroutines.flow.internal.h K = kotlinx.coroutines.flow.e.K(yVar.b.a(), new x(yVar.c.a.a()));
        gkh gkhVar = this.e;
        gkhVar.a.getClass();
        gkhVar.b.getClass();
        tpr b = gkhVar.c.b();
        gkhVar.a.getClass();
        gkhVar.b.getClass();
        return kotlinx.coroutines.flow.e.t(new p(new tpr[]{rVar, t, t2, K, b, gkhVar.c.a()}, this));
    }
}
