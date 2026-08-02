package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;

/* compiled from: PooledHashMap.java */
/* loaded from: classes8.dex */
public final class pvb0<K, V> implements Map<K, V> {
    public ArrayList<a<K, V>>[] b = new ArrayList[16];
    public final ju4 c = new ju4(new ovb0());
    public int d = 0;

    /* compiled from: PooledHashMap.java */
    public static class a<K, V> {
        public K a;
        public V b;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = 0;
        while (true) {
            ArrayList<a<K, V>>[] arrayListArr = this.b;
            if (i >= arrayListArr.length) {
                this.d = 0;
                return;
            }
            ArrayList<a<K, V>> arrayList = arrayListArr[i];
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    this.c.d(arrayList.get(i2));
                }
                arrayList.clear();
            }
            i++;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Objects.requireNonNull(obj, "This map does not support null keys");
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        int i = 0;
        while (true) {
            ArrayList<a<K, V>>[] arrayListArr = this.b;
            if (i >= arrayListArr.length) {
                return;
            }
            ArrayList<a<K, V>> arrayList = arrayListArr[i];
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    a<K, V> aVar = arrayList.get(i2);
                    biConsumer.accept(aVar.a, aVar.b);
                }
            }
            i++;
        }
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        Objects.requireNonNull(obj, "This map does not support null keys");
        ArrayList<a<K, V>> arrayList = this.b[Math.abs(obj.hashCode() % this.b.length)];
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a<K, V> aVar = arrayList.get(i);
            if (Objects.equals(aVar.a, obj)) {
                return aVar.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        Objects.requireNonNull(k, "This map does not support null keys");
        Objects.requireNonNull(v, "This map does not support null values");
        float f = this.d;
        ArrayList<a<K, V>>[] arrayListArr = this.b;
        float length = arrayListArr.length * 0.75f;
        ju4 ju4Var = this.c;
        if (f > length) {
            this.b = new ArrayList[arrayListArr.length * 2];
            this.d = 0;
            for (ArrayList<a<K, V>> arrayList : arrayListArr) {
                if (arrayList != null) {
                    Iterator<a<K, V>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a<K, V> next = it.next();
                        K k2 = next.a;
                        Objects.requireNonNull(k2);
                        V v2 = next.b;
                        Objects.requireNonNull(v2);
                        put(k2, v2);
                        ju4Var.d(next);
                    }
                    arrayList.clear();
                }
            }
        }
        int abs = Math.abs(k.hashCode() % this.b.length);
        ArrayList<a<K, V>> arrayList2 = this.b[abs];
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
            this.b[abs] = arrayList2;
        } else {
            for (int i = 0; i < arrayList2.size(); i++) {
                a<K, V> aVar = arrayList2.get(i);
                if (Objects.equals(aVar.a, k)) {
                    V v3 = aVar.b;
                    aVar.b = v;
                    return v3;
                }
            }
        }
        a<K, V> aVar2 = (a) ju4Var.a();
        aVar2.a = k;
        aVar2.b = v;
        arrayList2.add(aVar2);
        this.d++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        Objects.requireNonNull(obj, "This map does not support null keys");
        ArrayList<a<K, V>> arrayList = this.b[Math.abs(obj.hashCode() % this.b.length)];
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a<K, V> aVar = arrayList.get(i);
            if (Objects.equals(aVar.a, obj)) {
                V v = aVar.b;
                arrayList.remove(i);
                this.c.d(aVar);
                this.d--;
                return v;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        throw new UnsupportedOperationException();
    }
}
