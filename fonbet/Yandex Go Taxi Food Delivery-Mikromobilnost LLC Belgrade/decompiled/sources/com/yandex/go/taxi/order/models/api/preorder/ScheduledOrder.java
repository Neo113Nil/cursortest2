package com.yandex.go.taxi.order.models.api.preorder;

import defpackage.gsq0;
import java.util.Calendar;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/ScheduledOrder;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScheduledOrder {
    public static final b Companion = new b();
    public Calendar a;
    public Calendar b;
    public String c;
    public int d;
    public Integer e;

    public ScheduledOrder(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = null;
    }

    public ScheduledOrder() {
        this(0);
    }
}
