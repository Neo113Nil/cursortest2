package defpackage;

import com.yandex.go.search.router.Origin;
import kotlin.Pair;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class dyh {
    public static Pair a(pv0 pv0Var, PointType pointType, tls tlsVar) {
        return new Pair(new m41(pointType.a() ? kyh0.address_search_modal_view_from : kyh0.address_search_modal_view_to, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, pointType, Origin.DELIVERY, pv0Var, pv0Var != null ? pv0Var.a.B() : null, true, true, null, null, null, 524032), new cyh(0, tlsVar));
    }
}
