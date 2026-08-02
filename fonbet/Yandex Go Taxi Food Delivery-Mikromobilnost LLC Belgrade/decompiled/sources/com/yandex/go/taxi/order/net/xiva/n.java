package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.bay0;
import defpackage.dw41;
import defpackage.hst;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.te51;
import defpackage.u201;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class n implements u201 {
    public final String a;
    public final com.yandex.go.taxi_order.ws.d b;
    public final bay0 c;
    public final dw41 d;
    public final com.yandex.go.taxi.order.provider.a e;
    public final te51 f;
    public final jtq0 g;
    public final a3y0 h = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "WebSocketTrackerDataSource");
    public final AtomicReference i = new AtomicReference(null);

    public n(String str, com.yandex.go.taxi_order.ws.d dVar, bay0 bay0Var, dw41 dw41Var, com.yandex.go.taxi.order.provider.a aVar, te51 te51Var, jtq0 jtq0Var) {
        this.a = str;
        this.b = dVar;
        this.c = bay0Var;
        this.d = dw41Var;
        this.e = aVar;
        this.f = te51Var;
        this.g = jtq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WebSocketTrackerDataSource$fallbackTimeout$1 webSocketTrackerDataSource$fallbackTimeout$1;
        int i;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof WebSocketTrackerDataSource$fallbackTimeout$1) {
            webSocketTrackerDataSource$fallbackTimeout$1 = (WebSocketTrackerDataSource$fallbackTimeout$1) continuationImpl;
            int i2 = webSocketTrackerDataSource$fallbackTimeout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketTrackerDataSource$fallbackTimeout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webSocketTrackerDataSource$fallbackTimeout$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketTrackerDataSource$fallbackTimeout$1.label;
                Integer num = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webSocketTrackerDataSource$fallbackTimeout$1.label = 1;
                    obj = b(webSocketTrackerDataSource$fallbackTimeout$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                taxiOrder = (TaxiOrder) obj;
                if (taxiOrder != null) {
                    return new Long(0L);
                }
                this.d.getClass();
                WebSocketTrackingExperiment a = dw41.a(taxiOrder);
                Integer valueOf = Integer.valueOf(a.e);
                boolean z = a.b;
                boolean z2 = a.d;
                hst hstVar = jst.e;
                if (z && z2) {
                    num = valueOf;
                }
                return new Long(num != null ? 1000 * num.intValue() : 0L);
            }
        }
        webSocketTrackerDataSource$fallbackTimeout$1 = new WebSocketTrackerDataSource$fallbackTimeout$1(this, continuationImpl);
        Object obj3 = webSocketTrackerDataSource$fallbackTimeout$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketTrackerDataSource$fallbackTimeout$1.label;
        Integer num2 = null;
        if (i != 0) {
        }
        taxiOrder = (TaxiOrder) obj3;
        if (taxiOrder != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:10:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        WebSocketTrackerDataSource$getOrder$1 webSocketTrackerDataSource$getOrder$1;
        int i;
        o2y0 o2y0Var;
        AtomicReference atomicReference;
        Object obj;
        AtomicReference atomicReference2;
        Object obj2;
        o2y0 o2y0Var2;
        if (continuationImpl instanceof WebSocketTrackerDataSource$getOrder$1) {
            webSocketTrackerDataSource$getOrder$1 = (WebSocketTrackerDataSource$getOrder$1) continuationImpl;
            int i2 = webSocketTrackerDataSource$getOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketTrackerDataSource$getOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = webSocketTrackerDataSource$getOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketTrackerDataSource$getOrder$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = webSocketTrackerDataSource$getOrder$1.L$1;
                    atomicReference = (AtomicReference) webSocketTrackerDataSource$getOrder$1.L$0;
                    kotlin.b.b(obj3);
                    atomicReference2 = atomicReference;
                    obj2 = obj;
                    o2y0Var2 = (o2y0) obj3;
                    while (!atomicReference2.compareAndSet(obj2, o2y0Var2)) {
                        if (atomicReference2.get() != obj2) {
                            atomicReference = atomicReference2;
                            obj = atomicReference.get();
                            webSocketTrackerDataSource$getOrder$1.L$0 = atomicReference;
                            webSocketTrackerDataSource$getOrder$1.L$1 = obj;
                            webSocketTrackerDataSource$getOrder$1.L$2 = null;
                            webSocketTrackerDataSource$getOrder$1.label = 1;
                            obj3 = this.e.m(this.a, webSocketTrackerDataSource$getOrder$1);
                            if (obj3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            atomicReference2 = atomicReference;
                            obj2 = obj;
                            o2y0Var2 = (o2y0) obj3;
                            while (!atomicReference2.compareAndSet(obj2, o2y0Var2)) {
                            }
                        }
                    }
                    o2y0Var = o2y0Var2;
                    if (o2y0Var == null) {
                        return o2y0Var.b();
                    }
                    return null;
                }
                kotlin.b.b(obj3);
                AtomicReference atomicReference3 = this.i;
                o2y0Var = (o2y0) atomicReference3.get();
                if (o2y0Var == null) {
                    atomicReference = atomicReference3;
                    obj = atomicReference.get();
                    webSocketTrackerDataSource$getOrder$1.L$0 = atomicReference;
                    webSocketTrackerDataSource$getOrder$1.L$1 = obj;
                    webSocketTrackerDataSource$getOrder$1.L$2 = null;
                    webSocketTrackerDataSource$getOrder$1.label = 1;
                    obj3 = this.e.m(this.a, webSocketTrackerDataSource$getOrder$1);
                    if (obj3 == coroutineSingletons) {
                    }
                    atomicReference2 = atomicReference;
                    obj2 = obj;
                    o2y0Var2 = (o2y0) obj3;
                    while (!atomicReference2.compareAndSet(obj2, o2y0Var2)) {
                    }
                    o2y0Var = o2y0Var2;
                }
                if (o2y0Var == null) {
                }
            }
        }
        webSocketTrackerDataSource$getOrder$1 = new WebSocketTrackerDataSource$getOrder$1(this, continuationImpl);
        Object obj32 = webSocketTrackerDataSource$getOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketTrackerDataSource$getOrder$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WebSocketTrackerDataSource$isEnabled$1 webSocketTrackerDataSource$isEnabled$1;
        int i;
        TaxiOrder taxiOrder;
        if (continuationImpl instanceof WebSocketTrackerDataSource$isEnabled$1) {
            webSocketTrackerDataSource$isEnabled$1 = (WebSocketTrackerDataSource$isEnabled$1) continuationImpl;
            int i2 = webSocketTrackerDataSource$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketTrackerDataSource$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webSocketTrackerDataSource$isEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketTrackerDataSource$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webSocketTrackerDataSource$isEnabled$1.label = 1;
                    obj = b(webSocketTrackerDataSource$isEnabled$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                taxiOrder = (TaxiOrder) obj;
                if (taxiOrder != null) {
                    this.h.getClass();
                    a3y0.h(new String[]{"isEnabled"});
                    hst hstVar = jst.e;
                    return Boolean.FALSE;
                }
                this.d.getClass();
                WebSocketTrackingExperiment a = dw41.a(taxiOrder);
                boolean z = a.b;
                boolean z2 = a.d;
                hst hstVar2 = jst.e;
                return Boolean.valueOf(z && z2);
            }
        }
        webSocketTrackerDataSource$isEnabled$1 = new WebSocketTrackerDataSource$isEnabled$1(this, continuationImpl);
        Object obj3 = webSocketTrackerDataSource$isEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketTrackerDataSource$isEnabled$1.label;
        if (i != 0) {
        }
        taxiOrder = (TaxiOrder) obj3;
        if (taxiOrder != null) {
        }
    }
}
