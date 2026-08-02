package com.yandex.go.taxi.order.detailed_price.data.api;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/detailed_price/data/api/DetailedPriceRequest;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/detailed_price/data/api/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailedPriceRequest {
    public static final a Companion = new a();
    public final String a;
    public final String b;

    public /* synthetic */ DetailedPriceRequest(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = "order-complete-modal";
        } else {
            this.b = str2;
        }
    }

    public DetailedPriceRequest() {
        this(null, 3);
    }

    public DetailedPriceRequest(String str, int i) {
        this.a = (i & 1) != 0 ? "" : str;
        this.b = "order-complete-modal";
    }
}
