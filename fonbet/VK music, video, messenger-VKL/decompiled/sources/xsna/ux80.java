package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: OrderedScatterMap.kt */
/* loaded from: classes4.dex */
public final class ux80<K, V> implements Map<K, V>, kcy {
    public final ph50<K, V> b = new ph50<>(64);
    public final ArrayList c = new ArrayList();

    public final void a(int i, K k, V v) {
        ph50<K, V> ph50Var = this.b;
        boolean b = ph50Var.b(k);
        ArrayList arrayList = this.c;
        if (b) {
            arrayList.remove(k);
            arrayList.add(swe0.g(i, 0, arrayList.size()), k);
        } else {
            arrayList.add(swe0.g(i, 0, arrayList.size()), k);
        }
        ph50Var.p(k, v);
    }

    public final V b(K k, K k2, V v) {
        ArrayList arrayList = this.c;
        int indexOf = arrayList.indexOf(k);
        if (indexOf >= 0) {
            arrayList.set(indexOf, k2);
        } else {
            arrayList.add(k2);
        }
        ph50<K, V> ph50Var = this.b;
        V n = ph50Var.n(k);
        ph50Var.p(k2, v);
        return n;
    }

    @Override // java.util.Map
    public final void clear() {
        this.b.h();
        this.c.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.c(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object d = this.b.d(next);
            tx80 tx80Var = d != null ? new tx80(next, d, this) : null;
            if (tx80Var != null) {
                arrayList.add(tx80Var);
            }
        }
        return j5g.R0(arrayList);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.b.d(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return j5g.R0(this.c);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        ph50<K, V> ph50Var = this.b;
        if (ph50Var.b(k)) {
            return b(k, k, v);
        }
        this.c.add(k);
        return ph50Var.l(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        this.c.remove(obj);
        return this.b.n(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final Collection<V> values() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Object d = this.b.d(it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return new ArrayList(arrayList);
    }
}
