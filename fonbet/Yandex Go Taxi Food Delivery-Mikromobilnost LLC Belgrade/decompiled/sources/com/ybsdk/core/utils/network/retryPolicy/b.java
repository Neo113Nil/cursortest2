package com.ybsdk.core.utils.network.retryPolicy;

import defpackage.bx50;
import defpackage.e1k0;
import defpackage.f1k0;
import defpackage.g050;
import defpackage.g1k0;
import defpackage.gtq0;
import defpackage.h1k0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final bx50 a;
    public g1k0 b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();

    public b(bx50 bx50Var) {
        this.a = bx50Var;
    }

    public final g1k0 a() {
        g1k0 g1k0Var = this.b;
        if (g1k0Var != null) {
            return g1k0Var;
        }
        h1k0 h1k0Var = (h1k0) this.a.invoke();
        if (h1k0Var == null) {
            return null;
        }
        g1k0 g1k0Var2 = new g1k0(h1k0Var.a(), h1k0Var.b(), h1k0Var.c());
        this.b = g1k0Var2;
        return g1k0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        RetryBudget$refill$1 retryBudget$refill$1;
        int i;
        g050 g050Var;
        g1k0 a;
        double d;
        double b;
        f1k0 f1k0Var;
        try {
            if (continuationImpl instanceof RetryBudget$refill$1) {
                retryBudget$refill$1 = (RetryBudget$refill$1) continuationImpl;
                int i2 = retryBudget$refill$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    retryBudget$refill$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = retryBudget$refill$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = retryBudget$refill$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.c;
                        retryBudget$refill$1.L$0 = aVar;
                        retryBudget$refill$1.label = 1;
                        if (aVar.a(retryBudget$refill$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) retryBudget$refill$1.L$0;
                        kotlin.b.b(obj);
                    }
                    a = a();
                    if (a != null && a.d() < a.b()) {
                        d = a.d() + a.c();
                        b = a.b();
                        if (d > b) {
                            d = b;
                        }
                        double d2 = d - a.d();
                        this.b = g1k0.a(a, d);
                        f1k0Var = new f1k0(d2, d);
                        return f1k0Var;
                    }
                    f1k0Var = null;
                    return f1k0Var;
                }
            }
            a = a();
            if (a != null) {
                d = a.d() + a.c();
                b = a.b();
                if (d > b) {
                }
                double d22 = d - a.d();
                this.b = g1k0.a(a, d);
                f1k0Var = new f1k0(d22, d);
                return f1k0Var;
            }
            f1k0Var = null;
            return f1k0Var;
        } finally {
            g050Var.d(null);
        }
        retryBudget$refill$1 = new RetryBudget$refill$1(this, continuationImpl);
        Object obj2 = retryBudget$refill$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryBudget$refill$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x0043, B:17:0x004b, B:19:0x0055, B:20:0x0068), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        RetryBudget$tryAcquire$1 retryBudget$tryAcquire$1;
        int i;
        g050 g050Var;
        g1k0 a;
        e1k0 e1k0Var;
        try {
            if (continuationImpl instanceof RetryBudget$tryAcquire$1) {
                retryBudget$tryAcquire$1 = (RetryBudget$tryAcquire$1) continuationImpl;
                int i2 = retryBudget$tryAcquire$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    retryBudget$tryAcquire$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = retryBudget$tryAcquire$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = retryBudget$tryAcquire$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.c;
                        retryBudget$tryAcquire$1.L$0 = aVar;
                        retryBudget$tryAcquire$1.label = 1;
                        if (aVar.a(retryBudget$tryAcquire$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) retryBudget$tryAcquire$1.L$0;
                        kotlin.b.b(obj);
                    }
                    a = a();
                    if (a != null) {
                        e1k0Var = null;
                    } else if (a.d() >= 1.0d) {
                        double d = a.d() - 1.0d;
                        this.b = g1k0.a(a, d);
                        e1k0Var = new e1k0(d, true);
                    } else {
                        e1k0Var = new e1k0(a.d(), false);
                    }
                    return e1k0Var;
                }
            }
            a = a();
            if (a != null) {
            }
            return e1k0Var;
        } finally {
            g050Var.d(null);
        }
        retryBudget$tryAcquire$1 = new RetryBudget$tryAcquire$1(this, continuationImpl);
        Object obj2 = retryBudget$tryAcquire$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryBudget$tryAcquire$1.label;
        if (i != 0) {
        }
    }
}
