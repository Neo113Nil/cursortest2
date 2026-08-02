package com.yandex.go.image.internal.coil.fetcher;

import defpackage.bvf0;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.g050;
import defpackage.jl40;
import defpackage.l3f0;
import defpackage.l8x;
import defpackage.m041;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2f;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qhw0;
import defpackage.tls;
import defpackage.w511;
import defpackage.y270;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final Map a;
    public final qhw0 b = jl40.a();
    public final HashMap c;
    public long d;
    public int e;
    public final PriorityQueue f;

    public c(Map map) {
        this.a = map;
        Iterator it = map.entrySet().iterator();
        int i = 10;
        while (it.hasNext()) {
            int intValue = ((Number) ((Map.Entry) it.next()).getValue()).intValue();
            if (intValue <= 0) {
                w511.f(oyr.i(intValue, "Permits in perPriorityPermit must be positive, was: "));
                throw null;
            }
            i = Math.max(i, intValue);
        }
        this.c = new HashMap(i);
        this.f = new PriorityQueue(new o2f(5));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(y270 y270Var, Object obj) {
        eyc eycVar;
        synchronized (this.c) {
            int i = y270Var.d - 1;
            y270Var.d = i;
            if (i > 0) {
                return false;
            }
            this.c.remove(obj);
            m041 m041Var = y270Var.b;
            if ((m041Var != null ? (eyc) m041Var.c.getAndSet(null) : null) == null) {
                this.e--;
                do {
                    m041 m041Var2 = (m041) this.f.peek();
                    if (m041Var2 != null && c(m041Var2.a)) {
                        this.f.poll();
                        eycVar = (eyc) m041Var2.c.getAndSet(null);
                    }
                } while (eycVar == null);
                this.e++;
                ((l8x) y270Var.a.getValue()).a(null);
                if (eycVar != null) {
                    ((fyc) eycVar).T(zy11.a);
                }
                return true;
            }
            eycVar = null;
            ((l8x) y270Var.a.getValue()).a(null);
            if (eycVar != null) {
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, Object obj, tls tlsVar, ContinuationImpl continuationImpl) {
        PriorityRequestFactory$handleRequest$1 priorityRequestFactory$handleRequest$1;
        int i2;
        int i3;
        Object obj2;
        if (continuationImpl instanceof PriorityRequestFactory$handleRequest$1) {
            priorityRequestFactory$handleRequest$1 = (PriorityRequestFactory$handleRequest$1) continuationImpl;
            int i4 = priorityRequestFactory$handleRequest$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                priorityRequestFactory$handleRequest$1.label = i4 - Integer.MIN_VALUE;
                PriorityRequestFactory$handleRequest$1 priorityRequestFactory$handleRequest$12 = priorityRequestFactory$handleRequest$1;
                Object obj3 = priorityRequestFactory$handleRequest$12.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = priorityRequestFactory$handleRequest$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj3);
                    PriorityRequestFactory$handleRequest$requestHolder$1 priorityRequestFactory$handleRequest$requestHolder$1 = new PriorityRequestFactory$handleRequest$requestHolder$1(this, obj, i, tlsVar, null);
                    priorityRequestFactory$handleRequest$12.L$0 = obj;
                    priorityRequestFactory$handleRequest$12.L$1 = null;
                    priorityRequestFactory$handleRequest$12.I$0 = i;
                    priorityRequestFactory$handleRequest$12.label = 1;
                    obj3 = bvf0.n(priorityRequestFactory$handleRequest$requestHolder$1, priorityRequestFactory$handleRequest$12);
                    if (obj3 != obj4) {
                        i3 = i;
                        obj2 = obj;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                    return obj3;
                }
                i3 = priorityRequestFactory$handleRequest$12.I$0;
                obj2 = priorityRequestFactory$handleRequest$12.L$0;
                kotlin.b.b(obj3);
                priorityRequestFactory$handleRequest$12.L$0 = null;
                priorityRequestFactory$handleRequest$12.L$1 = null;
                priorityRequestFactory$handleRequest$12.L$2 = null;
                priorityRequestFactory$handleRequest$12.I$0 = i3;
                priorityRequestFactory$handleRequest$12.label = 2;
                Object d = d((y270) obj3, obj2, priorityRequestFactory$handleRequest$12);
                return d != obj4 ? obj4 : d;
            }
        }
        priorityRequestFactory$handleRequest$1 = new PriorityRequestFactory$handleRequest$1(this, continuationImpl);
        PriorityRequestFactory$handleRequest$1 priorityRequestFactory$handleRequest$122 = priorityRequestFactory$handleRequest$1;
        Object obj32 = priorityRequestFactory$handleRequest$122.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = priorityRequestFactory$handleRequest$122.label;
        if (i2 != 0) {
        }
        priorityRequestFactory$handleRequest$122.L$0 = null;
        priorityRequestFactory$handleRequest$122.L$1 = null;
        priorityRequestFactory$handleRequest$122.L$2 = null;
        priorityRequestFactory$handleRequest$122.I$0 = i3;
        priorityRequestFactory$handleRequest$122.label = 2;
        Object d2 = d((y270) obj32, obj2, priorityRequestFactory$handleRequest$122);
        if (d2 != obj42) {
        }
    }

    public final boolean c(int i) {
        int i2 = this.e;
        Integer num = (Integer) this.a.get(Integer.valueOf(i));
        return i2 < (num != null ? num.intValue() : 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(y270 y270Var, Object obj, ContinuationImpl continuationImpl) {
        PriorityRequestFactory$waitForResult$1 priorityRequestFactory$waitForResult$1;
        int i;
        noh nohVar;
        Object k;
        Throwable th;
        if (continuationImpl instanceof PriorityRequestFactory$waitForResult$1) {
            priorityRequestFactory$waitForResult$1 = (PriorityRequestFactory$waitForResult$1) continuationImpl;
            int i2 = priorityRequestFactory$waitForResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                priorityRequestFactory$waitForResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = priorityRequestFactory$waitForResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = priorityRequestFactory$waitForResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nohVar = (noh) y270Var.a.getValue();
                    try {
                        priorityRequestFactory$waitForResult$1.L$0 = y270Var;
                        priorityRequestFactory$waitForResult$1.L$1 = obj;
                        priorityRequestFactory$waitForResult$1.L$2 = nohVar;
                        priorityRequestFactory$waitForResult$1.label = 1;
                        k = nohVar.k(priorityRequestFactory$waitForResult$1);
                        if (k == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (a(y270Var, obj)) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    noh nohVar2 = (noh) priorityRequestFactory$waitForResult$1.L$2;
                    obj = priorityRequestFactory$waitForResult$1.L$1;
                    y270 y270Var2 = (y270) priorityRequestFactory$waitForResult$1.L$0;
                    try {
                        kotlin.b.b(obj2);
                        nohVar = nohVar2;
                        y270Var = y270Var2;
                        k = obj2;
                    } catch (Throwable th3) {
                        nohVar = nohVar2;
                        y270Var = y270Var2;
                        th = th3;
                        if (a(y270Var, obj)) {
                            try {
                                oo31.o((AutoCloseable) nohVar.c());
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                return new l3f0(k, a(y270Var, obj));
            }
        }
        priorityRequestFactory$waitForResult$1 = new PriorityRequestFactory$waitForResult$1(this, continuationImpl);
        Object obj22 = priorityRequestFactory$waitForResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = priorityRequestFactory$waitForResult$1.label;
        if (i != 0) {
        }
        return new l3f0(k, a(y270Var, obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r10 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r8 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.image.internal.coil.fetcher.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, tls tlsVar, ContinuationImpl continuationImpl) {
        PriorityRequestFactory$writeRequestLock$1 priorityRequestFactory$writeRequestLock$1;
        int i;
        g050 g050Var;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof PriorityRequestFactory$writeRequestLock$1) {
                priorityRequestFactory$writeRequestLock$1 = (PriorityRequestFactory$writeRequestLock$1) continuationImpl;
                int i2 = priorityRequestFactory$writeRequestLock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    priorityRequestFactory$writeRequestLock$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = priorityRequestFactory$writeRequestLock$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = priorityRequestFactory$writeRequestLock$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        synchronized (this.c) {
                            y270 y270Var = (y270) this.c.get(obj);
                            g050Var = y270Var != null ? (g050) y270Var.c.getValue() : null;
                        }
                        if (g050Var != null) {
                            priorityRequestFactory$writeRequestLock$1.L$0 = null;
                            priorityRequestFactory$writeRequestLock$1.L$1 = tlsVar;
                            priorityRequestFactory$writeRequestLock$1.L$2 = null;
                            priorityRequestFactory$writeRequestLock$1.L$3 = g050Var;
                            priorityRequestFactory$writeRequestLock$1.label = 1;
                            Object a = g050Var.a(priorityRequestFactory$writeRequestLock$1);
                            g050Var2 = g050Var;
                        } else {
                            priorityRequestFactory$writeRequestLock$1.L$0 = null;
                            priorityRequestFactory$writeRequestLock$1.L$1 = null;
                            priorityRequestFactory$writeRequestLock$1.L$2 = null;
                            priorityRequestFactory$writeRequestLock$1.label = 3;
                            Object invoke = tlsVar.invoke(priorityRequestFactory$writeRequestLock$1);
                            if (invoke != coroutineSingletons) {
                                return invoke;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            g050 g050Var3 = (g050) priorityRequestFactory$writeRequestLock$1.L$3;
                            kotlin.b.b(obj2);
                            this = g050Var3;
                            return obj2;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    g050 g050Var4 = (g050) priorityRequestFactory$writeRequestLock$1.L$3;
                    tlsVar = (tls) priorityRequestFactory$writeRequestLock$1.L$1;
                    kotlin.b.b(obj2);
                    g050Var2 = g050Var4;
                    priorityRequestFactory$writeRequestLock$1.L$0 = null;
                    priorityRequestFactory$writeRequestLock$1.L$1 = null;
                    priorityRequestFactory$writeRequestLock$1.L$2 = null;
                    priorityRequestFactory$writeRequestLock$1.L$3 = g050Var2;
                    priorityRequestFactory$writeRequestLock$1.label = 2;
                    obj2 = tlsVar.invoke(priorityRequestFactory$writeRequestLock$1);
                    this = g050Var2;
                }
            }
            if (i != 0) {
            }
            priorityRequestFactory$writeRequestLock$1.L$0 = null;
            priorityRequestFactory$writeRequestLock$1.L$1 = null;
            priorityRequestFactory$writeRequestLock$1.L$2 = null;
            priorityRequestFactory$writeRequestLock$1.L$3 = g050Var2;
            priorityRequestFactory$writeRequestLock$1.label = 2;
            obj2 = tlsVar.invoke(priorityRequestFactory$writeRequestLock$1);
            this = g050Var2;
        } finally {
            this.d(null);
        }
        priorityRequestFactory$writeRequestLock$1 = new PriorityRequestFactory$writeRequestLock$1(this, continuationImpl);
        Object obj22 = priorityRequestFactory$writeRequestLock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = priorityRequestFactory$writeRequestLock$1.label;
    }
}
