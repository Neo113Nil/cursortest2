package com.yandex.go.scooters.offers.v2.domain;

import defpackage.mth;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.z2o0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class h {
    public final pwy0 a;
    public final com.yandex.go.scooters.offers.v2.domain.mapper.b b;
    public final z2o0 c;

    public h(pwy0 pwy0Var, com.yandex.go.scooters.offers.v2.domain.mapper.b bVar, z2o0 z2o0Var) {
        this.a = pwy0Var;
        this.b = bVar;
        this.c = z2o0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.a.a(), new mth(kotlinx.coroutines.flow.e.d(this.c.a), 6), new ScootersOnParkingInteractor$listenToScootersOnParking$1(this, null)));
    }
}
