package com.yandex.go.scooters.di;

import defpackage.a2e0;
import defpackage.b2e0;
import defpackage.bjo0;
import defpackage.flo0;
import defpackage.mam0;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.v7p;

/* loaded from: classes13.dex */
public final class a implements v7p {
    public final mam0 a;

    public a(flo0 flo0Var, mam0 mam0Var) {
        this.a = mam0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        bjo0 bjo0Var = (bjo0) this.a.get();
        b2e0 b2e0Var = new b2e0();
        b2e0Var.a = new ScootersPreorderPollingContractsModule$photocontrolVerification$1$1(bjo0Var, null);
        b2e0Var.b = new pzn0(24);
        if (b2e0Var.a == null) {
            ny61.r("Request block must be defined using request { ... }");
            return null;
        }
        if (b2e0Var.b != null) {
            return new a2e0("photocontrol", b2e0Var, 3000L);
        }
        ny61.r("Continue polling block must be defined using continuePolling { ... }");
        return null;
    }
}
