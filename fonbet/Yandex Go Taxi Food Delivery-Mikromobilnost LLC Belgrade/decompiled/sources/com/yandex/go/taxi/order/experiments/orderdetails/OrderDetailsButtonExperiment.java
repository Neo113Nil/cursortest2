package com.yandex.go.taxi.order.experiments.orderdetails;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl70;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/orderdetails/OrderDetailsButtonExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/order/experiments/orderdetails/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderDetailsButtonExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(24))};
    public static final OrderDetailsButtonExperiment e = new OrderDetailsButtonExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ OrderDetailsButtonExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public OrderDetailsButtonExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public OrderDetailsButtonExperiment() {
        this(0);
    }
}
