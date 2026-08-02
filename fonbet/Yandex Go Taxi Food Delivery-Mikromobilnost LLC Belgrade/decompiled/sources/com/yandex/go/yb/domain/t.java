package com.yandex.go.yb.domain;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.bvf0;
import defpackage.c170;
import defpackage.dw51;
import defpackage.evu0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hg51;
import defpackage.hh31;
import defpackage.ijs;
import defpackage.jst;
import defpackage.jy31;
import defpackage.kz11;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vh51;
import defpackage.vmp0;
import defpackage.x5u;
import defpackage.y5u;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class t implements kz11, vmp0 {
    public final com.yandex.go.yb.data.e a;
    public final tt2 b;
    public final yvf0 c;
    public final c170 d;
    public final r0 e = bvf0.c(Boolean.FALSE);
    public final r0 f = bvf0.c(null);
    public final kotlinx.coroutines.sync.a g = gtq0.a();

    public t(com.yandex.go.yb.data.e eVar, tt2 tt2Var, yvf0 yvf0Var, c170 c170Var, Lifecycle lifecycle) {
        this.a = eVar;
        this.b = tt2Var;
        this.c = yvf0Var;
        this.d = c170Var;
        eVar.d(this);
        tje.N(androidx.lifecycle.r.a(lifecycle), null, null, new YbQrHandlerImpl$1(this, null), 3);
        ru.yandex.taxi.lifecycle.c.a(lifecycle, new jy31(15, this));
    }

    @Override // defpackage.vmp0
    public final void a() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.vmp0
    public final void b() {
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0068, code lost:
    
        if (r9.a(r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0032, B:14:0x00a4, B:16:0x00a8, B:17:0x00b5, B:19:0x00bb), top: B:12:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0032, B:14:0x00a4, B:16:0x00a8, B:17:0x00b5, B:19:0x00bb), top: B:12:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:32:0x004a, B:33:0x0086, B:35:0x008a, B:36:0x0091), top: B:31:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:32:0x004a, B:33:0x0086, B:35:0x008a, B:36:0x0091), top: B:31:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #0 {all -> 0x00cb, blocks: (B:44:0x006b, B:47:0x0074), top: B:43:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v15, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        YbQrHandlerImpl$loadQrResolverAndRules$1 ybQrHandlerImpl$loadQrResolverAndRules$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r0;
        kotlinx.coroutines.sync.a aVar2;
        hg51 hg51Var;
        hg51 hg51Var2;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof YbQrHandlerImpl$loadQrResolverAndRules$1) {
                ybQrHandlerImpl$loadQrResolverAndRules$1 = (YbQrHandlerImpl$loadQrResolverAndRules$1) continuationImpl;
                int i2 = ybQrHandlerImpl$loadQrResolverAndRules$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ybQrHandlerImpl$loadQrResolverAndRules$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = ybQrHandlerImpl$loadQrResolverAndRules$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ybQrHandlerImpl$loadQrResolverAndRules$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        aVar = this.g;
                        ybQrHandlerImpl$loadQrResolverAndRules$1.L$0 = aVar;
                        ybQrHandlerImpl$loadQrResolverAndRules$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                hg51Var2 = (hg51) ybQrHandlerImpl$loadQrResolverAndRules$1.L$1;
                                r0 = (g050) ybQrHandlerImpl$loadQrResolverAndRules$1.L$0;
                                try {
                                    kotlin.b.b(obj2);
                                    obj = ((Result) obj2).getValue();
                                    r0 = r0;
                                    if (!(obj instanceof Result.Failure)) {
                                        this.f.l(hg51Var2);
                                        jst.e.getClass();
                                    }
                                    a = Result.a(obj);
                                    if (a != null) {
                                        jst.e.i("Failed to load QR resolver rules", a);
                                    }
                                    aVar = r0;
                                    aVar.d(null);
                                    return zy11.a;
                                } catch (Throwable th) {
                                    th = th;
                                    r0.d(null);
                                    throw th;
                                }
                            }
                            ?? r2 = (g050) ybQrHandlerImpl$loadQrResolverAndRules$1.L$0;
                            try {
                                kotlin.b.b(obj2);
                                aVar2 = r2;
                                hg51Var = (hg51) obj2;
                                if (hg51Var != null) {
                                    jst.e.getClass();
                                    aVar = aVar2;
                                    aVar.d(null);
                                    return zy11.a;
                                }
                                ybQrHandlerImpl$loadQrResolverAndRules$1.L$0 = aVar2;
                                ybQrHandlerImpl$loadQrResolverAndRules$1.L$1 = hg51Var;
                                ybQrHandlerImpl$loadQrResolverAndRules$1.label = 3;
                                Object a2 = ((com.ybsdk.api.qr.internal.a) hg51Var).a(ybQrHandlerImpl$loadQrResolverAndRules$1);
                                if (a2 != coroutineSingletons) {
                                    hg51Var2 = hg51Var;
                                    obj = a2;
                                    r0 = aVar2;
                                    if (!(obj instanceof Result.Failure)) {
                                    }
                                    a = Result.a(obj);
                                    if (a != null) {
                                    }
                                    aVar = r0;
                                    aVar.d(null);
                                    return zy11.a;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                r0 = r2;
                                r0.d(null);
                                throw th;
                            }
                        }
                        ?? r22 = (g050) ybQrHandlerImpl$loadQrResolverAndRules$1.L$0;
                        kotlin.b.b(obj2);
                        aVar = r22;
                    }
                    if (this.f.getValue() == null) {
                        aVar.d(null);
                        return zy11.a;
                    }
                    com.yandex.go.yb.data.e eVar = this.a;
                    ybQrHandlerImpl$loadQrResolverAndRules$1.L$0 = aVar;
                    ybQrHandlerImpl$loadQrResolverAndRules$1.label = 2;
                    Object g0 = eVar.B.g0();
                    if (g0 != coroutineSingletons) {
                        aVar2 = aVar;
                        obj2 = g0;
                        hg51Var = (hg51) obj2;
                        if (hg51Var != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (this.f.getValue() == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            r0 = aVar;
            r0.d(null);
            throw th;
        }
        ybQrHandlerImpl$loadQrResolverAndRules$1 = new YbQrHandlerImpl$loadQrResolverAndRules$1(this, continuationImpl);
        Object obj22 = ybQrHandlerImpl$loadQrResolverAndRules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybQrHandlerImpl$loadQrResolverAndRules$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (c(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Uri uri, ContinuationImpl continuationImpl) {
        YbQrHandlerImpl$process$1 ybQrHandlerImpl$process$1;
        int i;
        String obj;
        hg51 hg51Var;
        if (continuationImpl instanceof YbQrHandlerImpl$process$1) {
            ybQrHandlerImpl$process$1 = (YbQrHandlerImpl$process$1) continuationImpl;
            int i2 = ybQrHandlerImpl$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybQrHandlerImpl$process$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybQrHandlerImpl$process$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybQrHandlerImpl$process$1.label;
                r0 r0Var = this.f;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    obj = evu0.k0(uri.toString()).toString();
                    if (!evu0.J(obj)) {
                        hg51Var = (hg51) r0Var.getValue();
                        if (hg51Var == null) {
                            if (this.a.f()) {
                                ybQrHandlerImpl$process$1.L$0 = null;
                                ybQrHandlerImpl$process$1.L$1 = null;
                                ybQrHandlerImpl$process$1.L$2 = obj;
                                ybQrHandlerImpl$process$1.L$3 = null;
                                ybQrHandlerImpl$process$1.label = 1;
                            } else {
                                hg51Var = null;
                            }
                        }
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        YbQrHandlerImpl$process$resolveResult$1 ybQrHandlerImpl$process$resolveResult$1 = new YbQrHandlerImpl$process$resolveResult$1(hg51Var, obj, null);
                        ybQrHandlerImpl$process$1.L$0 = null;
                        ybQrHandlerImpl$process$1.L$1 = null;
                        ybQrHandlerImpl$process$1.L$2 = null;
                        ybQrHandlerImpl$process$1.L$3 = null;
                        ybQrHandlerImpl$process$1.label = 2;
                        obj2 = tje.k0(mdhVar, ybQrHandlerImpl$process$resolveResult$1, ybQrHandlerImpl$process$1);
                    }
                    return y5u.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj2).getValue();
                    if (Result.a(value) == null) {
                        this.d.a.invoke(new ijs(14, new hh31(20, this, new dw51(YbScreenSource.DEEPLINK, (vh51) value))));
                        return new x5u();
                    }
                    return y5u.a;
                }
                obj = (String) ybQrHandlerImpl$process$1.L$2;
                kotlin.b.b(obj2);
                hg51Var = (hg51) r0Var.getValue();
            }
        }
        ybQrHandlerImpl$process$1 = new YbQrHandlerImpl$process$1(this, continuationImpl);
        Object obj22 = ybQrHandlerImpl$process$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybQrHandlerImpl$process$1.label;
        r0 r0Var2 = this.f;
        if (i != 0) {
        }
        hg51Var = (hg51) r0Var2.getValue();
    }
}
