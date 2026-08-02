package com.yandex.go.chargers.order.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.ml9;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.x5a;

/* loaded from: classes.dex */
public final class d implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final tt2 c;
    public final x5a d;
    public final com.yandex.go.chargers.data.g e;
    public final com.yandex.go.chargers.domain.a f;
    public final ml9 g;

    public d(Lifecycle lifecycle, tse tseVar, tt2 tt2Var, x5a x5aVar, com.yandex.go.chargers.data.g gVar, com.yandex.go.chargers.domain.a aVar, ml9 ml9Var) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = x5aVar;
        this.e = gVar;
        this.f = aVar;
        this.g = ml9Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ChargersActiveOrdersRemovePollingInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
