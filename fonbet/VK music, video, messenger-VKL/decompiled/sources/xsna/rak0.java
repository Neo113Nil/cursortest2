package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.d0a0;
import xsna.hbk0;
import xsna.kcy;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public final class rak0<K, V> extends tak0<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        bis.p();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        bis.p();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof gcy) && !(obj instanceof kcy.a)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return epx.f(this.b.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        hbk0<K, V> hbk0Var = this.b;
        return new iuk0(hbk0Var, ((jpw) hbk0Var.b().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof gcy) || (obj instanceof kcy.a)) && this.b.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.b.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        d0a0<K, ? extends V> d0a0Var;
        int i;
        dak0 j;
        boolean a;
        Collection<?> collection2 = collection;
        int e = on00.e(c5g.u(collection2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.i(), pair.j());
        }
        hbk0<K, V> hbk0Var = this.b;
        boolean z = false;
        do {
            synchronized (bis.b) {
                hbk0.a aVar = (hbk0.a) qak0.h(hbk0Var.b);
                d0a0Var = aVar.c;
                i = aVar.d;
                s3q0 s3q0Var = s3q0.a;
            }
            d0a0.a<K, ? extends V> builder = d0a0Var.builder();
            Object it2 = hbk0Var.c.iterator();
            while (((juk0) it2).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((iuk0) it2).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !epx.f(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z = true;
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            d0a0<K, ? extends V> build = builder.build();
            if (epx.f(build, d0a0Var)) {
                break;
            }
            hbk0.a aVar2 = hbk0Var.b;
            synchronized (qak0.c) {
                j = qak0.j();
                a = hbk0.a(hbk0Var, (hbk0.a) qak0.w(aVar2, hbk0Var, j), i, build);
            }
            qak0.n(j, hbk0Var);
        } while (!a);
        return z;
    }
}
