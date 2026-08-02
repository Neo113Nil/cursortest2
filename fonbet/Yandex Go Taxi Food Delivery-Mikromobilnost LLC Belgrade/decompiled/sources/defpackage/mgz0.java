package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes14.dex */
public final class mgz0 {
    public final jtq0 a;
    public final vze0 b;
    public final xdf c;
    public final ine0 d;
    public final egz0 e;
    public final MainUiAvailabilityMonitor f;
    public final lgz0 g;
    public volatile Boolean h;

    public mgz0(jtq0 jtq0Var, vze0 vze0Var, xdf xdfVar, ine0 ine0Var, egz0 egz0Var, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, lgz0 lgz0Var) {
        this.a = jtq0Var;
        this.b = vze0Var;
        this.c = xdfVar;
        this.d = ine0Var;
        this.e = egz0Var;
        this.f = mainUiAvailabilityMonitor;
        this.g = lgz0Var;
    }

    public final boolean a(TaxiOrder taxiOrder) {
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        lgz0 lgz0Var = this.g;
        String str = taxiOrder.a;
        lj60 a = lgz0Var.a();
        boolean containsKey = a.a.containsKey(str);
        long currentTimeMillis = System.currentTimeMillis();
        Map map = a.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            long longValue = ((Number) entry.getValue()).longValue();
            o430 o430Var = e3n.b;
            if (e3n.o(kp50.V(currentTimeMillis - longValue, DurationUnit.MILLISECONDS), DurationUnit.DAYS) < 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (map.size() != linkedHashMap.size()) {
            lj60 lj60Var = new lj60(linkedHashMap);
            lgz0Var.b.r("SHOWED_INFO_KEY", ((xnt) lgz0Var.a).e(lj60Var, lj60.Companion.serializer()));
        }
        this.h = Boolean.valueOf(containsKey);
        return containsKey;
    }

    public final boolean b(TaxiOrder taxiOrder) {
        boolean z;
        boolean z2;
        Integer num;
        TipsVariant tipsVariant = (TipsVariant) a.R(taxiOrder.V().E.a);
        if (tipsVariant != null) {
            List a = tipsVariant.a();
            boolean z3 = a instanceof Collection;
            if (!z3 || !a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (((TipsVariant.TipsChoice) it.next()).c > 0.0f) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean e = diz0.e(taxiOrder.y());
            boolean z4 = this.d.a.s() == 0;
            if (!z3 || !a.isEmpty()) {
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    if (((TipsVariant.TipsChoice) it2.next()).a != TipsType.FLAT) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            FeedbackDto k = taxiOrder.k();
            int intValue = (k == null || (num = k.a) == null) ? 0 : num.intValue();
            TipsVariant.Match match = tipsVariant.c;
            boolean z5 = intValue == 0 || intValue >= (match != null ? match.b : 0);
            if (z && !e && z4 && z2 && z5) {
                return true;
            }
        }
        return false;
    }
}
