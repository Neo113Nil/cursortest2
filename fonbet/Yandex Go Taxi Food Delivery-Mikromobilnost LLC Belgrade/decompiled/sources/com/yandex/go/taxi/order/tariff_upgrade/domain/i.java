package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements tpr {
    public final /* synthetic */ e a;
    public final /* synthetic */ l b;

    public i(e eVar, l lVar) {
        this.a = eVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1 tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1) {
            tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1 = (TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1) continuation;
            int i2 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.L$0 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.L$1 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.L$2 = null;
                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1 = new TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
