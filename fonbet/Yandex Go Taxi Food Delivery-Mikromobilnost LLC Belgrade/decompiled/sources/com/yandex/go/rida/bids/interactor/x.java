package com.yandex.go.rida.bids.interactor;

import defpackage.mth;
import defpackage.o2y0;
import defpackage.pp5;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class x {
    public final o2y0 a;
    public final pp5 b;

    public x(o2y0 o2y0Var, pp5 pp5Var) {
        this.a = o2y0Var;
        this.b = pp5Var;
    }

    public final m0 a() {
        return new m0(kotlinx.coroutines.flow.e.t(new mth(new w(this.a.a(), this), 6)), kotlinx.coroutines.flow.e.d(this.b.a), new RidaHeaderDataInteractor$headerDataStateFlow$1(3, null));
    }
}
