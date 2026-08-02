package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.TEMPLATE_TAG;
import com.yandex.plus.core.graphql.type.TRANSITION_LANGUAGE;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h8f implements b050 {
    public final String a;
    public final yf70 b;
    public final List c;
    public final yf70 d;
    public final TRANSITION_LANGUAGE e;
    public final String f;
    public final String g;
    public final String h;
    public final TEMPLATE_TAG i;
    public final String j;
    public final String k;
    public final String l;
    public final yf70 m;

    public h8f(String str, yf70 yf70Var, List list, yf70 yf70Var2, TRANSITION_LANGUAGE transition_language, String str2, String str3, String str4, TEMPLATE_TAG template_tag, String str5, String str6, String str7, yf70 yf70Var3) {
        this.a = str;
        this.b = yf70Var;
        this.c = list;
        this.d = yf70Var2;
        this.e = transition_language;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = template_tag;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = yf70Var3;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("eventSessionId");
        foe foeVar = l80.a;
        bfxVar.r0(this.a);
        yf70 yf70Var = this.b;
        boolean z = yf70Var instanceof xf70;
        wkf wkfVar = rs60.a;
        if (z) {
            bfxVar.A1("tariffId");
            new om60(cVar.d(wkfVar)).a(bfxVar, cVar, ((xf70) yf70Var).a);
        }
        bfxVar.A1("optionsIds");
        b70 d = cVar.d(wkfVar);
        bfxVar.l();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            d.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        yf70 yf70Var2 = this.d;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("offerFor");
            new om60(cVar.d(wkfVar)).a(bfxVar, cVar, ((xf70) yf70Var2).a);
        }
        bfxVar.A1("language");
        bfxVar.r0(this.e.getRawValue());
        bfxVar.A1("origin");
        bfxVar.r0(this.f);
        bfxVar.A1("returnPath");
        cVar.d(mr11.a).a(bfxVar, cVar, "");
        bfxVar.A1("source");
        bfxVar.r0(this.g);
        bfxVar.A1("target");
        bfxVar.r0(this.h);
        bfxVar.A1("templateTag");
        bfxVar.r0(this.i.getRawValue());
        bfxVar.A1("developerPayload");
        bfxVar.r0("");
        bfxVar.A1("offersPositionId");
        bfxVar.r0(this.j);
        bfxVar.A1("offersBatchId");
        bfxVar.r0(this.k);
        bfxVar.A1("externalCallerPayload");
        bfxVar.r0(this.l);
        yf70 yf70Var3 = this.m;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("experimentFlags");
            new om60(new lqy(foeVar)).a(bfxVar, cVar, ((xf70) yf70Var3).a);
        }
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(i8f.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation CreateSilentInvoice($eventSessionId: String!, $tariffId: OfferNameScalar, $optionsIds: [OfferNameScalar!]!, $offerFor: OfferNameScalar, $language: TRANSITION_LANGUAGE!, $origin: String!, $returnPath: URLScalar!, $source: String!, $target: String!, $templateTag: TEMPLATE_TAG!, $developerPayload: String!, $offersPositionId: String!, $offersBatchId: String!, $externalCallerPayload: String!, $experimentFlags: [String!]) { invoice { externalCreate(eventSessionId: $eventSessionId, req: { offersPositionId: $offersPositionId offersBatchId: $offersBatchId compositeOffer: { tariffOffer: $tariffId serviceOffers: $optionsIds offerFor: $offerFor }  developerPayload: $developerPayload language: $language origin: $origin returnPath: $returnPath source: $source target: $target templateTag: $templateTag silent: true externalCallerPayload: $externalCallerPayload oneClickRequested: true experimentFlags: $experimentFlags } ) { __typename ...invoice } } }  fragment invoicePrice on Price { currency amount }  fragment invoicePayment on Payment { id respCode respDesc status }  fragment invoice on Invoice { id invoiceStatus form paymentMethodId paidAmount { __typename ...invoicePrice } payment { __typename ...invoicePayment } totalAmount { __typename ...invoicePrice } invoicePollingParams { retryDelayMillis timeoutMillis } widgetQrCodeParams { widgetUrl underlineText } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8f)) {
            return false;
        }
        h8f h8fVar = (h8f) obj;
        return jl40.l(this.a, h8fVar.a) && this.b.equals(h8fVar.b) && jl40.l(this.c, h8fVar.c) && this.d.equals(h8fVar.d) && this.e == h8fVar.e && jl40.l(this.f, h8fVar.f) && jl40.l(this.g, h8fVar.g) && jl40.l(this.h, h8fVar.h) && this.i == h8fVar.i && jl40.l(this.j, h8fVar.j) && jl40.l(this.k, h8fVar.k) && this.l.equals(h8fVar.l) && this.m.equals(h8fVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + unr0.b(unr0.b(unr0.b((this.i.hashCode() + unr0.b(unr0.b(unr0.b((this.e.hashCode() + vfc.b(this.d, unr0.c(vfc.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31, 961, this.f), 31, this.g), 31, this.h)) * 961, 31, this.j), 31, this.k), 31, this.l);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "0c92e20359e92ad941b68687edc36bbef8e0f4b24b1ef24b110841abe17e4fc1";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "CreateSilentInvoice";
    }

    public final String toString() {
        return "CreateSilentInvoiceMutation(eventSessionId=" + this.a + ", tariffId=" + this.b + ", optionsIds=" + this.c + ", offerFor=" + this.d + ", language=" + this.e + ", origin=" + this.f + ", returnPath=, source=" + this.g + ", target=" + this.h + ", templateTag=" + this.i + ", developerPayload=, offersPositionId=" + this.j + ", offersBatchId=" + this.k + ", externalCallerPayload=" + this.l + ", experimentFlags=" + this.m + ')';
    }
}
