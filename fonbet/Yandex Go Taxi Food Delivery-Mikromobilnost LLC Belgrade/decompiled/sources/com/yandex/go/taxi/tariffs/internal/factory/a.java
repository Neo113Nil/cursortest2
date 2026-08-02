package com.yandex.go.taxi.tariffs.internal.factory;

import com.yandex.go.coroutines.b;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.internal.routestats.interactor.a0;
import com.yandex.go.taxi.tariffs.internal.routestats.interactor.c0;
import com.yandex.go.zone.model.Zone;
import defpackage.b2k;
import defpackage.e1s;
import defpackage.etq0;
import defpackage.mth;
import defpackage.o370;
import defpackage.oci;
import defpackage.tpr;
import defpackage.vo40;
import defpackage.wiq0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class a {
    public final wiq0 a;
    public final o370 b;
    public final a0 c;
    public final e1s d;
    public final vo40 e;
    public final oci f;

    public a(wiq0 wiq0Var, o370 o370Var, a0 a0Var, e1s e1sVar, vo40 vo40Var, oci ociVar) {
        this.a = wiq0Var;
        this.b = o370Var;
        this.c = a0Var;
        this.d = e1sVar;
        this.e = vo40Var;
        this.f = ociVar;
    }

    public final mth a(Zone zone) {
        b2k s = e.s(((k) this.a).j.b(), new etq0(4));
        tpr a = this.c.a(zone);
        o370 o370Var = this.b;
        return new mth(e.l(s, a, e.t(new c0(((c) o370Var.a).c(), o370Var)), b.d(this.d.a, new TariffInfoRequestFactory$infoFlow$$inlined$start$1(zy11.a, null)), this.f.e, new TariffInfoRequestFactory$infoFlow$1(this, null)), 6);
    }
}
