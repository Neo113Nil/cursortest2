package com.yandex.go.tariffcard.interactor;

import defpackage.b2k;
import defpackage.fco;
import defpackage.i3y;
import defpackage.ico;
import defpackage.iq40;
import defpackage.rqo;
import defpackage.xn3;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class g {
    public final fco a;
    public final ico b;
    public final com.yandex.go.taxi.tariffs.repository.g c;
    public final iq40 d;
    public final i3y e;

    public g(fco fcoVar, ico icoVar, com.yandex.go.taxi.tariffs.repository.g gVar, iq40 iq40Var, rqo rqoVar) {
        this.a = fcoVar;
        this.b = icoVar;
        this.c = gVar;
        this.d = iq40Var;
        this.e = kotlin.a.a(new xn3(rqoVar, 7));
    }

    public final m0 a(b2k b2kVar) {
        return new m0(b2kVar, this.a.b, new MulticlassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1(this, null));
    }
}
