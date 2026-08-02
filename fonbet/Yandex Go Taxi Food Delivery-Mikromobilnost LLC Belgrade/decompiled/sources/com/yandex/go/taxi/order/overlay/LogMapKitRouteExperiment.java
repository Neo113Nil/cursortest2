package com.yandex.go.taxi.order.overlay;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.o3z;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/overlay/LogMapKitRouteExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/order/overlay/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LogMapKitRouteExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(9))};
    public static final LogMapKitRouteExperiment d = new LogMapKitRouteExperiment(0);
    public final List b;

    public /* synthetic */ LogMapKitRouteExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public LogMapKitRouteExperiment(int i) {
        this.b = EmptyList.a;
    }

    public LogMapKitRouteExperiment() {
        this(0);
    }
}
