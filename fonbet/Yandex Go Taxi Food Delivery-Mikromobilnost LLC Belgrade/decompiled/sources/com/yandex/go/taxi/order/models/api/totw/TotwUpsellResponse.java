package com.yandex.go.taxi.order.models.api.totw;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/totw/TotwUpsellResponse;", "", "Companion", "Card", "com/yandex/go/taxi/order/models/api/totw/b", "com/yandex/go/taxi/order/models/api/totw/c", "com/yandex/go/taxi/order/models/api/totw/g", "Deeplink", "$serializer", "com/yandex/go/taxi/order/models/api/totw/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TotwUpsellResponse {
    public static final e Companion = new e();
    public final String a;
    public final Card b;
    public final int c;
    public final boolean d;
    public final b e;

    public /* synthetic */ TotwUpsellResponse(int i, String str, Card card, int i2, boolean z, b bVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = card;
        }
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = g.INSTANCE;
        } else {
            this.e = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotwUpsellResponse)) {
            return false;
        }
        TotwUpsellResponse totwUpsellResponse = (TotwUpsellResponse) obj;
        return jl40.l(this.a, totwUpsellResponse.a) && jl40.l(this.b, totwUpsellResponse.b) && this.c == totwUpsellResponse.c && this.d == totwUpsellResponse.d && jl40.l(this.e, totwUpsellResponse.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Card card = this.b;
        return this.e.hashCode() + unr0.e(oyr.b(this.c, (hashCode + (card == null ? 0 : card.hashCode())) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotwUpsellResponse(id=");
        sb.append(this.a);
        sb.append(", card=");
        sb.append(this.b);
        sb.append(", maxShowCount=");
        tse0.z(sb, this.c, ", hideOnAction=", this.d, ", action=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/totw/TotwUpsellResponse$Deeplink;", "Lcom/yandex/go/taxi/order/models/api/totw/b;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/totw/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Deeplink extends b {
        public static final f Companion = new f();
        public final String a;

        public Deeplink(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Deeplink) && jl40.l(this.a, ((Deeplink) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
        }

        public Deeplink() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/totw/TotwUpsellResponse$Card;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/totw/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Card {
        public static final d Companion = new d();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;

        public /* synthetic */ Card(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return jl40.l(this.a, card.a) && jl40.l(this.b, card.b) && jl40.l(this.c, card.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return oyr.t(n.r("Card(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
        }

        public Card() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = "";
        }
    }

    public TotwUpsellResponse() {
        this(0);
    }

    public TotwUpsellResponse(int i) {
        g gVar = g.INSTANCE;
        this.a = "";
        this.b = null;
        this.c = Integer.MAX_VALUE;
        this.d = false;
        this.e = gVar;
    }
}
