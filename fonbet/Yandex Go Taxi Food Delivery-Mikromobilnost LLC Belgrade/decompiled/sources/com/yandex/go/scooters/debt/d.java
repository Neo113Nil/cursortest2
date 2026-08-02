package com.yandex.go.scooters.debt;

import android.content.Context;
import defpackage.adn0;
import defpackage.bia0;
import defpackage.cno0;
import defpackage.edn0;
import defpackage.fcj0;
import defpackage.gdn0;
import defpackage.j6m0;
import defpackage.ldn0;
import defpackage.m230;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mdn0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o6p0;
import defpackage.po21;
import defpackage.qzm0;
import defpackage.rea0;
import defpackage.s6k0;
import defpackage.sgo0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u45;
import defpackage.w030;
import defpackage.xcn0;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public final class d extends m230 {
    public final w030 E;
    public final com.yandex.go.scooters.debt.domain.c F;
    public final po21 G;
    public final ldn0 H;
    public final edn0 I;
    public final yvf0 J;
    public final yvf0 K;

    public d(w030 w030Var, com.yandex.go.scooters.debt.domain.c cVar, po21 po21Var, ldn0 ldn0Var, edn0 edn0Var, yvf0 yvf0Var, yvf0 yvf0Var2) {
        super(null);
        this.E = w030Var;
        this.F = cVar;
        this.G = po21Var;
        this.H = ldn0Var;
        this.I = edn0Var;
        this.J = yvf0Var;
        this.K = yvf0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(d dVar, m6a0 m6a0Var, ContinuationImpl continuationImpl) {
        ScootersDebtRouter$openPaymentMethod$1 scootersDebtRouter$openPaymentMethod$1;
        int i;
        m6a0 m6a0Var2;
        m950 m950Var;
        d dVar2;
        dVar.getClass();
        if (continuationImpl instanceof ScootersDebtRouter$openPaymentMethod$1) {
            scootersDebtRouter$openPaymentMethod$1 = (ScootersDebtRouter$openPaymentMethod$1) continuationImpl;
            int i2 = scootersDebtRouter$openPaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtRouter$openPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtRouter$openPaymentMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtRouter$openPaymentMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m950 m950Var2 = (m950) dVar.J.get();
                    po21 po21Var = dVar.G;
                    scootersDebtRouter$openPaymentMethod$1.L$0 = m6a0Var;
                    scootersDebtRouter$openPaymentMethod$1.L$1 = dVar;
                    scootersDebtRouter$openPaymentMethod$1.L$2 = m950Var2;
                    scootersDebtRouter$openPaymentMethod$1.label = 1;
                    Object h = ((e) po21Var).h(scootersDebtRouter$openPaymentMethod$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m6a0Var2 = m6a0Var;
                    m950Var = m950Var2;
                    obj = h;
                    dVar2 = dVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) scootersDebtRouter$openPaymentMethod$1.L$2;
                    dVar2 = (d) scootersDebtRouter$openPaymentMethod$1.L$1;
                    m6a0Var2 = (m6a0) scootersDebtRouter$openPaymentMethod$1.L$0;
                    kotlin.b.b(obj);
                }
                dVar2.A(m950Var, new sgo0(((mo21) obj).a(), false, m6a0Var2), new mdn0(dVar, 0));
                return zy11.a;
            }
        }
        scootersDebtRouter$openPaymentMethod$1 = new ScootersDebtRouter$openPaymentMethod$1(dVar, continuationImpl);
        Object obj2 = scootersDebtRouter$openPaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtRouter$openPaymentMethod$1.label;
        if (i != 0) {
        }
        dVar2.A(m950Var, new sgo0(((mo21) obj2).a(), false, m6a0Var2), new mdn0(dVar, 0));
        return zy11.a;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        o6p0 o6p0Var = ((gdn0) obj).a;
        s6k0 s6k0Var = this.H.a;
        b bVar = new b((com.yandex.go.scooters.debt.domain.c) ((adn0) s6k0Var.a).get(), (po21) ((xvf0) s6k0Var.b).get(), (com.yandex.go.scooters.payments.domain.a) ((xvf0) s6k0Var.c).get(), o6p0Var);
        ScootersDebtRouter$provideModalView$1 scootersDebtRouter$provideModalView$1 = new ScootersDebtRouter$provideModalView$1(2, this, d.class, "showErrorDialog", "showErrorDialog(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        j6m0 j6m0Var = new j6m0(28, this);
        tls tlsVar = new tls() { // from class: com.yandex.go.scooters.debt.c
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                d dVar = d.this;
                tje.N(dVar.o(), null, null, new ScootersDebtRouter$provideModalView$3$1(dVar, (m6a0) obj2, null), 3);
                return zy11.a;
            }
        };
        fcj0 fcj0Var = this.I.a;
        return new ScootersDebtModalView((Context) ((xvf0) fcj0Var.a).get(), (xcn0) ((qzm0) fcj0Var.b).get(), (bia0) ((xvf0) fcj0Var.c).get(), (cno0) ((xvf0) fcj0Var.d).get(), (rea0) ((xvf0) fcj0Var.e).get(), bVar, j6m0Var, scootersDebtRouter$provideModalView$1, tlsVar);
    }
}
