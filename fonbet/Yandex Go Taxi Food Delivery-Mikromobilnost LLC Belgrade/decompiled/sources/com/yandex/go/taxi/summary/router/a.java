package com.yandex.go.taxi.summary.router;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.biv0;
import defpackage.jst;
import defpackage.pex0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vqv0;

/* loaded from: classes14.dex */
public final class a {
    public final vqv0 a;
    public final tse b;
    public final biv0 c;

    public a(vqv0 vqv0Var, tse tseVar, biv0 biv0Var) {
        this.a = vqv0Var;
        this.b = tseVar;
        this.c = biv0Var;
    }

    public final void a(pex0 pex0Var, SummaryExpandReason summaryExpandReason) {
        if (pex0Var == null) {
            jst.e.k(new IllegalArgumentException("null tariff has passed, skip redirect"), "null tariff has passed, skip redirect");
        } else {
            tje.N(this.b, null, null, new TariffCardRouterImpl$showTariffCard$1(this, pex0Var, summaryExpandReason, null), 3);
        }
    }
}
