package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: QualityNamePlates.kt */
/* loaded from: classes18.dex */
public final class dpe0 {
    public final Map<Integer, a> a;

    /* compiled from: QualityNamePlates.kt */
    public static final class a {
        public final List<String> a;

        public a(List<String> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("NamePlate(names="), this.a);
        }
    }

    public dpe0() {
        this(jgp.b);
    }

    public final LinkedHashMap a() {
        Map<Integer, a> map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).a);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpe0) && epx.f(this.a, ((dpe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("QualityNamePlates(qualities="), this.a, ')');
    }

    public dpe0(Map<Integer, a> map) {
        this.a = map;
    }
}
