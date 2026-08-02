package com.yandex.go.scooters.domain;

import defpackage.cwn0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class i0 implements cwn0 {
    public final tse a;
    public final ru.yandex.taxi.scooters.domain.r b;
    public final a c;

    public i0(tse tseVar, ru.yandex.taxi.scooters.domain.r rVar, a aVar) {
        this.a = tseVar;
        this.b = rVar;
        this.c = aVar;
    }

    @Override // defpackage.cwn0
    public final void b() {
        tje.N(this.a, null, null, new ScootersUserStateLifecycleInteractor$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
    }
}
