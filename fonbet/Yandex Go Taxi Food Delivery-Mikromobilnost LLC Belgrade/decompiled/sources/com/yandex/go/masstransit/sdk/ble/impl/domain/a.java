package com.yandex.go.masstransit.sdk.ble.impl.domain;

import com.yandex.go.masstransit.sdk.ble.impl.repository.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final m0 a() {
        b bVar = this.a;
        return new m0(e.d(bVar.l), e.d(bVar.m), new MtVehiclesInteractor$vehiclesFlowV2$1(this, null));
    }
}
