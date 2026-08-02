package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.agd0;
import defpackage.be21;
import defpackage.but0;
import defpackage.bvf0;
import defpackage.cpd0;
import defpackage.dio;
import defpackage.dod0;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.frx0;
import defpackage.g8e;
import defpackage.gio;
import defpackage.hzk;
import defpackage.ind0;
import defpackage.jnd0;
import defpackage.k3v0;
import defpackage.m3v0;
import defpackage.mdd0;
import defpackage.me21;
import defpackage.ne21;
import defpackage.nfd0;
import defpackage.ny61;
import defpackage.omm0;
import defpackage.ond0;
import defpackage.opd0;
import defpackage.ppd0;
import defpackage.qpd0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u7d0;
import defpackage.wr60;
import defpackage.x0u0;
import defpackage.xvz;
import defpackage.yr31;
import defpackage.zyh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends yr31 {
    public final hzk A;
    public final x0u0 B;
    public final opd0 C;
    public final qpd0 D;
    public boolean E;
    public boolean F;
    public PlusPayCompositeUpsale G;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.a H;
    public final r0 I;
    public final r0 J;
    public final ond0 b;
    public final jnd0 c;
    public final dod0 w;
    public final k3v0 x;
    public final omm0 y;
    public final cpd0 z;

    public b(ond0 ond0Var, jnd0 jnd0Var, dod0 dod0Var, k3v0 k3v0Var, omm0 omm0Var, cpd0 cpd0Var, hzk hzkVar, x0u0 x0u0Var, opd0 opd0Var, qpd0 qpd0Var, mdd0 mdd0Var, nfd0 nfd0Var, u7d0 u7d0Var) {
        this.b = ond0Var;
        this.c = jnd0Var;
        this.w = dod0Var;
        this.x = k3v0Var;
        this.y = omm0Var;
        this.z = cpd0Var;
        this.A = hzkVar;
        this.B = x0u0Var;
        this.C = opd0Var;
        this.D = qpd0Var;
        this.H = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.a(ds31.a(this), nfd0Var, u7d0Var, mdd0Var);
        r0 c = bvf0.c(me21.a);
        this.I = c;
        this.J = c;
        ind0 a = jnd0Var.a.a();
        tje.N(ds31.a(this), null, null, new UpsaleViewModel$setContentState$1(this, a.b(), a, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(b bVar, PlusPayCompositeUpsale plusPayCompositeUpsale, ContinuationImpl continuationImpl) {
        UpsaleViewModel$createUpsaleContent$1 upsaleViewModel$createUpsaleContent$1;
        int i;
        String title;
        String subtitle;
        String offerText;
        String str;
        String str2;
        CharSequence charSequence;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList2;
        String str8;
        bVar.getClass();
        if (continuationImpl instanceof UpsaleViewModel$createUpsaleContent$1) {
            upsaleViewModel$createUpsaleContent$1 = (UpsaleViewModel$createUpsaleContent$1) continuationImpl;
            int i2 = upsaleViewModel$createUpsaleContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upsaleViewModel$createUpsaleContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upsaleViewModel$createUpsaleContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upsaleViewModel$createUpsaleContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    title = plusPayCompositeUpsale.getTemplate().getTitle();
                    subtitle = plusPayCompositeUpsale.getTemplate().getSubtitle();
                    offerText = plusPayCompositeUpsale.getTemplate().getOfferText();
                    String additionalOfferText = plusPayCompositeUpsale.getTemplate().getAdditionalOfferText();
                    String rejectButtonText = plusPayCompositeUpsale.getTemplate().getRejectButtonText();
                    String acceptButtonText = plusPayCompositeUpsale.getTemplate().getAcceptButtonText();
                    List<String> benefits = plusPayCompositeUpsale.getTemplate().getBenefits();
                    ArrayList arrayList3 = new ArrayList(tcc.n(benefits, 10));
                    Iterator it = benefits.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new wr60((CharSequence) it.next()));
                    }
                    String mobileUrl = plusPayCompositeUpsale.getTemplate().getMainImage().getMobileUrl();
                    PlusPayLegalInfo legalInfo = plusPayCompositeUpsale.getOffer().getLegalInfo();
                    if (legalInfo == null) {
                        str = additionalOfferText;
                        str2 = rejectButtonText;
                        charSequence = null;
                        str3 = acceptButtonText;
                        str4 = mobileUrl;
                        arrayList = arrayList3;
                        return new be21(title, subtitle, offerText, str, str2, str3, arrayList, str4, charSequence);
                    }
                    cpd0 cpd0Var = bVar.z;
                    PlusPayRichText fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo);
                    but0 but0Var = new but0(28, bVar);
                    upsaleViewModel$createUpsaleContent$1.L$0 = null;
                    upsaleViewModel$createUpsaleContent$1.L$1 = null;
                    upsaleViewModel$createUpsaleContent$1.L$2 = title;
                    upsaleViewModel$createUpsaleContent$1.L$3 = subtitle;
                    upsaleViewModel$createUpsaleContent$1.L$4 = offerText;
                    upsaleViewModel$createUpsaleContent$1.L$5 = additionalOfferText;
                    upsaleViewModel$createUpsaleContent$1.L$6 = rejectButtonText;
                    upsaleViewModel$createUpsaleContent$1.L$7 = acceptButtonText;
                    upsaleViewModel$createUpsaleContent$1.L$8 = arrayList3;
                    upsaleViewModel$createUpsaleContent$1.L$9 = mobileUrl;
                    upsaleViewModel$createUpsaleContent$1.I$0 = 0;
                    upsaleViewModel$createUpsaleContent$1.label = 1;
                    Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(fromLegalInfo, but0Var, upsaleViewModel$createUpsaleContent$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str5 = additionalOfferText;
                    str6 = rejectButtonText;
                    str7 = acceptButtonText;
                    arrayList2 = arrayList3;
                    obj = a;
                    str8 = mobileUrl;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str8 = (String) upsaleViewModel$createUpsaleContent$1.L$9;
                    ?? r3 = (List) upsaleViewModel$createUpsaleContent$1.L$8;
                    str7 = (String) upsaleViewModel$createUpsaleContent$1.L$7;
                    str6 = (String) upsaleViewModel$createUpsaleContent$1.L$6;
                    str5 = (String) upsaleViewModel$createUpsaleContent$1.L$5;
                    offerText = (String) upsaleViewModel$createUpsaleContent$1.L$4;
                    subtitle = (String) upsaleViewModel$createUpsaleContent$1.L$3;
                    title = (String) upsaleViewModel$createUpsaleContent$1.L$2;
                    kotlin.b.b(obj);
                    arrayList2 = r3;
                }
                str4 = str8;
                charSequence = (CharSequence) obj;
                arrayList = arrayList2;
                str3 = str7;
                str2 = str6;
                str = str5;
                return new be21(title, subtitle, offerText, str, str2, str3, arrayList, str4, charSequence);
            }
        }
        upsaleViewModel$createUpsaleContent$1 = new UpsaleViewModel$createUpsaleContent$1(bVar, continuationImpl);
        Object obj2 = upsaleViewModel$createUpsaleContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upsaleViewModel$createUpsaleContent$1.label;
        if (i != 0) {
        }
        str4 = str8;
        charSequence = (CharSequence) obj2;
        arrayList = arrayList2;
        str3 = str7;
        str2 = str6;
        str = str5;
        return new be21(title, subtitle, offerText, str, str2, str3, arrayList, str4, charSequence);
    }

    public static final void X(b bVar, be21 be21Var) {
        bVar.H.b();
        r0 r0Var = bVar.I;
        omm0 omm0Var = bVar.y;
        ne21 ne21Var = new ne21(be21Var, omm0Var.a(zyh0.PlusPay_Payment_Loader_ProcessingOrder_Title), omm0Var.a(zyh0.PlusPay_Payment_Loader_ProcessingOrder_Subtitle));
        r0Var.getClass();
        r0Var.m(null, ne21Var);
    }

    @Override // defpackage.yr31
    public final void V() {
        PlusPayCompositeUpsale plusPayCompositeUpsale = this.G;
        if (plusPayCompositeUpsale != null) {
            ind0 a = this.c.a.a();
            boolean z = this.F;
            opd0 opd0Var = this.C;
            if (!z) {
                ppd0 ppd0Var = (ppd0) opd0Var;
                ppd0Var.getClass();
                PlusTarifficatorPurchase c = a.c();
                PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c.getOffer());
                String paymentMethodId = c.getPaymentMethodId();
                if (a2 != null) {
                    eu90 eu90Var = ppd0Var.a;
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
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale.getOffer().getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    String str = id2 != null ? id2 : "no_value";
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale.getOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    boolean z2 = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
                    xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                    xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
                    t.put("card_linked", String.valueOf(false));
                    t.put("upsale_product_id", str);
                    t.put("upsale_options_id", arrayList2);
                    t.put("silent", String.valueOf(z2));
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("Upsale.Cancelled", t);
                }
            }
            agd0 agd0Var = ((ppd0) opd0Var).b;
            PlusPayCompositeOffers.Offer offer = plusPayCompositeUpsale.getOffer();
            gio gioVar = ((frx0) agd0Var).a;
            String sessionId = offer.getMeta().getSessionId();
            gioVar.getClass();
            LinkedHashMap x = g8e.x("session_id", sessionId);
            x.put("_meta", gio.a(new HashMap()));
            gioVar.e("PlusPayment.Step.Upsale.Stop", x);
        }
    }

    public final void Y() {
        this.H.b();
        ((m3v0) this.x).b(SuccessFlowScreen.UPSALE);
    }
}
