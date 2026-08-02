package com.yandex.go.scooters.debt.domain;

import defpackage.ny61;
import defpackage.o6p0;
import defpackage.p6p0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zcn0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.scooters.data.model.DebtStatus;
import ru.yandex.taxi.scooters.domain.model.ScootersDebtPayOffException;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1 scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1;
        int i;
        p6p0 p6p0Var;
        vpr vprVar;
        vpr vprVar2;
        o6p0 o6p0Var;
        if (continuation instanceof ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1) {
            scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1 = (ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p6p0Var = (p6p0) obj;
                    o6p0 o6p0Var2 = p6p0Var.c;
                    DebtStatus debtStatus = o6p0Var2 != null ? o6p0Var2.a : null;
                    int i3 = debtStatus == null ? -1 : zcn0.a[debtStatus.ordinal()];
                    vprVar = this.a;
                    if (i3 != -1) {
                        if (i3 == 1) {
                            throw new ScootersDebtPayOffException();
                        }
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$5 = null;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$6 = null;
                        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label = 1;
                        obj2 = c.a(this.b, 5000L, scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$0 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$1 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$2 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$3 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$4 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$5 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$6 = null;
                    scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$3;
                    kotlin.b.b(obj2);
                }
                p6p0Var = (p6p0) obj2;
                o6p0Var = p6p0Var.c;
                if ((o6p0Var == null ? o6p0Var.a : null) != DebtStatus.NO_FUNDS) {
                    throw new ScootersDebtPayOffException();
                }
                vprVar = vprVar2;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$0 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$1 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$2 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$3 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$4 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$5 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.L$6 = null;
                scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label = 2;
            }
        }
        scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1 = new ScootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtInteractor$pollWhileDebt$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        p6p0Var = (p6p0) obj22;
        o6p0Var = p6p0Var.c;
        if ((o6p0Var == null ? o6p0Var.a : null) != DebtStatus.NO_FUNDS) {
        }
    }
}
