package com.yandex.go.chargers.qr;

import defpackage.jey;
import defpackage.moa;
import defpackage.poa;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class c extends jey {
    public final /* synthetic */ poa a;

    public c(poa poaVar) {
        this.a = poaVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        poa poaVar = this.a;
        poaVar.H = tje.N(poaVar.Jg(), null, null, new ChargersQrPresenter$start$1(poaVar, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        poa poaVar = this.a;
        pzt0 pzt0Var = poaVar.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((moa) poaVar.Dg()).stopCamera();
    }
}
