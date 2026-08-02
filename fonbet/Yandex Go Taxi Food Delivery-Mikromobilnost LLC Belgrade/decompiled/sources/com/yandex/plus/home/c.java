package com.yandex.plus.home;

import com.yandex.plus.home.internal.di.g;
import com.yandex.plus.log.api.LogPriority;
import defpackage.ckd0;
import defpackage.cop0;
import defpackage.dtt;
import defpackage.exf0;
import defpackage.f15;
import defpackage.ike;
import defpackage.j8u;
import defpackage.jzs;
import defpackage.lho;
import defpackage.m4d0;
import defpackage.mth;
import defpackage.n4d0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.ol5;
import defpackage.p4d0;
import defpackage.q5z;
import defpackage.qda0;
import defpackage.rkd0;
import defpackage.t3d0;
import defpackage.t821;
import defpackage.tne;
import defpackage.trj0;
import defpackage.vng;
import defpackage.wog;
import defpackage.x3m;
import defpackage.yk;
import defpackage.z3d0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c implements z3d0, p4d0, t3d0 {
    public final /* synthetic */ j8u a = new j8u();
    public final cop0 b;
    public final ol5 c;
    public final com.yandex.plus.home.internal.di.b d;
    public final g e;
    public final wog f;
    public final x3m g;
    public final com.yandex.plus.domain.auth.impl.a h;
    public final ike i;
    public final ckd0 j;

    public c(cop0 cop0Var, ol5 ol5Var, com.yandex.plus.home.internal.di.b bVar, g gVar, wog wogVar, x3m x3mVar, com.yandex.plus.domain.auth.impl.a aVar, ike ikeVar) {
        this.b = cop0Var;
        this.c = ol5Var;
        this.d = bVar;
        this.e = gVar;
        this.f = wogVar;
        this.g = x3mVar;
        this.h = aVar;
        this.i = ikeVar;
        ckd0 ckd0Var = new ckd0();
        this.j = ckd0Var;
        bVar.d();
        ((com.yandex.plus.home.analytics.evgen.b) bVar.d.getValue()).l = new PlusHomeSdkImpl$1(0, wogVar.b(), com.yandex.plus.home.graphql.plusstate.c.class, "getCurrentPlusState", "getCurrentPlusState()Lcom/yandex/plus/home/repository/api/model/plusstate/PlusState;", 0);
        ol5Var.a.b = new m4d0(this, 0);
        rkd0 rkd0Var = cop0Var.A;
        LogPriority logPriority = LogPriority.INFO;
        if (rkd0Var.e(logPriority)) {
            StringBuilder sb = new StringBuilder("Init PlusHomeSdk\n");
            sb.append("environment=" + cop0Var.b);
            sb.append('\n');
            sb.append("acceptLanguage=".concat(q5z.v(cop0Var.q)));
            sb.append('\n');
            sb.append("userId=" + cop0Var.f.a().getValue());
            sb.append('\n');
            StringBuilder sb2 = new StringBuilder("location=");
            n4u0 n4u0Var = cop0Var.j;
            sb2.append(n4u0Var != null ? (jzs) n4u0Var.getValue() : null);
            sb.append(sb2.toString());
            sb.append('\n');
            sb.append("serviceName=" + cop0Var.c);
            sb.append('\n');
            sb.append("versionName=".concat(cop0Var.v));
            sb.append('\n');
            StringBuilder sb3 = new StringBuilder("httpClientBuilder=");
            sb3.append(cop0Var.l != null);
            sb.append(sb3.toString());
            sb.append('\n');
            sb.append("packageName=".concat(cop0Var.u));
            sb.append('\n');
            sb.append("analyticsParams=" + cop0Var.n);
            sb.append('\n');
            sb.append("hostScheme=" + cop0Var.d);
            sb.append("\noverriddenTestIds=null\nsource=null\n");
            StringBuilder sb4 = new StringBuilder("treasuryAdapter=");
            sb4.append(cop0Var.r != null);
            sb.append(sb4.toString());
            sb.append('\n');
            rkd0Var.b(logPriority, "PlusHomeSdkImpl", sb.toString(), null);
        }
        r0 r0Var = aVar.h;
        qda0 qda0Var = new qda0(8);
        yk ykVar = vng.c;
        com.yandex.plus.home.common.utils.c.d(vng.l(r0Var, qda0Var, ykVar), ikeVar, new PlusHomeSdkImpl$5(this, null));
        com.yandex.plus.home.common.utils.c.d(new mth(vng.l(aVar.h, new qda0(9), ykVar), 4), ikeVar, new PlusHomeSdkImpl$7(this, null));
        ((com.yandex.plus.home.analytics.evgen.b) bVar.d.getValue()).k = new m4d0(this, 1);
        trj0 trj0Var = cop0Var.s;
        boolean z = trj0Var instanceof f15;
        f15 f15Var = z ? (f15) trj0Var : null;
        if (f15Var != null) {
            f15Var.e = new n4d0(this);
        }
        f15 f15Var2 = z ? (f15) trj0Var : null;
        if (f15Var2 != null) {
            f15Var2.d = new n4d0(this);
        }
        com.yandex.plus.home.common.utils.c.d(((tne) gVar.j.getValue()).a, ikeVar, new PlusHomeSdkImpl$11(this, null));
        com.yandex.plus.home.common.utils.c.b(ckd0Var.b, ikeVar, new PlusHomeSdkImpl$12(this, null));
        com.yandex.plus.home.common.utils.c.d(((t821) wogVar.r.getValue()).b, ikeVar, new PlusHomeSdkImpl$13(this, null));
        com.yandex.plus.home.common.utils.c.d(cop0Var.p, ikeVar, new PlusHomeSdkImpl$14(this, null));
        lho a = bVar.a();
        a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_meta", lho.a(1, new HashMap()));
        a.d("PlusHome.SDK.Init", linkedHashMap);
        ((com.yandex.plus.home.api.prefetch.a) x3mVar.a.getValue()).h();
    }

    @Override // defpackage.t3d0
    public final void a(exf0 exf0Var) {
        this.a.a(exf0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PlusHomeSdkImpl$exportCurrentPlusState$1 plusHomeSdkImpl$exportCurrentPlusState$1;
        int i;
        Object e;
        if (continuationImpl instanceof PlusHomeSdkImpl$exportCurrentPlusState$1) {
            plusHomeSdkImpl$exportCurrentPlusState$1 = (PlusHomeSdkImpl$exportCurrentPlusState$1) continuationImpl;
            int i2 = plusHomeSdkImpl$exportCurrentPlusState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeSdkImpl$exportCurrentPlusState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeSdkImpl$exportCurrentPlusState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeSdkImpl$exportCurrentPlusState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.home.graphql.plusstate.c b = this.f.b();
                    plusHomeSdkImpl$exportCurrentPlusState$1.label = 1;
                    e = b.e(plusHomeSdkImpl$exportCurrentPlusState$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (e instanceof Result.Failure) {
                    return e;
                }
                return null;
            }
        }
        plusHomeSdkImpl$exportCurrentPlusState$1 = new PlusHomeSdkImpl$exportCurrentPlusState$1(this, continuationImpl);
        Object obj2 = plusHomeSdkImpl$exportCurrentPlusState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeSdkImpl$exportCurrentPlusState$1.label;
        if (i != 0) {
        }
        if (e instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PlusHomeSdkImpl$exportIsRestrictionModeEnabled$1 plusHomeSdkImpl$exportIsRestrictionModeEnabled$1;
        int i;
        if (continuationImpl instanceof PlusHomeSdkImpl$exportIsRestrictionModeEnabled$1) {
            plusHomeSdkImpl$exportIsRestrictionModeEnabled$1 = (PlusHomeSdkImpl$exportIsRestrictionModeEnabled$1) continuationImpl;
            int i2 = plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.home.payment.google.a aVar = (com.yandex.plus.home.payment.google.a) this.f.A.getValue();
                    plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.label = 1;
                    obj = aVar.b(plusHomeSdkImpl$exportIsRestrictionModeEnabled$1);
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
                return Boolean.valueOf(!((dtt) obj).b);
            }
        }
        plusHomeSdkImpl$exportIsRestrictionModeEnabled$1 = new PlusHomeSdkImpl$exportIsRestrictionModeEnabled$1(this, continuationImpl);
        Object obj2 = plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeSdkImpl$exportIsRestrictionModeEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((dtt) obj2).b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (defpackage.bvf0.n(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6.h.e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PlusHomeSdkImpl$warmCaches$1 plusHomeSdkImpl$warmCaches$1;
        int i;
        if (continuationImpl instanceof PlusHomeSdkImpl$warmCaches$1) {
            plusHomeSdkImpl$warmCaches$1 = (PlusHomeSdkImpl$warmCaches$1) continuationImpl;
            int i2 = plusHomeSdkImpl$warmCaches$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeSdkImpl$warmCaches$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeSdkImpl$warmCaches$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeSdkImpl$warmCaches$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeSdkImpl$warmCaches$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                PlusHomeSdkImpl$warmCaches$2 plusHomeSdkImpl$warmCaches$2 = new PlusHomeSdkImpl$warmCaches$2(this, null);
                plusHomeSdkImpl$warmCaches$1.label = 2;
            }
        }
        plusHomeSdkImpl$warmCaches$1 = new PlusHomeSdkImpl$warmCaches$1(this, continuationImpl);
        Object obj2 = plusHomeSdkImpl$warmCaches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeSdkImpl$warmCaches$1.label;
        if (i != 0) {
        }
        PlusHomeSdkImpl$warmCaches$2 plusHomeSdkImpl$warmCaches$22 = new PlusHomeSdkImpl$warmCaches$2(this, null);
        plusHomeSdkImpl$warmCaches$1.label = 2;
    }

    @Override // defpackage.t3d0
    public final exf0 getPlugin() {
        return this.a.getPlugin();
    }
}
