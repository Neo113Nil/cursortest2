package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.d0l0;
import defpackage.jl40;
import defpackage.pv0;
import defpackage.tls;
import defpackage.z81;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SuperAppDiscoveryMapRouteBridgeInteractor$start$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        pv0 pv0Var = (pv0) obj;
        z zVar = (z) this.receiver;
        zVar.getClass();
        Address address = pv0Var.a;
        com.yandex.go.route.interactor.b bVar = zVar.b;
        d0l0 c = bVar.c();
        if (!z81.b(c.h(), address)) {
            ZoneAddress zoneAddress = c.a;
            Zone zone = null;
            Zone zone2 = zoneAddress != null ? zoneAddress.b : null;
            if (zone2 != null && jl40.l(zone2.a, pv0Var.a.getZoneName())) {
                zone = zone2;
            }
            bVar.m(new ZoneAddress(address, zone), null);
        }
        return zy11.a;
    }
}
