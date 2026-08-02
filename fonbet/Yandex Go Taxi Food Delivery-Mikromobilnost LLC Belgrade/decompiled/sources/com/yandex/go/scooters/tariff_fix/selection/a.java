package com.yandex.go.scooters.tariff_fix.selection;

import defpackage.con0;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ b a;
    public final /* synthetic */ con0 b;

    public /* synthetic */ a(b bVar, con0 con0Var) {
        this.a = bVar;
        this.b = con0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = this.a;
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$book$1(bVar, this.b, null), 3);
        return zy11.a;
    }
}
