package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$CompleteButtonElement", "Lcom/yandex/go/taxi/order/models/api/response/c2;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/r1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$CardElement$CompleteButtonElement extends c2 {
    public static final r1 Companion = new r1();
    public final String a;
    public final FormattedText b;
    public final n1 c;

    public OrderDetailsCardResponse$CardElement$CompleteButtonElement(int i, String str, FormattedText formattedText, n1 n1Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = m1.INSTANCE;
        } else {
            this.c = n1Var;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.c2
    public final OrderDetailsCardResponse$CardElement$Type a() {
        return OrderDetailsCardResponse$CardElement$Type.COMPLETE_BUTTON;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsCardResponse$CardElement$CompleteButtonElement)) {
            return false;
        }
        OrderDetailsCardResponse$CardElement$CompleteButtonElement orderDetailsCardResponse$CardElement$CompleteButtonElement = (OrderDetailsCardResponse$CardElement$CompleteButtonElement) obj;
        return jl40.l(this.a, orderDetailsCardResponse$CardElement$CompleteButtonElement.a) && jl40.l(this.b, orderDetailsCardResponse$CardElement$CompleteButtonElement.b) && jl40.l(this.c, orderDetailsCardResponse$CardElement$CompleteButtonElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder q = xvz.q("CompleteButtonElement(id=", this.a, ", title=", ", action=", this.b);
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public OrderDetailsCardResponse$CardElement$CompleteButtonElement() {
        FormattedText formattedText = FormattedText.c;
        m1 m1Var = m1.INSTANCE;
        this.a = "";
        this.b = formattedText;
        this.c = m1Var;
    }
}
