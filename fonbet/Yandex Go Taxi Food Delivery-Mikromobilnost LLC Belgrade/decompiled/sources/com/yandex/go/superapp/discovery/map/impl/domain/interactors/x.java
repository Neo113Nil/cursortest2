package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import defpackage.e7c0;
import defpackage.ein0;
import defpackage.sux0;
import defpackage.tpr;
import defpackage.vw9;
import defpackage.z111;

/* loaded from: classes14.dex */
public final class x {
    public final e7c0 a;
    public final z111 b;
    public final vw9 c;
    public final ein0 d;
    public final sux0 e;

    public x(e7c0 e7c0Var, z111 z111Var, vw9 vw9Var, ein0 ein0Var, sux0 sux0Var) {
        this.a = e7c0Var;
        this.b = z111Var;
        this.c = vw9Var;
        this.d = ein0Var;
        this.e = sux0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(new o(this.a.b.a), new q(this.b.b.a), new s(this.c.b.a), new u(this.d.b.a), new w(this.e.b.a), new SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$6(null)));
    }
}
