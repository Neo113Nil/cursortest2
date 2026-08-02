package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$MailingAdsAgreementStatus;
import defpackage.PayUIEvgenAnalytics$MailingAdsAgreementTextLogic;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.fnd0;
import defpackage.gnd0;
import defpackage.hnd0;
import defpackage.ind0;
import defpackage.mjb;
import defpackage.omb;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$4 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m335invoke() {
        d dVar = (d) this.receiver;
        mjb a = ((omb) dVar.U.a.getValue()).a();
        pzt0 pzt0Var = dVar.R;
        if ((pzt0Var == null || !pzt0Var.isActive()) && a != null) {
            ind0 a2 = dVar.c.a.a();
            PlusTarifficatorPurchase plusTarifficatorPurchase = a2.b;
            PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) dVar.O.getValue();
            fnd0 fnd0Var = dVar.G;
            String str = a.i;
            hnd0 hnd0Var = (hnd0) fnd0Var;
            hnd0Var.getClass();
            PayUIEvgenAnalytics$PaymentOption a3 = dio.a(plusTarifficatorPurchase.getOffer());
            String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
            PlusPayMailingAdsAgreement.Status status = plusPayMailingAdsAgreement != null ? (plusPayMailingAdsAgreement.isAgreementsChecked() && plusPayMailingAdsAgreement.getTextLogic() == PlusPayMailingAdsAgreement.TextLogic.DIRECT) ? PlusPayMailingAdsAgreement.Status.ALLOW : (plusPayMailingAdsAgreement.isAgreementsChecked() || plusPayMailingAdsAgreement.getTextLogic() != PlusPayMailingAdsAgreement.TextLogic.INVERTED) ? PlusPayMailingAdsAgreement.Status.REFUSE : PlusPayMailingAdsAgreement.Status.ALLOW : null;
            if (a3 != null) {
                eu90 eu90Var = hnd0Var.a;
                String d = dio.d(a2.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                if (id == null) {
                    id = "no_value";
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                if (paymentMethodId == null) {
                    paymentMethodId = "no_value";
                }
                int i = status == null ? -1 : gnd0.a[status.ordinal()];
                PayUIEvgenAnalytics$MailingAdsAgreementStatus payUIEvgenAnalytics$MailingAdsAgreementStatus = i != 1 ? i != 2 ? PayUIEvgenAnalytics$MailingAdsAgreementStatus.NotShown : PayUIEvgenAnalytics$MailingAdsAgreementStatus.Refuse : PayUIEvgenAnalytics$MailingAdsAgreementStatus.Allow;
                PlusPayMailingAdsAgreement.TextLogic textLogic = plusPayMailingAdsAgreement != null ? plusPayMailingAdsAgreement.getTextLogic() : null;
                int i2 = textLogic != null ? gnd0.b[textLogic.ordinal()] : -1;
                PayUIEvgenAnalytics$MailingAdsAgreementTextLogic payUIEvgenAnalytics$MailingAdsAgreementTextLogic = i2 != 1 ? i2 != 2 ? PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.Unknown : PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.Inverted : PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.Direct;
                LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
                xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                xvz.x(a3, t, "payment_option", "payment_method_id", paymentMethodId);
                t.put("button_text", str);
                t.put("mailing_ads_agreement_status", payUIEvgenAnalytics$MailingAdsAgreementStatus.getEventValue());
                t.put("mailing_ads_agreement_text_logic", payUIEvgenAnalytics$MailingAdsAgreementTextLogic.getEventValue());
                t.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("Checkout.Button.Clicked", t);
            }
            dVar.a0(a2);
            dVar.R = tje.N(ds31.a(dVar), null, null, new CheckoutViewModel$onPaymentButtonClick$1(plusTarifficatorPurchase, dVar, a2, null), 3);
        }
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m335invoke();
        return zy11.a;
    }
}
