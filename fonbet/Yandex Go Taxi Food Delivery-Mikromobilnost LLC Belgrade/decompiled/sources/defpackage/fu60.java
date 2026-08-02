package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.TRANSITION_LANGUAGE;

/* loaded from: classes2.dex */
public final class fu60 implements ejg0 {
    public final yf70 a;
    public final String b;
    public final String c;
    public final yf70 d;
    public final yf70 e;
    public final yf70 f;
    public final TRANSITION_LANGUAGE g;

    public fu60(yf70 yf70Var, String str, String str2, yf70 yf70Var2, yf70 yf70Var3, yf70 yf70Var4, TRANSITION_LANGUAGE transition_language) {
        this.a = yf70Var;
        this.b = str;
        this.c = str2;
        this.d = yf70Var2;
        this.e = yf70Var3;
        this.f = yf70Var4;
        this.g = transition_language;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        yf70 yf70Var = this.a;
        if (yf70Var instanceof xf70) {
            bfxVar.A1("eventSessionId");
            l80.i.a(bfxVar, cVar, ((xf70) yf70Var).a);
        }
        bfxVar.A1("eventReason");
        foe foeVar = l80.a;
        bfxVar.r0(this.b);
        bfxVar.A1("target");
        bfxVar.r0(this.c);
        yf70 yf70Var2 = this.d;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("features");
            new om60(new lqy(foeVar)).a(bfxVar, cVar, ((xf70) yf70Var2).a);
        }
        yf70 yf70Var3 = this.e;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("tariffName");
            l80.i.a(bfxVar, cVar, ((xf70) yf70Var3).a);
        }
        yf70 yf70Var4 = this.f;
        if (yf70Var4 instanceof xf70) {
            bfxVar.A1("optionNames");
            new om60(new lqy(foeVar)).a(bfxVar, cVar, ((xf70) yf70Var4).a);
        }
        bfxVar.A1("language");
        bfxVar.r0(this.g.getRawValue());
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(gu60.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query Offers($eventSessionId: String, $eventReason: String!, $target: String!, $features: [String!], $tariffName: String, $optionNames: [String!], $language: TRANSITION_LANGUAGE!) { externalCompositeOffers(input: { eventSessionId: $eventSessionId eventReason: $eventReason filter: { target: $target features: $features tariffOfferName: $tariffName serviceOfferNames: $optionNames }  language: $language silent: true } ) { batchPositionId eventSessionId offers { __typename ...compositeOffer } } }  fragment offerPrice on Price { currency amount }  fragment offerIntroPlan on IntroPlan { period price { __typename ...offerPrice } repetitionCount }  fragment offerIntroUntilPlan on IntroUntilPlan { price { __typename ...offerPrice } until }  fragment offerTrialPlan on TrialPlan { period }  fragment offerTrialUntilPlan on TrialUntilPlan { until }  fragment offerPlan on OfferPlanUnion { __typename ... on IntroPlan { __typename ...offerIntroPlan } ... on IntroUntilPlan { __typename ...offerIntroUntilPlan } ... on TrialPlan { __typename ...offerTrialPlan } ... on TrialUntilPlan { __typename ...offerTrialUntilPlan } }  fragment tariffOffer on TariffOffer { name title tariff { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment optionOffer on OptionOffer { name title option { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment legalInfo on LegalInfo { text items { type key data { text link } } }  fragment compositeOffer on CompositeOffer { positionId structureType forActiveTariff { name } tariffOffer { __typename ...tariffOffer } optionOffers { __typename ...optionOffer } legalInfo { __typename ...legalInfo } invoices { timestamp totalPrice { __typename ...offerPrice } } asset { buttonText buttonTextWithDetails subscriptionName } silentInvoiceAvailable }";
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu60)) {
            return false;
        }
        fu60 fu60Var = (fu60) obj;
        return this.a.equals(fu60Var.a) && jl40.l(this.b, fu60Var.b) && jl40.l(this.c, fu60Var.c) && this.d.equals(fu60Var.d) && this.e.equals(fu60Var.e) && this.f.equals(fu60Var.f) && this.g == fu60Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + vfc.b(this.f, vfc.b(this.e, vfc.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "8da49499b4c6c88f8cf9fd23433766936c0944dac335eec91a8578832ab7d1f3";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "Offers";
    }

    public final String toString() {
        return "OffersQuery(eventSessionId=" + this.a + ", eventReason=" + this.b + ", target=" + this.c + ", features=" + this.d + ", tariffName=" + this.e + ", optionNames=" + this.f + ", language=" + this.g + ')';
    }
}
