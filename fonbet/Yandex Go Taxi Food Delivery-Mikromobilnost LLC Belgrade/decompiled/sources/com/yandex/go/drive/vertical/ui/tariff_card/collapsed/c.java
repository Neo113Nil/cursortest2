package com.yandex.go.drive.vertical.ui.tariff_card.collapsed;

import defpackage.ggm;
import defpackage.hx0;
import defpackage.ny61;
import defpackage.u0c0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ggm b;

    public c(vpr vprVar, ggm ggmVar) {
        this.a = vprVar;
        this.b = ggmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1 driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof DriveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1) {
            driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1 = (DriveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1) continuation;
            int i2 = driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    u0c0 u0c0Var = (u0c0) obj;
                    this.b.getClass();
                    hx0 hx0Var = new hx0(u0c0Var.a.c, u0c0Var.b.c);
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.L$0 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.L$1 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.L$2 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.L$3 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(hx0Var, driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1) == coroutineSingletons) {
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
        driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1 = new DriveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1(this, continuation);
        Object obj22 = driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveTariffCardCollapsedPresenter$attachView$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
