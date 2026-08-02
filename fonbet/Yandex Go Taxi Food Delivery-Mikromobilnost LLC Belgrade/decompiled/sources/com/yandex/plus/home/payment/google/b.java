package com.yandex.plus.home.payment.google;

import defpackage.dtt;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final kotlinx.coroutines.sync.a a;
    public volatile dtt b;

    public b(int i) {
        this.a = gtq0.a();
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #1 {all -> 0x0088, blocks: (B:26:0x0066, B:28:0x006a), top: B:25:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tls tlsVar, ContinuationImpl continuationImpl) {
        SynchronizedGoogleConfigurationCache$getOrSave$1 synchronizedGoogleConfigurationCache$getOrSave$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        ?? r9;
        dtt dttVar;
        try {
            if (continuationImpl instanceof SynchronizedGoogleConfigurationCache$getOrSave$1) {
                synchronizedGoogleConfigurationCache$getOrSave$1 = (SynchronizedGoogleConfigurationCache$getOrSave$1) continuationImpl;
                int i3 = synchronizedGoogleConfigurationCache$getOrSave$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    synchronizedGoogleConfigurationCache$getOrSave$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = synchronizedGoogleConfigurationCache$getOrSave$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = synchronizedGoogleConfigurationCache$getOrSave$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        dtt dttVar2 = this.b;
                        if (dttVar2 != null) {
                            return dttVar2;
                        }
                        aVar = this.a;
                        synchronizedGoogleConfigurationCache$getOrSave$1.L$0 = tlsVar;
                        synchronizedGoogleConfigurationCache$getOrSave$1.L$1 = aVar;
                        synchronizedGoogleConfigurationCache$getOrSave$1.I$0 = 0;
                        synchronizedGoogleConfigurationCache$getOrSave$1.label = 1;
                        if (aVar.a(synchronizedGoogleConfigurationCache$getOrSave$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r9 = (g050) synchronizedGoogleConfigurationCache$getOrSave$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            r9 = r9;
                            this.b = (dtt) obj;
                            dttVar = (dtt) obj;
                            aVar = r9;
                            aVar.d(null);
                            return dttVar;
                        } catch (Throwable th) {
                            th = th;
                            r9.d(null);
                            throw th;
                        }
                    }
                    int i4 = synchronizedGoogleConfigurationCache$getOrSave$1.I$0;
                    ?? r2 = (g050) synchronizedGoogleConfigurationCache$getOrSave$1.L$1;
                    tls tlsVar2 = (tls) synchronizedGoogleConfigurationCache$getOrSave$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r2;
                    i2 = i4;
                    tlsVar = tlsVar2;
                    dttVar = this.b;
                    if (dttVar == null) {
                        synchronizedGoogleConfigurationCache$getOrSave$1.L$0 = null;
                        synchronizedGoogleConfigurationCache$getOrSave$1.L$1 = aVar;
                        synchronizedGoogleConfigurationCache$getOrSave$1.I$0 = i2;
                        synchronizedGoogleConfigurationCache$getOrSave$1.I$1 = 0;
                        synchronizedGoogleConfigurationCache$getOrSave$1.label = 2;
                        Object invoke = tlsVar.invoke(synchronizedGoogleConfigurationCache$getOrSave$1);
                        if (invoke != coroutineSingletons) {
                            kotlinx.coroutines.sync.a aVar2 = aVar;
                            obj = invoke;
                            r9 = aVar2;
                            this.b = (dtt) obj;
                            dttVar = (dtt) obj;
                            aVar = r9;
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return dttVar;
                }
            }
            dttVar = this.b;
            if (dttVar == null) {
            }
            aVar.d(null);
            return dttVar;
        } catch (Throwable th2) {
            th = th2;
            r9 = aVar;
            r9.d(null);
            throw th;
        }
        synchronizedGoogleConfigurationCache$getOrSave$1 = new SynchronizedGoogleConfigurationCache$getOrSave$1(this, continuationImpl);
        Object obj2 = synchronizedGoogleConfigurationCache$getOrSave$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = synchronizedGoogleConfigurationCache$getOrSave$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tls tlsVar, ContinuationImpl continuationImpl) {
        SynchronizedGoogleConfigurationCache$save$1 synchronizedGoogleConfigurationCache$save$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        g050 g050Var;
        Object invoke;
        try {
            if (continuationImpl instanceof SynchronizedGoogleConfigurationCache$save$1) {
                synchronizedGoogleConfigurationCache$save$1 = (SynchronizedGoogleConfigurationCache$save$1) continuationImpl;
                int i3 = synchronizedGoogleConfigurationCache$save$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    synchronizedGoogleConfigurationCache$save$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = synchronizedGoogleConfigurationCache$save$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = synchronizedGoogleConfigurationCache$save$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.a;
                        synchronizedGoogleConfigurationCache$save$1.L$0 = tlsVar;
                        synchronizedGoogleConfigurationCache$save$1.L$1 = aVar;
                        synchronizedGoogleConfigurationCache$save$1.I$0 = 0;
                        synchronizedGoogleConfigurationCache$save$1.label = 1;
                        if (aVar.a(synchronizedGoogleConfigurationCache$save$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (b) synchronizedGoogleConfigurationCache$save$1.L$2;
                        g050Var = (g050) synchronizedGoogleConfigurationCache$save$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            this.b = (dtt) obj;
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    int i4 = synchronizedGoogleConfigurationCache$save$1.I$0;
                    ?? r2 = (g050) synchronizedGoogleConfigurationCache$save$1.L$1;
                    tls tlsVar2 = (tls) synchronizedGoogleConfigurationCache$save$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r2;
                    i2 = i4;
                    tlsVar = tlsVar2;
                    synchronizedGoogleConfigurationCache$save$1.L$0 = null;
                    synchronizedGoogleConfigurationCache$save$1.L$1 = aVar;
                    synchronizedGoogleConfigurationCache$save$1.L$2 = this;
                    synchronizedGoogleConfigurationCache$save$1.I$0 = i2;
                    synchronizedGoogleConfigurationCache$save$1.I$1 = 0;
                    synchronizedGoogleConfigurationCache$save$1.label = 2;
                    invoke = tlsVar.invoke(synchronizedGoogleConfigurationCache$save$1);
                    if (invoke != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = invoke;
                        g050Var = aVar2;
                        this.b = (dtt) obj;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            synchronizedGoogleConfigurationCache$save$1.L$0 = null;
            synchronizedGoogleConfigurationCache$save$1.L$1 = aVar;
            synchronizedGoogleConfigurationCache$save$1.L$2 = this;
            synchronizedGoogleConfigurationCache$save$1.I$0 = i2;
            synchronizedGoogleConfigurationCache$save$1.I$1 = 0;
            synchronizedGoogleConfigurationCache$save$1.label = 2;
            invoke = tlsVar.invoke(synchronizedGoogleConfigurationCache$save$1);
            if (invoke != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        synchronizedGoogleConfigurationCache$save$1 = new SynchronizedGoogleConfigurationCache$save$1(this, continuationImpl);
        Object obj2 = synchronizedGoogleConfigurationCache$save$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = synchronizedGoogleConfigurationCache$save$1.label;
        if (i != 0) {
        }
    }

    public b() {
        this(0);
    }
}
