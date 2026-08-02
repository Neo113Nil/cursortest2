package com.yandex.go.scooters.authorization;

import defpackage.h55;
import defpackage.tje;
import defpackage.umm0;
import defpackage.yvf0;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final r D;
    public final yvf0 E;
    public final com.yandex.go.scooters.domain.b F;
    public final yvf0 G;

    public b(r rVar, yvf0 yvf0Var, com.yandex.go.scooters.domain.b bVar, yvf0 yvf0Var2) {
        super(null);
        this.D = rVar;
        this.E = yvf0Var;
        this.F = bVar;
        this.G = yvf0Var2;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        if (this.F.b.b()) {
            r(new umm0(22));
        } else {
            tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ScootersAuthorizationRouter$launchLogin$1(this, null), 1);
        }
    }
}
