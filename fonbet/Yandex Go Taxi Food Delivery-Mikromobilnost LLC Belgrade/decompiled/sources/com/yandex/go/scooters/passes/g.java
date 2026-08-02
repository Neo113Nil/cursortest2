package com.yandex.go.scooters.passes;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class g implements sls {
    public final /* synthetic */ h a;
    public final /* synthetic */ ScootersPassesFromScreen b;
    public final /* synthetic */ tls c;

    public /* synthetic */ g(h hVar, ScootersPassesFromScreen scootersPassesFromScreen, tls tlsVar) {
        this.a = hVar;
        this.b = scootersPassesFromScreen;
        this.c = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        h hVar = this.a;
        tje.N(hVar.o(), null, null, new ScootersPassesRouter$requestScootersPassesWithLoading$1(hVar, this.b, this.c, null), 3);
        return zy11.a;
    }
}
