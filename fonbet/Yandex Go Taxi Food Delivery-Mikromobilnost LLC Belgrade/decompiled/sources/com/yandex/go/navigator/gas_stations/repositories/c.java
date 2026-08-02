package com.yandex.go.navigator.gas_stations.repositories;

import defpackage.bvf0;
import defpackage.tpr;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.navigator.gas_stations.analytics.a a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public final r0 e;
    public final m0 f;
    public final r0 g;
    public final r0 h;
    public final tpr i;

    public c(com.yandex.go.navigator.gas_stations.analytics.a aVar) {
        this.a = aVar;
        EmptyList emptyList = EmptyList.a;
        r0 c = bvf0.c(emptyList);
        this.b = c;
        this.c = c;
        r0 c2 = bvf0.c(emptyList);
        this.d = c2;
        this.e = c2;
        this.f = new m0(c2, c, new GasStationsRepository$foundGasStationsFlow$1(3, null));
        r0 c3 = bvf0.c(null);
        this.g = c3;
        this.h = c3;
        this.i = kotlinx.coroutines.flow.e.t(new b(c3));
    }
}
