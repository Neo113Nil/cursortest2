package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.dio;
import defpackage.eu90;
import defpackage.fnd0;
import defpackage.hnd0;
import defpackage.ind0;
import defpackage.sls;
import defpackage.tcc;
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
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$5 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        fnd0 fnd0Var = dVar.G;
        ind0 a = dVar.c.a.a();
        hnd0 hnd0Var = (hnd0) fnd0Var;
        hnd0Var.getClass();
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PayUIEvgenAnalytics$PaymentOption a2 = dio.a(plusTarifficatorPurchase.getOffer());
        String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
        if (a2 != null) {
            eu90 eu90Var = hnd0Var.a;
            String d = dio.d(a.a);
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
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            t.put("payment_option", a2.getEventValue());
            t.put("payment_method_id", paymentMethodId);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("Checkout.Close.Clicked", t);
        }
        dVar.b0();
        return zy11.a;
    }
}
