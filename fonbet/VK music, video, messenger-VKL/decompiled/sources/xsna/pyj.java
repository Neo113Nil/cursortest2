package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CountingLruMap.java */
/* loaded from: classes.dex */
public final class pyj<K, V> {
    public final o900 a;
    public final LinkedHashMap<K, V> b = new LinkedHashMap<>();
    public int c = 0;

    public pyj(o900 o900Var) {
        this.a = o900Var;
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final synchronized ArrayList b(yzt yztVar) {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.entrySet().size());
        for (Map.Entry<K, V> entry : this.b.entrySet()) {
            if (yztVar.mo429apply((Object) entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public final synchronized int c() {
        return this.c;
    }

    public final synchronized void d(Object obj, Object obj2) {
        V remove = this.b.remove(obj);
        this.c -= remove == null ? 0 : this.a.a(remove);
        this.b.put(obj, obj2);
        this.c += this.a.a(obj2);
    }

    public final synchronized V e(K k) {
        V remove;
        remove = this.b.remove(k);
        this.c -= remove == null ? 0 : this.a.a(remove);
        return remove;
    }

    public final synchronized ArrayList<V> f(kxc0<K> kxc0Var) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (kxc0Var.mo429apply(next.getKey())) {
                arrayList.add(next.getValue());
                int i = this.c;
                V value = next.getValue();
                this.c = i - (value == null ? 0 : this.a.a(value));
                it.remove();
            }
        }
        return arrayList;
    }
}
