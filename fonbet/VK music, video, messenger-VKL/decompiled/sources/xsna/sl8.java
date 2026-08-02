package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.zbd0;

/* compiled from: BucketQueueConfig.kt */
/* loaded from: classes2.dex */
public final class sl8 {
    public static final /* synthetic */ int d = 0;
    public final LinkedHashMap a;
    public final int b;
    public final Map<NetworkClient.ClientType, Integer> c;

    /* compiled from: BucketQueueConfig.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
        public static sl8 a(int i) {
            zbd0.a.getClass();
            ?? r0 = zbd0.a.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = r0.values().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(Integer.valueOf(((Number) it.next()).intValue()), Integer.valueOf(i));
            }
            linkedHashMap.put(Integer.MAX_VALUE, Integer.valueOf(i));
            zbd0.a.getClass();
            return new sl8(i, linkedHashMap, zbd0.a.b);
        }
    }

    static {
        new bpn0(new n1(7));
    }

    public sl8(int i, LinkedHashMap linkedHashMap, Map map) {
        this.a = linkedHashMap;
        this.b = i;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl8)) {
            return false;
        }
        sl8 sl8Var = (sl8) obj;
        return this.a.equals(sl8Var.a) && this.b == sl8Var.b && epx.f(this.c, sl8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BucketQueueConfig(perPrioritySlotSize=");
        sb.append(this.a);
        sb.append(", defaultSlots=");
        sb.append(this.b);
        sb.append(", priorityMap=");
        return cjl0.a(sb, this.c, ')');
    }
}
