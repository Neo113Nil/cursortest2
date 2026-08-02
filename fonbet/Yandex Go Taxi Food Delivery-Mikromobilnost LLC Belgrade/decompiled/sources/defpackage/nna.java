package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class nna {
    public final dei0 a;
    public final EnumMap b;

    public nna(dei0 dei0Var) {
        this.a = dei0Var;
        EnumMap enumMap = new EnumMap(RealtimeEventType.class);
        Iterator<E> it = RealtimeEventType.a().iterator();
        while (it.hasNext()) {
            enumMap.put((EnumMap) it.next(), (RealtimeEventType) new LinkedHashSet());
        }
        this.b = enumMap;
    }

    public final void a(Map map, RealtimeEventType realtimeEventType) {
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get("creative_id");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (str2.length() == 0) {
            return;
        }
        if (realtimeEventType == RealtimeEventType.Clicked ? true : ((Set) b.g(realtimeEventType, this.b)).add(str2)) {
            int i = mna.a[realtimeEventType.ordinal()];
            dei0 dei0Var = this.a;
            if (i == 1) {
                ((a) dei0Var).d(new iei0(CreativeType.PromoOnSummary, str2, map, null, 18));
            } else if (i == 2) {
                ((a) dei0Var).d(new iei0(CreativeType.PromoOnSummary, str2, map, null, null, 50));
            } else {
                if (i != 3) {
                    return;
                }
                ((a) dei0Var).d(new lei0(CreativeType.PromoOnSummary, str2, map));
            }
        }
    }
}
