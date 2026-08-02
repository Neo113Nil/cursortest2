package com.yandex.go.taxi.order.map;

import android.content.Context;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.etk0;
import defpackage.hbp0;
import defpackage.o2y0;
import defpackage.tje;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class n {
    public final Context a;
    public final etk0 b;
    public final o2y0 c;
    public final com.yandex.go.taxi.order.map.route.a d;
    public final g e;
    public final ru.yandex.taxi.design.utils.b f;
    public final com.yandex.go.taxi.order.map.overlay.traffic.b g;
    public final com.yandex.go.taxi.order.map.overlay.traffic.a h;
    public final r0 i = bvf0.c(Boolean.FALSE);
    public final hbp0 j = new hbp0(new czo0(14), "", null);

    public n(Context context, etk0 etk0Var, o2y0 o2y0Var, com.yandex.go.taxi.order.map.route.a aVar, g gVar, ru.yandex.taxi.design.utils.b bVar, com.yandex.go.taxi.order.map.overlay.traffic.b bVar2, com.yandex.go.taxi.order.map.overlay.traffic.a aVar2) {
        this.a = context;
        this.b = etk0Var;
        this.c = o2y0Var;
        this.d = aVar;
        this.e = gVar;
        this.f = bVar;
        this.g = bVar2;
        this.h = aVar2;
    }

    public final void a() {
        hbp0 hbp0Var = this.j;
        hbp0Var.f();
        hbp0.e(hbp0Var, null, null, new RoadObjectsInteractor$trackBubbleVisibility$1(this, null), 3);
        hbp0.e(hbp0Var, null, null, new RoadObjectsInteractor$trackBubbleVisibility$2(this, null), 3);
        hbp0.e(hbp0Var, null, null, new RoadObjectsInteractor$trackDataFromExperiment$1(this, null), 3);
        hbp0.e(hbp0Var, null, null, new RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1(this, null), 3);
        etk0 etk0Var = this.b;
        tje.N(hbp0Var, null, null, new RoadObjectsInteractor$trackTrafficLightWithSignalExperiment$$inlined$safeCollectIn$1(new m0(etk0Var.d, new k(etk0Var.b), RoadObjectsInteractor$trackTrafficLightWithSignalExperiment$1.a), null, this), 3);
    }
}
