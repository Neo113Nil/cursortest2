package com.yandex.go.scooters.domain;

import defpackage.cwn0;
import defpackage.m2o0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class v implements cwn0 {
    public final tse a;
    public final m2o0 b;

    public v(tse tseVar, m2o0 m2o0Var) {
        this.a = tseVar;
        this.b = m2o0Var;
    }

    @Override // defpackage.cwn0
    public final void b() {
        tje.N(this.a, null, null, new ScootersNotificationsChannelsLifecycleInteractor$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
    }
}
