package com.yandex.go.yb.data;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.cma1;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.iw51;
import defpackage.jw51;
import defpackage.lt51;
import defpackage.mt51;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.t1b0;
import defpackage.yvf0;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class u {
    public final h3y a;
    public final yvf0 b;
    public final h3y c;
    public final i3y d = kotlin.a.a(new oay0(25, this));

    public u(h3y h3yVar, yvf0 yvf0Var, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = yvf0Var;
        this.c = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        YbSdkWrapper$awaitForSdkReadiness$1 ybSdkWrapper$awaitForSdkReadiness$1;
        int i;
        if (continuationImpl instanceof YbSdkWrapper$awaitForSdkReadiness$1) {
            ybSdkWrapper$awaitForSdkReadiness$1 = (YbSdkWrapper$awaitForSdkReadiness$1) continuationImpl;
            int i2 = ybSdkWrapper$awaitForSdkReadiness$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$awaitForSdkReadiness$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkWrapper$awaitForSdkReadiness$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$awaitForSdkReadiness$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(c().t);
                    ybSdkWrapper$awaitForSdkReadiness$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(nVar, ybSdkWrapper$awaitForSdkReadiness$1) == coroutineSingletons) {
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
        ybSdkWrapper$awaitForSdkReadiness$1 = new YbSdkWrapper$awaitForSdkReadiness$1(this, continuationImpl);
        Object obj2 = ybSdkWrapper$awaitForSdkReadiness$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$awaitForSdkReadiness$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object b(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        return c().B.o(str, bigDecimal, str2, continuationImpl);
    }

    public final e c() {
        return (e) this.a.get();
    }

    public final nw51 d() {
        return (nw51) c().t.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (a(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        YbSdkWrapper$getMenuItemInfo$1 ybSdkWrapper$getMenuItemInfo$1;
        int i;
        if (continuationImpl instanceof YbSdkWrapper$getMenuItemInfo$1) {
            ybSdkWrapper$getMenuItemInfo$1 = (YbSdkWrapper$getMenuItemInfo$1) continuationImpl;
            int i2 = ybSdkWrapper$getMenuItemInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$getMenuItemInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkWrapper$getMenuItemInfo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$getMenuItemInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ybSdkWrapper$getMenuItemInfo$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cma1 cma1Var = c().B;
                ybSdkWrapper$getMenuItemInfo$1.label = 2;
                Object T = cma1Var.T(ybSdkWrapper$getMenuItemInfo$1);
                return T != obj2 ? obj2 : T;
            }
        }
        ybSdkWrapper$getMenuItemInfo$1 = new YbSdkWrapper$getMenuItemInfo$1(this, continuationImpl);
        Object obj3 = ybSdkWrapper$getMenuItemInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$getMenuItemInfo$1.label;
        if (i != 0) {
        }
        cma1 cma1Var2 = c().B;
        ybSdkWrapper$getMenuItemInfo$1.label = 2;
        Object T2 = cma1Var2.T(ybSdkWrapper$getMenuItemInfo$1);
        if (T2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        YbSdkWrapper$shouldProcessUpdateBalanceRequest$1 ybSdkWrapper$shouldProcessUpdateBalanceRequest$1;
        int i;
        if (continuationImpl instanceof YbSdkWrapper$shouldProcessUpdateBalanceRequest$1) {
            ybSdkWrapper$shouldProcessUpdateBalanceRequest$1 = (YbSdkWrapper$shouldProcessUpdateBalanceRequest$1) continuationImpl;
            int i2 = ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = new r(c().t);
                    ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(rVar, ybSdkWrapper$shouldProcessUpdateBalanceRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((nw51) obj) instanceof jw51);
            }
        }
        ybSdkWrapper$shouldProcessUpdateBalanceRequest$1 = new YbSdkWrapper$shouldProcessUpdateBalanceRequest$1(this, continuationImpl);
        Object obj2 = ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$shouldProcessUpdateBalanceRequest$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((nw51) obj2) instanceof jw51);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        YbSdkWrapper$shouldProcessUpdateRequest$1 ybSdkWrapper$shouldProcessUpdateRequest$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object b;
        nw51 nw51Var;
        if (continuationImpl instanceof YbSdkWrapper$shouldProcessUpdateRequest$1) {
            ybSdkWrapper$shouldProcessUpdateRequest$1 = (YbSdkWrapper$shouldProcessUpdateRequest$1) continuationImpl;
            int i2 = ybSdkWrapper$shouldProcessUpdateRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$shouldProcessUpdateRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkWrapper$shouldProcessUpdateRequest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$shouldProcessUpdateRequest$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(c().t);
                    ybSdkWrapper$shouldProcessUpdateRequest$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(tVar, ybSdkWrapper$shouldProcessUpdateRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nw51Var = (nw51) ybSdkWrapper$shouldProcessUpdateRequest$1.L$0;
                        kotlin.b.b(obj);
                        YbWalletEntryPointExperiment ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) obj;
                        if (!(nw51Var instanceof jw51) && (!(nw51Var instanceof iw51) || !ybWalletEntryPointExperiment.g)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    kotlin.b.b(obj);
                }
                nw51 nw51Var2 = (nw51) obj;
                t1b0 t1b0Var = (t1b0) this.d.getValue();
                ybSdkWrapper$shouldProcessUpdateRequest$1.L$0 = nw51Var2;
                ybSdkWrapper$shouldProcessUpdateRequest$1.label = 2;
                b = t1b0Var.b(ybSdkWrapper$shouldProcessUpdateRequest$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    nw51Var = nw51Var2;
                    YbWalletEntryPointExperiment ybWalletEntryPointExperiment2 = (YbWalletEntryPointExperiment) obj;
                    if (!(nw51Var instanceof jw51)) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                return coroutineSingletons;
            }
        }
        ybSdkWrapper$shouldProcessUpdateRequest$1 = new YbSdkWrapper$shouldProcessUpdateRequest$1(this, continuationImpl);
        Object obj2 = ybSdkWrapper$shouldProcessUpdateRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$shouldProcessUpdateRequest$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        nw51 nw51Var22 = (nw51) obj2;
        t1b0 t1b0Var2 = (t1b0) this.d.getValue();
        ybSdkWrapper$shouldProcessUpdateRequest$1.L$0 = nw51Var22;
        ybSdkWrapper$shouldProcessUpdateRequest$1.label = 2;
        b = t1b0Var2.b(ybSdkWrapper$shouldProcessUpdateRequest$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        YbSdkWrapper$updateBalance$1 ybSdkWrapper$updateBalance$1;
        Object obj;
        int i;
        if (continuationImpl instanceof YbSdkWrapper$updateBalance$1) {
            ybSdkWrapper$updateBalance$1 = (YbSdkWrapper$updateBalance$1) continuationImpl;
            int i2 = ybSdkWrapper$updateBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$updateBalance$1.label = i2 - Integer.MIN_VALUE;
                obj = ybSdkWrapper$updateBalance$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$updateBalance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ybSdkWrapper$updateBalance$1.label = 1;
                    obj = f(ybSdkWrapper$updateBalance$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                cma1 cma1Var = c().B;
                ybSdkWrapper$updateBalance$1.label = 2;
                Object N0 = cma1Var.N0(ybSdkWrapper$updateBalance$1);
                return N0 == obj2 ? obj2 : N0;
            }
        }
        ybSdkWrapper$updateBalance$1 = new YbSdkWrapper$updateBalance$1(this, continuationImpl);
        obj = ybSdkWrapper$updateBalance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$updateBalance$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r9 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r9 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ContinuationImpl continuationImpl) {
        YbSdkWrapper$updatePaymentMethods$1 ybSdkWrapper$updatePaymentMethods$1;
        Object obj;
        int i;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof YbSdkWrapper$updatePaymentMethods$1) {
            ybSdkWrapper$updatePaymentMethods$1 = (YbSdkWrapper$updatePaymentMethods$1) continuationImpl;
            int i2 = ybSdkWrapper$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                obj = ybSdkWrapper$updatePaymentMethods$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$updatePaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ybSdkWrapper$updatePaymentMethods$1.L$0 = str;
                    ybSdkWrapper$updatePaymentMethods$1.label = 1;
                    obj = g(ybSdkWrapper$updatePaymentMethods$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) ybSdkWrapper$updatePaymentMethods$1.L$0;
                        kotlin.b.b(obj);
                        lt51 lt51Var = (lt51) obj;
                        if (lt51Var != null) {
                            mt51 mt51Var = (mt51) this.c.get();
                            mt51Var.b = str;
                            r0 r0Var = mt51Var.a;
                            r0Var.getClass();
                            r0Var.m(null, lt51Var);
                        }
                        return zy11Var;
                    }
                    str = (String) ybSdkWrapper$updatePaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    cma1 cma1Var = c().B;
                    ybSdkWrapper$updatePaymentMethods$1.L$0 = str;
                    ybSdkWrapper$updatePaymentMethods$1.label = 2;
                    obj = cma1Var.O0(str, ybSdkWrapper$updatePaymentMethods$1);
                }
                return zy11Var;
            }
        }
        ybSdkWrapper$updatePaymentMethods$1 = new YbSdkWrapper$updatePaymentMethods$1(this, continuationImpl);
        obj = ybSdkWrapper$updatePaymentMethods$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$updatePaymentMethods$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var;
    }
}
