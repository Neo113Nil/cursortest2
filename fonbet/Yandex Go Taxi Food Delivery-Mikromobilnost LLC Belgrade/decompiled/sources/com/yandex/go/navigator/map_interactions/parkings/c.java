package com.yandex.go.navigator.map_interactions.parkings;

import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.qv10;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.navigator.map_interactions.parkings.analytics.a a;
    public final cne0 b;
    public final r0 c;
    public final m0 d;

    public c(dne0 dne0Var, com.yandex.go.navigator.map_interactions.experiment.a aVar, com.yandex.go.navigator.map_interactions.parkings.analytics.a aVar2) {
        this.a = aVar2;
        cne0 a = dne0Var.a("com.yandex.go.navigator.map_interaction.CarParks");
        this.b = a;
        r0 c = bvf0.c(Boolean.valueOf(a.g("car_parks_visibility", false)));
        this.c = c;
        this.d = new m0(c, com.yandex.go.coroutines.b.d(new b(ru.yandex.taxi.experiments.d.b(aVar.a)), new CarParksRepository$special$$inlined$start$1(Boolean.FALSE, null)), new CarParksRepository$carParksEnabledFlow$2(3, null));
    }

    public final void a() {
        r0 r0Var = this.c;
        qv10.B(!((Boolean) r0Var.getValue()).booleanValue(), r0Var, null);
        this.b.u("car_parks_visibility", ((Boolean) r0Var.getValue()).booleanValue());
        this.a.f(((Boolean) r0Var.getValue()).booleanValue());
    }
}
