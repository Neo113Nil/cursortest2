package com.yandex.go.chargers;

import defpackage.mu9;
import defpackage.s2a;
import defpackage.tje;
import defpackage.tsa;

/* loaded from: classes12.dex */
public final class b implements mu9 {
    public final /* synthetic */ e a;
    public final /* synthetic */ s2a b;

    public b(e eVar, s2a s2aVar) {
        this.a = eVar;
        this.b = s2aVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.V(this.b);
    }

    @Override // defpackage.mu9
    public final void a0(tsa tsaVar) {
        e eVar = this.a;
        tje.N(eVar.o(), null, null, new ChargersRouterImpl$showDiscounts$1$showStationDetails$1(eVar, this.b, tsaVar, null), 3);
    }
}
