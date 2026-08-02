package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.log.api.LogPriority;
import defpackage.e3n;
import defpackage.g050;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rkd0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.configuration.SdkConfigurationRepositoryImpl$clearCacheAndStorage$2", f = "SdkConfigurationRepositoryImpl.kt", l = {225, 102, 105, 108, 110}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SdkConfigurationRepositoryImpl$clearCacheAndStorage$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $rechargeTime;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkConfigurationRepositoryImpl$clearCacheAndStorage$2(a aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$rechargeTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkConfigurationRepositoryImpl$clearCacheAndStorage$2(this.this$0, this.$rechargeTime, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkConfigurationRepositoryImpl$clearCacheAndStorage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0197, code lost:
    
        if (r9.e(r11, r19) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x005f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:67:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0175 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:10:0x0024, B:19:0x016c, B:22:0x0171, B:24:0x0175, B:26:0x017d, B:33:0x012f, B:36:0x014e, B:48:0x0111), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        g050 g050Var;
        long j;
        a aVar;
        int i;
        a aVar2;
        long j2;
        int i2;
        a aVar3;
        g050 g050Var2;
        com.yandex.plus.home.datasource.local.preferences.a aVar4;
        long j3;
        a aVar5;
        long a;
        e3n e3nVar;
        e3n e3nVar2;
        long k;
        Object a2;
        e3n e3nVar3;
        ?? r1 = "clearCacheAndStorage(rechargeTime=";
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 0;
        try {
            try {
                if (i3 == 0) {
                    b.b(obj);
                    a aVar6 = this.this$0;
                    g050Var = aVar6.k;
                    j = this.$rechargeTime;
                    this.L$0 = g050Var;
                    this.L$1 = aVar6;
                    this.J$0 = j;
                    this.I$0 = 0;
                    this.label = 1;
                    if (g050Var.a(this) != coroutineSingletons) {
                        aVar = aVar6;
                        i = 0;
                    }
                    return coroutineSingletons;
                }
                if (i3 == 1) {
                    i = this.I$0;
                    long j4 = this.J$0;
                    aVar = (a) this.L$1;
                    g050 g050Var3 = (g050) this.L$0;
                    b.b(obj);
                    g050Var = g050Var3;
                    j = j4;
                } else if (i3 == 2) {
                    i4 = this.I$1;
                    i2 = this.I$0;
                    j2 = this.J$0;
                    aVar3 = (a) this.L$1;
                    g050Var = (g050) this.L$0;
                    b.b(obj);
                    aVar2 = aVar3;
                    i = i2;
                    g050Var2 = g050Var;
                    aVar2.m = null;
                    aVar2.l.l(null);
                    aVar4 = aVar2.h;
                    this.L$0 = g050Var2;
                    this.L$1 = aVar2;
                    this.J$0 = j2;
                    this.I$0 = i;
                    this.I$1 = i4;
                    this.label = 3;
                    if (aVar4.e(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j3 = j2;
                    aVar5 = aVar2;
                    a = aVar5.c.a();
                    e3nVar = new e3n(j3);
                    e3nVar2 = new e3n(kp50.U(24, DurationUnit.HOURS));
                    if (e3nVar.compareTo(e3nVar2) > 0) {
                    }
                    k = e3n.k(a, e3nVar.a);
                    com.yandex.plus.home.datasource.local.preferences.a aVar7 = aVar5.i;
                    this.L$0 = g050Var2;
                    this.L$1 = aVar5;
                    this.I$0 = i;
                    this.I$1 = i4;
                    this.J$0 = a;
                    this.J$1 = k;
                    this.label = 4;
                    a2 = aVar7.a(this);
                    if (a2 == coroutineSingletons) {
                    }
                    if (a2 instanceof Result.Failure) {
                    }
                    e3nVar3 = (e3n) a2;
                    if (e3nVar3 != null) {
                    }
                    com.yandex.plus.home.datasource.local.preferences.a aVar8 = aVar5.i;
                    e3n e3nVar4 = new e3n(k);
                    this.L$0 = g050Var2;
                    this.L$1 = null;
                    this.I$0 = i;
                    this.I$1 = i4;
                    this.J$0 = a;
                    this.J$1 = k;
                    this.label = 5;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var2 = (g050) this.L$0;
                            b.b(obj);
                            ((Result) obj).getClass();
                            g050Var2.d(null);
                            return zy11.a;
                        }
                        long j5 = this.J$1;
                        long j6 = this.J$0;
                        int i5 = this.I$1;
                        int i6 = this.I$0;
                        aVar5 = (a) this.L$1;
                        g050 g050Var4 = (g050) this.L$0;
                        b.b(obj);
                        a2 = ((Result) obj).getValue();
                        a = j6;
                        i4 = i5;
                        i = i6;
                        g050Var2 = g050Var4;
                        k = j5;
                        if (a2 instanceof Result.Failure) {
                            a2 = null;
                        }
                        e3nVar3 = (e3n) a2;
                        if (e3nVar3 != null || e3n.c(e3nVar3.a, k) < 0) {
                            com.yandex.plus.home.datasource.local.preferences.a aVar82 = aVar5.i;
                            e3n e3nVar42 = new e3n(k);
                            this.L$0 = g050Var2;
                            this.L$1 = null;
                            this.I$0 = i;
                            this.I$1 = i4;
                            this.J$0 = a;
                            this.J$1 = k;
                            this.label = 5;
                        }
                        g050Var2.d(null);
                        return zy11.a;
                    }
                    int i7 = this.I$1;
                    i = this.I$0;
                    j3 = this.J$0;
                    a aVar9 = (a) this.L$1;
                    g050 g050Var5 = (g050) this.L$0;
                    try {
                        b.b(obj);
                        ((Result) obj).getClass();
                        i4 = i7;
                        g050Var2 = g050Var5;
                        aVar5 = aVar9;
                        a = aVar5.c.a();
                        e3nVar = new e3n(j3);
                        e3nVar2 = new e3n(kp50.U(24, DurationUnit.HOURS));
                        if (e3nVar.compareTo(e3nVar2) > 0) {
                            e3nVar = e3nVar2;
                        }
                        k = e3n.k(a, e3nVar.a);
                        com.yandex.plus.home.datasource.local.preferences.a aVar72 = aVar5.i;
                        this.L$0 = g050Var2;
                        this.L$1 = aVar5;
                        this.I$0 = i;
                        this.I$1 = i4;
                        this.J$0 = a;
                        this.J$1 = k;
                        this.label = 4;
                        a2 = aVar72.a(this);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (a2 instanceof Result.Failure) {
                        }
                        e3nVar3 = (e3n) a2;
                        if (e3nVar3 != null) {
                        }
                        com.yandex.plus.home.datasource.local.preferences.a aVar822 = aVar5.i;
                        e3n e3nVar422 = new e3n(k);
                        this.L$0 = g050Var2;
                        this.L$1 = null;
                        this.I$0 = i;
                        this.I$1 = i4;
                        this.J$0 = a;
                        this.J$1 = k;
                        this.label = 5;
                    } catch (Throwable th) {
                        th = th;
                        r1 = g050Var5;
                        r1.d(null);
                        throw th;
                    }
                }
                rkd0 rkd0Var = aVar.g;
                LogPriority logPriority = LogPriority.INFO;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "SdkConfigurationRepositoryImpl", "clearCacheAndStorage(rechargeTime=" + ((Object) e3n.p(j)) + ')', null);
                }
                qoh qohVar = aVar.m;
                if (qohVar != null) {
                    this.L$0 = g050Var;
                    this.L$1 = aVar;
                    this.J$0 = j;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 2;
                    if (kotlinx.coroutines.a.f(qohVar, this) != coroutineSingletons) {
                        i2 = i;
                        aVar3 = aVar;
                        j2 = j;
                        aVar2 = aVar3;
                        i = i2;
                        g050Var2 = g050Var;
                        aVar2.m = null;
                        aVar2.l.l(null);
                        aVar4 = aVar2.h;
                        this.L$0 = g050Var2;
                        this.L$1 = aVar2;
                        this.J$0 = j2;
                        this.I$0 = i;
                        this.I$1 = i4;
                        this.label = 3;
                        if (aVar4.e(null, this) == coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                aVar2 = aVar;
                j2 = j;
                g050Var2 = g050Var;
                aVar2.m = null;
                aVar2.l.l(null);
                aVar4 = aVar2.h;
                this.L$0 = g050Var2;
                this.L$1 = aVar2;
                this.J$0 = j2;
                this.I$0 = i;
                this.I$1 = i4;
                this.label = 3;
                if (aVar4.e(null, this) == coroutineSingletons) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            r1 = obj2;
        }
    }
}
