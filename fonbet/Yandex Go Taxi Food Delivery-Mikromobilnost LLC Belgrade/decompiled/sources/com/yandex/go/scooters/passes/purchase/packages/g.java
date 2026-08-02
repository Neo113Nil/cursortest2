package com.yandex.go.scooters.passes.purchase.packages;

import com.yandex.go.scooters.passes.model.PassType;
import defpackage.ftm0;
import defpackage.iun0;
import defpackage.lsm0;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.moo0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.q7o0;
import defpackage.qxm0;
import defpackage.sgo0;
import defpackage.x7o0;
import defpackage.zjn0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class g {
    public final qxm0 a;
    public final po21 b;
    public final com.yandex.go.scooters.passes.domain.i c;
    public final com.yandex.go.scooters.payments.domain.a d;
    public final com.yandex.go.scooters.passes.domain.g e;

    public g(qxm0 qxm0Var, po21 po21Var, com.yandex.go.scooters.passes.domain.g gVar, com.yandex.go.scooters.passes.domain.i iVar, com.yandex.go.scooters.payments.domain.a aVar) {
        this.a = qxm0Var;
        this.b = po21Var;
        this.c = iVar;
        this.d = aVar;
        this.e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q7o0 q7o0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1 scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1;
        int i;
        if (continuationImpl instanceof ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1) {
            scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1 = (ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1) continuationImpl;
            int i2 = scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.L$0 = null;
                    scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.L$1 = q7o0Var;
                    scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q7o0Var = (q7o0) scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.L$1;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                m6a0 d = this.d.c().d();
                ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2 scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2 = new ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2(1, this.d, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
                q7o0Var.getClass();
                sgo0 sgo0Var = new sgo0(a, true, d);
                iun0 iun0Var = q7o0Var.a;
                iun0Var.A((m950) iun0Var.J.get(), sgo0Var, new b(iun0Var, scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2));
                return zy11.a;
            }
        }
        scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1 = new ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1(this, continuationImpl);
        Object obj2 = scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        m6a0 d2 = this.d.c().d();
        ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2 scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$22 = new ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2(1, this.d, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
        q7o0Var.getClass();
        sgo0 sgo0Var2 = new sgo0(a2, true, d2);
        iun0 iun0Var2 = q7o0Var.a;
        iun0Var2.A((m950) iun0Var2.J.get(), sgo0Var2, new b(iun0Var2, scootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$22));
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(3:17|18|19))(2:20|21))(3:25|26|(2:28|24))|22|(1:24)(1:13)))|37|6|7|(0)(0)|22|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if ((r9 instanceof com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        r8 = a(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        r8 = r10.a;
        r8.A((defpackage.m950) r8.K.get(), new defpackage.zjn0(r9, (java.util.List) null, 6), new defpackage.ftm0(2));
        r8 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, q7o0 q7o0Var, x7o0 x7o0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesPurchaseUiActionInteractor$purchasePackage$1 scootersPackagesPurchaseUiActionInteractor$purchasePackage$1;
        int i;
        if (continuationImpl instanceof ScootersPackagesPurchaseUiActionInteractor$purchasePackage$1) {
            scootersPackagesPurchaseUiActionInteractor$purchasePackage$1 = (ScootersPackagesPurchaseUiActionInteractor$purchasePackage$1) continuationImpl;
            int i2 = scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = x7o0Var.b;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    com.yandex.go.scooters.passes.domain.i iVar = this.c;
                    PassType passType = PassType.PACKAGE;
                    scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$0 = null;
                    scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$1 = q7o0Var;
                    scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$2 = x7o0Var;
                    scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label = 1;
                    if (iVar.a(str, passType, scootersPackagesPurchaseUiActionInteractor$purchasePackage$1) == obj2) {
                    }
                } else {
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
                    x7o0Var = (x7o0) scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$2;
                    q7o0Var = (q7o0) scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$1;
                    kotlin.b.b(obj);
                }
                scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$0 = null;
                scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$1 = q7o0Var;
                scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$2 = x7o0Var;
                scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label = 2;
                return c(q7o0Var, x7o0Var, scootersPackagesPurchaseUiActionInteractor$purchasePackage$1) != obj2 ? obj2 : obj3;
            }
        }
        scootersPackagesPurchaseUiActionInteractor$purchasePackage$1 = new ScootersPackagesPurchaseUiActionInteractor$purchasePackage$1(this, continuationImpl);
        Object obj4 = scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$0 = null;
        scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$1 = q7o0Var;
        scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.L$2 = x7o0Var;
        scootersPackagesPurchaseUiActionInteractor$purchasePackage$1.label = 2;
        if (c(q7o0Var, x7o0Var, scootersPackagesPurchaseUiActionInteractor$purchasePackage$1) != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q7o0 q7o0Var, x7o0 x7o0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1 scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1;
        int i;
        Object a;
        boolean z;
        if (continuationImpl instanceof ScootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1) {
            scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1 = (ScootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1) continuationImpl;
            int i2 = scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = x7o0Var.b;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.L$0 = q7o0Var;
                    scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.L$1 = x7o0Var;
                    scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.label = 1;
                    a = this.e.a(scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x7o0Var = (x7o0) scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.L$1;
                    q7o0Var = (q7o0) scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                z = a instanceof Result.Failure;
                int i3 = 2;
                if (z) {
                    q7o0Var.a.r(new lsm0((moo0) (z ? null : a), i3));
                } else if (z) {
                    r0 r0Var2 = x7o0Var.b;
                    Boolean bool2 = Boolean.FALSE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                    Throwable a2 = Result.a(a);
                    if (a2 == null) {
                        a2 = new IllegalStateException();
                    }
                    iun0 iun0Var = q7o0Var.a;
                    iun0Var.A((m950) iun0Var.K.get(), new zjn0(a2, (List) null, 6), new ftm0(2));
                }
                return zy11.a;
            }
        }
        scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1 = new ScootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1(this, continuationImpl);
        Object obj2 = scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiActionInteractor$waitPurchaseResult$1.label;
        if (i != 0) {
        }
        z = a instanceof Result.Failure;
        int i32 = 2;
        if (z) {
        }
        return zy11.a;
    }
}
