package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.bbl0;
import defpackage.cwd;
import defpackage.dwj0;
import defpackage.g050;
import defpackage.g7j0;
import defpackage.gtq0;
import defpackage.hb7;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final AtomicReference a = new AtomicReference();
    public final ConcurrentHashMap b = new ConcurrentHashMap(2);
    public final kotlinx.coroutines.sync.a c = gtq0.a();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LoadTariffStorage$actualEntry$1 loadTariffStorage$actualEntry$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof LoadTariffStorage$actualEntry$1) {
                loadTariffStorage$actualEntry$1 = (LoadTariffStorage$actualEntry$1) continuationImpl;
                int i2 = loadTariffStorage$actualEntry$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loadTariffStorage$actualEntry$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loadTariffStorage$actualEntry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loadTariffStorage$actualEntry$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.c;
                        loadTariffStorage$actualEntry$1.L$0 = aVar;
                        loadTariffStorage$actualEntry$1.label = 1;
                        if (aVar.a(loadTariffStorage$actualEntry$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) loadTariffStorage$actualEntry$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return (dwj0) this.a.get();
                }
            }
            return (dwj0) this.a.get();
        } finally {
            g050Var.d(null);
        }
        loadTariffStorage$actualEntry$1 = new LoadTariffStorage$actualEntry$1(this, continuationImpl);
        Object obj2 = loadTariffStorage$actualEntry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadTariffStorage$actualEntry$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004a, B:13:0x005e), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Boolean bool, ContinuationImpl continuationImpl) {
        LoadTariffStorage$cachedEntry$1 loadTariffStorage$cachedEntry$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof LoadTariffStorage$cachedEntry$1) {
                loadTariffStorage$cachedEntry$1 = (LoadTariffStorage$cachedEntry$1) continuationImpl;
                int i2 = loadTariffStorage$cachedEntry$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loadTariffStorage$cachedEntry$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loadTariffStorage$cachedEntry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loadTariffStorage$cachedEntry$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        loadTariffStorage$cachedEntry$1.L$0 = bool;
                        aVar = this.c;
                        loadTariffStorage$cachedEntry$1.L$1 = aVar;
                        loadTariffStorage$cachedEntry$1.label = 1;
                        if (aVar.a(loadTariffStorage$cachedEntry$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) loadTariffStorage$cachedEntry$1.L$1;
                        Boolean bool2 = (Boolean) loadTariffStorage$cachedEntry$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        bool = bool2;
                    }
                    dwj0 dwj0Var = (dwj0) this.b.get(Boolean.valueOf(jl40.l(bool, Boolean.TRUE)));
                    return dwj0Var == null ? new hb7(dwj0Var, (dwj0) this.a.get()) : null;
                }
            }
            dwj0 dwj0Var2 = (dwj0) this.b.get(Boolean.valueOf(jl40.l(bool, Boolean.TRUE)));
            return dwj0Var2 == null ? new hb7(dwj0Var2, (dwj0) this.a.get()) : null;
        } finally {
            aVar.d(null);
        }
        loadTariffStorage$cachedEntry$1 = new LoadTariffStorage$cachedEntry$1(this, continuationImpl);
        Object obj2 = loadTariffStorage$cachedEntry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadTariffStorage$cachedEntry$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[Catch: all -> 0x00a5, TRY_ENTER, TryCatch #0 {all -> 0x00a5, blocks: (B:11:0x0074, B:14:0x007e, B:16:0x0086, B:18:0x00b6, B:23:0x00a7), top: B:10:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #0 {all -> 0x00a5, blocks: (B:11:0x0074, B:14:0x007e, B:16:0x0086, B:18:0x00b6, B:23:0x00a7), top: B:10:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(dwj0 dwj0Var, boolean z, ContinuationImpl continuationImpl) {
        LoadTariffStorage$updateCache$1 loadTariffStorage$updateCache$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Boolean bool;
        Boolean bool2;
        boolean l;
        try {
            if (continuationImpl instanceof LoadTariffStorage$updateCache$1) {
                loadTariffStorage$updateCache$1 = (LoadTariffStorage$updateCache$1) continuationImpl;
                int i2 = loadTariffStorage$updateCache$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loadTariffStorage$updateCache$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loadTariffStorage$updateCache$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loadTariffStorage$updateCache$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g7j0 g7j0Var = dwj0Var.a;
                        cwd cwdVar = dwj0Var.c;
                        Boolean bool3 = g7j0Var.a.k;
                        Boolean valueOf = !jl40.l(cwdVar, cwd.g) ? Boolean.valueOf(cwdVar.f) : null;
                        loadTariffStorage$updateCache$1.L$0 = dwj0Var;
                        loadTariffStorage$updateCache$1.L$1 = bool3;
                        loadTariffStorage$updateCache$1.L$2 = valueOf;
                        aVar = this.c;
                        loadTariffStorage$updateCache$1.L$3 = aVar;
                        loadTariffStorage$updateCache$1.Z$0 = z;
                        loadTariffStorage$updateCache$1.label = 1;
                        if (aVar.a(loadTariffStorage$updateCache$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bool = valueOf;
                        bool2 = bool3;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = loadTariffStorage$updateCache$1.Z$0;
                        ?? r9 = (g050) loadTariffStorage$updateCache$1.L$3;
                        bool = (Boolean) loadTariffStorage$updateCache$1.L$2;
                        bool2 = (Boolean) loadTariffStorage$updateCache$1.L$1;
                        dwj0 dwj0Var2 = (dwj0) loadTariffStorage$updateCache$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r9;
                        dwj0Var = dwj0Var2;
                    }
                    Boolean bool4 = Boolean.FALSE;
                    l = jl40.l(bool2, bool4);
                    ConcurrentHashMap concurrentHashMap = this.b;
                    if (l) {
                        Boolean bool5 = Boolean.TRUE;
                        if (jl40.l(bool, bool5)) {
                            concurrentHashMap.remove(bool4);
                            bool.getClass();
                            g7j0 g7j0Var2 = dwj0Var.a;
                            concurrentHashMap.put(bool5, dwj0.a(dwj0Var, g7j0.a(g7j0Var2, bbl0.a(g7j0Var2.a, null, false, bool, 130047)), null, 6));
                            if (z) {
                                this.a.set(dwj0Var);
                            }
                            aVar.d(null);
                            return zy11.a;
                        }
                    }
                    concurrentHashMap.put(Boolean.valueOf(jl40.l(bool2, Boolean.TRUE)), dwj0Var);
                    if (z) {
                    }
                    aVar.d(null);
                    return zy11.a;
                }
            }
            Boolean bool42 = Boolean.FALSE;
            l = jl40.l(bool2, bool42);
            ConcurrentHashMap concurrentHashMap2 = this.b;
            if (l) {
            }
            concurrentHashMap2.put(Boolean.valueOf(jl40.l(bool2, Boolean.TRUE)), dwj0Var);
            if (z) {
            }
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        loadTariffStorage$updateCache$1 = new LoadTariffStorage$updateCache$1(this, continuationImpl);
        Object obj2 = loadTariffStorage$updateCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadTariffStorage$updateCache$1.label;
        if (i != 0) {
        }
    }
}
