package com.yandex.go.scooters.domain;

import defpackage.cwn0;
import defpackage.jqr;
import defpackage.tse;
import defpackage.ycq0;

/* loaded from: classes13.dex */
public final class u implements cwn0 {
    public final tse a;
    public final ycq0 b;
    public final com.yandex.go.scooters.payments.data.c c;
    public final ru.yandex.taxi.scooters.data.p d;

    public u(tse tseVar, ycq0 ycq0Var, com.yandex.go.scooters.payments.data.c cVar, ru.yandex.taxi.scooters.data.p pVar) {
        this.a = tseVar;
        this.b = ycq0Var;
        this.c = cVar;
        this.d = pVar;
    }

    @Override // defpackage.cwn0
    public final void b() {
        kotlinx.coroutines.flow.e.H(this.a, new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.d(this.d.b), new ScootersMmPaymentSyncLifecycleInteractor$onLaunch$$inlined$flatMapLatest$1(this, null)), new ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2(this, null), 3));
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
    }
}
