package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffersKt;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.internal.model.PlusPayOfferSwitchToggle;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.cpd0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gjb;
import defpackage.h73;
import defpackage.hjb;
import defpackage.ied0;
import defpackage.ijb;
import defpackage.jjb;
import defpackage.jl40;
import defpackage.ked0;
import defpackage.kjb;
import defpackage.kxg0;
import defpackage.ljb;
import defpackage.med0;
import defpackage.mjb;
import defpackage.ny61;
import defpackage.o7f0;
import defpackage.omm0;
import defpackage.p5z;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.scc;
import defpackage.sls;
import defpackage.tbb;
import defpackage.tcc;
import defpackage.teb;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zyh0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final p5z a;
    public final cpd0 b;
    public final omm0 c;
    public final sls d;

    public a(p5z p5zVar, cpd0 cpd0Var, omm0 omm0Var, sls slsVar) {
        this.a = p5zVar;
        this.b = cpd0Var;
        this.c = omm0Var;
        this.d = slsVar;
    }

    public static o7f0 h(PlusPayAdditionalOffer plusPayAdditionalOffer) {
        return new o7f0(plusPayAdditionalOffer.getOffer().getOfferName(), new PlusThemedImage(plusPayAdditionalOffer.getAssets().getLightImageUrl(), plusPayAdditionalOffer.getAssets().getDarkImageUrl()), plusPayAdditionalOffer.getAssets().getText(), plusPayAdditionalOffer.getAssets().getAdditionalText(), plusPayAdditionalOffer.getAssets().getBenefits(), null, false);
    }

    public static o7f0 i(o7f0 o7f0Var, Set set) {
        return o7f0.a(o7f0Var, null, set.contains(o7f0Var.a), 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d0 A[LOOP:1: B:34:0x02ca->B:36:0x02d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, boolean z, PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, String str, tbb tbbVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$createContent$1 checkoutContentFactory$createContent$1;
        int i;
        String a;
        o7f0 i2;
        boolean z2;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2;
        wls wlsVar;
        List list;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement2;
        PlusPayAdditionalOffer plusPayAdditionalOffer;
        List list2;
        String firstPaymentText;
        String str2;
        String str3;
        boolean z3;
        PlusPayAdditionalOffer plusPayAdditionalOffer2;
        List list3;
        List list4;
        gjb gjbVar;
        PlusPayAdditionalOffer plusPayAdditionalOffer3;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails3;
        wls wlsVar2;
        List list5;
        String str4;
        Object b;
        String str5;
        String str6;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails4;
        PlusPayAdditionalOffer plusPayAdditionalOffer4;
        ljb ljbVar;
        Iterator it;
        PlusPayOfferSwitchToggle offerSwitchToggle;
        PlusPayOfferSwitchToggle offerSwitchToggle2;
        ijb ijbVar;
        PlusPayAdditionalOffer.Offer offer;
        if (continuationImpl instanceof CheckoutContentFactory$createContent$1) {
            checkoutContentFactory$createContent$1 = (CheckoutContentFactory$createContent$1) continuationImpl;
            int i3 = checkoutContentFactory$createContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$createContent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$createContent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$createContent$1.label;
                omm0 omm0Var = this.c;
                ijb ijbVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayAdditionalOffer switchOffer = PlusPayAdditionalOffersKt.getSwitchOffer(plusPayCompositeOfferDetails.getAdditionalOffers());
                    a = omm0Var.a(zyh0.PlusPay_Checkout_Title);
                    Set u = kotlin.sequences.b.u(kotlin.sequences.b.l(kotlin.sequences.b.g(new h73(1, plusPayCompositeOfferDetails.getAdditionalOffers().getOffers()), new teb(12)), new teb(13)));
                    if (switchOffer == null || !switchOffer.isSelected()) {
                        PlusPayCompositeOfferDetails.TariffOfferDetails tariffDetails = plusPayCompositeOfferDetails.getTariffDetails();
                        i2 = tariffDetails != null ? i(new o7f0(tariffDetails.getOfferName(), new PlusThemedImage(tariffDetails.getLightImageUrl(), tariffDetails.getDarkImageUrl()), tariffDetails.getTitle(), tariffDetails.getText(), tariffDetails.getAdditionText()), u) : null;
                    } else {
                        i2 = i(h(switchOffer), u);
                    }
                    ListBuilder a2 = rcc.a();
                    if (i2 != null) {
                        a2.add(i2);
                    }
                    for (Iterator it2 = plusPayCompositeOfferDetails.getOptionOffersDetails().iterator(); it2.hasNext(); it2 = it2) {
                        PlusPayCompositeOfferDetails.OptionOfferDetails optionOfferDetails = (PlusPayCompositeOfferDetails.OptionOfferDetails) it2.next();
                        a2.add(i(new o7f0(optionOfferDetails.getOfferName(), new PlusThemedImage(optionOfferDetails.getLightImageUrl(), optionOfferDetails.getDarkImageUrl()), optionOfferDetails.getTitle(), optionOfferDetails.getText(), optionOfferDetails.getAdditionText()), u));
                    }
                    ListBuilder j = a2.j();
                    checkoutContentFactory$createContent$1.L$0 = plusPayCompositeOfferDetails;
                    checkoutContentFactory$createContent$1.L$1 = plusPayMailingAdsAgreement;
                    checkoutContentFactory$createContent$1.L$2 = null;
                    checkoutContentFactory$createContent$1.L$3 = tbbVar;
                    checkoutContentFactory$createContent$1.L$4 = switchOffer;
                    checkoutContentFactory$createContent$1.L$5 = a;
                    checkoutContentFactory$createContent$1.L$6 = j;
                    z2 = z;
                    checkoutContentFactory$createContent$1.Z$0 = z2;
                    checkoutContentFactory$createContent$1.label = 1;
                    Object e = e(plusPayCompositeOfferDetails, str, tbbVar, checkoutContentFactory$createContent$1);
                    if (e != obj2) {
                        plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails;
                        wlsVar = tbbVar;
                        list = j;
                        plusPayMailingAdsAgreement2 = plusPayMailingAdsAgreement;
                        plusPayAdditionalOffer = switchOffer;
                        obj = e;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = checkoutContentFactory$createContent$1.Z$0;
                        gjbVar = (gjb) checkoutContentFactory$createContent$1.L$10;
                        String str7 = (String) checkoutContentFactory$createContent$1.L$9;
                        str3 = (String) checkoutContentFactory$createContent$1.L$8;
                        list3 = (List) checkoutContentFactory$createContent$1.L$7;
                        list4 = (List) checkoutContentFactory$createContent$1.L$6;
                        String str8 = (String) checkoutContentFactory$createContent$1.L$5;
                        plusPayAdditionalOffer4 = (PlusPayAdditionalOffer) checkoutContentFactory$createContent$1.L$4;
                        plusPayCompositeOfferDetails4 = (PlusPayCompositeOfferDetails) checkoutContentFactory$createContent$1.L$0;
                        kotlin.b.b(obj);
                        str5 = str7;
                        str6 = str8;
                        gjb gjbVar2 = gjbVar;
                        String str9 = str3;
                        List list6 = list3;
                        List list7 = list4;
                        List list8 = (List) obj;
                        if (z3) {
                            ljbVar = ijbVar2;
                        } else {
                            Locale locale = this.a.getLocale();
                            ljbVar = new ljb((cvu0.t(locale.getLanguage(), "RU", true) && cvu0.t(locale.getCountry(), "RU", true)) ? kxg0.pay_sdk_pay_logo_ru : kxg0.pay_sdk_pay_logo_en, omm0Var.a(zyh0.PlusPay_Checkout_YPay_PaymentVia));
                        }
                        String a3 = omm0Var.a(zyh0.PlusPay_Checkout_PurchaseButton_Title);
                        List<PlusPayAdditionalOffer> offers = plusPayCompositeOfferDetails4.getAdditionalOffers().getOffers();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : offers) {
                            if (!jl40.l(((PlusPayAdditionalOffer) obj3).getOffer().getOfferName(), (plusPayAdditionalOffer4 == null || (offer = plusPayAdditionalOffer4.getOffer()) == null) ? ijbVar2 : offer.getOfferName())) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            PlusPayAdditionalOffer plusPayAdditionalOffer5 = (PlusPayAdditionalOffer) it.next();
                            arrayList2.add(new jjb(plusPayAdditionalOffer5.getAssets().getTitle(), o7f0.a(h(plusPayAdditionalOffer5), Boolean.valueOf(plusPayAdditionalOffer5.isSelected()), false, 95)));
                        }
                        offerSwitchToggle = plusPayCompositeOfferDetails4.getAdditionalOffers().getOfferSwitchToggle();
                        ijbVar = ijbVar2;
                        ijbVar = ijbVar2;
                        if (offerSwitchToggle != null && plusPayAdditionalOffer4 != null) {
                            offerSwitchToggle2 = plusPayAdditionalOffer4.getOfferSwitchToggle();
                            ijbVar = ijbVar2;
                            if (offerSwitchToggle2 != null) {
                                ijbVar = new ijb(offerSwitchToggle.getText(), offerSwitchToggle2.getText(), offerSwitchToggle2.getBadgeText(), plusPayAdditionalOffer4.isSelected());
                            }
                        }
                        return new mjb(str6, list7, list6, gjbVar2, list8, str9, str5, ljbVar, a3, arrayList2, ijbVar);
                    }
                    z3 = checkoutContentFactory$createContent$1.Z$0;
                    str4 = (String) checkoutContentFactory$createContent$1.L$9;
                    str3 = (String) checkoutContentFactory$createContent$1.L$8;
                    list2 = (List) checkoutContentFactory$createContent$1.L$7;
                    list5 = (List) checkoutContentFactory$createContent$1.L$6;
                    str2 = (String) checkoutContentFactory$createContent$1.L$5;
                    plusPayAdditionalOffer3 = (PlusPayAdditionalOffer) checkoutContentFactory$createContent$1.L$4;
                    wlsVar2 = (wls) checkoutContentFactory$createContent$1.L$3;
                    plusPayCompositeOfferDetails3 = (PlusPayCompositeOfferDetails) checkoutContentFactory$createContent$1.L$0;
                    kotlin.b.b(obj);
                    gjb gjbVar3 = (gjb) obj;
                    firstPaymentText = str4;
                    gjbVar = gjbVar3;
                    plusPayAdditionalOffer2 = plusPayAdditionalOffer3;
                    plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails3;
                    list3 = list2;
                    list4 = list5;
                    wlsVar = wlsVar2;
                    checkoutContentFactory$createContent$1.L$0 = plusPayCompositeOfferDetails2;
                    ijbVar2 = null;
                    checkoutContentFactory$createContent$1.L$1 = null;
                    checkoutContentFactory$createContent$1.L$2 = null;
                    checkoutContentFactory$createContent$1.L$3 = null;
                    checkoutContentFactory$createContent$1.L$4 = plusPayAdditionalOffer2;
                    checkoutContentFactory$createContent$1.L$5 = str2;
                    checkoutContentFactory$createContent$1.L$6 = list4;
                    checkoutContentFactory$createContent$1.L$7 = list3;
                    checkoutContentFactory$createContent$1.L$8 = str3;
                    checkoutContentFactory$createContent$1.L$9 = firstPaymentText;
                    checkoutContentFactory$createContent$1.L$10 = gjbVar;
                    checkoutContentFactory$createContent$1.Z$0 = z3;
                    checkoutContentFactory$createContent$1.label = 3;
                    b = b(plusPayCompositeOfferDetails2, wlsVar, checkoutContentFactory$createContent$1);
                    if (b != obj2) {
                        str5 = firstPaymentText;
                        obj = b;
                        str6 = str2;
                        plusPayCompositeOfferDetails4 = plusPayCompositeOfferDetails2;
                        plusPayAdditionalOffer4 = plusPayAdditionalOffer2;
                        gjb gjbVar22 = gjbVar;
                        String str92 = str3;
                        List list62 = list3;
                        List list72 = list4;
                        List list82 = (List) obj;
                        if (z3) {
                        }
                        String a32 = omm0Var.a(zyh0.PlusPay_Checkout_PurchaseButton_Title);
                        List<PlusPayAdditionalOffer> offers2 = plusPayCompositeOfferDetails4.getAdditionalOffers().getOffers();
                        ArrayList arrayList3 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                        }
                        offerSwitchToggle = plusPayCompositeOfferDetails4.getAdditionalOffers().getOfferSwitchToggle();
                        ijbVar = ijbVar2;
                        ijbVar = ijbVar2;
                        if (offerSwitchToggle != null) {
                            offerSwitchToggle2 = plusPayAdditionalOffer4.getOfferSwitchToggle();
                            ijbVar = ijbVar2;
                            if (offerSwitchToggle2 != null) {
                            }
                        }
                        return new mjb(str6, list72, list62, gjbVar22, list82, str92, str5, ljbVar, a32, arrayList22, ijbVar);
                    }
                    return obj2;
                }
                boolean z4 = checkoutContentFactory$createContent$1.Z$0;
                list = (List) checkoutContentFactory$createContent$1.L$6;
                a = (String) checkoutContentFactory$createContent$1.L$5;
                plusPayAdditionalOffer = (PlusPayAdditionalOffer) checkoutContentFactory$createContent$1.L$4;
                wlsVar = (wls) checkoutContentFactory$createContent$1.L$3;
                plusPayMailingAdsAgreement2 = (PlusPayMailingAdsAgreement) checkoutContentFactory$createContent$1.L$1;
                plusPayCompositeOfferDetails2 = (PlusPayCompositeOfferDetails) checkoutContentFactory$createContent$1.L$0;
                kotlin.b.b(obj);
                z2 = z4;
                list2 = (List) obj;
                String nextPaymentText = plusPayCompositeOfferDetails2.getPaymentText().getNextPaymentText();
                firstPaymentText = plusPayCompositeOfferDetails2.getPaymentText().getFirstPaymentText();
                if (plusPayMailingAdsAgreement2 != null) {
                    str2 = a;
                    str3 = nextPaymentText;
                    z3 = z2;
                    plusPayAdditionalOffer2 = plusPayAdditionalOffer;
                    list3 = list2;
                    list4 = list;
                    gjbVar = null;
                    checkoutContentFactory$createContent$1.L$0 = plusPayCompositeOfferDetails2;
                    ijbVar2 = null;
                    checkoutContentFactory$createContent$1.L$1 = null;
                    checkoutContentFactory$createContent$1.L$2 = null;
                    checkoutContentFactory$createContent$1.L$3 = null;
                    checkoutContentFactory$createContent$1.L$4 = plusPayAdditionalOffer2;
                    checkoutContentFactory$createContent$1.L$5 = str2;
                    checkoutContentFactory$createContent$1.L$6 = list4;
                    checkoutContentFactory$createContent$1.L$7 = list3;
                    checkoutContentFactory$createContent$1.L$8 = str3;
                    checkoutContentFactory$createContent$1.L$9 = firstPaymentText;
                    checkoutContentFactory$createContent$1.L$10 = gjbVar;
                    checkoutContentFactory$createContent$1.Z$0 = z3;
                    checkoutContentFactory$createContent$1.label = 3;
                    b = b(plusPayCompositeOfferDetails2, wlsVar, checkoutContentFactory$createContent$1);
                    if (b != obj2) {
                    }
                    return obj2;
                }
                checkoutContentFactory$createContent$1.L$0 = plusPayCompositeOfferDetails2;
                checkoutContentFactory$createContent$1.L$1 = null;
                checkoutContentFactory$createContent$1.L$2 = null;
                checkoutContentFactory$createContent$1.L$3 = wlsVar;
                checkoutContentFactory$createContent$1.L$4 = plusPayAdditionalOffer;
                checkoutContentFactory$createContent$1.L$5 = a;
                checkoutContentFactory$createContent$1.L$6 = list;
                checkoutContentFactory$createContent$1.L$7 = list2;
                checkoutContentFactory$createContent$1.L$8 = nextPaymentText;
                checkoutContentFactory$createContent$1.L$9 = firstPaymentText;
                checkoutContentFactory$createContent$1.Z$0 = z2;
                checkoutContentFactory$createContent$1.label = 2;
                Object g = g(plusPayMailingAdsAgreement2, wlsVar, checkoutContentFactory$createContent$1);
                if (g != obj2) {
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails5 = plusPayCompositeOfferDetails2;
                    plusPayAdditionalOffer3 = plusPayAdditionalOffer;
                    plusPayCompositeOfferDetails3 = plusPayCompositeOfferDetails5;
                    str2 = a;
                    wlsVar2 = wlsVar;
                    str3 = nextPaymentText;
                    list5 = list;
                    str4 = firstPaymentText;
                    z3 = z2;
                    obj = g;
                    gjb gjbVar32 = (gjb) obj;
                    firstPaymentText = str4;
                    gjbVar = gjbVar32;
                    plusPayAdditionalOffer2 = plusPayAdditionalOffer3;
                    plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails3;
                    list3 = list2;
                    list4 = list5;
                    wlsVar = wlsVar2;
                    checkoutContentFactory$createContent$1.L$0 = plusPayCompositeOfferDetails2;
                    ijbVar2 = null;
                    checkoutContentFactory$createContent$1.L$1 = null;
                    checkoutContentFactory$createContent$1.L$2 = null;
                    checkoutContentFactory$createContent$1.L$3 = null;
                    checkoutContentFactory$createContent$1.L$4 = plusPayAdditionalOffer2;
                    checkoutContentFactory$createContent$1.L$5 = str2;
                    checkoutContentFactory$createContent$1.L$6 = list4;
                    checkoutContentFactory$createContent$1.L$7 = list3;
                    checkoutContentFactory$createContent$1.L$8 = str3;
                    checkoutContentFactory$createContent$1.L$9 = firstPaymentText;
                    checkoutContentFactory$createContent$1.L$10 = gjbVar;
                    checkoutContentFactory$createContent$1.Z$0 = z3;
                    checkoutContentFactory$createContent$1.label = 3;
                    b = b(plusPayCompositeOfferDetails2, wlsVar, checkoutContentFactory$createContent$1);
                    if (b != obj2) {
                    }
                }
                return obj2;
            }
        }
        checkoutContentFactory$createContent$1 = new CheckoutContentFactory$createContent$1(this, continuationImpl);
        Object obj4 = checkoutContentFactory$createContent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$createContent$1.label;
        omm0 omm0Var2 = this.c;
        ijb ijbVar22 = null;
        if (i != 0) {
        }
        list2 = (List) obj4;
        String nextPaymentText2 = plusPayCompositeOfferDetails2.getPaymentText().getNextPaymentText();
        firstPaymentText = plusPayCompositeOfferDetails2.getPaymentText().getFirstPaymentText();
        if (plusPayMailingAdsAgreement2 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, wls wlsVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$createLegalTexts$1 checkoutContentFactory$createLegalTexts$1;
        int i;
        int i2;
        ListBuilder a;
        ListBuilder listBuilder;
        Collection collection;
        int i3;
        PlusPayRichText fromLegalInfo;
        Object a2;
        wls wlsVar2;
        int i4;
        PlusPayRichText promoLegalInfo;
        List list;
        Collection collection2;
        CharSequence charSequence;
        ArrayList arrayList;
        ListIterator listIterator;
        qqy qqyVar;
        Object next;
        int i5;
        CharSequence charSequence2;
        if (continuationImpl instanceof CheckoutContentFactory$createLegalTexts$1) {
            checkoutContentFactory$createLegalTexts$1 = (CheckoutContentFactory$createLegalTexts$1) continuationImpl;
            int i6 = checkoutContentFactory$createLegalTexts$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$createLegalTexts$1.label = i6 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$createLegalTexts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$createLegalTexts$1.label;
                cpd0 cpd0Var = this.b;
                i2 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = rcc.a();
                    PlusPayLegalInfo legalInfo = plusPayCompositeOfferDetails.getLegalInfo();
                    if (legalInfo != null && (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) != null) {
                        checkoutContentFactory$createLegalTexts$1.L$0 = plusPayCompositeOfferDetails;
                        checkoutContentFactory$createLegalTexts$1.L$1 = wlsVar;
                        checkoutContentFactory$createLegalTexts$1.L$2 = a;
                        checkoutContentFactory$createLegalTexts$1.L$3 = a;
                        checkoutContentFactory$createLegalTexts$1.L$4 = null;
                        checkoutContentFactory$createLegalTexts$1.I$0 = 0;
                        checkoutContentFactory$createLegalTexts$1.I$1 = 0;
                        checkoutContentFactory$createLegalTexts$1.label = 1;
                        a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(fromLegalInfo, wlsVar, checkoutContentFactory$createLegalTexts$1);
                        if (a2 != coroutineSingletons) {
                            wlsVar2 = wlsVar;
                            collection = a;
                            i4 = 0;
                        }
                        return coroutineSingletons;
                    }
                    listBuilder = a;
                    collection = listBuilder;
                    i3 = 0;
                    wlsVar2 = wlsVar;
                    i4 = i3;
                    a = listBuilder;
                    promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
                    if (promoLegalInfo != null) {
                        if (!((Boolean) this.d.invoke()).booleanValue()) {
                            promoLegalInfo = null;
                        }
                        if (promoLegalInfo != null) {
                            checkoutContentFactory$createLegalTexts$1.L$0 = null;
                            checkoutContentFactory$createLegalTexts$1.L$1 = null;
                            checkoutContentFactory$createLegalTexts$1.L$2 = collection;
                            checkoutContentFactory$createLegalTexts$1.L$3 = a;
                            checkoutContentFactory$createLegalTexts$1.L$4 = null;
                            checkoutContentFactory$createLegalTexts$1.I$0 = i4;
                            checkoutContentFactory$createLegalTexts$1.I$1 = 0;
                            checkoutContentFactory$createLegalTexts$1.label = 2;
                            Object a3 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(promoLegalInfo, wlsVar2, checkoutContentFactory$createLegalTexts$1);
                            if (a3 != coroutineSingletons) {
                                ListBuilder listBuilder2 = a;
                                obj = a3;
                                list = listBuilder2;
                                collection2 = collection;
                                charSequence2 = (CharSequence) obj;
                                if (charSequence2 != null) {
                                }
                                collection = collection2;
                            }
                            return coroutineSingletons;
                        }
                    }
                    collection2 = collection;
                    ListBuilder j = ((ListBuilder) collection2).j();
                    arrayList = new ArrayList(tcc.n(j, 10));
                    listIterator = j.listIterator(0);
                    while (true) {
                        qqyVar = (qqy) listIterator;
                        if (qqyVar.hasNext()) {
                        }
                        arrayList.add(new hjb(i2, (CharSequence) next));
                        i2 = i5;
                    }
                } else if (i == 1) {
                    int i7 = checkoutContentFactory$createLegalTexts$1.I$0;
                    ?? r13 = (List) checkoutContentFactory$createLegalTexts$1.L$3;
                    Collection collection3 = (List) checkoutContentFactory$createLegalTexts$1.L$2;
                    wlsVar2 = (wls) checkoutContentFactory$createLegalTexts$1.L$1;
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = (PlusPayCompositeOfferDetails) checkoutContentFactory$createLegalTexts$1.L$0;
                    kotlin.b.b(obj);
                    i4 = i7;
                    plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                    collection = collection3;
                    a2 = obj;
                    a = r13;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) checkoutContentFactory$createLegalTexts$1.L$3;
                    collection2 = (List) checkoutContentFactory$createLegalTexts$1.L$2;
                    kotlin.b.b(obj);
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 != null) {
                        if (evu0.J(charSequence2)) {
                            charSequence2 = null;
                        }
                        if (charSequence2 != null) {
                            list.add(charSequence2);
                            ListBuilder j2 = ((ListBuilder) collection2).j();
                            arrayList = new ArrayList(tcc.n(j2, 10));
                            listIterator = j2.listIterator(0);
                            while (true) {
                                qqyVar = (qqy) listIterator;
                                if (qqyVar.hasNext()) {
                                    return arrayList;
                                }
                                next = qqyVar.next();
                                i5 = i2 + 1;
                                if (i2 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                arrayList.add(new hjb(i2, (CharSequence) next));
                                i2 = i5;
                            }
                        }
                    }
                    collection = collection2;
                    collection2 = collection;
                    ListBuilder j22 = ((ListBuilder) collection2).j();
                    arrayList = new ArrayList(tcc.n(j22, 10));
                    listIterator = j22.listIterator(0);
                    while (true) {
                        qqyVar = (qqy) listIterator;
                        if (qqyVar.hasNext()) {
                        }
                        arrayList.add(new hjb(i2, (CharSequence) next));
                        i2 = i5;
                    }
                }
                charSequence = (CharSequence) a2;
                if (charSequence != null) {
                    if (evu0.J(charSequence)) {
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        a.add(charSequence);
                        promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
                        if (promoLegalInfo != null) {
                        }
                        collection2 = collection;
                        ListBuilder j222 = ((ListBuilder) collection2).j();
                        arrayList = new ArrayList(tcc.n(j222, 10));
                        listIterator = j222.listIterator(0);
                        while (true) {
                            qqyVar = (qqy) listIterator;
                            if (qqyVar.hasNext()) {
                            }
                            arrayList.add(new hjb(i2, (CharSequence) next));
                            i2 = i5;
                        }
                    }
                }
                listBuilder = a;
                i3 = i4;
                wlsVar = wlsVar2;
                wlsVar2 = wlsVar;
                i4 = i3;
                a = listBuilder;
                promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
                if (promoLegalInfo != null) {
                }
                collection2 = collection;
                ListBuilder j2222 = ((ListBuilder) collection2).j();
                arrayList = new ArrayList(tcc.n(j2222, 10));
                listIterator = j2222.listIterator(0);
                while (true) {
                    qqyVar = (qqy) listIterator;
                    if (qqyVar.hasNext()) {
                    }
                    arrayList.add(new hjb(i2, (CharSequence) next));
                    i2 = i5;
                }
            }
        }
        checkoutContentFactory$createLegalTexts$1 = new CheckoutContentFactory$createLegalTexts$1(this, continuationImpl);
        Object obj2 = checkoutContentFactory$createLegalTexts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$createLegalTexts$1.label;
        cpd0 cpd0Var2 = this.b;
        i2 = 0;
        if (i != 0) {
        }
        charSequence = (CharSequence) a2;
        if (charSequence != null) {
        }
        listBuilder = a;
        i3 = i4;
        wlsVar = wlsVar2;
        wlsVar2 = wlsVar;
        i4 = i3;
        a = listBuilder;
        promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
        if (promoLegalInfo != null) {
        }
        collection2 = collection;
        ListBuilder j22222 = ((ListBuilder) collection2).j();
        arrayList = new ArrayList(tcc.n(j22222, 10));
        listIterator = j22222.listIterator(0);
        while (true) {
            qqyVar = (qqy) listIterator;
            if (qqyVar.hasNext()) {
            }
            arrayList.add(new hjb(i2, (CharSequence) next));
            i2 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayCompositeOfferDetails.PaymentMethod paymentMethod, String str, wls wlsVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$createPaymentMethodContent$1 checkoutContentFactory$createPaymentMethodContent$1;
        int i;
        String id;
        ied0 ied0Var;
        String title;
        PlusThemedImage icon;
        PlusThemedColor<PlusColor> plusThemedColor;
        PlusThemedColor<PlusColor> plusThemedColor2;
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod2;
        wls wlsVar2;
        boolean z;
        CharSequence charSequence;
        PlusPayRichText badgeText;
        ied0 ied0Var2;
        PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset;
        boolean z2;
        CharSequence charSequence2;
        PlusThemedColor<PlusColor> plusThemedColor3;
        PlusThemedColor<PlusColor> plusThemedColor4;
        PlusThemedImage plusThemedImage;
        String str2;
        String str3;
        CharSequence charSequence3;
        ied0 ied0Var3;
        PlusPayRichText subtitleText;
        boolean z3;
        CharSequence charSequence4;
        PlusThemedColor<PlusColor> plusThemedColor5;
        PlusThemedColor<PlusColor> plusThemedColor6;
        PlusThemedImage plusThemedImage2;
        String str4;
        String str5;
        if (continuationImpl instanceof CheckoutContentFactory$createPaymentMethodContent$1) {
            checkoutContentFactory$createPaymentMethodContent$1 = (CheckoutContentFactory$createPaymentMethodContent$1) continuationImpl;
            int i2 = checkoutContentFactory$createPaymentMethodContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$createPaymentMethodContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$createPaymentMethodContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$createPaymentMethodContent$1.label;
                sls slsVar = this.d;
                cpd0 cpd0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    id = paymentMethod.getId();
                    boolean l = jl40.l(paymentMethod.getId(), str);
                    ied0Var = new ied0(!paymentMethod.isBound(), paymentMethod.getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_YB_CARD);
                    title = paymentMethod.getTitle();
                    icon = paymentMethod.getIcon();
                    PlusThemedColor<PlusColor> textColor = paymentMethod.getTextColor();
                    PlusThemedColor<PlusColor> backgroundColor = paymentMethod.getBackgroundColor();
                    PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset2 = paymentMethod.getButtonAsset();
                    if (buttonAsset2 != null && (badgeText = buttonAsset2.getBadgeText()) != null) {
                        if (!((Boolean) slsVar.invoke()).booleanValue()) {
                            badgeText = null;
                        }
                        if (badgeText != null) {
                            checkoutContentFactory$createPaymentMethodContent$1.L$0 = paymentMethod;
                            checkoutContentFactory$createPaymentMethodContent$1.L$1 = null;
                            checkoutContentFactory$createPaymentMethodContent$1.L$2 = wlsVar;
                            checkoutContentFactory$createPaymentMethodContent$1.L$3 = id;
                            checkoutContentFactory$createPaymentMethodContent$1.L$4 = ied0Var;
                            checkoutContentFactory$createPaymentMethodContent$1.L$5 = title;
                            checkoutContentFactory$createPaymentMethodContent$1.L$6 = icon;
                            checkoutContentFactory$createPaymentMethodContent$1.L$7 = textColor;
                            checkoutContentFactory$createPaymentMethodContent$1.L$8 = backgroundColor;
                            checkoutContentFactory$createPaymentMethodContent$1.L$9 = null;
                            checkoutContentFactory$createPaymentMethodContent$1.Z$0 = l;
                            checkoutContentFactory$createPaymentMethodContent$1.I$0 = 0;
                            checkoutContentFactory$createPaymentMethodContent$1.label = 1;
                            Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(badgeText, wlsVar, checkoutContentFactory$createPaymentMethodContent$1);
                            if (a != coroutineSingletons) {
                                plusThemedColor = textColor;
                                plusThemedColor2 = backgroundColor;
                                paymentMethod2 = paymentMethod;
                                wlsVar2 = wlsVar;
                                z = l;
                                obj = a;
                            }
                            return coroutineSingletons;
                        }
                    }
                    plusThemedColor = textColor;
                    plusThemedColor2 = backgroundColor;
                    paymentMethod2 = paymentMethod;
                    wlsVar2 = wlsVar;
                    z = l;
                    charSequence = null;
                    ied0Var2 = ied0Var;
                    buttonAsset = paymentMethod2.getButtonAsset();
                    if (buttonAsset != null && (subtitleText = buttonAsset.getSubtitleText()) != null) {
                        if (!((Boolean) slsVar.invoke()).booleanValue()) {
                            subtitleText = null;
                        }
                        if (subtitleText != null) {
                            checkoutContentFactory$createPaymentMethodContent$1.L$0 = null;
                            checkoutContentFactory$createPaymentMethodContent$1.L$1 = null;
                            checkoutContentFactory$createPaymentMethodContent$1.L$2 = null;
                            checkoutContentFactory$createPaymentMethodContent$1.L$3 = id;
                            checkoutContentFactory$createPaymentMethodContent$1.L$4 = ied0Var2;
                            checkoutContentFactory$createPaymentMethodContent$1.L$5 = title;
                            checkoutContentFactory$createPaymentMethodContent$1.L$6 = icon;
                            checkoutContentFactory$createPaymentMethodContent$1.L$7 = plusThemedColor;
                            checkoutContentFactory$createPaymentMethodContent$1.L$8 = plusThemedColor2;
                            checkoutContentFactory$createPaymentMethodContent$1.L$9 = charSequence;
                            checkoutContentFactory$createPaymentMethodContent$1.L$10 = null;
                            checkoutContentFactory$createPaymentMethodContent$1.Z$0 = z;
                            checkoutContentFactory$createPaymentMethodContent$1.I$0 = 0;
                            checkoutContentFactory$createPaymentMethodContent$1.label = 2;
                            Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(subtitleText, wlsVar2, checkoutContentFactory$createPaymentMethodContent$1);
                            if (a2 != coroutineSingletons) {
                                CharSequence charSequence5 = charSequence;
                                obj = a2;
                                z3 = z;
                                charSequence4 = charSequence5;
                                plusThemedColor5 = plusThemedColor2;
                                plusThemedColor6 = plusThemedColor;
                                plusThemedImage2 = icon;
                                str4 = title;
                                str5 = id;
                                z2 = z3;
                                charSequence2 = charSequence4;
                                plusThemedColor3 = plusThemedColor5;
                                plusThemedColor4 = plusThemedColor6;
                                plusThemedImage = plusThemedImage2;
                                str2 = str4;
                                str3 = str5;
                                ied0Var3 = ied0Var2;
                                charSequence3 = (CharSequence) obj;
                                return new ked0(str3, z2, ied0Var3, str2, charSequence3, charSequence2, plusThemedImage, plusThemedColor4, plusThemedColor3);
                            }
                            return coroutineSingletons;
                        }
                    }
                    z2 = z;
                    charSequence2 = charSequence;
                    plusThemedColor3 = plusThemedColor2;
                    plusThemedColor4 = plusThemedColor;
                    plusThemedImage = icon;
                    str2 = title;
                    str3 = id;
                    charSequence3 = null;
                    ied0Var3 = ied0Var2;
                    return new ked0(str3, z2, ied0Var3, str2, charSequence3, charSequence2, plusThemedImage, plusThemedColor4, plusThemedColor3);
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = checkoutContentFactory$createPaymentMethodContent$1.Z$0;
                    charSequence4 = (CharSequence) checkoutContentFactory$createPaymentMethodContent$1.L$9;
                    plusThemedColor5 = (PlusThemedColor) checkoutContentFactory$createPaymentMethodContent$1.L$8;
                    plusThemedColor6 = (PlusThemedColor) checkoutContentFactory$createPaymentMethodContent$1.L$7;
                    plusThemedImage2 = (PlusThemedImage) checkoutContentFactory$createPaymentMethodContent$1.L$6;
                    str4 = (String) checkoutContentFactory$createPaymentMethodContent$1.L$5;
                    ied0Var2 = (ied0) checkoutContentFactory$createPaymentMethodContent$1.L$4;
                    str5 = (String) checkoutContentFactory$createPaymentMethodContent$1.L$3;
                    kotlin.b.b(obj);
                    z2 = z3;
                    charSequence2 = charSequence4;
                    plusThemedColor3 = plusThemedColor5;
                    plusThemedColor4 = plusThemedColor6;
                    plusThemedImage = plusThemedImage2;
                    str2 = str4;
                    str3 = str5;
                    ied0Var3 = ied0Var2;
                    charSequence3 = (CharSequence) obj;
                    return new ked0(str3, z2, ied0Var3, str2, charSequence3, charSequence2, plusThemedImage, plusThemedColor4, plusThemedColor3);
                }
                z = checkoutContentFactory$createPaymentMethodContent$1.Z$0;
                plusThemedColor2 = (PlusThemedColor) checkoutContentFactory$createPaymentMethodContent$1.L$8;
                plusThemedColor = (PlusThemedColor) checkoutContentFactory$createPaymentMethodContent$1.L$7;
                icon = (PlusThemedImage) checkoutContentFactory$createPaymentMethodContent$1.L$6;
                title = (String) checkoutContentFactory$createPaymentMethodContent$1.L$5;
                ied0Var = (ied0) checkoutContentFactory$createPaymentMethodContent$1.L$4;
                id = (String) checkoutContentFactory$createPaymentMethodContent$1.L$3;
                wlsVar2 = (wls) checkoutContentFactory$createPaymentMethodContent$1.L$2;
                paymentMethod2 = (PlusPayCompositeOfferDetails.PaymentMethod) checkoutContentFactory$createPaymentMethodContent$1.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                ied0Var2 = ied0Var;
                buttonAsset = paymentMethod2.getButtonAsset();
                if (buttonAsset != null) {
                    if (!((Boolean) slsVar.invoke()).booleanValue()) {
                    }
                    if (subtitleText != null) {
                    }
                }
                z2 = z;
                charSequence2 = charSequence;
                plusThemedColor3 = plusThemedColor2;
                plusThemedColor4 = plusThemedColor;
                plusThemedImage = icon;
                str2 = title;
                str3 = id;
                charSequence3 = null;
                ied0Var3 = ied0Var2;
                return new ked0(str3, z2, ied0Var3, str2, charSequence3, charSequence2, plusThemedImage, plusThemedColor4, plusThemedColor3);
            }
        }
        checkoutContentFactory$createPaymentMethodContent$1 = new CheckoutContentFactory$createPaymentMethodContent$1(this, continuationImpl);
        Object obj2 = checkoutContentFactory$createPaymentMethodContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$createPaymentMethodContent$1.label;
        sls slsVar2 = this.d;
        cpd0 cpd0Var2 = this.b;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        ied0Var2 = ied0Var;
        buttonAsset = paymentMethod2.getButtonAsset();
        if (buttonAsset != null) {
        }
        z2 = z;
        charSequence2 = charSequence;
        plusThemedColor3 = plusThemedColor2;
        plusThemedColor4 = plusThemedColor;
        plusThemedImage = icon;
        str2 = title;
        str3 = id;
        charSequence3 = null;
        ied0Var3 = ied0Var2;
        return new ked0(str3, z2, ied0Var3, str2, charSequence3, charSequence2, plusThemedImage, plusThemedColor4, plusThemedColor3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.a] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0179 -> B:11:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0100 -> B:27:0x0109). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup, String str, wls wlsVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$createPaymentMethodGroupContent$1 checkoutContentFactory$createPaymentMethodGroupContent$1;
        int i;
        String str2;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup2;
        wls wlsVar2;
        CheckoutContentFactory$createPaymentMethodGroupContent$1 checkoutContentFactory$createPaymentMethodGroupContent$12;
        String str3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        wls wlsVar3;
        int i4;
        int i5;
        ArrayList arrayList4;
        String str4;
        Iterator it2;
        if (continuationImpl instanceof CheckoutContentFactory$createPaymentMethodGroupContent$1) {
            checkoutContentFactory$createPaymentMethodGroupContent$1 = (CheckoutContentFactory$createPaymentMethodGroupContent$1) continuationImpl;
            int i6 = checkoutContentFactory$createPaymentMethodGroupContent$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$createPaymentMethodGroupContent$1.label = i6 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$createPaymentMethodGroupContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$createPaymentMethodGroupContent$1.label;
                ArrayList arrayList5 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String title = paymentMethodsGroup.getTitle();
                    List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
                    ArrayList arrayList6 = new ArrayList(tcc.n(paymentMethods, 10));
                    str2 = title;
                    it = paymentMethods.iterator();
                    arrayList = arrayList6;
                    i2 = 0;
                    i3 = 0;
                    paymentMethodsGroup2 = paymentMethodsGroup;
                    wlsVar2 = wlsVar;
                    checkoutContentFactory$createPaymentMethodGroupContent$12 = checkoutContentFactory$createPaymentMethodGroupContent$1;
                    str3 = str;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i7 = checkoutContentFactory$createPaymentMethodGroupContent$1.I$1;
                    int i8 = checkoutContentFactory$createPaymentMethodGroupContent$1.I$0;
                    ?? r11 = (Collection) checkoutContentFactory$createPaymentMethodGroupContent$1.L$10;
                    String str5 = (String) checkoutContentFactory$createPaymentMethodGroupContent$1.L$9;
                    Iterator it3 = (Iterator) checkoutContentFactory$createPaymentMethodGroupContent$1.L$6;
                    ?? r14 = (Collection) checkoutContentFactory$createPaymentMethodGroupContent$1.L$5;
                    wls wlsVar4 = (wls) checkoutContentFactory$createPaymentMethodGroupContent$1.L$2;
                    String str6 = (String) checkoutContentFactory$createPaymentMethodGroupContent$1.L$1;
                    PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup3 = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) checkoutContentFactory$createPaymentMethodGroupContent$1.L$0;
                    kotlin.b.b(obj);
                    checkoutContentFactory$createPaymentMethodGroupContent$12 = checkoutContentFactory$createPaymentMethodGroupContent$1;
                    str3 = str6;
                    Iterator it4 = it3;
                    String str7 = str5;
                    ArrayList arrayList7 = r11;
                    int i9 = i8;
                    int i10 = i7;
                    wlsVar2 = wlsVar4;
                    ArrayList arrayList8 = r14;
                    arrayList7.add((ked0) obj);
                    paymentMethodsGroup2 = paymentMethodsGroup3;
                    i2 = i10;
                    i3 = i9;
                    str2 = str7;
                    arrayList = arrayList8;
                    it = it4;
                    if (it.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) it.next();
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$0 = paymentMethodsGroup2;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$1 = str3;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$2 = wlsVar2;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$3 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$4 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$5 = arrayList;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$6 = it;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$7 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$8 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$9 = str2;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.L$10 = arrayList;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.I$0 = i3;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.I$1 = i2;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.I$2 = 0;
                        checkoutContentFactory$createPaymentMethodGroupContent$12.label = 1;
                        Object c = c(paymentMethod, str3, wlsVar2, checkoutContentFactory$createPaymentMethodGroupContent$12);
                        if (c != coroutineSingletons) {
                            it4 = it;
                            str7 = str2;
                            arrayList7 = arrayList;
                            i9 = i3;
                            i10 = i2;
                            paymentMethodsGroup3 = paymentMethodsGroup2;
                            obj = c;
                            arrayList8 = arrayList7;
                            arrayList7.add((ked0) obj);
                            paymentMethodsGroup2 = paymentMethodsGroup3;
                            i2 = i10;
                            i3 = i9;
                            str2 = str7;
                            arrayList = arrayList8;
                            it = it4;
                            if (it.hasNext()) {
                                arrayList2 = arrayList;
                                List<PlusPayCompositeOfferDetails.PaymentPromo> paymentPromos = paymentMethodsGroup2.getPaymentPromos();
                                if (!((Boolean) this.d.invoke()).booleanValue()) {
                                    paymentPromos = null;
                                }
                                if (paymentPromos != null) {
                                    List<PlusPayCompositeOfferDetails.PaymentPromo> list = paymentPromos;
                                    arrayList3 = new ArrayList(tcc.n(list, 10));
                                    wlsVar3 = wlsVar2;
                                    checkoutContentFactory$createPaymentMethodGroupContent$1 = checkoutContentFactory$createPaymentMethodGroupContent$12;
                                    i4 = 0;
                                    i5 = 0;
                                    arrayList4 = arrayList2;
                                    str4 = str2;
                                    it2 = list.iterator();
                                    if (it2.hasNext()) {
                                    }
                                }
                                if (arrayList5 == null) {
                                }
                                return new kjb(str2, arrayList2, arrayList5);
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = checkoutContentFactory$createPaymentMethodGroupContent$1.I$1;
                    i5 = checkoutContentFactory$createPaymentMethodGroupContent$1.I$0;
                    ?? r7 = (Collection) checkoutContentFactory$createPaymentMethodGroupContent$1.L$11;
                    ?? r10 = (List) checkoutContentFactory$createPaymentMethodGroupContent$1.L$10;
                    str4 = (String) checkoutContentFactory$createPaymentMethodGroupContent$1.L$9;
                    it2 = (Iterator) checkoutContentFactory$createPaymentMethodGroupContent$1.L$6;
                    ?? r13 = (Collection) checkoutContentFactory$createPaymentMethodGroupContent$1.L$5;
                    wlsVar3 = (wls) checkoutContentFactory$createPaymentMethodGroupContent$1.L$2;
                    kotlin.b.b(obj);
                    ArrayList arrayList9 = r7;
                    ArrayList arrayList10 = r10;
                    arrayList9.add((med0) obj);
                    arrayList3 = r13;
                    arrayList4 = arrayList10;
                    if (it2.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentPromo paymentPromo = (PlusPayCompositeOfferDetails.PaymentPromo) it2.next();
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$0 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$1 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$2 = wlsVar3;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$3 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$4 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$5 = arrayList3;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$6 = it2;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$7 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$8 = null;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$9 = str4;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$10 = arrayList4;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.L$11 = arrayList3;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.I$0 = i5;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.I$1 = i4;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.I$2 = 0;
                        checkoutContentFactory$createPaymentMethodGroupContent$1.label = 2;
                        obj = f(paymentPromo, wlsVar3, checkoutContentFactory$createPaymentMethodGroupContent$1);
                        if (obj != coroutineSingletons) {
                            r13 = arrayList3;
                            arrayList9 = arrayList3;
                            arrayList10 = arrayList4;
                            arrayList9.add((med0) obj);
                            arrayList3 = r13;
                            arrayList4 = arrayList10;
                            if (it2.hasNext()) {
                                arrayList5 = arrayList3;
                                str2 = str4;
                                arrayList2 = arrayList4;
                                if (arrayList5 == null) {
                                    arrayList5 = EmptyList.a;
                                }
                                return new kjb(str2, arrayList2, arrayList5);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        checkoutContentFactory$createPaymentMethodGroupContent$1 = new CheckoutContentFactory$createPaymentMethodGroupContent$1(this, continuationImpl);
        Object obj2 = checkoutContentFactory$createPaymentMethodGroupContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$createPaymentMethodGroupContent$1.label;
        ArrayList arrayList52 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x010a -> B:10:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, String str, wls wlsVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$createPaymentMethodsGroups$1 checkoutContentFactory$createPaymentMethodsGroups$1;
        int i;
        String str2;
        String str3;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        wls wlsVar2;
        List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods;
        if (continuationImpl instanceof CheckoutContentFactory$createPaymentMethodsGroups$1) {
            checkoutContentFactory$createPaymentMethodsGroups$1 = (CheckoutContentFactory$createPaymentMethodsGroups$1) continuationImpl;
            int i5 = checkoutContentFactory$createPaymentMethodsGroups$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$createPaymentMethodsGroups$1.label = i5 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$createPaymentMethodsGroups$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$createPaymentMethodsGroups$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = paymentMethodsGroups.iterator();
                    while (it2.hasNext()) {
                        ycc.r(((PlusPayCompositeOfferDetails.PaymentMethodsGroup) it2.next()).getPaymentMethods(), arrayList);
                    }
                    int size = arrayList.size();
                    if (size <= 1) {
                        return EmptyList.a;
                    }
                    if (str == null) {
                        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) kotlin.collections.a.R(plusPayCompositeOfferDetails.getPaymentMethodsGroups());
                        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (paymentMethodsGroup == null || (paymentMethods = paymentMethodsGroup.getPaymentMethods()) == null) ? null : (PlusPayCompositeOfferDetails.PaymentMethod) kotlin.collections.a.R(paymentMethods);
                        str2 = paymentMethod != null ? paymentMethod.getId() : null;
                    } else {
                        str2 = str;
                    }
                    List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups2 = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
                    ArrayList arrayList2 = new ArrayList(tcc.n(paymentMethodsGroups2, 10));
                    str3 = str2;
                    i2 = 0;
                    it = paymentMethodsGroups2.iterator();
                    collection = arrayList2;
                    i3 = size;
                    i4 = 0;
                    wlsVar2 = wlsVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = checkoutContentFactory$createPaymentMethodsGroups$1.I$2;
                    i4 = checkoutContentFactory$createPaymentMethodsGroups$1.I$1;
                    i3 = checkoutContentFactory$createPaymentMethodsGroups$1.I$0;
                    collection = (Collection) checkoutContentFactory$createPaymentMethodsGroups$1.L$10;
                    it = (Iterator) checkoutContentFactory$createPaymentMethodsGroups$1.L$7;
                    Collection collection2 = (Collection) checkoutContentFactory$createPaymentMethodsGroups$1.L$6;
                    str3 = (String) checkoutContentFactory$createPaymentMethodsGroups$1.L$3;
                    wls wlsVar3 = (wls) checkoutContentFactory$createPaymentMethodsGroups$1.L$2;
                    kotlin.b.b(obj);
                    collection.add((kjb) obj);
                    collection = collection2;
                    wlsVar2 = wlsVar3;
                    if (it.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup2 = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) it.next();
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$0 = null;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$1 = null;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$2 = wlsVar2;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$3 = str3;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$4 = null;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$5 = null;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$6 = collection;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$7 = it;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$8 = null;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$9 = null;
                        checkoutContentFactory$createPaymentMethodsGroups$1.L$10 = collection;
                        checkoutContentFactory$createPaymentMethodsGroups$1.I$0 = i3;
                        checkoutContentFactory$createPaymentMethodsGroups$1.I$1 = i4;
                        checkoutContentFactory$createPaymentMethodsGroups$1.I$2 = i2;
                        checkoutContentFactory$createPaymentMethodsGroups$1.I$3 = 0;
                        checkoutContentFactory$createPaymentMethodsGroups$1.label = 1;
                        Object d = d(paymentMethodsGroup2, str3, wlsVar2, checkoutContentFactory$createPaymentMethodsGroups$1);
                        if (d == obj2) {
                            return obj2;
                        }
                        wlsVar3 = wlsVar2;
                        obj = d;
                        collection2 = collection;
                        collection.add((kjb) obj);
                        collection = collection2;
                        wlsVar2 = wlsVar3;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        checkoutContentFactory$createPaymentMethodsGroups$1 = new CheckoutContentFactory$createPaymentMethodsGroups$1(this, continuationImpl);
        Object obj3 = checkoutContentFactory$createPaymentMethodsGroups$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$createPaymentMethodsGroups$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPayCompositeOfferDetails.PaymentPromo paymentPromo, wls wlsVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$createPaymentPromoContent$1 checkoutContentFactory$createPaymentPromoContent$1;
        int i;
        String paymentMethodId;
        Object a;
        CharSequence charSequence;
        PlusThemedImage imageUrl;
        PlusPayRichText additionalTitle;
        String str;
        PlusPayCompositeOfferDetails.PaymentPromo paymentPromo2;
        String str2;
        CharSequence charSequence2;
        PlusThemedImage plusThemedImage;
        if (continuationImpl instanceof CheckoutContentFactory$createPaymentPromoContent$1) {
            checkoutContentFactory$createPaymentPromoContent$1 = (CheckoutContentFactory$createPaymentPromoContent$1) continuationImpl;
            int i2 = checkoutContentFactory$createPaymentPromoContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$createPaymentPromoContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$createPaymentPromoContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$createPaymentPromoContent$1.label;
                cpd0 cpd0Var = this.b;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodId = paymentPromo.getPaymentMethodId();
                    PlusPayRichText benefitTitle = paymentPromo.getBenefitTitle();
                    checkoutContentFactory$createPaymentPromoContent$1.L$0 = paymentPromo;
                    checkoutContentFactory$createPaymentPromoContent$1.L$1 = wlsVar;
                    checkoutContentFactory$createPaymentPromoContent$1.L$2 = paymentMethodId;
                    checkoutContentFactory$createPaymentPromoContent$1.label = 1;
                    a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(benefitTitle, wlsVar, checkoutContentFactory$createPaymentPromoContent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        plusThemedImage = (PlusThemedImage) checkoutContentFactory$createPaymentPromoContent$1.L$4;
                        charSequence2 = (CharSequence) checkoutContentFactory$createPaymentPromoContent$1.L$3;
                        str2 = (String) checkoutContentFactory$createPaymentPromoContent$1.L$2;
                        paymentPromo2 = (PlusPayCompositeOfferDetails.PaymentPromo) checkoutContentFactory$createPaymentPromoContent$1.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        imageUrl = plusThemedImage;
                        charSequence = charSequence2;
                        str = str2;
                        paymentPromo = paymentPromo2;
                        return new med0(str, charSequence, charSequence3, imageUrl, paymentPromo.getBackGroundColor());
                    }
                    String str3 = (String) checkoutContentFactory$createPaymentPromoContent$1.L$2;
                    wlsVar = (wls) checkoutContentFactory$createPaymentPromoContent$1.L$1;
                    PlusPayCompositeOfferDetails.PaymentPromo paymentPromo3 = (PlusPayCompositeOfferDetails.PaymentPromo) checkoutContentFactory$createPaymentPromoContent$1.L$0;
                    kotlin.b.b(obj);
                    paymentMethodId = str3;
                    paymentPromo = paymentPromo3;
                    a = obj;
                }
                charSequence = (CharSequence) a;
                imageUrl = paymentPromo.getImageUrl();
                additionalTitle = paymentPromo.getAdditionalTitle();
                if (additionalTitle != null) {
                    str = paymentMethodId;
                    return new med0(str, charSequence, charSequence3, imageUrl, paymentPromo.getBackGroundColor());
                }
                checkoutContentFactory$createPaymentPromoContent$1.L$0 = paymentPromo;
                checkoutContentFactory$createPaymentPromoContent$1.L$1 = null;
                checkoutContentFactory$createPaymentPromoContent$1.L$2 = paymentMethodId;
                checkoutContentFactory$createPaymentPromoContent$1.L$3 = charSequence;
                checkoutContentFactory$createPaymentPromoContent$1.L$4 = imageUrl;
                checkoutContentFactory$createPaymentPromoContent$1.L$5 = null;
                checkoutContentFactory$createPaymentPromoContent$1.I$0 = 0;
                checkoutContentFactory$createPaymentPromoContent$1.label = 2;
                Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(additionalTitle, wlsVar, checkoutContentFactory$createPaymentPromoContent$1);
                if (a2 != coroutineSingletons) {
                    paymentPromo2 = paymentPromo;
                    str2 = paymentMethodId;
                    charSequence2 = charSequence;
                    obj = a2;
                    plusThemedImage = imageUrl;
                    charSequence3 = (CharSequence) obj;
                    imageUrl = plusThemedImage;
                    charSequence = charSequence2;
                    str = str2;
                    paymentPromo = paymentPromo2;
                    return new med0(str, charSequence, charSequence3, imageUrl, paymentPromo.getBackGroundColor());
                }
                return coroutineSingletons;
            }
        }
        checkoutContentFactory$createPaymentPromoContent$1 = new CheckoutContentFactory$createPaymentPromoContent$1(this, continuationImpl);
        Object obj2 = checkoutContentFactory$createPaymentPromoContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$createPaymentPromoContent$1.label;
        cpd0 cpd0Var2 = this.b;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) a;
        imageUrl = paymentPromo.getImageUrl();
        additionalTitle = paymentPromo.getAdditionalTitle();
        if (additionalTitle != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, wls wlsVar, ContinuationImpl continuationImpl) {
        CheckoutContentFactory$toContentAgreement$1 checkoutContentFactory$toContentAgreement$1;
        int i;
        if (continuationImpl instanceof CheckoutContentFactory$toContentAgreement$1) {
            checkoutContentFactory$toContentAgreement$1 = (CheckoutContentFactory$toContentAgreement$1) continuationImpl;
            int i2 = checkoutContentFactory$toContentAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutContentFactory$toContentAgreement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutContentFactory$toContentAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutContentFactory$toContentAgreement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayRichText fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(plusPayMailingAdsAgreement.getAgreementText());
                    checkoutContentFactory$toContentAgreement$1.L$0 = plusPayMailingAdsAgreement;
                    checkoutContentFactory$toContentAgreement$1.L$1 = null;
                    checkoutContentFactory$toContentAgreement$1.label = 1;
                    obj = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) this.b).a(fromLegalInfo, wlsVar, checkoutContentFactory$toContentAgreement$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) checkoutContentFactory$toContentAgreement$1.L$0;
                    kotlin.b.b(obj);
                }
                return new gjb((CharSequence) obj, plusPayMailingAdsAgreement.isAgreementsChecked());
            }
        }
        checkoutContentFactory$toContentAgreement$1 = new CheckoutContentFactory$toContentAgreement$1(this, continuationImpl);
        Object obj2 = checkoutContentFactory$toContentAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutContentFactory$toContentAgreement$1.label;
        if (i != 0) {
        }
        return new gjb((CharSequence) obj2, plusPayMailingAdsAgreement.isAgreementsChecked());
    }
}
