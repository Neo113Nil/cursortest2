package com.yandex.go.taxi.summary.order_part;

import defpackage.d770;
import defpackage.icv0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x880;
import defpackage.y880;

/* loaded from: classes14.dex */
public final class a implements y880 {
    public final tse a;
    public final d770 b;
    public final icv0 c;
    public final tt2 d;

    public a(tse tseVar, d770 d770Var, icv0 icv0Var, tt2 tt2Var) {
        this.a = tseVar;
        this.b = d770Var;
        this.c = icv0Var;
        this.d = tt2Var;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        this.d.getClass();
        tje.N(this.a, uyj.a, null, new ZonePaymentMethodCheckOrderPart$execute$1(this, x880Var, null), 2);
    }
}
