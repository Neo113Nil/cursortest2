package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/yandex/go/taxi/order/OrderStatusProvider$IllegalDriveStateException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderStatusProvider$IllegalDriveStateException extends RuntimeException {
    public final transient TaxiOrder a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderStatusProvider$IllegalDriveStateException(TaxiOrder taxiOrder) {
        super(r0);
        String str;
        if (taxiOrder == null) {
            str = "Null order passed";
        } else {
            str = "Illegal order state [" + taxiOrder.h.getB() + "]";
        }
        this.a = taxiOrder;
    }

    public OrderStatusProvider$IllegalDriveStateException() {
        this(null);
    }
}
