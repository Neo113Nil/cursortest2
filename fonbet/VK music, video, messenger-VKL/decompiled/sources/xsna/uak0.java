package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.d0a0;
import xsna.hbk0;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public final class uak0<K, V> extends tak0<K, V, V> {
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
        return this.b.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.b.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        hbk0<K, V> hbk0Var = this.b;
        return new luk0(hbk0Var, ((jpw) hbk0Var.b().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        hbk0<K, V> hbk0Var = this.b;
        Object it = hbk0Var.c.iterator();
        while (true) {
            if (!((juk0) it).hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = ((iuk0) it).next();
            if (epx.f(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        hbk0Var.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        d0a0<K, ? extends V> d0a0Var;
        int i;
        dak0 j;
        boolean a;
        Set S0 = j5g.S0(collection);
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
            Object it = hbk0Var.c.iterator();
            while (((juk0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((iuk0) it).next();
                if (S0.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        d0a0<K, ? extends V> d0a0Var;
        int i;
        dak0 j;
        boolean a;
        Set S0 = j5g.S0(collection);
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
            Object it = hbk0Var.c.iterator();
            while (((juk0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((iuk0) it).next();
                if (!S0.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
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
