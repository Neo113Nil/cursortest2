package com.yandex.go.scooters.domain;

import defpackage.iy11;
import defpackage.ky11;
import defpackage.tpr;
import defpackage.tqm0;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class p {
    public final m a;
    public final o b;
    public final tpr c;
    public final k d;

    public p(ky11 ky11Var, iy11 iy11Var, h0 h0Var, tqm0 tqm0Var, ru.yandex.taxi.scooters.data.g gVar) {
        this.a = new m(gVar.b(true));
        this.b = new o(ky11Var.d());
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(iy11Var.a), new ScootersCurrentSessionStateAdapterRepositoryImpl$special$$inlined$flatMapLatest$1(null, this, h0Var, tqm0Var)));
        this.c = t;
        EmptyList emptyList = EmptyList.a;
        this.d = new k(new kotlinx.coroutines.flow.j0(new Pair(emptyList, emptyList), t, new ScootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1(3, null)));
    }
}
