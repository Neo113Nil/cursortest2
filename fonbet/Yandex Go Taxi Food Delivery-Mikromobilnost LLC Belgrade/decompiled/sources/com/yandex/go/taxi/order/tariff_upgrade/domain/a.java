package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.lpx0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q2y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o2y0 b;

    public a(vpr vprVar, o2y0 o2y0Var) {
        this.a = vprVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ActiveOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1 activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ActiveOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1) {
            activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1 = (ActiveOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1) continuation;
            int i2 = activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q2y0 q2y0Var = new q2y0(this.b, (lpx0) obj);
                    activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.L$0 = null;
                    activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.L$1 = null;
                    activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.L$2 = null;
                    activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.L$3 = null;
                    activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q2y0Var, activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1 = new ActiveOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersTariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
