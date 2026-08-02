package com.yandex.go.taxi.order.performer;

import com.yandex.go.taxi.order.models.api.objects.DriverPictures;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/performer/OrderPerformerInfoResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/performer/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderPerformerInfoResponse {
    public static final c Companion = new c();
    public final DriverPictures a;

    public /* synthetic */ OrderPerformerInfoResponse(int i, DriverPictures driverPictures) {
        if ((i & 1) == 0) {
            this.a = DriverPictures.c;
        } else {
            this.a = driverPictures;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderPerformerInfoResponse) && jl40.l(this.a, ((OrderPerformerInfoResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrderPerformerInfoResponse(photos=" + this.a + Extension.C_BRAKE;
    }

    public OrderPerformerInfoResponse() {
        this.a = DriverPictures.c;
    }
}
