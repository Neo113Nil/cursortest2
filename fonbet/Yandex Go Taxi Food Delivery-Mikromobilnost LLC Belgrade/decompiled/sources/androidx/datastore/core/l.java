package androidx.datastore.core;

import defpackage.f8w;
import defpackage.g050;
import defpackage.gp50;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.wls;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class l implements f8w {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final gp50 b = new gp50(5);
    public final rol0 c = new rol0(new SingleProcessCoordinator$updateNotifications$1(2, null));

    @Override // defpackage.f8w
    public final tpr a() {
        return this.c;
    }

    @Override // defpackage.f8w
    public final Object b(ContinuationImpl continuationImpl) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.datastore.core.l] */
    /* JADX WARN: Type inference failed for: r6v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    @Override // defpackage.f8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tls tlsVar, ContinuationImpl continuationImpl) {
        SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        int i;
        Object obj;
        try {
            if (continuationImpl instanceof SingleProcessCoordinator$lock$1) {
                singleProcessCoordinator$lock$1 = (SingleProcessCoordinator$lock$1) continuationImpl;
                int i2 = singleProcessCoordinator$lock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessCoordinator$lock$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = singleProcessCoordinator$lock$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = singleProcessCoordinator$lock$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        singleProcessCoordinator$lock$1.L$0 = tlsVar;
                        kotlinx.coroutines.sync.a aVar = this.a;
                        singleProcessCoordinator$lock$1.L$1 = aVar;
                        singleProcessCoordinator$lock$1.label = 1;
                        Object a = aVar.a(singleProcessCoordinator$lock$1);
                        obj = aVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050 g050Var = (g050) singleProcessCoordinator$lock$1.L$0;
                            kotlin.b.b(obj2);
                            this = g050Var;
                            return obj2;
                        }
                        Object obj3 = (g050) singleProcessCoordinator$lock$1.L$1;
                        tlsVar = (tls) singleProcessCoordinator$lock$1.L$0;
                        kotlin.b.b(obj2);
                        obj = obj3;
                    }
                    singleProcessCoordinator$lock$1.L$0 = obj;
                    singleProcessCoordinator$lock$1.L$1 = null;
                    singleProcessCoordinator$lock$1.label = 2;
                    obj2 = tlsVar.invoke(singleProcessCoordinator$lock$1);
                    this = obj;
                }
            }
            if (i != 0) {
            }
            singleProcessCoordinator$lock$1.L$0 = obj;
            singleProcessCoordinator$lock$1.L$1 = null;
            singleProcessCoordinator$lock$1.label = 2;
            obj2 = tlsVar.invoke(singleProcessCoordinator$lock$1);
            this = obj;
        } finally {
            this.d(null);
        }
        singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, continuationImpl);
        Object obj22 = singleProcessCoordinator$lock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleProcessCoordinator$lock$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.f8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(wls wlsVar, ContinuationImpl continuationImpl) {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        int i;
        g050 g050Var;
        boolean z;
        Throwable th;
        if (continuationImpl instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) continuationImpl;
            int i2 = singleProcessCoordinator$tryLock$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessCoordinator$tryLock$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleProcessCoordinator$tryLock$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.sync.a aVar = this.a;
                    boolean h = aVar.h();
                    try {
                        Object valueOf = Boolean.valueOf(h);
                        singleProcessCoordinator$tryLock$1.L$0 = aVar;
                        singleProcessCoordinator$tryLock$1.Z$0 = h;
                        singleProcessCoordinator$tryLock$1.label = 1;
                        Object invoke = wlsVar.invoke(valueOf, singleProcessCoordinator$tryLock$1);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        g050Var = aVar;
                        z = h;
                        obj = invoke;
                    } catch (Throwable th2) {
                        g050Var = aVar;
                        z = h;
                        th = th2;
                        if (z) {
                            g050Var.d(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = singleProcessCoordinator$tryLock$1.Z$0;
                    g050Var = (g050) singleProcessCoordinator$tryLock$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    g050Var.d(null);
                }
                return obj;
            }
        }
        singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, continuationImpl);
        Object obj3 = singleProcessCoordinator$tryLock$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleProcessCoordinator$tryLock$1.label;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }

    @Override // defpackage.f8w
    public final Object e(Continuation continuation) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }
}
