package com.yandex.go.scooters.payments.navigation;

import defpackage.fva0;
import defpackage.h55;
import defpackage.m950;
import defpackage.ngo0;
import defpackage.sgo0;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a extends h55 implements m950 {
    public final fva0 D;
    public final ngo0 E;

    public a(fva0 fva0Var, ngo0 ngo0Var) {
        super(null);
        this.D = fva0Var;
        this.E = ngo0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ScootersPaymentRouterImpl$onLaunch$1(this, (sgo0) obj, null), 3);
    }
}
