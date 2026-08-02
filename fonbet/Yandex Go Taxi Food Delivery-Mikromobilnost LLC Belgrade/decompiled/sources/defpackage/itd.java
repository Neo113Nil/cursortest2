package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class itd implements ejg0 {
    public final String a;
    public final List b;
    public final yf70 c;
    public final yf70 d;
    public final yf70 e;
    public final String f;
    public final yf70 g;
    public final Object h;

    public itd(String str, List list, yf70 yf70Var, yf70 yf70Var2, yf70 yf70Var3, String str2, yf70 yf70Var4, Object obj) {
        this.a = str;
        this.b = list;
        this.c = yf70Var;
        this.d = yf70Var2;
        this.e = yf70Var3;
        this.f = str2;
        this.g = yf70Var4;
        this.h = obj;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("eventSessionId");
        foe foeVar = l80.a;
        bfxVar.r0(this.a);
        bfxVar.A1("purchasedOptionOffers");
        wkf wkfVar = rs60.a;
        b70 d = cVar.d(wkfVar);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        bfxVar.l();
        for (Object obj : this.b) {
            if (obj == null) {
                bfxVar.k2();
            } else {
                d.a(bfxVar, cVar, obj);
            }
        }
        bfxVar.j();
        yf70 yf70Var = this.c;
        if (yf70Var instanceof xf70) {
            bfxVar.A1("purchasedTariffOffers");
            b70 d2 = cVar.d(wkfVar);
            if (d2 instanceof om60) {
                ny61.r("The adapter is already nullable");
                return;
            }
            Object obj2 = ((xf70) yf70Var).a;
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                d2.a(bfxVar, cVar, obj2);
            }
        }
        yf70 yf70Var2 = this.d;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("flags");
            l80.m.a(bfxVar, cVar, ((xf70) yf70Var2).a);
        }
        yf70 yf70Var3 = this.e;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("testIds");
            lqy lqyVar = new lqy(foeVar);
            Object obj3 = ((xf70) yf70Var3).a;
            if (obj3 == null) {
                bfxVar.k2();
            } else {
                lqyVar.a(bfxVar, cVar, obj3);
            }
        }
        bfxVar.A1("target");
        bfxVar.r0(this.f);
        yf70 yf70Var4 = this.g;
        if (yf70Var4 instanceof xf70) {
            bfxVar.A1("inAppPurchases");
            lqy lqyVar2 = new lqy(l80.a(g97.k));
            Object obj4 = ((xf70) yf70Var4).a;
            if (obj4 == null) {
                bfxVar.k2();
            } else {
                lqyVar2.a(bfxVar, cVar, obj4);
            }
        }
        bfxVar.A1("language");
        foe foeVar2 = l80.a;
        uga1.f(bfxVar, this.h);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(ltd.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query CompositeUpsale($eventSessionId: String!, $purchasedOptionOffers: [OfferNameScalar]!, $purchasedTariffOffers: OfferNameScalar, $flags: Map_String_BooleanScalar, $testIds: [String!], $target: String!, $inAppPurchases: [InAppPurchaseInput!], $language: LanguageISO639Scalar!) { upsaleComposites(input: { eventSessionId: $eventSessionId purchasedOffers: { optionOffers: $purchasedOptionOffers tariffOffer: $purchasedTariffOffers }  experiments: { flags: $flags testIds: $testIds }  target: $target language: $language inAppPurchases: $inAppPurchases } ) { offersBatchIdUpsale eventSessionId upsales { offer { __typename ...compositeOffer } asset { titleText subtitleText benefits { text } acceptButtonText buttonText buttonAdditionalText rejectButtonText mainImageMobile mainImageTV } storePurchaseInfo { __typename ...storePurchaseInfo } } } }  fragment offerPrice on Price { currency amount }  fragment offerIntroPlan on IntroPlan { period price { __typename ...offerPrice } repetitionCount }  fragment offerIntroUntilPlan on IntroUntilPlan { price { __typename ...offerPrice } until }  fragment offerTrialPlan on TrialPlan { period }  fragment offerTrialUntilPlan on TrialUntilPlan { until }  fragment offerPlan on OfferPlanUnion { __typename ... on IntroPlan { __typename ...offerIntroPlan } ... on IntroUntilPlan { __typename ...offerIntroUntilPlan } ... on TrialPlan { __typename ...offerTrialPlan } ... on TrialUntilPlan { __typename ...offerTrialUntilPlan } }  fragment tariffOffer on TariffOffer { name title tariff { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment optionOffer on OptionOffer { name title option { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment legalInfo on LegalInfo { text items { type key data { text link } } }  fragment compositeOffer on CompositeOffer { positionId structureType forActiveTariff { name } tariffOffer { __typename ...tariffOffer } optionOffers { __typename ...optionOffer } legalInfo { __typename ...legalInfo } invoices { timestamp totalPrice { __typename ...offerPrice } } asset { buttonText buttonTextWithDetails subscriptionName } silentInvoiceAvailable }  fragment storePurchaseInfo on StorePurchaseInfo { googleOfferReplaceParams { purchaseToken strategy } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itd)) {
            return false;
        }
        itd itdVar = (itd) obj;
        return jl40.l(this.a, itdVar.a) && jl40.l(this.b, itdVar.b) && this.c.equals(itdVar.c) && this.d.equals(itdVar.d) && this.e.equals(itdVar.e) && jl40.l(this.f, itdVar.f) && this.g.equals(itdVar.g) && jl40.l(this.h, itdVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + vfc.b(this.g, unr0.b(vfc.b(this.e, vfc.b(this.d, vfc.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "9dd18bce805df290d254f82b54f35d5ac341f26fb3eeff4f317a0ce57dd14b0b";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "CompositeUpsale";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeUpsaleQuery(eventSessionId=");
        sb.append(this.a);
        sb.append(", purchasedOptionOffers=");
        sb.append(this.b);
        sb.append(", purchasedTariffOffers=");
        sb.append(this.c);
        sb.append(", flags=");
        sb.append(this.d);
        sb.append(", testIds=");
        sb.append(this.e);
        sb.append(", target=");
        sb.append(this.f);
        sb.append(", inAppPurchases=");
        sb.append(this.g);
        sb.append(", language=");
        return qv10.r(sb, this.h, ')');
    }
}
