package com.yandex.go.scooters.discovery.shortcuts;

import defpackage.cms;
import defpackage.dib1;
import defpackage.faf0;
import defpackage.jl40;
import defpackage.jms;
import defpackage.mth;
import defpackage.tpr;
import defpackage.xvo0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements faf0, jms {
    public final /* synthetic */ xvo0 a;

    public a(xvo0 xvo0Var) {
        this.a = xvo0Var;
    }

    @Override // defpackage.faf0
    public final tpr a() {
        xvo0 xvo0Var = this.a;
        return kotlinx.coroutines.flow.e.l(xvo0Var.c.c(), kotlinx.coroutines.flow.e.t(new mth(new m0(kotlinx.coroutines.flow.e.t(new i(new n(xvo0Var.b.d(), new ScootersShortcutsRequestTriggerRepository$listenOuterBboxFromResponse$1(2, null)))), new n(new e(kotlinx.coroutines.flow.e.p(new c(dib1.c(xvo0Var.a)), 500L), xvo0Var), new ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3(xvo0Var, null)), new ScootersShortcutsRequestTriggerRepository$listenBboxChange$1(3, xvo0Var, xvo0.class, "obtainBboxIfInnerIsOutOfOuter", "obtainBboxIfInnerIsOutOfOuter(Lru/yandex/taxi/common_models/net/BBox;Lru/yandex/taxi/common_models/net/BBox;)Lru/yandex/taxi/common_models/net/BBox;", 4)), 6)), kotlinx.coroutines.flow.e.t(new g(xvo0Var.e.b(true))), xvo0Var.d.e, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d(((com.yandex.go.scooters.passes.data.b) xvo0Var.f).b)), new ScootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1(xvo0Var, null));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof faf0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, xvo0.class, "listenGeoPositionChange", "listenGeoPositionChange()Lkotlinx/coroutines/flow/Flow;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
