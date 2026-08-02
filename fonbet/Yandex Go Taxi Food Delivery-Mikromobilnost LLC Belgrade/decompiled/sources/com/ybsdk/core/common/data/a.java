package com.ybsdk.core.common.data;

import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final r0 a;
    public final kotlinx.coroutines.sync.a b;
    public final r0 c;

    public a() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = gtq0.a();
        this.c = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (defpackage.zy11.a == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        if (r9.a(r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:20:0x0045, B:21:0x0093, B:23:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, tls tlsVar, ContinuationImpl continuationImpl) {
        Cacheable$request$1 cacheable$request$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g050 g050Var;
        Object value;
        boolean z2;
        g050 g050Var2;
        Object value2;
        try {
            if (continuationImpl instanceof Cacheable$request$1) {
                cacheable$request$1 = (Cacheable$request$1) continuationImpl;
                int i2 = cacheable$request$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cacheable$request$1.label = i2 - Integer.MIN_VALUE;
                    obj = cacheable$request$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cacheable$request$1.label;
                    r0 r0Var = this.a;
                    if (i != 0) {
                        b.b(obj);
                        if (z != 0 && (value = r0Var.getValue()) != null) {
                            return value;
                        }
                        cacheable$request$1.L$0 = tlsVar;
                        g050Var = this.b;
                        cacheable$request$1.L$1 = g050Var;
                        cacheable$request$1.Z$0 = z;
                        cacheable$request$1.label = 1;
                        z2 = z;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                value2 = cacheable$request$1.L$1;
                                g050Var2 = (g050) cacheable$request$1.L$0;
                                b.b(obj);
                                g050Var2.d(null);
                                return value2;
                            }
                            g050Var2 = (g050) cacheable$request$1.L$0;
                            b.b(obj);
                            value2 = ((Result) obj).getValue();
                            if (!(value2 instanceof Result.Failure)) {
                                cacheable$request$1.L$0 = g050Var2;
                                cacheable$request$1.L$1 = value2;
                                cacheable$request$1.label = 3;
                                r0Var.emit(value2, cacheable$request$1);
                            }
                            g050Var2.d(null);
                            return value2;
                        }
                        boolean z3 = cacheable$request$1.Z$0;
                        g050Var = (g050) cacheable$request$1.L$1;
                        tlsVar = (tls) cacheable$request$1.L$0;
                        b.b(obj);
                        z2 = z3;
                    }
                    if (z2) {
                        try {
                            Object value3 = r0Var.getValue();
                            if (value3 != null) {
                                g050Var.d(null);
                                return value3;
                            }
                        } catch (Throwable th) {
                            z = g050Var;
                            th = th;
                            z.d(null);
                            throw th;
                        }
                    }
                    cacheable$request$1.L$0 = g050Var;
                    cacheable$request$1.L$1 = null;
                    cacheable$request$1.label = 2;
                    obj = tlsVar.invoke(cacheable$request$1);
                    if (obj != coroutineSingletons) {
                        g050Var2 = g050Var;
                        value2 = ((Result) obj).getValue();
                        if (!(value2 instanceof Result.Failure)) {
                        }
                        g050Var2.d(null);
                        return value2;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            if (z2) {
            }
            cacheable$request$1.L$0 = g050Var;
            cacheable$request$1.L$1 = null;
            cacheable$request$1.label = 2;
            obj = tlsVar.invoke(cacheable$request$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
        }
        cacheable$request$1 = new Cacheable$request$1(this, continuationImpl);
        obj = cacheable$request$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cacheable$request$1.label;
        r0 r0Var2 = this.a;
    }
}
