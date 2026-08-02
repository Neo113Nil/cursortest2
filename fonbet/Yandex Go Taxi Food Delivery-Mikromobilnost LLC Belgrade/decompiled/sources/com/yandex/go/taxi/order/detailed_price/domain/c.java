package com.yandex.go.taxi.order.detailed_price.domain;

import defpackage.fef;
import defpackage.mdh;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class c {
    public final com.yandex.go.taxi.order.detailed_price.data.a a;
    public final com.yandex.go.taxi.order.detailed_price.domain.mapper.a b;
    public final pwy0 c;
    public final tt2 d;

    public c(com.yandex.go.taxi.order.detailed_price.data.a aVar, com.yandex.go.taxi.order.detailed_price.domain.mapper.a aVar2, pwy0 pwy0Var, tt2 tt2Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = pwy0Var;
        this.d = tt2Var;
    }

    public final tpr a(String str, fef fefVar, String str2) {
        rol0 rol0Var = new rol0(new DetailedPriceStateInteractor$stateFlow$1(this, str, fefVar, str2, null));
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return e.F(rol0Var, mdh.b);
    }
}
