package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.hfa0;
import defpackage.rgo0;
import defpackage.tls;

/* loaded from: classes13.dex */
public final class b implements rgo0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ tls b;

    public b(c cVar, tls tlsVar) {
        this.a = cVar;
        this.b = tlsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.G.h();
    }

    @Override // defpackage.rgo0
    public final void j(hfa0 hfa0Var) {
        this.a.G.h();
        ((ScootersSuperPassesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2) this.b).invoke(hfa0Var.d());
    }
}
