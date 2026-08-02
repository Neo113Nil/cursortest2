package com.yandex.go.scooters.passes.active.v3.renew.menu;

import com.yandex.go.scooters.passes.active.domain.f;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.passes.model.PassType;
import defpackage.lsm0;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.moo0;
import defpackage.msm0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qu;
import defpackage.sgo0;
import defpackage.usm0;
import defpackage.wqm0;
import defpackage.ygi0;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class c {
    public final po21 a;
    public final f b;
    public final r c;
    public final i d;
    public final com.yandex.go.scooters.payments.domain.a e;
    public final g f;

    public c(po21 po21Var, f fVar, r rVar, i iVar, com.yandex.go.scooters.payments.domain.a aVar, g gVar) {
        this.a = po21Var;
        this.b = fVar;
        this.c = rVar;
        this.d = iVar;
        this.e = aVar;
        this.f = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(msm0 msm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1 scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1;
        int i;
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1) {
            scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1 = (ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.L$0 = null;
                    scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.L$1 = msm0Var;
                    scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).h(scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    msm0Var = (msm0) scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.L$1;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                m6a0 d = this.e.c().d();
                ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2 scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2 = new ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2(1, this.e, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
                ygi0 ygi0Var = msm0Var.a;
                ygi0Var.A((m950) ((yvf0) ygi0Var.J).get(), new sgo0(a, true, d), new b(ygi0Var, scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2));
                return zy11.a;
            }
        }
        scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1 = new ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1(this, continuationImpl);
        Object obj2 = scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        m6a0 d2 = this.e.c().d();
        ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2 scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$22 = new ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2(1, this.e, com.yandex.go.scooters.payments.domain.a.class, "changeSelectedPaymentReference", "changeSelectedPaymentReference(Lru/yandex/taxi/payments/model/PaymentMethodReference;)V", 0);
        ygi0 ygi0Var2 = msm0Var.a;
        ygi0Var2.A((m950) ((yvf0) ygi0Var2.J).get(), new sgo0(a2, true, d2), new b(ygi0Var2, scootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$22));
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|(1:(1:(1:(1:(6:13|14|15|16|17|18)(2:24|25))(8:26|27|28|29|(3:31|(1:33)|34)(3:36|(1:38)|39)|35|17|18))(9:42|43|44|(2:46|(2:48|49))|29|(0)(0)|35|17|18))(2:50|51))(3:55|56|(2:58|49))|52|(2:54|49)|44|(0)|29|(0)(0)|35|17|18))|73|6|7|(0)(0)|52|(0)|44|(0)|29|(0)(0)|35|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        r1.L$0 = null;
        r1.L$1 = r12;
        r1.L$2 = null;
        r1.L$3 = null;
        r1.L$4 = null;
        r1.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0122, code lost:
    
        if ((r11 instanceof com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        r10 = a(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
    
        if (r10 != r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        r13.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0134, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[Catch: all -> 0x0067, CancellationException -> 0x006a, TryCatch #5 {CancellationException -> 0x006a, all -> 0x0067, blocks: (B:28:0x0062, B:29:0x00e4, B:31:0x00e8, B:34:0x00ed, B:36:0x00fb, B:38:0x0101, B:39:0x0106, B:43:0x007b, B:44:0x00c9, B:46:0x00d3, B:51:0x0093, B:52:0x00b8, B:56:0x00a4), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[Catch: all -> 0x0067, CancellationException -> 0x006a, TryCatch #5 {CancellationException -> 0x006a, all -> 0x0067, blocks: (B:28:0x0062, B:29:0x00e4, B:31:0x00e8, B:34:0x00ed, B:36:0x00fb, B:38:0x0101, B:39:0x0106, B:43:0x007b, B:44:0x00c9, B:46:0x00d3, B:51:0x0093, B:52:0x00b8, B:56:0x00a4), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[Catch: all -> 0x0067, CancellationException -> 0x006a, TryCatch #5 {CancellationException -> 0x006a, all -> 0x0067, blocks: (B:28:0x0062, B:29:0x00e4, B:31:0x00e8, B:34:0x00ed, B:36:0x00fb, B:38:0x0101, B:39:0x0106, B:43:0x007b, B:44:0x00c9, B:46:0x00d3, B:51:0x0093, B:52:0x00b8, B:56:0x00a4), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, usm0 usm0Var, msm0 msm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1 scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1;
        Object obj;
        int i;
        Throwable th;
        usm0 usm0Var2;
        r0 r0Var;
        Object c;
        r rVar = this.c;
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1) {
            scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1 = (ScootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r0 r0Var2 = usm0Var.a;
                    Boolean bool = Boolean.TRUE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool);
                    i iVar = this.d;
                    PassType passType = PassType.SUPER_PASS;
                    scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$0 = null;
                    scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1 = usm0Var;
                    scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2 = msm0Var;
                    scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label = 1;
                    if (iVar.a(str, passType, scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1) == obj) {
                        return obj;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            msm0Var = (msm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2;
                            usm0Var = (usm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1;
                            kotlin.b.b(obj2);
                            c = ((Result) obj2).getValue();
                            if (rVar.b.a().h != null) {
                                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$0 = null;
                                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1 = usm0Var;
                                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2 = msm0Var;
                                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$3 = c;
                                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label = 3;
                                if (rVar.a(scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1) == obj) {
                                    return obj;
                                }
                            }
                            if (c instanceof Result.Failure) {
                            }
                            r0Var = usm0Var.a;
                            Boolean bool2 = Boolean.FALSE;
                            r0Var.getClass();
                            r0Var.m(null, bool2);
                            return obj3;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            usm0Var2 = (usm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1;
                            try {
                                kotlin.b.b(obj2);
                                r0Var = usm0Var2.a;
                                Boolean bool22 = Boolean.FALSE;
                                r0Var.getClass();
                                r0Var.m(null, bool22);
                                return obj3;
                            } catch (Throwable th2) {
                                th = th2;
                                r0 r0Var3 = usm0Var2.a;
                                Boolean bool3 = Boolean.FALSE;
                                r0Var3.getClass();
                                r0Var3.m(null, bool3);
                                throw th;
                            }
                        }
                        c = scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$3;
                        msm0Var = (msm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2;
                        usm0Var = (usm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1;
                        try {
                            kotlin.b.b(obj2);
                            if (c instanceof Result.Failure) {
                                if (c instanceof Result.Failure) {
                                    c = null;
                                }
                                msm0Var.a.r(new lsm0((moo0) c, 0));
                            } else {
                                Throwable a = Result.a(c);
                                if (a == null) {
                                    a = new IllegalStateException();
                                }
                                msm0Var.a(a);
                            }
                            r0Var = usm0Var.a;
                            Boolean bool222 = Boolean.FALSE;
                            r0Var.getClass();
                            r0Var.m(null, bool222);
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            usm0Var2 = usm0Var;
                            r0 r0Var32 = usm0Var2.a;
                            Boolean bool32 = Boolean.FALSE;
                            r0Var32.getClass();
                            r0Var32.m(null, bool32);
                            throw th;
                        }
                    }
                    msm0Var = (msm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2;
                    usm0Var = (usm0) scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1;
                    kotlin.b.b(obj2);
                }
                g gVar = this.f;
                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$0 = null;
                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1 = usm0Var;
                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2 = msm0Var;
                scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label = 2;
                c = gVar.c(scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1);
                if (c == obj) {
                    return obj;
                }
                if (rVar.b.a().h != null) {
                }
                if (c instanceof Result.Failure) {
                }
                r0Var = usm0Var.a;
                Boolean bool2222 = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool2222);
                return obj3;
            }
        }
        scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1 = new ScootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1(this, continuationImpl);
        Object obj22 = scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        g gVar2 = this.f;
        scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$0 = null;
        scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$1 = usm0Var;
        scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.L$2 = msm0Var;
        scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1.label = 2;
        c = gVar2.c(scootersActivePassesV3RenewMenuUiActionInteractor$purchasePass$1);
        if (c == obj) {
        }
        if (rVar.b.a().h != null) {
        }
        if (c instanceof Result.Failure) {
        }
        r0Var = usm0Var.a;
        Boolean bool22222 = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool22222);
        return obj32;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(3:11|12|13)(2:24|25))(3:26|27|(1:29))|14|15|16|17))|36|6|7|8|(0)(0)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        defpackage.zgz.a(null, r0);
        r12.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, wqm0 wqm0Var, ScootersPassesFromScreen scootersPassesFromScreen, msm0 msm0Var, usm0 usm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1 scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1;
        int i;
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1) {
            scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1 = (ScootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1 scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12 = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1;
                Object obj = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = usm0Var.b;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    f fVar = this.b;
                    scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$0 = null;
                    scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$1 = null;
                    scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$2 = null;
                    scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$3 = msm0Var;
                    scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$4 = usm0Var;
                    scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.label = 1;
                    if (fVar.a(scootersPassesFromScreen, str, true, wqm0Var, scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    usm0Var = (usm0) scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$4;
                    msm0Var = (msm0) scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$12.L$3;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th) {
                        r0 r0Var2 = usm0Var.b;
                        Boolean bool2 = Boolean.FALSE;
                        r0Var2.getClass();
                        r0Var2.m(null, bool2);
                        throw th;
                    }
                }
                msm0Var.a.r(new qu(9));
                r0 r0Var3 = usm0Var.b;
                Boolean bool3 = Boolean.FALSE;
                r0Var3.getClass();
                r0Var3.m(null, bool3);
                return zy11.a;
            }
        }
        scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1 = new ScootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1(this, continuationImpl);
        ScootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1 scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$122 = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$1;
        Object obj2 = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiActionInteractor$tryToEnableRenew$122.label;
        if (i != 0) {
        }
        msm0Var.a.r(new qu(9));
        r0 r0Var32 = usm0Var.b;
        Boolean bool32 = Boolean.FALSE;
        r0Var32.getClass();
        r0Var32.m(null, bool32);
        return zy11.a;
    }
}
