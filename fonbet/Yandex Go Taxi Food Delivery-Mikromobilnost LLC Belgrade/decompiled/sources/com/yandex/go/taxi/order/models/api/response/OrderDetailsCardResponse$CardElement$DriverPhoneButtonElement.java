package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement", "Lcom/yandex/go/taxi/order/models/api/response/c2;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/u1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement extends c2 {
    public static final u1 Companion = new u1();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final i1 d;
    public final n1 e;

    public OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement(int i, String str, FormattedText formattedText, FormattedText formattedText2, i1 i1Var, n1 n1Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = i1Var;
        }
        if ((i & 16) == 0) {
            this.e = m1.INSTANCE;
        } else {
            this.e = n1Var;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.c2
    public final OrderDetailsCardResponse$CardElement$Type a() {
        return OrderDetailsCardResponse$CardElement$Type.DRIVER_PHONE_NUMBER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement)) {
            return false;
        }
        OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement orderDetailsCardResponse$CardElement$DriverPhoneButtonElement = (OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement) obj;
        return jl40.l(this.a, orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.a) && jl40.l(this.b, orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.b) && jl40.l(this.c, orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.c) && jl40.l(this.d, orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.d) && jl40.l(this.e, orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.e);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
        i1 i1Var = this.d;
        return this.e.hashCode() + ((c + (i1Var == null ? 0 : i1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder q = xvz.q("DriverPhoneButtonElement(id=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", accessory=");
        q.append(this.d);
        q.append(", action=");
        q.append(this.e);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement() {
        FormattedText formattedText = FormattedText.c;
        m1 m1Var = m1.INSTANCE;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = null;
        this.e = m1Var;
    }
}
