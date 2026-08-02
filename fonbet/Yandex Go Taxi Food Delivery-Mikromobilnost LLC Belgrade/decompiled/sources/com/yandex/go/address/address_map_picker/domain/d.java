package com.yandex.go.address.address_map_picker.domain;

import defpackage.bp0;
import defpackage.jqr;
import defpackage.tse;
import defpackage.xp0;

/* loaded from: classes12.dex */
public final class d {
    public final bp0 a;
    public final ru.yandex.taxi.address.clarification.impl.repo.a b;

    public d(bp0 bp0Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar) {
        this.a = bp0Var;
        this.b = aVar;
    }

    public final void a(xp0 xp0Var, tse tseVar) {
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(kotlinx.coroutines.flow.e.d(this.b.h), new AddressMapPickerDrumsAnalyticsInteractor$observe$1(this, xp0Var, null), 3));
    }
}
