package com.yandex.go.taxi.order.infosharing.domain;

import defpackage.pwy0;
import defpackage.s2y0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public final class e {
    public final a a;
    public final pwy0 b;

    public e(a aVar, pwy0 pwy0Var) {
        this.a = aVar;
        this.b = pwy0Var;
    }

    public final n a(s2y0 s2y0Var) {
        return new n(new d(this.b.a(), this, s2y0Var), new TaxiOrderSharingUiStateInteractor$uiStateFlow$2(this, s2y0Var, null));
    }
}
