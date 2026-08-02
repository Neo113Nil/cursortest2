package com.yandex.go.preorder.lifecycle;

import defpackage.ah00;
import defpackage.pft0;
import defpackage.qy41;
import defpackage.s8z;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;

/* loaded from: classes13.dex */
public final class m implements pft0 {
    public final ah00 a;
    public final tt2 b;
    public final qy41 c;
    public final s8z d;
    public final com.yandex.go.route.interactor.b e;
    public final ru.yandex.taxi.preorder.source.domain.a f;
    public final ru.yandex.taxi.search.suggest.i g;

    public m(ah00 ah00Var, tt2 tt2Var, qy41 qy41Var, s8z s8zVar, com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.preorder.source.domain.a aVar, ru.yandex.taxi.search.suggest.i iVar) {
        this.a = ah00Var;
        this.b = tt2Var;
        this.c = qy41Var;
        this.d = s8zVar;
        this.e = bVar;
        this.f = aVar;
        this.g = iVar;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        tje.N(tseVar, null, null, new SourcePointDestinationChangeListener$onResume$1(this, null), 3);
        tje.N(tseVar, null, null, new SourcePointDestinationChangeListener$onResume$2(this, null), 3);
    }
}
