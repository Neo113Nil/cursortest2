package com.ybsdk.utils.poller;

import com.ybsdk.core.utils.poller.PollerAnalyticsReporter$PollerResult;
import defpackage.az91;
import defpackage.bvf0;
import defpackage.bzd0;
import defpackage.e3n;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i5z0;
import defpackage.iyd0;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.l8x;
import defpackage.myd0;
import defpackage.ny61;
import defpackage.o2e0;
import defpackage.o430;
import defpackage.q6c0;
import defpackage.r2e0;
import defpackage.rol0;
import defpackage.s2e0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tq11;
import defpackage.v5;
import defpackage.wls;
import defpackage.yyd0;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class c {
    public final yyd0 a;
    public final myd0 b;
    public final wls c;
    public final zls d;
    public final bzd0 e;
    public final q6c0 f;
    public final az91 g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();
    public final r0 i = bvf0.c(o2e0.a);
    public l8x j;

    public c(yyd0 yyd0Var, myd0 myd0Var, wls wlsVar, zls zlsVar) {
        this.a = yyd0Var;
        this.b = myd0Var;
        this.c = wlsVar;
        this.d = zlsVar;
        this.e = myd0Var.e;
        this.f = myd0Var.d;
        this.g = myd0Var.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:20|(2:22|23)|25|(1:27)(1:69)|28|(1:68)|31|32|34|35|36|37|38|(1:42)(5:40|41|15|16|(16:18|20|(0)|25|(0)(0)|28|(0)|30|31|32|34|35|36|37|38|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:20|(2:22|23)|25|(1:27)(1:69)|28|(1:68)|30|31|32|34|35|36|37|38|(1:42)(5:40|41|15|16|(16:18|20|(0)|25|(0)(0)|28|(0)|30|31|32|34|35|36|37|38|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(7:13|14|15|16|(15:20|(2:22|23)|25|(1:27)(1:69)|28|(1:68)|30|31|32|34|35|36|37|38|(1:42)(5:40|41|15|16|(16:18|20|(0)|25|(0)(0)|28|(0)|30|31|32|34|35|36|37|38|(0)(0))))|71|72)(2:73|74))(9:75|76|77|78|15|16|(0)|71|72))(11:79|80|30|31|32|34|35|36|37|38|(0)(0)))(15:81|82|25|(0)(0)|28|(0)|30|31|32|34|35|36|37|38|(0)(0)))(5:83|16|(0)|71|72)))|87|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        defpackage.x4c.g("Exception during loop() in Poller", r0, null, null, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        if (((java.lang.Boolean) r2.g.a.invoke(r0)).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        r1 = new defpackage.n2e0(r0);
        r3.getClass();
        r3.m(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        r7 = r7 + 1;
        r8 = r2.c.c(r7);
        r4.Q(defpackage.e3n.e(r8));
        r5.L$0 = null;
        r5.I$0 = r7;
        r5.J$0 = r14;
        r10 = 4;
        r5.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013f, code lost:
    
        if (kotlinx.coroutines.a.j(r8, r5) == r6) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0056, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0052, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0053, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: Exception -> 0x0052, CancellationException -> 0x0056, TryCatch #6 {CancellationException -> 0x0056, Exception -> 0x0052, blocks: (B:20:0x008a, B:25:0x00a1, B:27:0x00af, B:28:0x00bb, B:69:0x00b5, B:76:0x004c, B:80:0x005f, B:82:0x0067), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5 A[Catch: Exception -> 0x0052, CancellationException -> 0x0056, TryCatch #6 {CancellationException -> 0x0056, Exception -> 0x0052, blocks: (B:20:0x008a, B:25:0x00a1, B:27:0x00af, B:28:0x00bb, B:69:0x00b5, B:76:0x004c, B:80:0x005f, B:82:0x0067), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013f -> B:14:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        PollerImpl$loop$1 pollerImpl$loop$1;
        int i;
        char c;
        long j;
        PollerAnalyticsReporter$PollerResult pollerAnalyticsReporter$PollerResult;
        Object obj;
        int i2;
        long c2;
        zls zlsVar;
        Result result;
        myd0 myd0Var = cVar.b;
        r0 r0Var = cVar.i;
        q6c0 q6c0Var = cVar.f;
        if (continuationImpl instanceof PollerImpl$loop$1) {
            pollerImpl$loop$1 = (PollerImpl$loop$1) continuationImpl;
            int i3 = pollerImpl$loop$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pollerImpl$loop$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = pollerImpl$loop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollerImpl$loop$1.label;
                char c3 = 3;
                int i4 = 2;
                int i5 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j = System.currentTimeMillis();
                    i = 0;
                    if (kotlinx.coroutines.a.p(pollerImpl$loop$1.get_context())) {
                    }
                    q6c0Var.R(PollerAnalyticsReporter$PollerResult.FINISHED, System.currentTimeMillis() - j, i);
                    return zy11.a;
                }
                if (i == 1) {
                    j = pollerImpl$loop$1.J$0;
                    i = pollerImpl$loop$1.I$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                    zlsVar = cVar.d;
                    Throwable a = Result.a(obj);
                    result = new Result(a == null ? ((iyd0) obj).a : new Result.Failure(a));
                    pollerImpl$loop$1.L$0 = obj;
                    pollerImpl$loop$1.I$0 = i;
                    pollerImpl$loop$1.J$0 = j;
                    pollerImpl$loop$1.label = i4;
                    if (zlsVar.invoke(r0Var, result, pollerImpl$loop$1) == coroutineSingletons) {
                    }
                    i2 = i + 1;
                    c2 = cVar.c(i, obj);
                    q6c0Var.Q(e3n.e(c2));
                    pollerImpl$loop$1.L$0 = null;
                    pollerImpl$loop$1.I$0 = i2;
                    pollerImpl$loop$1.J$0 = j;
                    c = 3;
                    pollerImpl$loop$1.label = 3;
                    if (kotlinx.coroutines.a.j(c2, pollerImpl$loop$1) != coroutineSingletons) {
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            j = pollerImpl$loop$1.J$0;
                            i = pollerImpl$loop$1.I$0;
                            kotlin.b.b(obj2);
                            c3 = 3;
                            i4 = 2;
                            i5 = 1;
                            if (kotlinx.coroutines.a.p(pollerImpl$loop$1.get_context())) {
                            }
                            q6c0Var.R(PollerAnalyticsReporter$PollerResult.FINISHED, System.currentTimeMillis() - j, i);
                            return zy11.a;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = pollerImpl$loop$1.J$0;
                        i = pollerImpl$loop$1.I$0;
                        kotlin.b.b(obj2);
                        c = 3;
                        char c4 = 4;
                        c3 = c;
                        i4 = 2;
                        i5 = 1;
                        if (kotlinx.coroutines.a.p(pollerImpl$loop$1.get_context()) && !e.a((s2e0) r0Var.getValue())) {
                            try {
                                wls wlsVar = cVar.c;
                                tq11 tq11Var = new tq11(i);
                                pollerImpl$loop$1.L$0 = null;
                                pollerImpl$loop$1.I$0 = i;
                                pollerImpl$loop$1.J$0 = j;
                                pollerImpl$loop$1.label = i5;
                                obj2 = wlsVar.invoke(tq11Var, pollerImpl$loop$1);
                                if (obj2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = ((Result) obj2).getValue();
                                zlsVar = cVar.d;
                                Throwable a2 = Result.a(obj);
                                result = new Result(a2 == null ? ((iyd0) obj).a : new Result.Failure(a2));
                                pollerImpl$loop$1.L$0 = obj;
                                pollerImpl$loop$1.I$0 = i;
                                pollerImpl$loop$1.J$0 = j;
                                pollerImpl$loop$1.label = i4;
                                if (zlsVar.invoke(r0Var, result, pollerImpl$loop$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                c2 = cVar.c(i, obj);
                                q6c0Var.Q(e3n.e(c2));
                                pollerImpl$loop$1.L$0 = null;
                                pollerImpl$loop$1.I$0 = i2;
                                pollerImpl$loop$1.J$0 = j;
                                c = 3;
                                pollerImpl$loop$1.label = 3;
                                if (kotlinx.coroutines.a.j(c2, pollerImpl$loop$1) != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                i = i2;
                                c3 = 3;
                                i4 = 2;
                                i5 = 1;
                                if (kotlinx.coroutines.a.p(pollerImpl$loop$1.get_context())) {
                                    wls wlsVar2 = cVar.c;
                                    tq11 tq11Var2 = new tq11(i);
                                    pollerImpl$loop$1.L$0 = null;
                                    pollerImpl$loop$1.I$0 = i;
                                    pollerImpl$loop$1.J$0 = j;
                                    pollerImpl$loop$1.label = i5;
                                    obj2 = wlsVar2.invoke(tq11Var2, pollerImpl$loop$1);
                                    if (obj2 == coroutineSingletons) {
                                    }
                                    obj = ((Result) obj2).getValue();
                                    zlsVar = cVar.d;
                                    Throwable a22 = Result.a(obj);
                                    result = new Result(a22 == null ? ((iyd0) obj).a : new Result.Failure(a22));
                                    pollerImpl$loop$1.L$0 = obj;
                                    pollerImpl$loop$1.I$0 = i;
                                    pollerImpl$loop$1.J$0 = j;
                                    pollerImpl$loop$1.label = i4;
                                    if (zlsVar.invoke(r0Var, result, pollerImpl$loop$1) == coroutineSingletons) {
                                    }
                                    i2 = i + 1;
                                    c2 = cVar.c(i, obj);
                                    q6c0Var.Q(e3n.e(c2));
                                    pollerImpl$loop$1.L$0 = null;
                                    pollerImpl$loop$1.I$0 = i2;
                                    pollerImpl$loop$1.J$0 = j;
                                    c = 3;
                                    pollerImpl$loop$1.label = 3;
                                    if (kotlinx.coroutines.a.j(c2, pollerImpl$loop$1) != coroutineSingletons) {
                                    }
                                }
                            } catch (CancellationException e) {
                                e = e;
                                i = i2;
                                double currentTimeMillis = System.currentTimeMillis() - j;
                                if (!(e instanceof PollerImpl$SuccessCancellationException)) {
                                    pollerAnalyticsReporter$PollerResult = PollerAnalyticsReporter$PollerResult.FINISHED;
                                } else if (e instanceof TimeoutCancellationException) {
                                    i5z0.a.a("Poller job timeout", new Object[0]);
                                    pollerAnalyticsReporter$PollerResult = PollerAnalyticsReporter$PollerResult.TIMEOUT;
                                } else {
                                    i5z0.a.a("Poller job canceled", new Object[0]);
                                    pollerAnalyticsReporter$PollerResult = PollerAnalyticsReporter$PollerResult.CANCELLED;
                                }
                                q6c0Var.R(pollerAnalyticsReporter$PollerResult, currentTimeMillis, i);
                                throw e;
                            }
                            i2 = i + 1;
                        }
                        q6c0Var.R(PollerAnalyticsReporter$PollerResult.FINISHED, System.currentTimeMillis() - j, i);
                        return zy11.a;
                    }
                    j = pollerImpl$loop$1.J$0;
                    i = pollerImpl$loop$1.I$0;
                    obj = pollerImpl$loop$1.L$0;
                    kotlin.b.b(obj2);
                    i2 = i + 1;
                    c2 = cVar.c(i, obj);
                    q6c0Var.Q(e3n.e(c2));
                    pollerImpl$loop$1.L$0 = null;
                    pollerImpl$loop$1.I$0 = i2;
                    pollerImpl$loop$1.J$0 = j;
                    c = 3;
                    pollerImpl$loop$1.label = 3;
                    if (kotlinx.coroutines.a.j(c2, pollerImpl$loop$1) != coroutineSingletons) {
                    }
                }
            }
        }
        pollerImpl$loop$1 = new PollerImpl$loop$1(cVar, continuationImpl);
        Object obj22 = pollerImpl$loop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollerImpl$loop$1.label;
        char c32 = 3;
        int i42 = 2;
        int i52 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r11 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (kotlinx.coroutines.a.j(r3, r1) == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, ContinuationImpl continuationImpl) {
        PollerImpl$loopWithTimeout$1 pollerImpl$loopWithTimeout$1;
        int i;
        bzd0 bzd0Var = cVar.e;
        if (continuationImpl instanceof PollerImpl$loopWithTimeout$1) {
            pollerImpl$loopWithTimeout$1 = (PollerImpl$loopWithTimeout$1) continuationImpl;
            int i2 = pollerImpl$loopWithTimeout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollerImpl$loopWithTimeout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollerImpl$loopWithTimeout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollerImpl$loopWithTimeout$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bzd0Var != null) {
                        long d = cVar.b.b.d();
                        pollerImpl$loopWithTimeout$1.label = 1;
                    } else {
                        PollerImpl$loopWithTimeout$4 pollerImpl$loopWithTimeout$4 = new PollerImpl$loopWithTimeout$4(cVar, null);
                        pollerImpl$loopWithTimeout$1.label = 4;
                        if (bvf0.n(pollerImpl$loopWithTimeout$4, pollerImpl$loopWithTimeout$1) != coroutineSingletons) {
                            return zy11Var;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i == 4) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (((zy11) obj) == null) {
                        l8x l8xVar = cVar.j;
                        if (l8xVar != null) {
                            l8xVar.a(null);
                        }
                        r0 r0Var = cVar.i;
                        pollerImpl$loopWithTimeout$1.label = 3;
                        r0Var.emit(r2e0.a, pollerImpl$loopWithTimeout$1);
                        if (zy11Var == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                kotlin.b.b(obj);
                long j = bzd0Var.b;
                PollerImpl$loopWithTimeout$2 pollerImpl$loopWithTimeout$2 = new PollerImpl$loopWithTimeout$2(cVar, null);
                pollerImpl$loopWithTimeout$1.label = 2;
                obj = kotlinx.coroutines.a.w(j, pollerImpl$loopWithTimeout$2, pollerImpl$loopWithTimeout$1);
            }
        }
        pollerImpl$loopWithTimeout$1 = new PollerImpl$loopWithTimeout$1(cVar, continuationImpl);
        Object obj2 = pollerImpl$loopWithTimeout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollerImpl$loopWithTimeout$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        long j2 = bzd0Var.b;
        PollerImpl$loopWithTimeout$2 pollerImpl$loopWithTimeout$22 = new PollerImpl$loopWithTimeout$2(cVar, null);
        pollerImpl$loopWithTimeout$1.label = 2;
        obj2 = kotlinx.coroutines.a.w(j2, pollerImpl$loopWithTimeout$22, pollerImpl$loopWithTimeout$1);
    }

    public final long c(int i, Object obj) {
        Integer num;
        e3n e3nVar = null;
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        iyd0 iyd0Var = (iyd0) obj;
        if (iyd0Var != null && (num = iyd0Var.b) != null) {
            o430 o430Var = e3n.b;
            e3nVar = new e3n(kp50.U(num.intValue(), DurationUnit.MILLISECONDS));
        }
        return e3nVar != null ? e3nVar.a : this.b.b.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0061, code lost:
    
        if (r11.a(r0) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x00a5, B:15:0x00aa, B:16:0x00ad), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v9, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v5 v5Var, ContinuationImpl continuationImpl) {
        PollerImpl$poll$1 pollerImpl$poll$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        r0 r0Var;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        l8x l8xVar;
        Object b;
        tls tlsVar;
        c cVar;
        try {
            if (continuationImpl instanceof PollerImpl$poll$1) {
                pollerImpl$poll$1 = (PollerImpl$poll$1) continuationImpl;
                int i2 = pollerImpl$poll$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pollerImpl$poll$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pollerImpl$poll$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pollerImpl$poll$1.label;
                    int i3 = 3;
                    r0Var = this.i;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pollerImpl$poll$1.L$0 = v5Var;
                        aVar = this.h;
                        pollerImpl$poll$1.L$1 = aVar;
                        pollerImpl$poll$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cVar = (c) pollerImpl$poll$1.L$2;
                            g050Var = (g050) pollerImpl$poll$1.L$1;
                            tlsVar = (tls) pollerImpl$poll$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                l8x l8xVar2 = (l8x) obj;
                                if (tlsVar != null) {
                                    tlsVar.invoke(l8xVar2);
                                }
                                cVar.j = (l8x) obj;
                                jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.Y(r0Var, new PollerImpl$getReturnFlow$1(3, null)), new PollerImpl$poll$2$3(this, null), i3);
                                g050Var.d(null);
                                return jqrVar;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r10 = (g050) pollerImpl$poll$1.L$1;
                        ?? r2 = (tls) pollerImpl$poll$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r10;
                        v5Var = r2;
                    }
                    l8xVar = this.j;
                    if (l8xVar == null && l8xVar.isActive()) {
                        rol0 Y = kotlinx.coroutines.flow.e.Y(r0Var, new PollerImpl$getReturnFlow$1(3, null));
                        aVar.d(null);
                        return Y;
                    }
                    o2e0 o2e0Var = o2e0.a;
                    r0Var.getClass();
                    r0Var.m(null, o2e0Var);
                    yyd0 yyd0Var = this.a;
                    PollerScopeType pollerScopeType = this.b.a;
                    PollerImpl$poll$2$1 pollerImpl$poll$2$1 = new PollerImpl$poll$2$1(this, null);
                    pollerImpl$poll$1.L$0 = v5Var;
                    pollerImpl$poll$1.L$1 = aVar;
                    pollerImpl$poll$1.L$2 = this;
                    pollerImpl$poll$1.label = 2;
                    b = yyd0Var.b(pollerScopeType, pollerImpl$poll$2$1, pollerImpl$poll$1);
                    if (b != coroutineSingletons) {
                        g050Var = aVar;
                        obj = b;
                        tlsVar = v5Var;
                        cVar = this;
                        l8x l8xVar22 = (l8x) obj;
                        if (tlsVar != null) {
                        }
                        cVar.j = (l8x) obj;
                        jqr jqrVar2 = new jqr(kotlinx.coroutines.flow.e.Y(r0Var, new PollerImpl$getReturnFlow$1(3, null)), new PollerImpl$poll$2$3(this, null), i3);
                        g050Var.d(null);
                        return jqrVar2;
                    }
                    return coroutineSingletons;
                }
            }
            l8xVar = this.j;
            if (l8xVar == null) {
            }
            o2e0 o2e0Var2 = o2e0.a;
            r0Var.getClass();
            r0Var.m(null, o2e0Var2);
            yyd0 yyd0Var2 = this.a;
            PollerScopeType pollerScopeType2 = this.b.a;
            PollerImpl$poll$2$1 pollerImpl$poll$2$12 = new PollerImpl$poll$2$1(this, null);
            pollerImpl$poll$1.L$0 = v5Var;
            pollerImpl$poll$1.L$1 = aVar;
            pollerImpl$poll$1.L$2 = this;
            pollerImpl$poll$1.label = 2;
            b = yyd0Var2.b(pollerScopeType2, pollerImpl$poll$2$12, pollerImpl$poll$1);
            if (b != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        pollerImpl$poll$1 = new PollerImpl$poll$1(this, continuationImpl);
        Object obj2 = pollerImpl$poll$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollerImpl$poll$1.label;
        int i32 = 3;
        r0Var = this.i;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PollerImpl$pollForResult$1 pollerImpl$pollForResult$1;
        int i;
        if (continuationImpl instanceof PollerImpl$pollForResult$1) {
            pollerImpl$pollForResult$1 = (PollerImpl$pollForResult$1) continuationImpl;
            int i2 = pollerImpl$pollForResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollerImpl$pollForResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollerImpl$pollForResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollerImpl$pollForResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pollerImpl$pollForResult$1.label = 1;
                    obj = d(null, pollerImpl$pollForResult$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                pollerImpl$pollForResult$1.label = 2;
                Object b = e.b((tpr) obj, pollerImpl$pollForResult$1);
                return b != obj2 ? obj2 : b;
            }
        }
        pollerImpl$pollForResult$1 = new PollerImpl$pollForResult$1(this, continuationImpl);
        Object obj3 = pollerImpl$pollForResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollerImpl$pollForResult$1.label;
        if (i != 0) {
        }
        pollerImpl$pollForResult$1.label = 2;
        Object b2 = e.b((tpr) obj3, pollerImpl$pollForResult$1);
        if (b2 != obj22) {
        }
    }
}
