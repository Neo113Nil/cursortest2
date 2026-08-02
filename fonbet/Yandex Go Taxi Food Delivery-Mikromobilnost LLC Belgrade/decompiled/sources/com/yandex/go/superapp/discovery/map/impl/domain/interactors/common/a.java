package com.yandex.go.superapp.discovery.map.impl.domain.interactors.common;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import defpackage.tje;
import defpackage.tse;
import defpackage.yz4;

/* loaded from: classes14.dex */
public abstract class a {
    public final tse a;
    public final yz4 b;

    public a(tse tseVar, yz4 yz4Var) {
        this.a = tseVar;
        this.b = yz4Var;
    }

    public final void a(SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState) {
        tje.N(this.a, null, null, new BaseDiscoveryMapOverlayStateInteractor$changeMapObjectsState$1(this, superAppDiscoveryMapOverlayState, null), 3);
    }

    public final void b(Object obj) {
        tje.N(this.a, null, null, new BaseDiscoveryMapOverlayStateInteractor$changeScreen$1(this, obj, null), 3);
    }
}
