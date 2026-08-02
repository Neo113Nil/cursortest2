package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.hfa0;
import defpackage.iun0;
import defpackage.rgo0;
import defpackage.tls;

/* loaded from: classes13.dex */
public final class b implements rgo0 {
    public final /* synthetic */ iun0 a;
    public final /* synthetic */ tls b;

    public b(iun0 iun0Var, tls tlsVar) {
        this.a = iun0Var;
        this.b = tlsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.H.h();
    }

    @Override // defpackage.rgo0
    public final void j(hfa0 hfa0Var) {
        this.a.H.h();
        ((ScootersPackagesPurchaseUiActionInteractor$openPaymentMethodsWithUserData$2) this.b).invoke(hfa0Var.d());
    }
}
