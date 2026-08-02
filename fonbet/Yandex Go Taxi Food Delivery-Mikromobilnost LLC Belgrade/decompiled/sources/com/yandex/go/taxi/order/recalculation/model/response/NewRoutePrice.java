package com.yandex.go.taxi.order.recalculation.model.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/recalculation/model/response/NewRoutePrice;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/recalculation/model/response/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class NewRoutePrice {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final long c;
    public final ief d;

    public /* synthetic */ NewRoutePrice(int i, String str, String str2, long j, ief iefVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 10L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = ief.e;
        } else {
            this.d = iefVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewRoutePrice)) {
            return false;
        }
        NewRoutePrice newRoutePrice = (NewRoutePrice) obj;
        return jl40.l(this.a, newRoutePrice.a) && jl40.l(this.b, newRoutePrice.b) && this.c == newRoutePrice.c && jl40.l(this.d, newRoutePrice.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("NewRoutePrice(recalculationId=", this.a, ", pricingMessage=", this.b, ", pollingDelay=");
        v.append(this.c);
        v.append(", currencyRulesDto=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public NewRoutePrice() {
        this.a = "";
        this.b = "";
        this.c = 10L;
        this.d = ief.e;
    }
}
