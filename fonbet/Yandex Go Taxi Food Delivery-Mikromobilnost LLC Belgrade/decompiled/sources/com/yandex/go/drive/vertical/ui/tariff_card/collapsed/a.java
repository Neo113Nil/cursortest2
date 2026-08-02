package com.yandex.go.drive.vertical.ui.tariff_card.collapsed;

import defpackage.fnx0;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1 driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DriveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1) {
            driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1 = (DriveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kb5 kb5Var = ((fnx0) obj).e;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kb5Var, driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
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
        driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1 = new DriveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveTariffCardCollapsedPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
