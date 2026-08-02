package com.yandex.go.payments.paymentlist.experiments.change_payment_modal;

import defpackage.fr3;
import defpackage.lz60;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class a implements lz60 {
    public final tse a;
    public final tt2 b;
    public final f c;
    public final fr3 d;
    public final oep0 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public a(tse tseVar, tt2 tt2Var, f fVar, fr3 fr3Var, oep0 oep0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = fVar;
        this.d = fr3Var;
        this.e = oep0Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        if (this.f.get()) {
            return;
        }
        this.b.getClass();
        tje.N(this.a, uyj.a, null, new ChangePaymentOnSummaryInteractor$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ChangePaymentOnSummaryInteractor";
    }
}
