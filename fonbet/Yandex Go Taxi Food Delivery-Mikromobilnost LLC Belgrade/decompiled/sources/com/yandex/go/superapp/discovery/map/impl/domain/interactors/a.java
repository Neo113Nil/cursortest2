package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public static final SuperAppOpenServiceActionType h = SuperAppOpenServiceActionType.PLACES;
    public final com.yandex.go.superapp.discovery.map.impl.experiments.v2.p a;
    public final tse b;
    public final r0 c;
    public final gci0 d;
    public final r0 e;
    public final gci0 f;
    public pzt0 g;

    public a(com.yandex.go.superapp.discovery.map.impl.experiments.v2.p pVar, tse tseVar) {
        this.a = pVar;
        this.b = tseVar;
        r0 c = bvf0.c(null);
        this.c = c;
        this.d = kotlinx.coroutines.flow.e.d(c);
        SuperAppOpenServiceActionType superAppOpenServiceActionType = h;
        r0 c2 = bvf0.c(superAppOpenServiceActionType);
        this.e = c2;
        this.f = kotlinx.coroutines.flow.e.d(c2);
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(tseVar, null, null, new SearchbarStateRepository$fetchConfig$1(this, superAppOpenServiceActionType, null), 3);
    }

    public final void a(SuperAppOpenServiceActionType superAppOpenServiceActionType) {
        this.e.l(superAppOpenServiceActionType);
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(this.b, null, null, new SearchbarStateRepository$fetchConfig$1(this, superAppOpenServiceActionType, null), 3);
    }
}
