package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$RideSupportElement", "Lcom/yandex/go/taxi/order/models/api/response/c2;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/w1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$CardElement$RideSupportElement extends c2 {
    public static final w1 Companion = new w1();
    public final String a;
    public final OrderDetailsCardResponse.CardIcon b;
    public final i1 c;
    public final FormattedText d;
    public final n1 e;

    public OrderDetailsCardResponse$CardElement$RideSupportElement(int i, String str, OrderDetailsCardResponse.CardIcon cardIcon, i1 i1Var, FormattedText formattedText, n1 n1Var) {
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
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = m1.INSTANCE;
        } else {
            this.e = n1Var;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.c2
    public final OrderDetailsCardResponse$CardElement$Type a() {
        return OrderDetailsCardResponse$CardElement$Type.RIDE_SUPPORT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsCardResponse$CardElement$RideSupportElement)) {
            return false;
        }
        OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement = (OrderDetailsCardResponse$CardElement$RideSupportElement) obj;
        return jl40.l(this.a, orderDetailsCardResponse$CardElement$RideSupportElement.a) && jl40.l(this.b, orderDetailsCardResponse$CardElement$RideSupportElement.b) && jl40.l(this.c, orderDetailsCardResponse$CardElement$RideSupportElement.c) && jl40.l(this.d, orderDetailsCardResponse$CardElement$RideSupportElement.d) && jl40.l(this.e, orderDetailsCardResponse$CardElement$RideSupportElement.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderDetailsCardResponse.CardIcon cardIcon = this.b;
        int hashCode2 = (hashCode + (cardIcon == null ? 0 : cardIcon.hashCode())) * 31;
        i1 i1Var = this.c;
        return this.e.hashCode() + unr0.c((hashCode2 + (i1Var != null ? i1Var.hashCode() : 0)) * 31, 31, this.d.a);
    }

    public final String toString() {
        return "RideSupportElement(id=" + this.a + ", icon=" + this.b + ", accessory=" + this.c + ", title=" + this.d + ", action=" + this.e + Extension.C_BRAKE;
    }

    public OrderDetailsCardResponse$CardElement$RideSupportElement() {
        FormattedText formattedText = FormattedText.c;
        m1 m1Var = m1.INSTANCE;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = formattedText;
        this.e = m1Var;
    }
}
