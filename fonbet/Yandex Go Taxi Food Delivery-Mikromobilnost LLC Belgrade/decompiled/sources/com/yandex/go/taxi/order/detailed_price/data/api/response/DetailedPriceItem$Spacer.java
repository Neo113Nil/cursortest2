package com.yandex.go.taxi.order.detailed_price.data.api.response;

import defpackage.gsq0;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem$Spacer", "Lcom/yandex/go/taxi/order/detailed_price/data/api/response/j;", "Companion", "$serializer", "com/yandex/go/taxi/order/detailed_price/data/api/response/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DetailedPriceItem$Spacer extends j {
    public static final g Companion = new g();
    public final int a;

    public DetailedPriceItem$Spacer(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailedPriceItem$Spacer) && this.a == ((DetailedPriceItem$Spacer) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Spacer(value=", Extension.C_BRAKE);
    }

    public DetailedPriceItem$Spacer() {
        this.a = 0;
    }
}
