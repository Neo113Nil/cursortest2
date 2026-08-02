package com.yandex.go.address_confirmation.navigation;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.address_confirmation.SourceAddressConfirmationMapFragment;
import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import com.yandex.go.pickup_from_photo.navigation.c;
import defpackage.a821;
import defpackage.cob0;
import defpackage.gbt0;
import defpackage.hbt0;
import defpackage.hxx;
import defpackage.jqr;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.x8t0;
import defpackage.zat0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class a implements sy60 {
    public final /* synthetic */ gbt0 a;
    public final /* synthetic */ hbt0 b;
    public final /* synthetic */ zat0 c;
    public final /* synthetic */ SourceAddressConfirmationMapFragment w;
    public final /* synthetic */ TargetScreenAfterConfirmation x;

    public a(gbt0 gbt0Var, hbt0 hbt0Var, zat0 zat0Var, SourceAddressConfirmationMapFragment sourceAddressConfirmationMapFragment, TargetScreenAfterConfirmation targetScreenAfterConfirmation) {
        this.a = gbt0Var;
        this.b = hbt0Var;
        this.c = zat0Var;
        this.w = sourceAddressConfirmationMapFragment;
        this.x = targetScreenAfterConfirmation;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1(pv0 pv0Var, AddressClarificationReason addressClarificationReason) {
        gbt0 gbt0Var = this.a;
        a821 a821Var = gbt0Var.F;
        a821Var.getClass();
        a821Var.b.m(new ZoneAddress(pv0Var.a, a821Var.a.f(pv0Var.a.getZoneName())), null);
        ((com.yandex.go.clarify_address.a) gbt0Var.G).c(true, addressClarificationReason);
        gbt0Var.r(new x8t0(4));
    }

    public final void o1(PickupFromPhotoPayload$Origin pickupFromPhotoPayload$Origin) {
        gbt0 gbt0Var = this.a;
        pzt0 pzt0Var = gbt0Var.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c cVar = (c) gbt0Var.K.get();
        gbt0Var.O = e.H(gbt0Var.o(), new jqr(e.c(cVar.M.a), new SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1(this, gbt0Var, this.b, this.c, this.w, this.x, null), 3));
        gbt0Var.E(cVar, new cob0(pickupFromPhotoPayload$Origin, true), sy60.Q2, hxx.a);
    }
}
