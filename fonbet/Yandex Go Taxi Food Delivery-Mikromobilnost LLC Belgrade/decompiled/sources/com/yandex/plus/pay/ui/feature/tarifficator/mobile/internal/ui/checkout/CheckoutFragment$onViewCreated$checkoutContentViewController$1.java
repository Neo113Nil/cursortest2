package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.cvu0;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.fnd0;
import defpackage.foc;
import defpackage.h73;
import defpackage.hnd0;
import defpackage.ind0;
import defpackage.jl40;
import defpackage.qld;
import defpackage.rld;
import defpackage.s5r;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$1 extends FunctionReferenceImpl implements tls {
    public final void i(String str) {
        int i;
        Object obj;
        d dVar = (d) this.receiver;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) dVar.N.getValue();
        if (plusPayCompositeOfferDetails == null) {
            return;
        }
        ind0 a = dVar.c.a.a();
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PlusPayCompositeOfferDetails.PaymentMethod a2 = rld.a(plusPayCompositeOfferDetails, str);
        fnd0 fnd0Var = dVar.G;
        List<PlusPayCompositeOfferDetails.PaymentMethod> allPaymentMethods = plusPayCompositeOfferDetails.getAllPaymentMethods();
        ArrayList arrayList = new ArrayList(tcc.n(allPaymentMethods, 10));
        Iterator<T> it = allPaymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCompositeOfferDetails.PaymentMethod) it.next()).getId());
        }
        String bankName = a2 != null ? a2.getBankName() : null;
        eu90 eu90Var = ((hnd0) fnd0Var).a;
        String d = dio.d(a.a);
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
        String id = tariffOffer != null ? tariffOffer.getId() : null;
        if (id == null) {
            id = "no_value";
        }
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
        ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers, 10));
        Iterator<T> it2 = optionOffers.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (!cvu0.x((String) it3.next(), "new", false) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        boolean z = i > 0;
        if (bankName == null) {
            bankName = "no_value";
        }
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
        xvz.A(t, "options_id", arrayList2, true, "is_tarifficator");
        t.put("card_linked", String.valueOf(z));
        t.put("payment_method_id", str);
        t.put("bank_name", bankName);
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("PaymentMethods.Clicked", t);
        s5r s5rVar = new s5r(kotlin.sequences.b.l(new h73(1, plusPayCompositeOfferDetails.getPaymentMethodsGroups()), new foc(9)));
        while (true) {
            if (!s5rVar.hasNext()) {
                obj = null;
                break;
            } else {
                obj = s5rVar.next();
                if (jl40.l(((PlusPayCompositeOfferDetails.PaymentMethod) obj).getId(), str)) {
                    break;
                }
            }
        }
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) obj;
        PlusPayCompositeOfferDetails.PaymentMethod.Type type = paymentMethod != null ? paymentMethod.getType() : null;
        int i2 = type == null ? -1 : qld.a[type.ordinal()];
        if (i2 != -1) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                dVar.a0(a);
                tje.N(ds31.a(dVar), null, null, new CheckoutViewModel$onPaymentMethodClick$2(dVar, plusTarifficatorPurchase, str, plusPayCompositeOfferDetails, a, null), 3);
                return;
            } else if (i2 != 4 && i2 != 5) {
                w511.b();
                return;
            }
        }
        r0 r0Var = dVar.M;
        r0Var.getClass();
        r0Var.m(null, str);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
