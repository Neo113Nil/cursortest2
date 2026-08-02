package com.yandex.go.drive.vertical.ui.tariff_card;

import defpackage.ahm;
import defpackage.cem;
import defpackage.d0l0;
import defpackage.dem;
import defpackage.dhm;
import defpackage.eem;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ahm b;

    public a(vpr vprVar, ahm ahmVar) {
        this.a = vprVar;
        this.b = ahmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveTariffCardPresenter$attachView$$inlined$map$1$2$1 driveTariffCardPresenter$attachView$$inlined$map$1$2$1;
        int i;
        Object eemVar;
        if (continuation instanceof DriveTariffCardPresenter$attachView$$inlined$map$1$2$1) {
            driveTariffCardPresenter$attachView$$inlined$map$1$2$1 = (DriveTariffCardPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = driveTariffCardPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveTariffCardPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveTariffCardPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveTariffCardPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    dhm dhmVar = pex0Var.Y;
                    String str = pex0Var.G;
                    if (dhmVar != null) {
                        d0l0 c = this.b.D.c();
                        eemVar = new dem(c.h(), c.b, dhmVar.b, dhmVar.a);
                    } else {
                        eemVar = jl40.l(str, "drive_not_registered") ? cem.a : new eem(str);
                    }
                    driveTariffCardPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(eemVar, driveTariffCardPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
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
        driveTariffCardPresenter$attachView$$inlined$map$1$2$1 = new DriveTariffCardPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = driveTariffCardPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveTariffCardPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
