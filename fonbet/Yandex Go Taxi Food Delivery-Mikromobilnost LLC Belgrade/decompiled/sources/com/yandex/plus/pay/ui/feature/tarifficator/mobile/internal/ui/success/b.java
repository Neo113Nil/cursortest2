package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.bvf0;
import defpackage.c4v0;
import defpackage.dio;
import defpackage.ds31;
import defpackage.erx0;
import defpackage.eu90;
import defpackage.g8e;
import defpackage.gio;
import defpackage.hzk;
import defpackage.ind0;
import defpackage.jnd0;
import defpackage.jpd0;
import defpackage.k3v0;
import defpackage.kpd0;
import defpackage.m3v0;
import defpackage.mdd0;
import defpackage.omm0;
import defpackage.r3v0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.v3v0;
import defpackage.w3v0;
import defpackage.xvz;
import defpackage.yr31;
import defpackage.zfd0;
import defpackage.zyh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends yr31 {
    public final mdd0 A;
    public final hzk B;
    public final r0 C;
    public final r0 D;
    public final jnd0 b;
    public final k3v0 c;
    public final c4v0 w;
    public final com.yandex.plus.pay.ui.core.api.domain.a x;
    public final jpd0 y;
    public final omm0 z;

    public b(jnd0 jnd0Var, k3v0 k3v0Var, c4v0 c4v0Var, com.yandex.plus.pay.ui.core.api.domain.a aVar, jpd0 jpd0Var, omm0 omm0Var, sls slsVar, mdd0 mdd0Var, hzk hzkVar) {
        this.b = jnd0Var;
        this.c = k3v0Var;
        this.w = c4v0Var;
        this.x = aVar;
        this.y = jpd0Var;
        this.z = omm0Var;
        this.A = mdd0Var;
        this.B = hzkVar;
        v3v0 v3v0Var = v3v0.a;
        r0 c = bvf0.c(v3v0Var);
        this.C = c;
        this.D = c;
        jnd0Var.a.a();
        kpd0 kpd0Var = (kpd0) jpd0Var;
        ind0 a = kpd0Var.a.a();
        PlusTarifficatorPurchase c2 = a.c();
        PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c2.getOffer());
        String paymentMethodId = c2.getPaymentMethodId();
        if (a2 != null) {
            eu90 eu90Var = kpd0Var.b;
            String d = dio.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = c2.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            id = id == null ? "no_value" : id;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = c2.getOffer().getOptionOffers();
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            paymentMethodId = paymentMethodId == null ? "no_value" : paymentMethodId;
            boolean z = c2.getType() == PlusTarifficatorPurchase.Type.SILENT;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
            t.put("silent", String.valueOf(z));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PaymentProcess.SuccessScreen.Shown", t);
        }
        zfd0 zfd0Var = kpd0Var.c;
        PlusPayCompositeOffers.Offer offer = c2.getOffer();
        gio gioVar = ((erx0) zfd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Success.Start", x);
        if (!((Boolean) slsVar.invoke()).booleanValue()) {
            X();
            return;
        }
        r0 r0Var = this.C;
        r0Var.getClass();
        r0Var.m(null, v3v0Var);
        tje.N(ds31.a(this), null, null, new SuccessViewModel$showWebSuccess$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        ind0 a = this.b.a.a();
        kpd0 kpd0Var = (kpd0) this.y;
        kpd0Var.getClass();
        PlusTarifficatorPurchase c = a.c();
        zfd0 zfd0Var = kpd0Var.c;
        PlusPayCompositeOffers.Offer offer = c.getOffer();
        gio gioVar = ((erx0) zfd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Success.Stop", x);
    }

    public final void W() {
        ind0 a = this.b.a.a();
        String a2 = this.z.a(zyh0.PlusPay_Success_Button);
        kpd0 kpd0Var = (kpd0) this.y;
        kpd0Var.getClass();
        PlusTarifficatorPurchase c = a.c();
        PayUIEvgenAnalytics$PaymentOption a3 = dio.a(c.getOffer());
        String paymentMethodId = c.getPaymentMethodId();
        if (a3 != null) {
            eu90 eu90Var = kpd0Var.b;
            String d = dio.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = c.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = c.getOffer().getOptionOffers();
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            if (paymentMethodId == null) {
                paymentMethodId = "no_value";
            }
            boolean z = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a3, t, "payment_option", "payment_method_id", paymentMethodId);
            t.put("button_text", a2);
            t.put("silent", String.valueOf(z));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PaymentProcess.SuccessScreen.ContinueButton.Clicked", t);
        }
        ((m3v0) this.c).b(SuccessFlowScreen.SUCCESS);
    }

    public final void X() {
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreen;
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreen2;
        List<PlusPayCompositeOfferDetails.OptionOfferDetails> optionOffersDetails;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffDetails;
        PlusPayCompositeOfferDetails offerDetails = this.b.a.a().c().getOfferDetails();
        ArrayList arrayList = new ArrayList();
        if (offerDetails != null && (tariffDetails = offerDetails.getTariffDetails()) != null) {
            arrayList.add(new PlusThemedImage(tariffDetails.getLightImageUrl(), tariffDetails.getDarkImageUrl()));
        }
        if (offerDetails != null && (optionOffersDetails = offerDetails.getOptionOffersDetails()) != null) {
            for (PlusPayCompositeOfferDetails.OptionOfferDetails optionOfferDetails : optionOffersDetails) {
                arrayList.add(new PlusThemedImage(optionOfferDetails.getLightImageUrl(), optionOfferDetails.getDarkImageUrl()));
            }
        }
        String title = (offerDetails == null || (successScreen2 = offerDetails.getSuccessScreen()) == null) ? null : successScreen2.getTitle();
        if (title == null) {
            title = "";
        }
        String message = (offerDetails == null || (successScreen = offerDetails.getSuccessScreen()) == null) ? null : successScreen.getMessage();
        w3v0 w3v0Var = new w3v0(new r3v0(title, message != null ? message : "", this.z.a(zyh0.PlusPay_Success_Button), arrayList));
        r0 r0Var = this.C;
        r0Var.getClass();
        r0Var.m(null, w3v0Var);
    }
}
