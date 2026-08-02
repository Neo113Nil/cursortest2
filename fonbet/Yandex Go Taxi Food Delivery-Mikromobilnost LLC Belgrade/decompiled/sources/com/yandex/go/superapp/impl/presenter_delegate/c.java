package com.yandex.go.superapp.impl.presenter_delegate;

import com.yandex.go.coroutines.h;
import defpackage.h1p;
import defpackage.lse;
import defpackage.o400;
import defpackage.ru8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u1p;
import defpackage.uyj;
import ru.yandex.taxi.superapp.address.f;

/* loaded from: classes14.dex */
public final class c {
    public final u1p a;
    public final tt2 b;
    public final com.yandex.go.superapp.impl.interactor.c c;
    public final ru.yandex.taxi.eatskit.c d;
    public final f e;
    public final h1p f;
    public final h g = new h(new ExternalServiceGeoPositionDelegateImpl$isServiceEnabledAndProvidingContext$1(this, null));

    public c(u1p u1pVar, tt2 tt2Var, com.yandex.go.superapp.impl.interactor.c cVar, ru.yandex.taxi.eatskit.c cVar2, f fVar, h1p h1pVar) {
        this.a = u1pVar;
        this.b = tt2Var;
        this.c = cVar;
        this.d = cVar2;
        this.e = fVar;
        this.f = h1pVar;
    }

    public final void a(tse tseVar) {
        ru8 ru8Var = new ru8(lse.a, 3);
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, o400.a.plus(ru8Var), null, new ExternalServiceGeoPositionDelegateImpl$collectGeoPosition$1(this, null), 2);
    }
}
