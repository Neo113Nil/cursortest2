package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$Action$CopyToClipboard", "Lcom/yandex/go/taxi/order/models/api/response/n1;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/k1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$CardElement$Action$CopyToClipboard extends n1 {
    public static final k1 Companion = new k1();
    public final String a;

    public OrderDetailsCardResponse$CardElement$Action$CopyToClipboard(int i, String str) {
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
        return (obj instanceof OrderDetailsCardResponse$CardElement$Action$CopyToClipboard) && jl40.l(this.a, ((OrderDetailsCardResponse$CardElement$Action$CopyToClipboard) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CopyToClipboard(payload=", this.a, Extension.C_BRAKE);
    }

    public OrderDetailsCardResponse$CardElement$Action$CopyToClipboard() {
        this.a = "";
    }
}
