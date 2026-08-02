package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$SectionDetailElement", "Lcom/yandex/go/taxi/order/models/api/response/c2;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$CardElement$SectionDetailElement extends c2 {
    public static final y1 Companion = new y1();
    public final String a;
    public final OrderDetailsCardResponse.CardIcon b;
    public final String c;
    public final FormattedText d;

    public OrderDetailsCardResponse$CardElement$SectionDetailElement(int i, String str, OrderDetailsCardResponse.CardIcon cardIcon, String str2, FormattedText formattedText) {
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
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.c2
    public final OrderDetailsCardResponse$CardElement$Type a() {
        return OrderDetailsCardResponse$CardElement$Type.SECTION_DETAIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsCardResponse$CardElement$SectionDetailElement)) {
            return false;
        }
        OrderDetailsCardResponse$CardElement$SectionDetailElement orderDetailsCardResponse$CardElement$SectionDetailElement = (OrderDetailsCardResponse$CardElement$SectionDetailElement) obj;
        return jl40.l(this.a, orderDetailsCardResponse$CardElement$SectionDetailElement.a) && jl40.l(this.b, orderDetailsCardResponse$CardElement$SectionDetailElement.b) && jl40.l(this.c, orderDetailsCardResponse$CardElement$SectionDetailElement.c) && jl40.l(this.d, orderDetailsCardResponse$CardElement$SectionDetailElement.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderDetailsCardResponse.CardIcon cardIcon = this.b;
        int hashCode2 = (hashCode + (cardIcon == null ? 0 : cardIcon.hashCode())) * 31;
        String str2 = this.c;
        return this.d.a.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SectionDetailElement(id=" + this.a + ", icon=" + this.b + ", backgroundColor=" + this.c + ", title=" + this.d + Extension.C_BRAKE;
    }

    public OrderDetailsCardResponse$CardElement$SectionDetailElement() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = formattedText;
    }
}
