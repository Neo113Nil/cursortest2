package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.bvf0;
import defpackage.dod0;
import defpackage.ds31;
import defpackage.fed0;
import defpackage.ftb;
import defpackage.gpd0;
import defpackage.ind0;
import defpackage.jnd0;
import defpackage.k3v0;
import defpackage.m0u0;
import defpackage.mdd0;
import defpackage.nfd0;
import defpackage.omm0;
import defpackage.p2d0;
import defpackage.pcs0;
import defpackage.tje;
import defpackage.tpd;
import defpackage.u7d0;
import defpackage.x0u0;
import defpackage.yr31;
import defpackage.zyh0;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends yr31 {
    public final ftb A;
    public final omm0 B;
    public final gpd0 C;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.a D;
    public final r0 E;
    public final r0 F;
    public final jnd0 b;
    public final p2d0 c;
    public final dod0 w;
    public final k3v0 x;
    public final x0u0 y;
    public final m0u0 z;

    public b(jnd0 jnd0Var, p2d0 p2d0Var, dod0 dod0Var, k3v0 k3v0Var, x0u0 x0u0Var, m0u0 m0u0Var, ftb ftbVar, omm0 omm0Var, gpd0 gpd0Var, mdd0 mdd0Var, nfd0 nfd0Var, u7d0 u7d0Var) {
        this.b = jnd0Var;
        this.c = p2d0Var;
        this.w = dod0Var;
        this.x = k3v0Var;
        this.y = x0u0Var;
        this.z = m0u0Var;
        this.A = ftbVar;
        this.B = omm0Var;
        this.C = gpd0Var;
        this.D = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.a(ds31.a(this), nfd0Var, u7d0Var, mdd0Var);
        r0 c = bvf0.c(pcs0.a);
        this.E = c;
        this.F = c;
        tje.N(ds31.a(this), null, null, new SilentPaymentViewModel$checkSilentPaymentAvailabilityAndStart$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.D.b();
    }

    public final fed0 W(PlusTarifficatorPurchase plusTarifficatorPurchase) {
        PlusPayCompositeOfferDetails.PaymentText paymentText;
        PlusPayCompositeOfferDetails.PaymentText paymentText2;
        boolean z = tpd.b(plusTarifficatorPurchase.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        int i = zyh0.PlusPay_Payment_Loader_Processing_Title;
        omm0 omm0Var = this.B;
        String a = omm0Var.a(i);
        String subscriptionName = plusTarifficatorPurchase.getOffer().getAssets().getSubscriptionName();
        PlusPayCompositeOfferDetails offerDetails = plusTarifficatorPurchase.getOfferDetails();
        String firstPaymentText = (offerDetails == null || (paymentText2 = offerDetails.getPaymentText()) == null) ? null : paymentText2.getFirstPaymentText();
        if (firstPaymentText == null) {
            firstPaymentText = "";
        }
        if (!z) {
            firstPaymentText = null;
        }
        PlusPayCompositeOfferDetails offerDetails2 = plusTarifficatorPurchase.getOfferDetails();
        String nextPaymentText = (offerDetails2 == null || (paymentText = offerDetails2.getPaymentText()) == null) ? null : paymentText.getNextPaymentText();
        return new fed0(a, subscriptionName, firstPaymentText, z ? nextPaymentText != null ? nextPaymentText : "" : null, z ? omm0Var.a(zyh0.PlusPay_Payment_Loader_Footer) : null);
    }

    public final void X(boolean z) {
        jnd0 jnd0Var = this.b;
        ind0 a = jnd0Var.a.a();
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PlusTarifficatorPurchase copy$default = PlusTarifficatorPurchase.copy$default(plusTarifficatorPurchase, null, null, null, null, null, PlusTarifficatorPurchase.Type.DEFAULT, null, 95, null);
        List list = a.c;
        if (z) {
            list = kotlin.collections.a.o0(list, plusTarifficatorPurchase);
        }
        jnd0Var.a.a = ind0.a(a, copy$default, list, 25);
    }
}
