package com.yandex.go.payments.transport.domain;

import android.os.SystemClock;
import com.yandex.go.payments.data.g;
import com.yandex.go.payments.domain.l0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h0a0;
import defpackage.lz30;
import defpackage.mo21;
import defpackage.n6a0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qr30;
import defpackage.tpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class a {
    public final po21 a;
    public final qr30 b;
    public final lz30 c;
    public final n6a0 d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public volatile long f;

    public a(po21 po21Var, qr30 qr30Var, lz30 lz30Var, n6a0 n6a0Var) {
        this.a = po21Var;
        this.b = qr30Var;
        this.c = lz30Var;
        this.d = n6a0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(7:22|23|24|25|26|27|28))(1:36))(2:49|(1:51)(1:52))|37|38|(1:(3:42|(4:44|26|27|28)|30)(2:46|28))(3:40|16|17)))|58|6|7|(0)(0)|37|38|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(7:22|23|24|25|26|27|28))(1:36))(2:49|(1:51)(1:52))|37|38|(1:(3:42|(4:44|26|27|28)|30)(2:46|28))(3:40|16|17)))|37|38|(0)(0))|58|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ec, code lost:
    
        if (d(r6, r4) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r2.a(r4) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.yandex.go.payments.transport.domain.a] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, boolean z, Continuation continuation) {
        MtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1 mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1;
        int i;
        g050 g050Var;
        zzs zzsVar2;
        boolean z2;
        long elapsedRealtime;
        long j;
        boolean z3;
        g050 g050Var2;
        Object h;
        g050 g050Var3;
        long j2;
        ?? r1 = z;
        zy11 zy11Var = zy11.a;
        try {
            if (continuation instanceof MtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1) {
                mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1 = (MtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1) continuation;
                int i2 = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (r1 == 0) {
                            return zy11Var;
                        }
                        g050Var = this.e;
                        zzsVar2 = zzsVar;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$0 = zzsVar2;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1 = g050Var;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0 = r1;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label = 1;
                        z2 = r1;
                    } else if (i == 1) {
                        boolean z4 = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0;
                        g050 g050Var4 = (g050) mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1;
                        zzs zzsVar3 = (zzs) mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$0;
                        kotlin.b.b(obj);
                        g050Var = g050Var4;
                        zzsVar2 = zzsVar3;
                        z2 = z4;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050 g050Var5 = (g050) mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1;
                            kotlin.b.b(obj);
                            r1 = g050Var5;
                            this.f = SystemClock.elapsedRealtime();
                            g050Var = r1;
                            g050Var.d(null);
                            return zy11Var;
                        }
                        j2 = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$1;
                        elapsedRealtime = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$0;
                        boolean z5 = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0;
                        g050 g050Var6 = (g050) mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            z3 = z5;
                            g050Var3 = g050Var6;
                            h = obj;
                            zzsVar2 = ((mo21) h).a();
                            j = j2;
                            g050Var2 = g050Var3;
                            this.b.a().a();
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$0 = null;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1 = g050Var2;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$2 = null;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0 = z3;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$0 = elapsedRealtime;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$1 = j;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label = 3;
                            r1 = g050Var2;
                        } catch (Throwable th) {
                            th = th;
                            r1 = g050Var6;
                            r1.d(null);
                            throw th;
                        }
                    }
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    j = elapsedRealtime - this.f;
                    if (j < 500) {
                        g050Var.d(null);
                        return zy11Var;
                    }
                    if (zzsVar2 == null) {
                        po21 po21Var = this.a;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$0 = null;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1 = g050Var;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0 = z2;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$0 = elapsedRealtime;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$1 = j;
                        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label = 2;
                        h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1);
                        if (h != coroutineSingletons) {
                            g050 g050Var7 = g050Var;
                            z3 = z2;
                            g050Var3 = g050Var7;
                            j2 = j;
                            zzsVar2 = ((mo21) h).a();
                            j = j2;
                            g050Var2 = g050Var3;
                            this.b.a().a();
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$0 = null;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1 = g050Var2;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$2 = null;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0 = z3;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$0 = elapsedRealtime;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$1 = j;
                            mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label = 3;
                            r1 = g050Var2;
                        }
                        return coroutineSingletons;
                    }
                    g050 g050Var8 = g050Var;
                    z3 = z2;
                    g050Var2 = g050Var8;
                    this.b.a().a();
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$0 = null;
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$1 = g050Var2;
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.L$2 = null;
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.Z$0 = z3;
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$0 = elapsedRealtime;
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.J$1 = j;
                    mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label = 3;
                    r1 = g050Var2;
                }
            }
            elapsedRealtime = SystemClock.elapsedRealtime();
            j = elapsedRealtime - this.f;
            if (j < 500) {
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = g050Var;
            r1.d(null);
            throw th;
        }
        mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1 = new MtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1(this, continuation);
        Object obj2 = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCurrentPaymentMethodInteractorImpl$forceUpdateCurrentPaymentOptions$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v15, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v8, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.go.payments.transport.domain.a] */
    /* JADX WARN: Type inference failed for: r9v14, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, ContinuationImpl continuationImpl) {
        MtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1 mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1;
        int i;
        Throwable th;
        ?? r9;
        zzs zzsVar2;
        zzs zzsVar3;
        zzs zzsVar4;
        ?? r10;
        qr30 qr30Var = this.b;
        try {
            if (continuationImpl instanceof MtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1) {
                mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1 = (MtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1) continuationImpl;
                int i2 = mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$0 = zzsVar;
                        ?? r11 = this.e;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1 = r11;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label = 1;
                        if (r11.a(mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1) != coroutineSingletons) {
                            zzsVar2 = zzsVar;
                            zzsVar3 = r11;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r9 = (g050) mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                r10 = r9;
                                r10.d(null);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                r9.d(null);
                                throw th;
                            }
                        }
                        ?? r102 = (g050) mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1;
                        kotlin.b.b(obj);
                        zzsVar4 = r102;
                        zzsVar2 = ((mo21) obj).a();
                        zzsVar = zzsVar4;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$0 = null;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1 = zzsVar;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$2 = null;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$3 = null;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label = 3;
                        if (d(zzsVar2, mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1) != coroutineSingletons) {
                            r9 = zzsVar;
                            r10 = r9;
                            r10.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                    ?? r103 = (g050) mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1;
                    zzsVar2 = (zzs) mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$0;
                    kotlin.b.b(obj);
                    zzsVar3 = r103;
                    r10 = zzsVar3;
                    zzsVar = zzsVar3;
                    if (qr30Var.a().b("transport_card").a()) {
                        if (zzsVar2 == null) {
                            po21 po21Var = this.a;
                            mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$0 = null;
                            mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1 = zzsVar3;
                            mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$2 = null;
                            mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label = 2;
                            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1);
                            zzsVar4 = zzsVar3;
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            zzsVar2 = ((mo21) obj).a();
                            zzsVar = zzsVar4;
                        }
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$0 = null;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$1 = zzsVar;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$2 = null;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.L$3 = null;
                        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label = 3;
                        if (d(zzsVar2, mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    r10.d(null);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            r10 = zzsVar3;
            zzsVar = zzsVar3;
            if (qr30Var.a().b("transport_card").a()) {
            }
            r10.d(null);
            return zy11.a;
        } catch (Throwable th3) {
            zzs zzsVar5 = zzsVar;
            th = th3;
            r9 = zzsVar5;
        }
        mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1 = new MtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1(this, continuationImpl);
        Object obj2 = mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentModelsIfNeeded$1.label;
    }

    public final tpr c(zzs zzsVar, boolean z) {
        return com.yandex.go.coroutines.b.d(new m0(((g) this.b.a().a.a("transport_card")).d(), this.c.c, new MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1(this, null)), new MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$2(this, zzsVar, z, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:18|19))(3:20|21|(1:23))|13|14|15))|30|6|7|8|(0)(0)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        defpackage.jst.e.c(java.lang.String.format("Error while requesting current payment options for transport", java.util.Arrays.copyOf(new java.lang.Object[]{r0}, 1)));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zzs zzsVar, ContinuationImpl continuationImpl) {
        MtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1 mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1;
        int i;
        qr30 qr30Var = this.b;
        if (continuationImpl instanceof MtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1) {
            mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1 = (MtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1) continuationImpl;
            int i2 = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1.label = i2 - Integer.MIN_VALUE;
                MtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1 mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$12 = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1;
                Object obj = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0 a = qr30Var.a();
                    h0a0 h0a0Var = new h0a0(zzsVar, null);
                    mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$12.L$0 = null;
                    mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$12.label = 1;
                    if (l0.d(a, h0a0Var, "transport_card", false, mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$12, 24) == coroutineSingletons) {
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
        mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1 = new MtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1(this, continuationImpl);
        MtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1 mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$122 = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$1;
        Object obj2 = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCurrentPaymentMethodInteractorImpl$requestCurrentPaymentModels$122.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
