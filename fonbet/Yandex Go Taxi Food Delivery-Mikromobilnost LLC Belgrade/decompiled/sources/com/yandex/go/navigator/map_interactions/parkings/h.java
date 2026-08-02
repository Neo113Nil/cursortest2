package com.yandex.go.navigator.map_interactions.parkings;

import com.yandex.go.navigator.driving.c0;
import com.yandex.mapkit.search.Session;
import defpackage.ffx;
import defpackage.j0g;
import defpackage.m901;
import defpackage.n68;
import defpackage.q850;
import defpackage.tpr;
import defpackage.tt2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class h {
    public final tt2 a;
    public final com.yandex.go.navigator.utils.d b;
    public final j0g c;
    public final ru.yandex.taxi.deeplinks.e d;
    public final com.yandex.go.navigator.search.a e;
    public final m901 f;
    public final c g;
    public Session h;
    public final n0 i = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final n68 j = new n68(this);
    public final tpr k;

    public h(tt2 tt2Var, com.yandex.go.navigator.utils.d dVar, j0g j0gVar, ru.yandex.taxi.deeplinks.e eVar, com.yandex.go.navigator.search.a aVar, m901 m901Var, c cVar, c0 c0Var, q850 q850Var) {
        this.a = tt2Var;
        this.b = dVar;
        this.c = j0gVar;
        this.d = eVar;
        this.e = aVar;
        this.f = m901Var;
        this.g = cVar;
        this.k = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new m0(q850Var.a(), c0Var.a(), new CarParksUiStateInteractor$speedGroupUiStateFlow$1(3, null)), new CarParksUiStateInteractor$special$$inlined$start$1(null, null)));
    }
}
