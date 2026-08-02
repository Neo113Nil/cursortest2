package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$DetailsElement", "Lcom/yandex/go/taxi/order/models/api/response/c2;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/t1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$CardElement$DetailsElement extends c2 {
    public static final t1 Companion = new t1();
    public final String a;
    public final OrderDetailsCardResponse.CardIcon b;
    public final i1 c;
    public final FormattedText d;
    public final FormattedText e;

    public OrderDetailsCardResponse$CardElement$DetailsElement(int i, String str, OrderDetailsCardResponse.CardIcon cardIcon, i1 i1Var, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cardIcon;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = i1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText2;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.c2
    public final OrderDetailsCardResponse$CardElement$Type a() {
        return OrderDetailsCardResponse$CardElement$Type.DETAILS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsCardResponse$CardElement$DetailsElement)) {
            return false;
        }
        OrderDetailsCardResponse$CardElement$DetailsElement orderDetailsCardResponse$CardElement$DetailsElement = (OrderDetailsCardResponse$CardElement$DetailsElement) obj;
        return jl40.l(this.a, orderDetailsCardResponse$CardElement$DetailsElement.a) && jl40.l(this.b, orderDetailsCardResponse$CardElement$DetailsElement.b) && jl40.l(this.c, orderDetailsCardResponse$CardElement$DetailsElement.c) && jl40.l(this.d, orderDetailsCardResponse$CardElement$DetailsElement.d) && jl40.l(this.e, orderDetailsCardResponse$CardElement$DetailsElement.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderDetailsCardResponse.CardIcon cardIcon = this.b;
        int hashCode2 = (hashCode + (cardIcon == null ? 0 : cardIcon.hashCode())) * 31;
        i1 i1Var = this.c;
        int hashCode3 = (hashCode2 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        FormattedText formattedText = this.d;
        int hashCode4 = (hashCode3 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.e;
        return hashCode4 + (formattedText2 != null ? formattedText2.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailsElement(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", accessory=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        return tse0.m(sb, this.e, Extension.C_BRAKE);
    }

    public OrderDetailsCardResponse$CardElement$DetailsElement() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
