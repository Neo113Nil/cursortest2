package com.yandex.go.chargers.offer.data;

import com.yandex.go.chargers.data.f;
import defpackage.h3y;
import defpackage.hfa0;
import defpackage.lpa;
import defpackage.n3a;
import defpackage.n9a;
import defpackage.ow9;
import defpackage.tje;
import defpackage.tsa;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final h3y b;
    public final f c;
    public final lpa d;
    public final com.yandex.go.chargers.payments.data.a e;
    public final n3a f;

    public a(tt2 tt2Var, h3y h3yVar, f fVar, lpa lpaVar, com.yandex.go.chargers.payments.data.a aVar, n3a n3aVar, n3a n3aVar2) {
        this.a = tt2Var;
        this.b = h3yVar;
        this.c = fVar;
        this.d = lpaVar;
        this.e = aVar;
        this.f = n3aVar2;
    }

    public final Object a(tsa tsaVar, hfa0 hfa0Var, n9a n9aVar, ow9 ow9Var, boolean z, Continuation continuation) {
        this.a.getClass();
        return tje.k0(uyj.a, new ChargersCreateOfferRepository$createOffer$2(hfa0Var, this, ow9Var, tsaVar, n9aVar, z, null), continuation);
    }
}
