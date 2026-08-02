package com.yandex.go.navigator.events;

import defpackage.el00;
import defpackage.j24;
import defpackage.sb50;
import defpackage.t35;
import ru.yandex.taxi.map_common.map.p;

/* loaded from: classes12.dex */
public final class f extends t35 {
    public final p d;
    public final sb50 e;
    public final g f;
    public final el00 g;

    public f(p pVar, sb50 sb50Var, g gVar, el00 el00Var) {
        this.d = pVar;
        this.e = sb50Var;
        this.f = gVar;
        this.g = el00Var;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.g.f(true, new RoadEventsLayerHolder$requestCreation$1(this, j24Var, null));
    }
}
