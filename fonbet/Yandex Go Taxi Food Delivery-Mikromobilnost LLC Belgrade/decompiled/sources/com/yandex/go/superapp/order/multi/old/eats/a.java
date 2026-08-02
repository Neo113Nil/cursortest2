package com.yandex.go.superapp.order.multi.old.eats;

import com.yandex.go.coroutines.b;
import com.yandex.go.order.external.tracking.h;
import defpackage.jqr;
import defpackage.tpr;
import defpackage.tt2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class a {
    public final h a;
    public final tt2 b;
    public final AtomicReference c = new AtomicReference(EmptyList.a);

    public a(h hVar, tt2 tt2Var) {
        this.a = hVar;
        this.b = tt2Var;
    }

    public final tpr a() {
        return b.d(b.d(new jqr(this.a.v, new EatsOrderProviderDelegate$observe$1(2, this.c, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4), 3), new EatsOrderProviderDelegate$observe$2(this, null)), new EatsOrderProviderDelegate$observe$$inlined$start$1(this, null));
    }
}
