package com.yandex.go.taxi.order.detailed_price.data.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem$Icon", "Lcom/yandex/go/taxi/order/detailed_price/data/api/response/j;", "Companion", "$serializer", "com/yandex/go/taxi/order/detailed_price/data/api/response/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DetailedPriceItem$Icon extends j {
    public static final f Companion = new f();
    public final String a;

    public DetailedPriceItem$Icon(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailedPriceItem$Icon) && jl40.l(this.a, ((DetailedPriceItem$Icon) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Icon(icon=", this.a, Extension.C_BRAKE);
    }

    public DetailedPriceItem$Icon() {
        this.a = null;
    }
}
