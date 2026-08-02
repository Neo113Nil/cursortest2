package com.yandex.go.chargers.offer.ui.compose.ui;

import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import defpackage.c29;
import defpackage.eci0;
import defpackage.em9;
import defpackage.g6a;
import defpackage.jqr;
import defpackage.maa;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tsa;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vn9;

/* loaded from: classes12.dex */
public final class e {
    public final tt2 a;
    public final em9 b;
    public final com.yandex.go.chargers.offer.domain.b c;
    public final String d;
    public final c29 e;
    public final tpr f;
    public final eci0 g;

    public e(vn9 vn9Var, tt2 tt2Var, em9 em9Var, com.yandex.go.chargers.offer.domain.b bVar, g6a g6aVar, String str, c29 c29Var) {
        this.a = tt2Var;
        this.b = em9Var;
        this.c = bVar;
        this.d = str;
        this.e = c29Var;
        this.f = kotlinx.coroutines.flow.e.t(new d(kotlinx.coroutines.flow.e.d(vn9Var.a)));
        this.g = g6aVar.b;
    }

    public final tpr a(tsa tsaVar, ChargersOfferOpenReason chargersOfferOpenReason) {
        jqr jqrVar = new jqr(new jqr(com.yandex.go.coroutines.b.d(this.c.c(tsaVar), new ChargersOfferUiStateInteractor$getUiStateFlow$$inlined$start$1(maa.a, null)), new ChargersOfferUiStateInteractor$getUiStateFlow$1(this, chargersOfferOpenReason, null), 3), new ChargersOfferUiStateInteractor$getUiStateFlow$2(this, null), 3);
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(jqrVar, o400.a);
    }
}
