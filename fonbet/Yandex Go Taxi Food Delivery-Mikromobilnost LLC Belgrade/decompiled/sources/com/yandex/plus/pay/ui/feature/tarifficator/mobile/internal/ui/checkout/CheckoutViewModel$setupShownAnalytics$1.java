package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$MailingAdsAgreementStatus;
import defpackage.PayUIEvgenAnalytics$MailingAdsAgreementTextLogic;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.cvu0;
import defpackage.dio;
import defpackage.eu90;
import defpackage.fnd0;
import defpackage.g8e;
import defpackage.gio;
import defpackage.gnd0;
import defpackage.hnd0;
import defpackage.ind0;
import defpackage.mjb;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pb;
import defpackage.pfd0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tqx0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wqx0;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutViewModel$setupShownAnalytics$1", f = "CheckoutViewModel.kt", l = {410}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CheckoutViewModel$setupShownAnalytics$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$setupShownAnalytics$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutViewModel$setupShownAnalytics$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutViewModel$setupShownAnalytics$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y;
        mjb mjbVar;
        Object obj2;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails;
        List<PlusPayAdditionalOffer> offers;
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups;
        int i;
        Iterator it;
        PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption;
        PlusPayRichText subtitleText;
        PlusPayRichText badgeText;
        PlusPayRichText promoLegalInfo;
        PlusPayLegalInfo legalInfo;
        PlusPayRichText fromLegalInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(new pb(this.this$0.U, 28), 6);
            this.label = 1;
            y = e.y(mthVar, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            y = obj;
        }
        mjb mjbVar2 = (mjb) y;
        ind0 a = this.this$0.c.a.a();
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) this.this$0.O.getValue();
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = (PlusPayCompositeOfferDetails) this.this$0.N.getValue();
        hnd0 hnd0Var = (hnd0) this.this$0.G;
        hnd0Var.getClass();
        PayUIEvgenAnalytics$PaymentOption a2 = dio.a(plusTarifficatorPurchase.getOffer());
        String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
        ListBuilder a3 = rcc.a();
        PlusPayCompositeOfferDetails offerDetails = plusTarifficatorPurchase.getOfferDetails();
        if (offerDetails != null && (legalInfo = offerDetails.getLegalInfo()) != null && (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) != null) {
            a3.add(com.yandex.plus.pay.ui.common.api.utils.a.c(fromLegalInfo));
        }
        if (offerDetails != null && (promoLegalInfo = offerDetails.getPromoLegalInfo()) != null) {
            if (!((Boolean) hnd0Var.d.invoke()).booleanValue()) {
                promoLegalInfo = null;
            }
            if (promoLegalInfo != null) {
                a3.add(com.yandex.plus.pay.ui.common.api.utils.a.c(promoLegalInfo));
            }
        }
        ListBuilder j = a3.j();
        if (a2 != null) {
            eu90 eu90Var = hnd0Var.a;
            String d = dio.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
            String str = id == null ? "no_value" : id;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
            mjbVar = mjbVar2;
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it2 = optionOffers.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            String str2 = paymentMethodId == null ? "no_value" : paymentMethodId;
            PlusPayMailingAdsAgreement.Status defaultAgreementStatus = plusPayMailingAdsAgreement != null ? plusPayMailingAdsAgreement.getDefaultAgreementStatus() : null;
            int i3 = defaultAgreementStatus == null ? -1 : gnd0.a[defaultAgreementStatus.ordinal()];
            PayUIEvgenAnalytics$MailingAdsAgreementStatus payUIEvgenAnalytics$MailingAdsAgreementStatus = i3 != 1 ? i3 != 2 ? PayUIEvgenAnalytics$MailingAdsAgreementStatus.NotShown : PayUIEvgenAnalytics$MailingAdsAgreementStatus.Refuse : PayUIEvgenAnalytics$MailingAdsAgreementStatus.Allow;
            PlusPayMailingAdsAgreement.TextLogic textLogic = plusPayMailingAdsAgreement != null ? plusPayMailingAdsAgreement.getTextLogic() : null;
            int i4 = textLogic == null ? -1 : gnd0.b[textLogic.ordinal()];
            PayUIEvgenAnalytics$MailingAdsAgreementStatus payUIEvgenAnalytics$MailingAdsAgreementStatus2 = payUIEvgenAnalytics$MailingAdsAgreementStatus;
            PayUIEvgenAnalytics$MailingAdsAgreementTextLogic payUIEvgenAnalytics$MailingAdsAgreementTextLogic = i4 != 1 ? i4 != 2 ? PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.Unknown : PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.Inverted : PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.Direct;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", str);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a2, t, "payment_option", "payment_method_id", str2);
            t.put("mailing_ads_agreement_status", payUIEvgenAnalytics$MailingAdsAgreementStatus2.getEventValue());
            t.put("mailing_ads_agreement_text_logic", payUIEvgenAnalytics$MailingAdsAgreementTextLogic.getEventValue());
            t.put("legal_text", j);
            obj2 = "_meta";
            t.put(obj2, eu90.c(new HashMap()));
            eu90Var.f("Checkout.Shown", t);
            hnd0Var = hnd0Var;
        } else {
            mjbVar = mjbVar2;
            obj2 = "_meta";
            plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
        }
        pfd0 pfd0Var = hnd0Var.b;
        PlusPayCompositeOffers.Offer offer = plusTarifficatorPurchase.getOffer();
        gio gioVar = ((tqx0) pfd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        String str3 = "session_id";
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put(obj2, gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Checkout.Start", x);
        if (!mjbVar.c.isEmpty() && plusPayCompositeOfferDetails != null && (paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups()) != null) {
            d dVar = this.this$0;
            Iterator it3 = paymentMethodsGroups.iterator();
            while (it3.hasNext()) {
                PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) it3.next();
                fnd0 fnd0Var = dVar.G;
                ind0 a4 = dVar.c.a.a();
                hnd0 hnd0Var2 = (hnd0) fnd0Var;
                eu90 eu90Var2 = hnd0Var2.a;
                UUID uuid = a4.a;
                PlusTarifficatorPurchase plusTarifficatorPurchase2 = a4.b;
                Iterator it4 = it3;
                List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
                d dVar2 = dVar;
                ArrayList arrayList2 = new ArrayList(tcc.n(paymentMethods, 10));
                Iterator<T> it5 = paymentMethods.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOfferDetails.PaymentMethod) it5.next()).getId());
                }
                PayUIEvgenAnalytics$PaymentOption a5 = dio.a(plusTarifficatorPurchase2.getOffer());
                eu90 eu90Var3 = hnd0Var2.a;
                String d2 = dio.d(uuid);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
                String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                String str4 = id2 == null ? "no_value" : id2;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
                ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers2, 10));
                Iterator<T> it6 = optionOffers2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it6.next()).getId());
                }
                if (arrayList2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it7 = arrayList2.iterator();
                    i = 0;
                    while (it7.hasNext()) {
                        ArrayList arrayList4 = arrayList3;
                        Iterator it8 = it7;
                        if (!cvu0.x((String) it7.next(), "new", false) && (i = i + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                        it7 = it8;
                        arrayList3 = arrayList4;
                    }
                }
                eu90Var3.d(d2, str4, arrayList3, i > 0, arrayList2);
                ArrayList arrayList5 = arrayList2;
                Iterator it9 = paymentMethodsGroup.getPaymentMethods().iterator();
                while (it9.hasNext()) {
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) it9.next();
                    PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset = paymentMethod.getButtonAsset();
                    Iterator it10 = it9;
                    String d3 = dio.d(uuid);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
                    String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                    String str5 = id3 == null ? "no_value" : id3;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
                    ArrayList arrayList6 = arrayList5;
                    PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption2 = a5;
                    String str6 = str3;
                    ArrayList arrayList7 = new ArrayList(tcc.n(optionOffers3, 10));
                    Iterator<T> it11 = optionOffers3.iterator();
                    while (it11.hasNext()) {
                        arrayList7.add(((PlusPayCompositeOffers.Offer.Option) it11.next()).getId());
                    }
                    boolean z = !cvu0.x(paymentMethod.getId(), "new", false);
                    String id4 = paymentMethod.getId();
                    String c = (buttonAsset == null || (badgeText = buttonAsset.getBadgeText()) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.a.c(badgeText);
                    String str7 = c == null ? "no_value" : c;
                    String c2 = (buttonAsset == null || (subtitleText = buttonAsset.getSubtitleText()) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.a.c(subtitleText);
                    String str8 = c2 == null ? "no_value" : c2;
                    LinkedHashMap t2 = xvz.t(eu90Var2, "purchase_session_id", d3, "product_id", str5);
                    xvz.A(t2, "options_id", arrayList7, true, "is_tarifficator");
                    t2.put("card_linked", String.valueOf(z));
                    t2.put("payment_method_id", id4);
                    t2.put("promo_text", str7);
                    t2.put("info_text", str8);
                    t2.put(obj2, eu90.c(new HashMap()));
                    eu90Var2.f("PaymentMethod.Shown", t2);
                    it9 = it10;
                    str3 = str6;
                    a5 = payUIEvgenAnalytics$PaymentOption2;
                    arrayList5 = arrayList6;
                }
                PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption3 = a5;
                ArrayList arrayList8 = arrayList5;
                String str9 = str3;
                List<PlusPayCompositeOfferDetails.PaymentPromo> paymentPromos = paymentMethodsGroup.getPaymentPromos();
                if (!((Boolean) hnd0Var2.d.invoke()).booleanValue()) {
                    paymentPromos = null;
                }
                if (paymentPromos != null) {
                    Iterator it12 = paymentPromos.iterator();
                    while (it12.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentPromo paymentPromo = (PlusPayCompositeOfferDetails.PaymentPromo) it12.next();
                        if (payUIEvgenAnalytics$PaymentOption3 != null) {
                            String d4 = dio.d(uuid);
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
                            String id5 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                            if (id5 == null) {
                                id5 = "no_value";
                            }
                            List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
                            it = it12;
                            ArrayList arrayList9 = new ArrayList(tcc.n(optionOffers4, 10));
                            Iterator<T> it13 = optionOffers4.iterator();
                            while (it13.hasNext()) {
                                arrayList9.add(((PlusPayCompositeOffers.Offer.Option) it13.next()).getId());
                            }
                            String paymentMethodId2 = paymentPromo.getPaymentMethodId();
                            if (paymentMethodId2 == null) {
                                paymentMethodId2 = "no_value";
                            }
                            String c3 = com.yandex.plus.pay.ui.common.api.utils.a.c(paymentPromo.getBenefitTitle());
                            PlusPayRichText additionalTitle = paymentPromo.getAdditionalTitle();
                            String c4 = additionalTitle != null ? com.yandex.plus.pay.ui.common.api.utils.a.c(additionalTitle) : null;
                            if (c4 == null) {
                                c4 = "no_value";
                            }
                            LinkedHashMap t3 = xvz.t(eu90Var2, "purchase_session_id", d4, "product_id", id5);
                            xvz.A(t3, "options_id", arrayList9, true, "is_tarifficator");
                            payUIEvgenAnalytics$PaymentOption = payUIEvgenAnalytics$PaymentOption3;
                            xvz.x(payUIEvgenAnalytics$PaymentOption, t3, "payment_option", "payment_method_id", paymentMethodId2);
                            t3.put("title_text", c3);
                            t3.put("subtitle_text", c4);
                            t3.put(obj2, eu90.c(new HashMap()));
                            eu90Var2.f("Checkout.PromoCard.Shown", t3);
                        } else {
                            it = it12;
                            payUIEvgenAnalytics$PaymentOption = payUIEvgenAnalytics$PaymentOption3;
                        }
                        payUIEvgenAnalytics$PaymentOption3 = payUIEvgenAnalytics$PaymentOption;
                        it12 = it;
                    }
                }
                pfd0 pfd0Var2 = hnd0Var2.b;
                PlusPayCompositeOffers.Offer offer2 = plusTarifficatorPurchase2.getOffer();
                gio gioVar2 = ((tqx0) pfd0Var2).a;
                String sessionId2 = offer2.getMeta().getSessionId();
                gioVar2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(str9, sessionId2);
                linkedHashMap.put("payment_methods_id", arrayList8);
                linkedHashMap.put(obj2, gio.a(new HashMap()));
                gioVar2.e("PlusPayment.PaymentMethods.Show", linkedHashMap);
                str3 = str9;
                it3 = it4;
                dVar = dVar2;
            }
        }
        PlusPayAdditionalOffers additionalOffers = plusPayCompositeOfferDetails != null ? plusPayCompositeOfferDetails.getAdditionalOffers() : null;
        if (additionalOffers != null && (offers = additionalOffers.getOffers()) != null) {
            d dVar3 = this.this$0;
            int i5 = 0;
            for (Object obj3 : offers) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                PlusPayAdditionalOffer plusPayAdditionalOffer = (PlusPayAdditionalOffer) obj3;
                if (dVar3.S.add(plusPayAdditionalOffer.getOffer().getOfferName())) {
                    ((wqx0) ((hnd0) dVar3.G).c).f(i5, plusTarifficatorPurchase.getOffer().getMeta().getSessionId(), plusPayAdditionalOffer.getOffer().getOffersBatchId(), plusPayAdditionalOffer.getOffer().getPositionId(), "onsale_offer", "checkout_onsale_page", null, kotlin.collections.b.f());
                }
                i5 = i6;
            }
        }
        return zy11.a;
    }
}
