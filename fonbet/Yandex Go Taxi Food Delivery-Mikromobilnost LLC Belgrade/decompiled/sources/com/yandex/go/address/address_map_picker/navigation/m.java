package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import defpackage.cob0;
import defpackage.h55;
import defpackage.jqr;
import defpackage.sy60;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class m extends h55 {
    public final yvf0 D;

    public m(yvf0 yvf0Var) {
        super(null);
        this.D = yvf0Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        com.yandex.go.pickup_from_photo.navigation.c cVar = (com.yandex.go.pickup_from_photo.navigation.c) this.D.get();
        A(cVar, new cob0(PickupFromPhotoPayload$Origin.CLARIFY, false), sy60.Q2);
        kotlinx.coroutines.flow.e.H(o(), new jqr(kotlinx.coroutines.flow.e.c(cVar.M.a), new PickupFromPhotoAdapterRouter$onAttach$1(this, null), 3));
    }
}
