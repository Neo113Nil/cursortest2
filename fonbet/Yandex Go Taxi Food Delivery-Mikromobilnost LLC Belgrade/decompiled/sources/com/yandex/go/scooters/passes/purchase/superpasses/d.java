package com.yandex.go.scooters.passes.purchase.superpasses;

import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.passes.model.PassType;
import defpackage.d1p0;
import defpackage.ftm0;
import defpackage.lsm0;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.moo0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qxm0;
import defpackage.sgo0;
import defpackage.t0p0;
import defpackage.zjn0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d {
    public final qxm0 a;
    public final po21 b;
    public final i c;
    public final com.yandex.go.scooters.passes.domain.g d;
    public final com.yandex.go.scooters.payments.domain.a e;

    public d(qxm0 qxm0Var, po21 po21Var, com.yandex.go.scooters.passes.domain.g gVar, i iVar, com.yandex.go.scooters.payments.domain.a aVar) {
        this.a = qxm0Var;
        this.b = po21Var;
        this.c = iVar;
        this.d = gVar;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t0p0 t0p0Var, ContinuationImpl continuationImpl) {
        ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1 scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1;
        int i;
        if (continuationImpl instanceof ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1) {
            scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1 = (ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1) continuationImpl;
            int i2 = scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.L$0 = null;
                    scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.L$1 = t0p0Var;
                    scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t0p0Var = (t0p0) scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.L$1;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                m6a0 d = this.e.c().d();
                ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2 scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2 = new ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2(1, this.e, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
                t0p0Var.getClass();
                sgo0 sgo0Var = new sgo0(a, true, d);
                c cVar = t0p0Var.a;
                cVar.A((m950) cVar.I.get(), sgo0Var, new b(cVar, scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2));
                return zy11.a;
            }
        }
        scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1 = new ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1(this, continuationImpl);
        Object obj2 = scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        m6a0 d2 = this.e.c().d();
        ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2 scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$22 = new ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2(1, this.e, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
        t0p0Var.getClass();
        sgo0 sgo0Var2 = new sgo0(a2, true, d2);
        c cVar2 = t0p0Var.a;
        cVar2.A((m950) cVar2.I.get(), sgo0Var2, new b(cVar2, scootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$22));
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(3:17|18|19))(2:20|21))(3:25|(2:27|(2:29|24))|13)|22|(1:24)(1:13)))|38|6|7|(0)(0)|22|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r11 = r11.b;
        r12 = java.lang.Boolean.FALSE;
        r11.getClass();
        r11.m(null, r12);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if ((r9 instanceof com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
    
        r8 = a(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        r8 = r10.a;
        r8.A((defpackage.m950) r8.J.get(), new defpackage.zjn0(r9, (java.util.List) null, 6), new defpackage.ftm0(4));
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, t0p0 t0p0Var, d1p0 d1p0Var, ContinuationImpl continuationImpl) {
        ScootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1 scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1;
        int i;
        if (continuationImpl instanceof ScootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1) {
            scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1 = (ScootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1) continuationImpl;
            int i2 = scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((Boolean) d1p0Var.b.getValue()).booleanValue()) {
                        r0 r0Var = d1p0Var.b;
                        Boolean bool = Boolean.TRUE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                        i iVar = this.c;
                        PassType passType = PassType.SUPER_PASS;
                        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$0 = null;
                        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$1 = t0p0Var;
                        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$2 = d1p0Var;
                        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label = 1;
                        if (iVar.a(str, passType, scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1) == obj2) {
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj3;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                d1p0Var = (d1p0) scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$2;
                t0p0Var = (t0p0) scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$1;
                kotlin.b.b(obj);
                scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$0 = null;
                scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$1 = t0p0Var;
                scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$2 = d1p0Var;
                scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label = 2;
                return c(t0p0Var, d1p0Var, scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1) != obj2 ? obj2 : obj3;
            }
        }
        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1 = new ScootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1(this, continuationImpl);
        Object obj4 = scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$0 = null;
        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$1 = t0p0Var;
        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.L$2 = d1p0Var;
        scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1.label = 2;
        if (c(t0p0Var, d1p0Var, scootersSuperPassesPurchaseUiActionInteractor$purchaseSuperPass$1) != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t0p0 t0p0Var, d1p0 d1p0Var, ContinuationImpl continuationImpl) {
        ScootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1 scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1;
        int i;
        Object c;
        boolean z;
        if (continuationImpl instanceof ScootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1) {
            scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1 = (ScootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1) continuationImpl;
            int i2 = scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.L$0 = t0p0Var;
                    scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.L$1 = d1p0Var;
                    scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.label = 1;
                    c = this.d.c(scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d1p0Var = (d1p0) scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.L$1;
                    t0p0Var = (t0p0) scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                z = c instanceof Result.Failure;
                int i3 = 4;
                if (z) {
                    t0p0Var.a.r(new lsm0((moo0) (z ? null : c), i3));
                } else if (z) {
                    r0 r0Var = d1p0Var.b;
                    Boolean bool = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    Throwable a = Result.a(c);
                    if (a == null) {
                        a = new IllegalStateException();
                    }
                    c cVar = t0p0Var.a;
                    cVar.A((m950) cVar.J.get(), new zjn0(a, (List) null, 6), new ftm0(4));
                }
                return zy11.a;
            }
        }
        scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1 = new ScootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1(this, continuationImpl);
        Object obj2 = scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesPurchaseUiActionInteractor$waitPurchaseResult$1.label;
        if (i != 0) {
        }
        z = c instanceof Result.Failure;
        int i32 = 4;
        if (z) {
        }
        return zy11.a;
    }
}
