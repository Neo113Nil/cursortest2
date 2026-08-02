package com.yandex.go.taxi.tariffs.internal.interactor;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.repository.g;
import defpackage.mdh;
import defpackage.pft0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes14.dex */
public final class c implements pft0 {
    public final tt2 a;
    public final g b;
    public final k c;

    public c(tt2 tt2Var, g gVar, k kVar) {
        this.a = tt2Var;
        this.b = gVar;
        this.c = kVar;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new UpdateMulticlassTariffInteractor$onResume$1(this, null), 2);
    }
}
