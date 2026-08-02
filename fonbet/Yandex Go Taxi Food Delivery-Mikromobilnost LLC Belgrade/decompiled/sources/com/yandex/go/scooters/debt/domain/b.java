package com.yandex.go.scooters.debt.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ n a;
    public final /* synthetic */ c b;

    public b(n nVar, c cVar) {
        this.a = nVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1 scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1) {
            scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1 = (ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1) continuation;
            int i2 = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.L$0 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.L$1 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.L$2 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1 = new ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
