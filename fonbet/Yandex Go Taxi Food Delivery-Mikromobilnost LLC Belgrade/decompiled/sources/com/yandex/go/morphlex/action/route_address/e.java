package com.yandex.go.morphlex.action.route_address;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.repository.o;
import defpackage.dw;
import defpackage.kpi0;
import defpackage.kr;
import defpackage.n6u;
import defpackage.w511;
import defpackage.zgc0;

/* loaded from: classes12.dex */
public final class e implements dw {
    public final com.yandex.go.route.interactor.b a;
    public final kpi0 b;
    public final o c;

    public e(com.yandex.go.route.interactor.b bVar, kpi0 kpi0Var, o oVar) {
        this.a = bVar;
        this.b = kpi0Var;
        this.c = oVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        SetRouteAddressAction setRouteAddressAction = (SetRouteAddressAction) krVar;
        zgc0 zgc0Var = PlainAddress.Companion;
        AddressDTO addressDTO = setRouteAddressAction.b;
        zgc0Var.getClass();
        PlainAddress plainAddress = new PlainAddress(addressDTO);
        String str = setRouteAddressAction.c;
        plainAddress.p(str);
        int i = d.a[setRouteAddressAction.a.ordinal()];
        com.yandex.go.route.interactor.b bVar = this.a;
        if (i == 1) {
            bVar.m(new ZoneAddress(plainAddress, this.c.f(str)), null);
            this.b.b();
        } else if (i == 2) {
            bVar.l(plainAddress);
        } else {
            w511.b();
        }
    }
}
