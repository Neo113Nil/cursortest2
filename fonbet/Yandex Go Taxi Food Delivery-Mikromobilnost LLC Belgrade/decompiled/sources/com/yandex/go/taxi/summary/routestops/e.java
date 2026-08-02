package com.yandex.go.taxi.summary.routestops;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.tct0;
import defpackage.tpr;
import defpackage.uze0;
import defpackage.wiq0;
import defpackage.y9y0;
import java.util.List;

/* loaded from: classes14.dex */
public final class e {
    public final y9y0 a;
    public final wiq0 b;
    public final uze0 c;
    public final tct0 d;

    public e(y9y0 y9y0Var, wiq0 wiq0Var, uze0 uze0Var, tct0 tct0Var) {
        this.a = y9y0Var;
        this.b = wiq0Var;
        this.c = uze0Var;
        this.d = tct0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.n(((k) this.c).j.a(), new b(((k) this.b).j.b()), this.a.g(), new SourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2(this, null));
    }

    public final List b() {
        return this.a.e();
    }

    public final Address c() {
        return this.a.h();
    }

    public final tpr d() {
        return new d((g) this.a.f());
    }
}
