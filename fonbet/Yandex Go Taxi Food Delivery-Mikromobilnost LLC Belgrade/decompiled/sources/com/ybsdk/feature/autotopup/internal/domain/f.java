package com.ybsdk.feature.autotopup.internal.domain;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentInfo;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.ValidateAutoTopupV2Request;
import defpackage.bqg;
import defpackage.bvf0;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.ffx;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.h031;
import defpackage.h5a0;
import defpackage.j14;
import defpackage.k5c;
import defpackage.l5a0;
import defpackage.lrp0;
import defpackage.ny61;
import defpackage.r24;
import defpackage.s24;
import defpackage.s2b1;
import defpackage.t2b1;
import defpackage.thq0;
import defpackage.tje;
import defpackage.ty21;
import defpackage.u04;
import defpackage.ua91;
import defpackage.uz21;
import defpackage.v41;
import defpackage.vz21;
import defpackage.w511;
import defpackage.wz21;
import defpackage.x4c;
import defpackage.xjt0;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class f {
    public final k5c a;
    public final com.ybsdk.feature.autotopup.internal.data.b b;
    public final n0 c;
    public final r0 d;

    public f(k5c k5cVar, com.ybsdk.feature.autotopup.internal.data.b bVar) {
        this.a = k5cVar;
        this.b = bVar;
        n0 c = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
        this.c = c;
        r0 c2 = bvf0.c(gwk0.a(new Result(new Result.Failure(new IllegalStateException("no validations yet")))));
        this.d = c2;
        com.ybsdk.core.utils.ext.c.a(kotlinx.coroutines.flow.e.I(c, new AutoTopupValidationInteractor$1(this, null)), k5cVar, new v41(2, c2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ty21 ty21Var, ContinuationImpl continuationImpl) {
        AutoTopupValidationInteractor$getValidationRequestState$1 autoTopupValidationInteractor$getValidationRequestState$1;
        int i;
        Object value;
        Object d;
        if (continuationImpl instanceof AutoTopupValidationInteractor$getValidationRequestState$1) {
            autoTopupValidationInteractor$getValidationRequestState$1 = (AutoTopupValidationInteractor$getValidationRequestState$1) continuationImpl;
            int i2 = autoTopupValidationInteractor$getValidationRequestState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupValidationInteractor$getValidationRequestState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupValidationInteractor$getValidationRequestState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupValidationInteractor$getValidationRequestState$1.label;
                r0 r0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupValidationInteractor$getValidationRequestState$1.L$0 = ty21Var;
                    autoTopupValidationInteractor$getValidationRequestState$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(kotlinx.coroutines.flow.e.I(r0Var, new AutoTopupValidationInteractor$awaitFirst$2(2, null)), autoTopupValidationInteractor$getValidationRequestState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        d = ((Result) obj).getValue();
                        fyc a = gwk0.a(new Result(d));
                        r0Var.getClass();
                        r0Var.m(null, a);
                        if (Result.a(d) != null) {
                            return wz21.a;
                        }
                        h031 h031Var = (h031) d;
                        ArrayList arrayList = h031Var.b;
                        ArrayList arrayList2 = h031Var.c;
                        return (arrayList.isEmpty() && arrayList2.isEmpty()) ? new vz21(h031Var.a) : new uz21(h031Var.b, arrayList2);
                    }
                    ty21Var = (ty21) autoTopupValidationInteractor$getValidationRequestState$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.a(value) != null) {
                    h031 h031Var2 = (h031) value;
                    ArrayList arrayList3 = h031Var2.b;
                    ArrayList arrayList4 = h031Var2.c;
                    return (arrayList3.isEmpty() && arrayList4.isEmpty()) ? new vz21(h031Var2.a) : new uz21(h031Var2.b, arrayList4);
                }
                autoTopupValidationInteractor$getValidationRequestState$1.L$0 = null;
                autoTopupValidationInteractor$getValidationRequestState$1.label = 2;
                d = d(ty21Var, autoTopupValidationInteractor$getValidationRequestState$1);
            }
        }
        autoTopupValidationInteractor$getValidationRequestState$1 = new AutoTopupValidationInteractor$getValidationRequestState$1(this, continuationImpl);
        Object obj3 = autoTopupValidationInteractor$getValidationRequestState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupValidationInteractor$getValidationRequestState$1.label;
        r0 r0Var2 = this.d;
        if (i != 0) {
        }
        value = ((Result) obj3).getValue();
        if (Result.a(value) != null) {
        }
    }

    public final void b(j14 j14Var) {
        tje.N(this.a, null, null, new AutoTopupValidationInteractor$subscribeOnValidationResults$1(this, j14Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(r24 r24Var, u04 u04Var, ContinuationImpl continuationImpl) {
        AutoTopupValidationInteractor$validateAutoFundV2$1 autoTopupValidationInteractor$validateAutoFundV2$1;
        int i;
        if (continuationImpl instanceof AutoTopupValidationInteractor$validateAutoFundV2$1) {
            autoTopupValidationInteractor$validateAutoFundV2$1 = (AutoTopupValidationInteractor$validateAutoFundV2$1) continuationImpl;
            int i2 = autoTopupValidationInteractor$validateAutoFundV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupValidationInteractor$validateAutoFundV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupValidationInteractor$validateAutoFundV2$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupValidationInteractor$validateAutoFundV2$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                AutoTopupPaymentInfo i3 = t2b1.i(r24Var);
                autoTopupValidationInteractor$validateAutoFundV2$1.label = 1;
                Object f = f(i3, u04Var, autoTopupValidationInteractor$validateAutoFundV2$1);
                return f == obj2 ? obj2 : f;
            }
        }
        autoTopupValidationInteractor$validateAutoFundV2$1 = new AutoTopupValidationInteractor$validateAutoFundV2$1(this, continuationImpl);
        Object obj3 = autoTopupValidationInteractor$validateAutoFundV2$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupValidationInteractor$validateAutoFundV2$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ty21 ty21Var, ContinuationImpl continuationImpl) {
        AutoTopupValidationInteractor$validateAutoTopup$1 autoTopupValidationInteractor$validateAutoTopup$1;
        int i;
        Object s;
        Throwable a;
        Object failure;
        Throwable a2;
        if (continuationImpl instanceof AutoTopupValidationInteractor$validateAutoTopup$1) {
            autoTopupValidationInteractor$validateAutoTopup$1 = (AutoTopupValidationInteractor$validateAutoTopup$1) continuationImpl;
            int i2 = autoTopupValidationInteractor$validateAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupValidationInteractor$validateAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupValidationInteractor$validateAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupValidationInteractor$validateAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupValidationInteractor$validateAutoTopup$1.label = 1;
                    s = this.b.s(ty21Var, autoTopupValidationInteractor$validateAutoTopup$1);
                    if (s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    s = ((Result) obj).getValue();
                }
                a = Result.a(s);
                if (a != null) {
                    Object obj2 = (dqg) s;
                    if (obj2 instanceof bqg) {
                        failure = new Result.Failure(new FailDataException((ct11) obj2));
                    } else {
                        if (!(obj2 instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        failure = ((cqg) obj2).a;
                    }
                } else {
                    failure = new Result.Failure(a);
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                    x4c.g("error occurred during auto topup validation", a2, null, Collections.singletonList(lrp0.b), 4);
                }
                return failure;
            }
        }
        autoTopupValidationInteractor$validateAutoTopup$1 = new AutoTopupValidationInteractor$validateAutoTopup$1(this, continuationImpl);
        Object obj3 = autoTopupValidationInteractor$validateAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupValidationInteractor$validateAutoTopup$1.label;
        if (i != 0) {
        }
        a = Result.a(s);
        if (a != null) {
        }
        a2 = Result.a(failure);
        if (a2 != null) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(s24 s24Var, u04 u04Var, ContinuationImpl continuationImpl) {
        AutoTopupValidationInteractor$validateAutoTopupV2$1 autoTopupValidationInteractor$validateAutoTopupV2$1;
        int i;
        if (continuationImpl instanceof AutoTopupValidationInteractor$validateAutoTopupV2$1) {
            autoTopupValidationInteractor$validateAutoTopupV2$1 = (AutoTopupValidationInteractor$validateAutoTopupV2$1) continuationImpl;
            int i2 = autoTopupValidationInteractor$validateAutoTopupV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupValidationInteractor$validateAutoTopupV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupValidationInteractor$validateAutoTopupV2$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupValidationInteractor$validateAutoTopupV2$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                AutoTopupPaymentInfo j = t2b1.j(s24Var);
                autoTopupValidationInteractor$validateAutoTopupV2$1.label = 1;
                Object f = f(j, u04Var, autoTopupValidationInteractor$validateAutoTopupV2$1);
                return f == obj2 ? obj2 : f;
            }
        }
        autoTopupValidationInteractor$validateAutoTopupV2$1 = new AutoTopupValidationInteractor$validateAutoTopupV2$1(this, continuationImpl);
        Object obj3 = autoTopupValidationInteractor$validateAutoTopupV2$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupValidationInteractor$validateAutoTopupV2$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AutoTopupPaymentInfo autoTopupPaymentInfo, u04 u04Var, ContinuationImpl continuationImpl) {
        AutoTopupValidationInteractor$validateV2$1 autoTopupValidationInteractor$validateV2$1;
        int i;
        h5a0 h5a0Var;
        if (continuationImpl instanceof AutoTopupValidationInteractor$validateV2$1) {
            autoTopupValidationInteractor$validateV2$1 = (AutoTopupValidationInteractor$validateV2$1) continuationImpl;
            int i2 = autoTopupValidationInteractor$validateV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupValidationInteractor$validateV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupValidationInteractor$validateV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupValidationInteractor$validateV2$1.label;
                l5a0 l5a0Var = null;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                thq0 thq0Var = u04Var.h;
                if (thq0Var != null && (h5a0Var = thq0Var.a) != null) {
                    l5a0Var = ua91.d(h5a0Var);
                }
                Object c = s2b1.c(l5a0Var, u04Var.k);
                Throwable a = Result.a(c);
                if (a != null) {
                    return new Result.Failure(a);
                }
                xjt0 xjt0Var = (xjt0) c;
                ValidateAutoTopupV2Request validateAutoTopupV2Request = new ValidateAutoTopupV2Request(t2b1.l(xjt0Var.a), t2b1.l(xjt0Var.b), autoTopupPaymentInfo);
                autoTopupValidationInteractor$validateV2$1.label = 1;
                Object t = this.b.t(validateAutoTopupV2Request, autoTopupValidationInteractor$validateV2$1);
                return t == coroutineSingletons ? coroutineSingletons : t;
            }
        }
        autoTopupValidationInteractor$validateV2$1 = new AutoTopupValidationInteractor$validateV2$1(this, continuationImpl);
        Object obj2 = autoTopupValidationInteractor$validateV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupValidationInteractor$validateV2$1.label;
        l5a0 l5a0Var2 = null;
        if (i == 0) {
        }
    }
}
