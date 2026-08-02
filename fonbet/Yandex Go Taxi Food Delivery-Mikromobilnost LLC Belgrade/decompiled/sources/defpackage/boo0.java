package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class boo0 implements zno0 {
    public final dei0 a;
    public final EnumMap b;

    public boo0(dei0 dei0Var) {
        this.a = dei0Var;
        ((Boolean) ((a) dei0Var).d.getValue()).booleanValue();
        EnumMap enumMap = new EnumMap(RealtimeEventType.class);
        Iterator<E> it = RealtimeEventType.a().iterator();
        while (it.hasNext()) {
            enumMap.put((EnumMap) it.next(), (RealtimeEventType) new LinkedHashSet());
        }
        enumMap.remove(RealtimeEventType.Clicked);
        this.b = enumMap;
    }

    public final void a(String str, Map map, RealtimeEventType realtimeEventType) {
        Set set;
        boolean z;
        if (map.isEmpty() || str.length() == 0) {
            return;
        }
        if (realtimeEventType == RealtimeEventType.Clicked || (set = (Set) this.b.get(realtimeEventType)) == null) {
            z = true;
        } else {
            boolean contains = set.contains(str);
            if (!contains) {
                set.add(str);
            }
            z = !contains;
        }
        if (z) {
            int i = aoo0.a[realtimeEventType.ordinal()];
            dei0 dei0Var = this.a;
            if (i == 1) {
                ((a) dei0Var).d(new iei0(CreativeType.PromoOnSummary, str, map, null, 18));
            } else if (i == 2) {
                ((a) dei0Var).d(new iei0(CreativeType.PromoOnSummary, str, map, null, null, 50));
            } else {
                if (i != 3) {
                    return;
                }
                ((a) dei0Var).d(new lei0(CreativeType.PromoOnSummary, str, map));
            }
        }
    }

    public final void b(yno0 yno0Var) {
        Map map = yno0Var.c;
        if (map != null) {
            String str = (String) map.get("creative_id");
            if (str == null) {
                str = "";
            }
            a(str, map, RealtimeEventType.Clicked);
        }
    }

    public final void c(yno0 yno0Var) {
        Map map = yno0Var.c;
        if (map != null) {
            String str = (String) map.get("creative_id");
            if (str == null) {
                str = "";
            }
            a(str, map, RealtimeEventType.Received);
        }
    }
}
