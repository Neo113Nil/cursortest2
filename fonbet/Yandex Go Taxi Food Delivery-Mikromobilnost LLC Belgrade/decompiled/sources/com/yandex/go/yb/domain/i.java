package com.yandex.go.yb.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.di51;
import defpackage.ike;
import defpackage.jqr;
import defpackage.kj;
import defpackage.n4u0;
import defpackage.r2u0;
import defpackage.wsr0;
import defpackage.xsr0;

/* loaded from: classes8.dex */
public final class i implements di51 {
    public final Lifecycle a;
    public final ike b;
    public final ru.yandex.taxi.am.g c;

    public i(Lifecycle lifecycle, ike ikeVar, ru.yandex.taxi.am.g gVar) {
        this.a = lifecycle;
        this.b = ikeVar;
        this.c = gVar;
    }

    @Override // defpackage.di51
    public final n4u0 m() {
        ru.yandex.taxi.am.g gVar = this.c;
        jqr jqrVar = new jqr(new h(gVar.h()), new RealYbOAuthTokenLoader$getUidFlow$2(this, null), 3);
        xsr0.a.getClass();
        r2u0 r2u0Var = wsr0.c;
        kj Ig = gVar.a.Ig();
        return kotlinx.coroutines.flow.e.R(jqrVar, this.b, r2u0Var, Ig != null ? Long.valueOf(Ig.a) : null);
    }
}
