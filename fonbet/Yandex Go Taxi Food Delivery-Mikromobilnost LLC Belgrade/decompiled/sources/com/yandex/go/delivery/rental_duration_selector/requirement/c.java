package com.yandex.go.delivery.rental_duration_selector.requirement;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bzi0;
import defpackage.czi0;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class c {
    public final czi0 a;
    public final wiq0 b;
    public final bzi0 c;

    public c(bzi0 bzi0Var, czi0 czi0Var, wiq0 wiq0Var) {
        this.a = czi0Var;
        this.b = wiq0Var;
        this.c = bzi0Var;
    }

    public final m0 a() {
        return new m0(this.a.b, ((k) this.b).j.b(), new DeliveryRentSummaryInteractor$summaryRequirementModelFlow$1(this, null));
    }
}
