package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.aqx0;
import defpackage.lpx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1 tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1) {
            tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1 = (TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1) continuation;
            int i2 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lpx0 lpx0Var = ((aqx0) obj).a;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.L$0 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.L$1 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.L$2 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.L$3 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(lpx0Var, tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1 = new TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
