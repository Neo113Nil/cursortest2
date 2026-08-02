package com.yandex.go.drive.vertical.ui.tariff_card;

import defpackage.ahm;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ ahm b;

    public b(jqr jqrVar, ahm ahmVar) {
        this.a = jqrVar;
        this.b = ahmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DriveTariffCardPresenter$attachView$$inlined$map$1$1 driveTariffCardPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof DriveTariffCardPresenter$attachView$$inlined$map$1$1) {
            driveTariffCardPresenter$attachView$$inlined$map$1$1 = (DriveTariffCardPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = driveTariffCardPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveTariffCardPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveTariffCardPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveTariffCardPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    driveTariffCardPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    driveTariffCardPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, driveTariffCardPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        driveTariffCardPresenter$attachView$$inlined$map$1$1 = new DriveTariffCardPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = driveTariffCardPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveTariffCardPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
