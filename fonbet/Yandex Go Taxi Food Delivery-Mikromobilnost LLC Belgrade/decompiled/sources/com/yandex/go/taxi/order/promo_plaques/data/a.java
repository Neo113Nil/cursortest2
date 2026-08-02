package com.yandex.go.taxi.order.promo_plaques.data;

import com.yandex.go.coroutines.b;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final r0 a;
    public final gci0 b;
    public final r0 c;
    public final gci0 d;
    public final r0 e;
    public final ha2 f;

    public a(ru.yandex.taxi.communications.data.a aVar) {
        r0 c = bvf0.c(EmptySet.a);
        this.a = c;
        gci0 d = e.d(c);
        this.b = d;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.c = c2;
        this.d = e.d(c2);
        r0 c3 = bvf0.c(EmptyList.a);
        this.e = c3;
        this.f = e.n(c3, b.d(aVar.f, new DetailsCommunicationsRepository$special$$inlined$start$1(zy11.a, null)), d, new DetailsCommunicationsRepository$allCommunications$1(4, null));
    }
}
