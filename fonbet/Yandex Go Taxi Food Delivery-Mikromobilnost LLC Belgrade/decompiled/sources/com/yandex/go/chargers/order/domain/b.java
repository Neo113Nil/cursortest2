package com.yandex.go.chargers.order.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.iy11;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class b implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final com.yandex.go.chargers.data.g c;
    public final com.yandex.go.chargers.domain.a d;
    public final a e;
    public final iy11 f;
    public final com.yandex.go.chargers.data.a g;

    public b(Lifecycle lifecycle, tse tseVar, com.yandex.go.chargers.data.g gVar, com.yandex.go.chargers.domain.a aVar, a aVar2, iy11 iy11Var, com.yandex.go.chargers.data.a aVar3) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = gVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = iy11Var;
        this.g = aVar3;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ChargersActiveOrdersPollingInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new ChargersActiveOrdersPollingInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
