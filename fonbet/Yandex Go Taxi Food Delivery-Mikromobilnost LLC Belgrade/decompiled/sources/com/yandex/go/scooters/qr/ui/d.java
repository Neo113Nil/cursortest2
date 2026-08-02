package com.yandex.go.scooters.qr.ui;

import defpackage.jey;
import defpackage.npo0;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class d extends jey {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        e eVar = this.a;
        eVar.N = tje.N(eVar.Jg(), null, null, new ScootersQrPresenter$start$1(eVar, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        e eVar = this.a;
        pzt0 pzt0Var = eVar.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        eVar.N = null;
        ((npo0) eVar.Dg()).stopCamera();
    }
}
