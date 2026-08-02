package com.yandex.go.taxi.order.search.factory;

import com.yandex.go.coroutines.h;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.eco;
import defpackage.n380;
import defpackage.o400;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class a {
    public final eco a;
    public final com.yandex.go.pin.api.widget.a b;
    public final r0c0 c;
    public final tt2 d;
    public final h e = new h(new SearchMapPinFactory$pinHolder$1(this, null));

    public a(eco ecoVar, com.yandex.go.pin.api.widget.a aVar, r0c0 r0c0Var, tt2 tt2Var) {
        this.a = ecoVar;
        this.b = aVar;
        this.c = r0c0Var;
        this.d = tt2Var;
    }

    public final Object a(SearchState searchState, p0c0 p0c0Var, n380 n380Var, Continuation continuation) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new SearchMapPinFactory$createPinView$2(searchState, this, p0c0Var, n380Var, null), continuation);
    }
}
