package com.ybsdk.feature.transfer.internal.screens.targets.presentation;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.feature.transfer.api.TransferYbScreenArguments;
import defpackage.ary;
import defpackage.bry;
import defpackage.bwb0;
import defpackage.ds31;
import defpackage.gh90;
import defpackage.gpx0;
import defpackage.hag;
import defpackage.jvx0;
import defpackage.k5c;
import defpackage.p370;
import defpackage.pt01;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tt01;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.us3;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zgz0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final com.ybsdk.feature.transfer.internal.domain.b B;
    public final us3 C;
    public final TransferYbScreenArguments D;
    public pzt0 E;
    public final com.ybsdk.feature.transfer.internal.domain.a F;

    public b(com.ybsdk.feature.transfer.internal.domain.b bVar, gh90 gh90Var, us3 us3Var, a aVar, TransferYbScreenArguments transferYbScreenArguments) {
        super(new zgz0(29, transferYbScreenArguments), aVar);
        this.B = bVar;
        this.C = us3Var;
        this.D = transferYbScreenArguments;
        k5c a = ds31.a(this);
        TransferTargetsViewModel$ybCheckInteractor$1 transferTargetsViewModel$ybCheckInteractor$1 = new TransferTargetsViewModel$ybCheckInteractor$1(1, this, b.class, "onSuccessYbCheck", "onSuccessYbCheck(Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;)V", 0);
        jvx0 jvx0Var = new jvx0(20, this);
        p370 p370Var = gh90Var.a;
        this.F = new com.ybsdk.feature.transfer.internal.domain.a((com.ybsdk.feature.transfer.internal.data.a) ((gpx0) p370Var.b).get(), (bwb0) ((hag) p370Var.c).get(), (com.ybsdk.utils.poller.b) ((hag) p370Var.w).get(), this, a, this, transferTargetsViewModel$ybCheckInteractor$1, jvx0Var);
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new TransferTargetsViewModel$loadPartners$1(this, null), 3);
    }

    public final void b0(PartnerEntity partnerEntity) {
        this.F.e(partnerEntity, this.D.getTransferType(), ((pt01) X()).d);
    }

    public final void c0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, pt01.a((pt01) value, null, str, null, 13)));
    }

    public final void d0() {
        u8j0 u8j0Var = ((pt01) X()).a;
        if ((u8j0Var instanceof s8j0) || (u8j0Var instanceof t8j0)) {
            Z(tt01.a);
        } else if (u8j0Var instanceof r8j0) {
            Z(tt01.b);
        } else {
            w511.b();
        }
    }

    public final void e0(bry bryVar, int i) {
        ary aryVar = bryVar.a;
        if (aryVar == null) {
            x4c.g("Unknown item data clicked", null, String.valueOf(aryVar), null, 10);
            return;
        }
        PartnerEntity partnerEntity = aryVar.a;
        this.C.d(i, partnerEntity.getTitle(), "", null);
        b0(partnerEntity);
    }

    public final void f0() {
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new TransferTargetsViewModel$loadPartners$1(this, null), 3);
    }
}
