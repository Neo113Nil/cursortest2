package com.yandex.go.taxi.order.details.v2.domain.a11y;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.k8k0;
import defpackage.l8x;
import defpackage.o8k0;
import defpackage.wls;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public final /* synthetic */ class d implements wls {
    public final /* synthetic */ e a;
    public final /* synthetic */ k8k0 b;
    public final /* synthetic */ o8k0 c;
    public final /* synthetic */ RideCardPresentationType w;

    public /* synthetic */ d(e eVar, k8k0 k8k0Var, o8k0 o8k0Var, RideCardPresentationType rideCardPresentationType) {
        this.a = eVar;
        this.b = k8k0Var;
        this.c = o8k0Var;
        this.w = rideCardPresentationType;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap;
        k8k0 k8k0Var = this.b;
        String str = k8k0Var.b;
        l8x l8xVar = (l8x) obj2;
        e eVar = this.a;
        ConcurrentHashMap concurrentHashMap2 = eVar.g;
        AtomicReference atomicReference = eVar.h;
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap2.get(atomicReference.get());
        k8k0 k8k0Var2 = concurrentHashMap3 != null ? (k8k0) concurrentHashMap3.get(str) : null;
        boolean z = (k8k0Var2 != null && jl40.l(k8k0Var2.a, k8k0Var.a) && k8k0Var2.c == k8k0Var.c) ? false : true;
        if (z && (concurrentHashMap = (ConcurrentHashMap) concurrentHashMap2.get(atomicReference.get())) != null) {
            concurrentHashMap.put(str, k8k0Var);
        }
        if (!z && l8xVar != null) {
            return l8xVar;
        }
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.c.invoke();
        return hbp0.e(eVar.d, null, null, new RideCardAccessibilityRepository$startIntervalJob$1(false, eVar, k8k0Var, this.w, null), 3);
    }
}
