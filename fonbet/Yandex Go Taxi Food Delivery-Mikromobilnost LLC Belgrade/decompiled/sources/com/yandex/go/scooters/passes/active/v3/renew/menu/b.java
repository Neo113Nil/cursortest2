package com.yandex.go.scooters.passes.active.v3.renew.menu;

import defpackage.hfa0;
import defpackage.rgo0;
import defpackage.tls;
import defpackage.ygi0;

/* loaded from: classes13.dex */
public final class b implements rgo0 {
    public final /* synthetic */ ygi0 a;
    public final /* synthetic */ tls b;

    public b(ygi0 ygi0Var, tls tlsVar) {
        this.a = ygi0Var;
        this.b = tlsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.H.h();
    }

    @Override // defpackage.rgo0
    public final void j(hfa0 hfa0Var) {
        this.a.H.h();
        ((ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$2) this.b).invoke(hfa0Var.d());
    }
}
