package com.yandex.go.scooters.debt;

import defpackage.ad5;
import defpackage.fdn0;
import defpackage.hfa0;
import defpackage.kdn0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o6p0;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.w511;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public final class b extends ad5 {
    public o6p0 A;
    public pzt0 B;
    public final com.yandex.go.scooters.debt.domain.c x;
    public final po21 y;
    public final com.yandex.go.scooters.payments.domain.a z;

    public b(com.yandex.go.scooters.debt.domain.c cVar, po21 po21Var, com.yandex.go.scooters.payments.domain.a aVar, o6p0 o6p0Var) {
        super(fdn0.class);
        this.x = cVar;
        this.y = po21Var;
        this.z = aVar;
        this.A = o6p0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(5:11|12|(1:14)(1:18)|15|16)(2:19|20))(2:21|22))(3:26|27|(2:29|25))|23))|36|6|7|(0)(0)|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r9 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        defpackage.zgz.a("Error while payment methods request in scooters debt dialog", r0);
        ((defpackage.fdn0) r8.Dg()).W4(r0, new com.yandex.go.scooters.debt.ScootersDebtPresenter$initPaymentOptions$3$1(0, r8, com.yandex.go.scooters.debt.b.class, "load", "load()V", 0));
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(b bVar, ContinuationImpl continuationImpl) {
        ScootersDebtPresenter$initPaymentOptions$1 scootersDebtPresenter$initPaymentOptions$1;
        int i;
        com.yandex.go.scooters.payments.domain.a aVar;
        Object f;
        bVar.getClass();
        if (continuationImpl instanceof ScootersDebtPresenter$initPaymentOptions$1) {
            scootersDebtPresenter$initPaymentOptions$1 = (ScootersDebtPresenter$initPaymentOptions$1) continuationImpl;
            int i2 = scootersDebtPresenter$initPaymentOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtPresenter$initPaymentOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtPresenter$initPaymentOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtPresenter$initPaymentOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = bVar.z;
                    po21 po21Var = bVar.y;
                    scootersDebtPresenter$initPaymentOptions$1.L$0 = aVar;
                    scootersDebtPresenter$initPaymentOptions$1.label = 1;
                    obj = ((e) po21Var).h(scootersDebtPresenter$initPaymentOptions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        f = ((Result) obj).getValue();
                        kotlin.b.b(f);
                        hfa0 hfa0Var = (hfa0) f;
                        com.yandex.go.scooters.debt.domain.c cVar = bVar.x;
                        if (hfa0Var == null) {
                            cVar.getClass();
                        } else {
                            r0 r0Var = cVar.f.a;
                            r0Var.getClass();
                            r0Var.m(null, hfa0Var);
                        }
                        return zy11.a;
                    }
                    aVar = (com.yandex.go.scooters.payments.domain.a) scootersDebtPresenter$initPaymentOptions$1.L$0;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                scootersDebtPresenter$initPaymentOptions$1.L$0 = null;
                scootersDebtPresenter$initPaymentOptions$1.label = 2;
                f = aVar.f(a, scootersDebtPresenter$initPaymentOptions$1);
            }
        }
        scootersDebtPresenter$initPaymentOptions$1 = new ScootersDebtPresenter$initPaymentOptions$1(bVar, continuationImpl);
        Object obj2 = scootersDebtPresenter$initPaymentOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtPresenter$initPaymentOptions$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        scootersDebtPresenter$initPaymentOptions$1.L$0 = null;
        scootersDebtPresenter$initPaymentOptions$1.label = 2;
        f = aVar.f(a2, scootersDebtPresenter$initPaymentOptions$1);
    }

    public static final Object Lg(b bVar, SuspendLambda suspendLambda) {
        pzt0 pzt0Var = bVar.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 N = tje.N(bVar.Jg(), null, null, new ScootersDebtPresenter$listenToPayCompletion$2(bVar, null), 3);
        bVar.B = N;
        return N.u0(suspendLambda);
    }

    public static final void Mg(b bVar, o6p0 o6p0Var) {
        bVar.getClass();
        int i = kdn0.a[o6p0Var.a.ordinal()];
        if (i == 1) {
            bVar.Ng();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            ((fdn0) bVar.Dg()).e9();
            ((fdn0) bVar.Dg()).k8();
            ((fdn0) bVar.Dg()).I0();
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = null;
        super.Cg();
    }

    public final void Ng() {
        ((fdn0) Dg()).Hf();
        ((fdn0) Dg()).C4();
        ((fdn0) Dg()).Q5();
    }

    public final void Og() {
        ((fdn0) Dg()).e9();
        ((fdn0) Dg()).k8();
        ((fdn0) Dg()).I0();
        tje.N(Jg(), null, null, new ScootersDebtPresenter$makePayment$1(this, null), 3);
    }
}
