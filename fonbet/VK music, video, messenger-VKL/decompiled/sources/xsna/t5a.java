package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: CatalogFullBlockDataCache.kt */
/* loaded from: classes16.dex */
public final class t5a<T> {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: CatalogFullBlockDataCache.kt */
    public static final class a<T> {
        public final String a;
        public List<? extends T> b;

        public a(String str, List<? extends T> list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheEntry(items: ");
            sb.append(this.b.size());
            sb.append(", pageKey:");
            return ho8.a(sb, this.a, ')');
        }
    }

    public final void a(String str, String str2, List<? extends T> list) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = s5a.a(str, linkedHashMap);
        }
        List<a> list2 = (List) obj;
        for (a aVar : list2) {
            if (str2.equals(aVar.a)) {
                aVar.b = list;
                return;
            }
        }
        list2.add(new a(str2, list));
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.a.get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g5g.y(((a) it.next()).b, arrayList);
            }
        }
        return arrayList;
    }
}
