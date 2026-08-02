package com.yandex.go.taxi.order.detailed_price.data.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem$Text", "Lcom/yandex/go/taxi/order/detailed_price/data/api/response/j;", "Companion", "$serializer", "com/yandex/go/taxi/order/detailed_price/data/api/response/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DetailedPriceItem$Text extends j {
    public static final h Companion = new h();
    public final FormattedText a;

    public DetailedPriceItem$Text(int i, FormattedText formattedText) {
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
        return (obj instanceof DetailedPriceItem$Text) && jl40.l(this.a, ((DetailedPriceItem$Text) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("Text(text=", Extension.C_BRAKE, this.a);
    }

    public DetailedPriceItem$Text() {
        this.a = FormattedText.c;
    }
}
