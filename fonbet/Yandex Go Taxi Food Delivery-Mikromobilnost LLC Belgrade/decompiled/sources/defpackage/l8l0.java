package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class l8l0 {
    public final d0l0 a;
    public final List b;
    public final List c;

    public l8l0(TaxiOrder taxiOrder) {
        this.a = taxiOrder.t();
        this.b = taxiOrder.V().C;
        RouteInfo routeInfo = taxiOrder.V().r;
        this.c = routeInfo != null ? routeInfo.c() : EmptyList.a;
    }
}
