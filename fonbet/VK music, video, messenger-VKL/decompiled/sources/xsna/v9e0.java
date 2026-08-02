package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.random.Random;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ProxyConfig.kt */
/* loaded from: classes.dex */
public final class v9e0 {
    public static final v9e0 d;
    public final Set<String> a;
    public final Set<Integer> b;
    public final List<aae0> c;

    /* compiled from: ProxyConfig.kt */
    public static final class a {
        public static v9e0 a(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, Set set) {
            double F0 = j5g.F0(linkedHashMap.values());
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) ((Map.Entry) it.next()).getKey(), Double.valueOf(((Number) r3.getValue()).intValue() / F0)));
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String str = (String) pair.d();
                double doubleValue = ((Number) pair.g()).doubleValue() + d;
                arrayList2.add(new aae0(str, new zvf(d, doubleValue)));
                d = doubleValue;
            }
            return new v9e0(linkedHashSet, set, arrayList2);
        }
    }

    static {
        EmptySet emptySet = EmptySet.b;
        d = new v9e0(emptySet, emptySet, EmptyList.b);
    }

    public v9e0(Set<String> set, Set<Integer> set2, List<aae0> list) {
        this.a = set;
        this.b = set2;
        this.c = list;
    }

    public final String a() {
        String b;
        List<aae0> list = this.c;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        Random.b.getClass();
        double h = Random.c.h(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((zvf) ((aae0) next).a()).b(Double.valueOf(h))) {
                obj = next;
                break;
            }
        }
        aae0 aae0Var = (aae0) obj;
        return (aae0Var == null || (b = aae0Var.b()) == null) ? ((aae0) j5g.w0(list, Random.b)).b() : b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9e0)) {
            return false;
        }
        v9e0 v9e0Var = (v9e0) obj;
        return epx.f(this.a, v9e0Var.a) && epx.f(this.b, v9e0Var.b) && epx.f(this.c, v9e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxyConfig(trustedDomains=");
        sb.append(this.a);
        sb.append(", trustedDomainsSizes=");
        sb.append(this.b);
        sb.append(", proxies=");
        return ms9.a(')', sb, this.c);
    }
}
