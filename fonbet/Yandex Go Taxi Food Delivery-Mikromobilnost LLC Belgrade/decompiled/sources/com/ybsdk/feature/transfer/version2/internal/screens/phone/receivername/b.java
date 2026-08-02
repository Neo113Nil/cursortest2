package com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import defpackage.ai90;
import defpackage.aj90;
import defpackage.ao01;
import defpackage.ci90;
import defpackage.ds31;
import defpackage.evu0;
import defpackage.gj90;
import defpackage.jl01;
import defpackage.k5c;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.tc01;
import defpackage.tfl0;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.yn01;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 implements aj90 {
    public final tfl0 B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a C;
    public final TransferReceiverNameFragment.Arguments D;
    public r8j0 E;
    public final com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a F;

    public b(tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar, ao01 ao01Var, ai90 ai90Var, TransferReceiverNameFragment.Arguments arguments) {
        super(new tc01(16), ao01Var);
        this.B = tfl0Var;
        this.C = aVar;
        this.D = arguments;
        this.E = new r8j0(EmptyList.a, null, 14);
        String agreementId = arguments.getAgreementId();
        MoneyEntity money = arguments.getMoney();
        String comment = arguments.getComment();
        k5c a = ds31.a(this);
        String transferSessionId = arguments.getTransferSessionId();
        TransferScenario transferScenario = arguments.getTransferScenario();
        String destinationCountry = arguments.getDestinationCountry();
        PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry = PartnerSelectionFeature$Companion$Entry.TRANSFER;
        ci90 ci90Var = (ci90) ai90Var;
        this.F = new com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a(ci90Var.c, ci90Var.d, ci90Var.e, ci90Var.f, ci90Var.g, ci90Var.h, ci90Var.b, ci90Var.i, ci90Var.j, ci90Var.k, agreementId, money, comment, this, this, a, transferSessionId, transferScenario, destinationCountry, false, new jl01(8, this), new gj90(3, this), partnerSelectionFeature$Companion$Entry);
    }

    @Override // defpackage.aj90
    public final void N(u8j0 u8j0Var) {
        this.E = (r8j0) u8j0Var;
    }

    public final boolean b0() {
        return ((yn01) X()).b;
    }

    public final void c0() {
        this.F.b();
        this.B.e();
    }

    public final void d0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, yn01.a((yn01) value, str, false, 2)));
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        yn01 yn01Var = (yn01) X();
        if (!yn01Var.b() || yn01Var.b) {
            return;
        }
        String obj = evu0.k0(yn01Var.a).toString();
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, yn01.a((yn01) value, null, true, 1)));
        TransferReceiverNameFragment.Arguments arguments = this.D;
        PartnerEntity partnerEntity = arguments.getPartner().getPartnerEntity();
        String receiverPhone = arguments.getPartner().getReceiverPhone();
        String transferId = arguments.getPartner().getTransferId();
        com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a aVar = this.F;
        aVar.b();
        aVar.d(partnerEntity, receiverPhone, transferId, obj);
    }

    public final void f0() {
        this.C.getClass();
        tfl0.b(this.B, com.ybsdk.feature.transfer.version2.internal.screens.a.e(), null, false, 6);
    }

    @Override // defpackage.aj90
    public final u8j0 l() {
        return this.E;
    }
}
