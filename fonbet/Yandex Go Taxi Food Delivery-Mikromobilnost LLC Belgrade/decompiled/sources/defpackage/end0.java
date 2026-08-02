package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class end0 implements fod0 {
    public final eu90 a;

    public end0(eu90 eu90Var) {
        this.a = eu90Var;
    }

    public static boolean d(ind0 ind0Var) {
        PlusTarifficatorPurchase c = ind0Var.c();
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        if (!jl40.l(plusTarifficatorPurchase.getOffer(), c.getOffer())) {
            plusTarifficatorPurchase = null;
        }
        if (plusTarifficatorPurchase != null) {
            c = plusTarifficatorPurchase;
        }
        return c.getType() == PlusTarifficatorPurchase.Type.SILENT;
    }

    @Override // defpackage.fod0
    public final zy11 a(ind0 ind0Var, uod0 uod0Var) {
        if (uod0Var instanceof sod0) {
            e(ind0Var);
        } else if (uod0Var instanceof rod0) {
            e(ind0Var);
        } else if (!(uod0Var instanceof ood0) && !(uod0Var instanceof tod0) && !(uod0Var instanceof qod0) && !(uod0Var instanceof pod0) && !(uod0Var instanceof nod0)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    @Override // defpackage.fod0
    public final void b(ind0 ind0Var) {
        PlusTarifficatorPurchase plusTarifficatorPurchase;
        UUID uuid;
        PlusPayCompositeOfferDetails offerDetails;
        PlusTarifficatorPurchase plusTarifficatorPurchase2 = ind0Var.b;
        UUID uuid2 = ind0Var.a;
        xz4 b = dio.b(plusTarifficatorPurchase2.getSource(), ind0Var.d);
        PayUIEvgenAnalytics$PaymentOption a = dio.a(plusTarifficatorPurchase2.getOffer());
        String paymentMethodId = plusTarifficatorPurchase2.getPaymentMethodId();
        PlusPayCompositeOfferDetails.PaymentMethod a2 = (paymentMethodId == null || (offerDetails = plusTarifficatorPurchase2.getOfferDetails()) == null) ? null : rld.a(offerDetails, paymentMethodId);
        eu90 eu90Var = this.a;
        if (a != null) {
            String d = dio.d(uuid2);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase2.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            String str = id == null ? "no_value" : id;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase2.getOffer().getOptionOffers();
            plusTarifficatorPurchase = plusTarifficatorPurchase2;
            uuid = uuid2;
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            if (paymentMethodId == null) {
                paymentMethodId = "no_value";
            }
            String str2 = (String) b.a;
            if (str2 == null) {
                str2 = "no_value";
            }
            String str3 = (String) b.b;
            if (str3 == null) {
                str3 = "no_value";
            }
            PayUIEvgenAnalytics$SourceType e = dio.e(plusTarifficatorPurchase.getSource());
            boolean d2 = d(ind0Var);
            String bankName = a2 != null ? a2.getBankName() : null;
            if (bankName == null) {
                bankName = "no_value";
            }
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", str);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a, t, "payment_option", "payment_method_id", paymentMethodId);
            t.put(Constants.KEY_PAGE, str3);
            t.put("place", str2);
            t.put("source_type", e.getEventValue());
            t.put("bank_name", bankName);
            t.put("silent", String.valueOf(d2));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PaymentProcess.Opened", t);
        } else {
            plusTarifficatorPurchase = plusTarifficatorPurchase2;
            uuid = uuid2;
        }
        if (tpd.b(plusTarifficatorPurchase.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            String d3 = dio.d(uuid);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
            if (id2 == null) {
                id2 = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusTarifficatorPurchase.getOffer().getOptionOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
            Iterator<T> it2 = optionOffers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            LinkedHashMap t2 = xvz.t(eu90Var, "purchase_session_id", d3, "product_id", id2);
            t2.put("options_id", arrayList2);
            t2.put("is_tarifficator", String.valueOf(true));
            t2.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("InAppPayment.Shown", t2);
        }
    }

    @Override // defpackage.fod0
    public final void c(ind0 ind0Var, kod0 kod0Var) {
        String str;
        PlusPayCompositeOfferDetails offerDetails;
        boolean z = kod0Var instanceof jod0;
        eu90 eu90Var = this.a;
        if (z) {
            String str2 = ((jod0) kod0Var).b;
            PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
            xz4 b = dio.b(plusTarifficatorPurchase.getSource(), ind0Var.d);
            PayUIEvgenAnalytics$PaymentOption a = dio.a(plusTarifficatorPurchase.getOffer());
            boolean z2 = tpd.b(plusTarifficatorPurchase.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
            PlusPayCompositeOfferDetails.PaymentMethod a2 = (str2 == null || (offerDetails = plusTarifficatorPurchase.getOfferDetails()) == null) ? null : rld.a(offerDetails, str2);
            if (a != null) {
                String d = dio.d(ind0Var.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                String str3 = id == null ? "no_value" : id;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                String str4 = str2 == null ? z2 ? "in_app" : "no_value" : str2;
                String str5 = (String) b.a;
                if (str5 == null) {
                    str5 = "no_value";
                }
                String str6 = (String) b.b;
                if (str6 == null) {
                    str6 = "no_value";
                }
                PayUIEvgenAnalytics$SourceType e = dio.e(plusTarifficatorPurchase.getSource());
                boolean d2 = d(ind0Var);
                String bankName = a2 != null ? a2.getBankName() : null;
                str = bankName != null ? bankName : "no_value";
                LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", str3);
                xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                xvz.x(a, t, "payment_option", "payment_method_id", str4);
                t.put(Constants.KEY_PAGE, str6);
                t.put("place", str5);
                t.put("source_type", e.getEventValue());
                t.put("bank_name", str);
                t.put("silent", String.valueOf(d2));
                t.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("PaymentProcess.Success", t);
                return;
            }
            return;
        }
        if (!(kod0Var instanceof iod0)) {
            if (!(kod0Var instanceof hod0)) {
                w511.b();
                return;
            }
            PlusTarifficatorPurchase plusTarifficatorPurchase2 = ind0Var.b;
            if (tpd.b(plusTarifficatorPurchase2.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                String d3 = dio.d(ind0Var.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
                String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                str = id2 != null ? id2 : "no_value";
                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
                ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                Iterator<T> it2 = optionOffers2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                }
                LinkedHashMap t2 = xvz.t(eu90Var, "purchase_session_id", d3, "product_id", str);
                t2.put("options_id", arrayList2);
                t2.put("is_tarifficator", String.valueOf(true));
                t2.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("InAppPayment.Cancelled", t2);
                return;
            }
            return;
        }
        PlusPaymentFlowErrorReason plusPaymentFlowErrorReason = ((iod0) kod0Var).a;
        PlusTarifficatorPurchase plusTarifficatorPurchase3 = ind0Var.b;
        xz4 b2 = dio.b(plusTarifficatorPurchase3.getSource(), ind0Var.d);
        PayUIEvgenAnalytics$PaymentOption a3 = dio.a(plusTarifficatorPurchase3.getOffer());
        String paymentMethodId = plusTarifficatorPurchase3.getPaymentMethodId();
        if (a3 != null) {
            String d4 = dio.d(ind0Var.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = plusTarifficatorPurchase3.getOffer().getTariffOffer();
            String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
            String str7 = id3 == null ? "no_value" : id3;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = plusTarifficatorPurchase3.getOffer().getOptionOffers();
            ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers3, 10));
            Iterator<T> it3 = optionOffers3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
            }
            String str8 = paymentMethodId == null ? "no_value" : paymentMethodId;
            String c = dio.c(plusPaymentFlowErrorReason);
            String str9 = (String) b2.a;
            String str10 = str9 == null ? "no_value" : str9;
            String str11 = (String) b2.b;
            this.a.e(d4, str7, arrayList3, a3, str8, c, str11 == null ? "no_value" : str11, str10, dio.e(plusTarifficatorPurchase3.getSource()), d(ind0Var));
        }
    }

    public final void e(ind0 ind0Var) {
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        PayUIEvgenAnalytics$PaymentOption a = dio.a(plusTarifficatorPurchase.getOffer());
        String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
        if (a != null) {
            String d = dio.d(ind0Var.a);
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
            boolean d2 = d(ind0Var);
            eu90 eu90Var = this.a;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a, t, "payment_option", "payment_method_id", paymentMethodId);
            t.put("silent", String.valueOf(d2));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PaymentProcess.Loader.Shown", t);
        }
    }
}
