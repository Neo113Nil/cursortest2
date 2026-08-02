package com.yandex.go.taxi.order.details.v2.state.elements.promoblock;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.qpf0;
import defpackage.rpf0;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final qpf0 a;
    public final r0 b;
    public final gci0 c;
    public final r0 d;
    public final gci0 e;
    public final r0 f;
    public final ha2 g;

    public a(ru.yandex.taxi.communications.data.a aVar, qpf0 qpf0Var) {
        this.a = qpf0Var;
        r0 c = bvf0.c(EmptySet.a);
        this.b = c;
        gci0 d = e.d(c);
        this.c = d;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.d = c2;
        this.e = e.d(c2);
        r0 c3 = bvf0.c(EmptyList.a);
        this.f = c3;
        this.g = e.m(c3, com.yandex.go.coroutines.b.d(aVar.f, new RideCardCommunicationsRepository$special$$inlined$start$1(zy11.a, null)), d, e.d(((rpf0) qpf0Var).a), new RideCardCommunicationsRepository$communications$1(this, null));
    }
}
