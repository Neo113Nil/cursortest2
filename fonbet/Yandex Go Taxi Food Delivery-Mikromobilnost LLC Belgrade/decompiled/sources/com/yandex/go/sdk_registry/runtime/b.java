package com.yandex.go.sdk_registry.runtime;

import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import com.yandex.go.sdk_registry.api.exceptions.SdkObtainException;
import com.yandex.go.sdk_registry.api.metrics.SdkInitMetric$Phase;
import com.yandex.go.sdk_registry.api.metrics.SdkMetricResult;
import defpackage.d7g0;
import defpackage.fwf0;
import defpackage.gnp0;
import defpackage.h73;
import defpackage.hdi0;
import defpackage.ike;
import defpackage.j0g;
import defpackage.jl40;
import defpackage.mpp0;
import defpackage.npp0;
import defpackage.ny61;
import defpackage.qnp0;
import defpackage.qtb1;
import defpackage.tje;
import defpackage.vnp0;
import defpackage.w511;
import defpackage.xcc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes13.dex */
public final class b {
    public final fwf0 a;
    public final ike b;
    public final d7g0 c;
    public final j0g d;
    public volatile Map e;
    public final Object f;

    public b(fwf0 fwf0Var, ike ikeVar) {
        d7g0 d7g0Var = qtb1.P;
        j0g j0gVar = new j0g(fwf0Var, ikeVar);
        this.a = fwf0Var;
        this.b = ikeVar;
        this.c = d7g0Var;
        this.d = j0gVar;
        this.e = kotlin.collections.b.f();
        this.f = new Object();
    }

    public final Object a(qnp0 qnp0Var) {
        return tje.Y(EmptyCoroutineContext.a, new RealSdkComponentRegistry$forceObtainInstanceNow$1(this, qnp0Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v7, types: [gnp0] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00cb -> B:10:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(SdkLifecycleStage sdkLifecycleStage, fwf0 fwf0Var, ContinuationImpl continuationImpl) {
        RealSdkComponentRegistry$initializeStage$1 realSdkComponentRegistry$initializeStage$1;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        fwf0 fwf0Var2;
        if (continuationImpl instanceof RealSdkComponentRegistry$initializeStage$1) {
            realSdkComponentRegistry$initializeStage$1 = (RealSdkComponentRegistry$initializeStage$1) continuationImpl;
            int i2 = realSdkComponentRegistry$initializeStage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realSdkComponentRegistry$initializeStage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = realSdkComponentRegistry$initializeStage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSdkComponentRegistry$initializeStage$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (sdkLifecycleStage == SdkLifecycleStage.ON_DEMAND) {
                        return (Serializable) kotlin.collections.b.f();
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    h73 h73Var = new h73(i3, this.e.entrySet());
                    hdi0 hdi0Var = new hdi0();
                    List t = kotlin.sequences.b.t(h73Var);
                    xcc.q(t, hdi0Var);
                    it = ((ArrayList) t).iterator();
                    linkedHashMap = linkedHashMap2;
                    fwf0Var2 = fwf0Var;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r9 = (Map) realSdkComponentRegistry$initializeStage$1.L$9;
                    vnp0 vnp0Var = (vnp0) realSdkComponentRegistry$initializeStage$1.L$8;
                    it = (Iterator) realSdkComponentRegistry$initializeStage$1.L$4;
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) realSdkComponentRegistry$initializeStage$1.L$2;
                    ?? r5 = (gnp0) realSdkComponentRegistry$initializeStage$1.L$1;
                    SdkLifecycleStage sdkLifecycleStage2 = (SdkLifecycleStage) realSdkComponentRegistry$initializeStage$1.L$0;
                    kotlin.b.b(obj);
                    Object obj2 = ((Result) obj).getValue();
                    fwf0 fwf0Var3 = r5;
                    LinkedHashMap linkedHashMap4 = r9;
                    linkedHashMap4.put(vnp0Var, new Result(obj2));
                    linkedHashMap = linkedHashMap3;
                    fwf0Var2 = fwf0Var3;
                    sdkLifecycleStage = sdkLifecycleStage2;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = ((vnp0) entry.getKey()).a;
                        a aVar = (a) entry.getValue();
                        vnp0 vnp0Var2 = new vnp0(str);
                        realSdkComponentRegistry$initializeStage$1.L$0 = sdkLifecycleStage;
                        realSdkComponentRegistry$initializeStage$1.L$1 = fwf0Var2;
                        realSdkComponentRegistry$initializeStage$1.L$2 = linkedHashMap;
                        realSdkComponentRegistry$initializeStage$1.L$3 = null;
                        realSdkComponentRegistry$initializeStage$1.L$4 = it;
                        realSdkComponentRegistry$initializeStage$1.L$5 = null;
                        realSdkComponentRegistry$initializeStage$1.L$6 = null;
                        realSdkComponentRegistry$initializeStage$1.L$7 = null;
                        realSdkComponentRegistry$initializeStage$1.L$8 = vnp0Var2;
                        realSdkComponentRegistry$initializeStage$1.L$9 = linkedHashMap;
                        realSdkComponentRegistry$initializeStage$1.label = 1;
                        Object e = aVar.e(sdkLifecycleStage, fwf0Var2, realSdkComponentRegistry$initializeStage$1);
                        if (e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        sdkLifecycleStage2 = sdkLifecycleStage;
                        vnp0Var = vnp0Var2;
                        fwf0Var3 = fwf0Var2;
                        obj2 = e;
                        linkedHashMap3 = linkedHashMap;
                        linkedHashMap4 = linkedHashMap;
                        linkedHashMap4.put(vnp0Var, new Result(obj2));
                        linkedHashMap = linkedHashMap3;
                        fwf0Var2 = fwf0Var3;
                        sdkLifecycleStage = sdkLifecycleStage2;
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                    }
                }
            }
        }
        realSdkComponentRegistry$initializeStage$1 = new RealSdkComponentRegistry$initializeStage$1(this, continuationImpl);
        Object obj3 = realSdkComponentRegistry$initializeStage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSdkComponentRegistry$initializeStage$1.label;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(qnp0 qnp0Var, npp0 npp0Var, ContinuationImpl continuationImpl) {
        RealSdkComponentRegistry$obtainInstance$1 realSdkComponentRegistry$obtainInstance$1;
        int i;
        if (continuationImpl instanceof RealSdkComponentRegistry$obtainInstance$1) {
            realSdkComponentRegistry$obtainInstance$1 = (RealSdkComponentRegistry$obtainInstance$1) continuationImpl;
            int i2 = realSdkComponentRegistry$obtainInstance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realSdkComponentRegistry$obtainInstance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = realSdkComponentRegistry$obtainInstance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSdkComponentRegistry$obtainInstance$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object obj3 = this.e.get(new vnp0(qnp0Var.a));
                    a aVar = obj3 instanceof a ? (a) obj3 : null;
                    if (aVar == null) {
                        return new Result.Failure(new SdkObtainException(qnp0Var.a));
                    }
                    if (jl40.l(npp0Var, mpp0.a)) {
                        aVar.d.getClass();
                        Object obj4 = aVar.j.get();
                        if (obj4 == null) {
                            com.yandex.go.sdk_registry.wrappers.mob.a aVar2 = (com.yandex.go.sdk_registry.wrappers.mob.a) aVar.i.get();
                            if (aVar2 != null && aVar2.l) {
                                obj2 = aVar2.j;
                            }
                        } else {
                            obj2 = obj4;
                        }
                        return obj2 != null ? obj2 : new Result.Failure(new SdkObtainException(aVar.a.a.a));
                    }
                    if (!jl40.l(npp0Var, npp0.a)) {
                        w511.b();
                        return null;
                    }
                    realSdkComponentRegistry$obtainInstance$1.L$0 = null;
                    realSdkComponentRegistry$obtainInstance$1.L$1 = null;
                    realSdkComponentRegistry$obtainInstance$1.L$2 = null;
                    realSdkComponentRegistry$obtainInstance$1.label = 1;
                    Object f = aVar.f(realSdkComponentRegistry$obtainInstance$1);
                    return f == coroutineSingletons ? coroutineSingletons : f;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar3 = (a) realSdkComponentRegistry$obtainInstance$1.L$2;
                kotlin.b.b(obj);
                Object value = ((Result) obj).getValue();
                if (!(Result.a(value) instanceof TimeoutCancellationException)) {
                    return value;
                }
                com.yandex.go.sdk_registry.runtime.metrics.a aVar4 = aVar3.e;
                synchronized (aVar4.d) {
                    if (aVar4.i) {
                        return value;
                    }
                    Long l = aVar4.h;
                    if (l == null) {
                        return value;
                    }
                    long longValue = l.longValue();
                    aVar4.i = true;
                    aVar4.g(aVar4.a(SdkInitMetric$Phase.FULL, SdkMetricResult.TIMEOUT, longValue));
                    return value;
                }
            }
        }
        realSdkComponentRegistry$obtainInstance$1 = new RealSdkComponentRegistry$obtainInstance$1(this, continuationImpl);
        Object obj5 = realSdkComponentRegistry$obtainInstance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSdkComponentRegistry$obtainInstance$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
    }
}
