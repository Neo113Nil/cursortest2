package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$AccessoryResponse$AttributedText", "Lcom/yandex/go/taxi/order/models/api/response/i1;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse$AccessoryResponse$AttributedText extends i1 {
    public static final e1 Companion = new e1();
    public final FormattedText a;

    public OrderDetailsCardResponse$AccessoryResponse$AttributedText(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = FormattedText.c;
        } else {
            this.a = formattedText;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderDetailsCardResponse$AccessoryResponse$AttributedText) && jl40.l(this.a, ((OrderDetailsCardResponse$AccessoryResponse$AttributedText) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("AttributedText(text=", Extension.C_BRAKE, this.a);
    }

    public OrderDetailsCardResponse$AccessoryResponse$AttributedText() {
        this.a = FormattedText.c;
    }
}
