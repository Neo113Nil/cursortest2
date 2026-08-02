package com.yandex.go.sdk_registry.runtime;

import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import com.yandex.go.sdk_registry.api.SdkLogLevel;
import com.yandex.go.sdk_registry.api.exceptions.SdkInitializationException;
import defpackage.d7g0;
import defpackage.dab1;
import defpackage.gnp0;
import defpackage.lnp0;
import defpackage.mnp0;
import defpackage.nnp0;
import defpackage.ny61;
import defpackage.pxf0;
import defpackage.qoh;
import defpackage.rop0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.xpp0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final lnp0 a;
    public final com.yandex.go.sdk_registry.wrappers.mob.b b;
    public final tse c;
    public final d7g0 d;
    public final com.yandex.go.sdk_registry.runtime.metrics.a e;
    public final pxf0 f;
    public final dab1 g;
    public final ReentrantLock h;
    public final AtomicReference i;
    public final AtomicReference j;
    public qoh k;
    public qoh l;

    public a(lnp0 lnp0Var, com.yandex.go.sdk_registry.wrappers.mob.b bVar, gnp0 gnp0Var, tse tseVar, d7g0 d7g0Var, com.yandex.go.sdk_registry.runtime.metrics.a aVar) {
        this.a = lnp0Var;
        this.b = bVar;
        this.c = tseVar;
        this.d = d7g0Var;
        this.e = aVar;
        pxf0 pxf0Var = new pxf0(lnp0Var.a.a, tseVar, gnp0Var, null);
        this.f = pxf0Var;
        this.g = ((xpp0) pxf0Var.a(rop0.a)) != null ? dab1.G : null;
        this.h = new ReentrantLock();
        this.i = new AtomicReference(null);
        this.j = new AtomicReference(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 != r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ComponentEntry$runInitializationCatching$1 componentEntry$runInitializationCatching$1;
        int i;
        Object g;
        com.yandex.go.sdk_registry.runtime.metrics.a aVar2 = aVar.e;
        try {
            if (continuationImpl instanceof ComponentEntry$runInitializationCatching$1) {
                componentEntry$runInitializationCatching$1 = (ComponentEntry$runInitializationCatching$1) continuationImpl;
                int i2 = componentEntry$runInitializationCatching$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    componentEntry$runInitializationCatching$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = componentEntry$runInitializationCatching$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = componentEntry$runInitializationCatching$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        componentEntry$runInitializationCatching$1.label = 1;
                        g = aVar.g(componentEntry$runInitializationCatching$1);
                        if (g == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            aVar.j.set(obj);
                            aVar2.b();
                            return obj;
                        }
                        kotlin.b.b(obj);
                        g = ((Result) obj).getValue();
                    }
                    kotlin.b.b(g);
                    aVar2.c();
                    com.yandex.go.sdk_registry.wrappers.mob.a c = aVar.c();
                    c.b(aVar.f);
                    componentEntry$runInitializationCatching$1.L$0 = null;
                    componentEntry$runInitializationCatching$1.label = 2;
                    obj = c.i.s(componentEntry$runInitializationCatching$1);
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(g);
            aVar2.c();
            com.yandex.go.sdk_registry.wrappers.mob.a c2 = aVar.c();
            c2.b(aVar.f);
            componentEntry$runInitializationCatching$1.L$0 = null;
            componentEntry$runInitializationCatching$1.label = 2;
            obj = c2.i.s(componentEntry$runInitializationCatching$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            aVar.b(th);
            aVar2.d();
            return aVar.d(th);
        }
        componentEntry$runInitializationCatching$1 = new ComponentEntry$runInitializationCatching$1(aVar, continuationImpl);
        Object obj3 = componentEntry$runInitializationCatching$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = componentEntry$runInitializationCatching$1.label;
    }

    public final SdkInitializationException b(Throwable th) {
        return th instanceof SdkInitializationException ? (SdkInitializationException) th : new SdkInitializationException(this.a.a.a, th);
    }

    public final com.yandex.go.sdk_registry.wrappers.mob.a c() {
        AtomicReference atomicReference = this.i;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            com.yandex.go.sdk_registry.wrappers.mob.a aVar = (com.yandex.go.sdk_registry.wrappers.mob.a) atomicReference.get();
            if (aVar == null) {
                aVar = this.b.a();
                atomicReference.set(aVar);
            }
            return aVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Result.Failure d(Throwable th) {
        SdkLogLevel sdkLogLevel;
        lnp0 lnp0Var = this.a;
        lnp0Var.getClass();
        Object obj = mnp0.a;
        nnp0 nnp0Var = nnp0.a;
        if (nnp0Var.equals(obj)) {
            sdkLogLevel = SdkLogLevel.CRITICAL;
        } else {
            if (!nnp0Var.equals(nnp0Var)) {
                w511.b();
                return null;
            }
            sdkLogLevel = SdkLogLevel.ERROR;
        }
        dab1 dab1Var = this.g;
        if (dab1Var != null) {
            String str = lnp0Var.a.a;
            dab1Var.m(sdkLogLevel, str, "SDK component initialization failed: ".concat(str), b(th));
        }
        return new Result.Failure(b(th));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0056, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0067, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(SdkLifecycleStage sdkLifecycleStage, gnp0 gnp0Var, ContinuationImpl continuationImpl) {
        ComponentEntry$processLifecycleStage$1 componentEntry$processLifecycleStage$1;
        int i;
        Object obj;
        SdkLogLevel sdkLogLevel;
        if (continuationImpl instanceof ComponentEntry$processLifecycleStage$1) {
            componentEntry$processLifecycleStage$1 = (ComponentEntry$processLifecycleStage$1) continuationImpl;
            int i2 = componentEntry$processLifecycleStage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                componentEntry$processLifecycleStage$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = componentEntry$processLifecycleStage$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = componentEntry$processLifecycleStage$1.label;
                Object obj4 = zy11.a;
                lnp0 lnp0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (sdkLifecycleStage == lnp0Var.c) {
                        componentEntry$processLifecycleStage$1.L$0 = sdkLifecycleStage;
                        componentEntry$processLifecycleStage$1.L$1 = gnp0Var;
                        componentEntry$processLifecycleStage$1.label = 1;
                        obj = f(componentEntry$processLifecycleStage$1);
                    } else if (sdkLifecycleStage == lnp0Var.d) {
                        componentEntry$processLifecycleStage$1.L$0 = sdkLifecycleStage;
                        componentEntry$processLifecycleStage$1.L$1 = gnp0Var;
                        componentEntry$processLifecycleStage$1.label = 2;
                        obj = g(componentEntry$processLifecycleStage$1);
                    } else {
                        obj = obj4;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gnp0Var = (gnp0) componentEntry$processLifecycleStage$1.L$1;
                    sdkLifecycleStage = (SdkLifecycleStage) componentEntry$processLifecycleStage$1.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                if (!(obj instanceof Result.Failure)) {
                    return obj;
                }
                pxf0 pxf0Var = this.f;
                pxf0 pxf0Var2 = new pxf0(pxf0Var.a, pxf0Var.b, pxf0Var.c, gnp0Var);
                try {
                    com.yandex.go.sdk_registry.wrappers.mob.a aVar = (com.yandex.go.sdk_registry.wrappers.mob.a) this.i.get();
                    if (aVar != null) {
                        aVar.d(sdkLifecycleStage, pxf0Var2);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    lnp0Var.getClass();
                    Object obj5 = mnp0.a;
                    nnp0 nnp0Var = nnp0.a;
                    if (nnp0Var.equals(obj5)) {
                        sdkLogLevel = SdkLogLevel.CRITICAL;
                    } else {
                        if (!nnp0Var.equals(nnp0Var)) {
                            w511.b();
                            return null;
                        }
                        sdkLogLevel = SdkLogLevel.ERROR;
                    }
                    dab1 dab1Var = this.g;
                    if (dab1Var != null) {
                        String str = lnp0Var.a.a;
                        dab1Var.m(sdkLogLevel, str, "SDK component stage callback failed: " + str + " at " + sdkLifecycleStage, b(th));
                    }
                    obj4 = new Result.Failure(b(th));
                }
                Throwable a = Result.a(obj4);
                if (a != null) {
                    return new Result.Failure(a);
                }
                return obj;
            }
        }
        componentEntry$processLifecycleStage$1 = new ComponentEntry$processLifecycleStage$1(this, continuationImpl);
        Object obj22 = componentEntry$processLifecycleStage$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = componentEntry$processLifecycleStage$1.label;
        Object obj42 = zy11.a;
        lnp0 lnp0Var2 = this.a;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        ComponentEntry$startInitializeFullJob$1 componentEntry$startInitializeFullJob$1;
        int i;
        if (continuationImpl instanceof ComponentEntry$startInitializeFullJob$1) {
            componentEntry$startInitializeFullJob$1 = (ComponentEntry$startInitializeFullJob$1) continuationImpl;
            int i2 = componentEntry$startInitializeFullJob$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                componentEntry$startInitializeFullJob$1.label = i2 - Integer.MIN_VALUE;
                Object obj = componentEntry$startInitializeFullJob$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = componentEntry$startInitializeFullJob$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.getClass();
                    ReentrantLock reentrantLock = this.h;
                    reentrantLock.lock();
                    try {
                        qoh qohVar = this.l;
                        if (qohVar == null) {
                            qohVar = tje.h(this.c, null, null, new ComponentEntry$getOrCreateInit$1$1(this, null), 3);
                            this.l = qohVar;
                        }
                        reentrantLock.unlock();
                        componentEntry$startInitializeFullJob$1.label = 1;
                        obj = qohVar.s(componentEntry$startInitializeFullJob$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        componentEntry$startInitializeFullJob$1 = new ComponentEntry$startInitializeFullJob$1(this, continuationImpl);
        Object obj2 = componentEntry$startInitializeFullJob$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = componentEntry$startInitializeFullJob$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ComponentEntry$startInitializeLightweightJob$1 componentEntry$startInitializeLightweightJob$1;
        int i;
        if (continuationImpl instanceof ComponentEntry$startInitializeLightweightJob$1) {
            componentEntry$startInitializeLightweightJob$1 = (ComponentEntry$startInitializeLightweightJob$1) continuationImpl;
            int i2 = componentEntry$startInitializeLightweightJob$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                componentEntry$startInitializeLightweightJob$1.label = i2 - Integer.MIN_VALUE;
                Object obj = componentEntry$startInitializeLightweightJob$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = componentEntry$startInitializeLightweightJob$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.getClass();
                    ReentrantLock reentrantLock = this.h;
                    reentrantLock.lock();
                    try {
                        qoh qohVar = this.k;
                        if (qohVar == null) {
                            qohVar = tje.h(this.c, null, null, new ComponentEntry$getOrCreateLightweightInit$1$1(this, null), 3);
                            this.k = qohVar;
                        }
                        reentrantLock.unlock();
                        componentEntry$startInitializeLightweightJob$1.label = 1;
                        obj = qohVar.s(componentEntry$startInitializeLightweightJob$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        componentEntry$startInitializeLightweightJob$1 = new ComponentEntry$startInitializeLightweightJob$1(this, continuationImpl);
        Object obj2 = componentEntry$startInitializeLightweightJob$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = componentEntry$startInitializeLightweightJob$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
