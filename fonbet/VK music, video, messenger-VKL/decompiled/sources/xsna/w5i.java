package xsna;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactHashMap.java */
/* loaded from: classes13.dex */
public final class w5i<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object k = new Object();
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int g;
    public transient c h;
    public transient a i;
    public transient e j;

    /* compiled from: CompactHashMap.java */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            w5i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            if (g != null) {
                return g.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int i = w5iVar.i(entry.getKey());
                if (i != -1 && pli.l(w5iVar.p()[i], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            return g != null ? g.entrySet().iterator() : new u5i(w5iVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            if (g != null) {
                return g.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (w5iVar.l()) {
                return false;
            }
            int h = w5iVar.h();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = w5iVar.b;
            Objects.requireNonNull(obj2);
            int v = alk.v(key, value, h, obj2, w5iVar.n(), w5iVar.o(), w5iVar.p());
            if (v == -1) {
                return false;
            }
            w5iVar.k(v, h);
            w5iVar.g--;
            w5iVar.f += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return w5i.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    public abstract class b<T> implements Iterator<T> {
        public int b;
        public int c;
        public int d;

        public b() {
            this.b = w5i.this.f;
            this.c = w5i.this.isEmpty() ? -1 : 0;
            this.d = -1;
        }

        public abstract T a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            w5i w5iVar = w5i.this;
            if (w5iVar.f != this.b) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.c;
            this.d = i;
            T a = a(i);
            int i2 = this.c + 1;
            if (i2 >= w5iVar.g) {
                i2 = -1;
            }
            this.c = i2;
            return a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            w5i w5iVar = w5i.this;
            if (w5iVar.f != this.b) {
                throw new ConcurrentModificationException();
            }
            fxc0.A(this.d >= 0, "no calls to next() since the last call to remove()");
            this.b += 32;
            w5iVar.remove(w5iVar.o()[this.d]);
            this.c--;
            this.d = -1;
        }
    }

    /* compiled from: CompactHashMap.java */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            w5i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return w5i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            return g != null ? g.keySet().iterator() : new t5i(w5iVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            return g != null ? g.keySet().remove(obj) : w5iVar.m(obj) != w5i.k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return w5i.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    public final class d extends nf<K, V> {
        public final K b;
        public int c;

        public d(int i) {
            Object obj = w5i.k;
            this.b = (K) w5i.this.o()[i];
            this.c = i;
        }

        public final void d() {
            int i = this.c;
            K k = this.b;
            w5i w5iVar = w5i.this;
            if (i != -1 && i < w5iVar.size()) {
                if (pli.l(k, w5iVar.o()[this.c])) {
                    return;
                }
            }
            Object obj = w5i.k;
            this.c = w5iVar.i(k);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            if (g != null) {
                return g.get(this.b);
            }
            d();
            int i = this.c;
            if (i == -1) {
                return null;
            }
            return (V) w5iVar.p()[i];
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            K k = this.b;
            if (g != null) {
                return g.put(k, v);
            }
            d();
            int i = this.c;
            if (i == -1) {
                w5iVar.put(k, v);
                return null;
            }
            V v2 = (V) w5iVar.p()[i];
            w5iVar.p()[this.c] = v;
            return v2;
        }
    }

    /* compiled from: CompactHashMap.java */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            w5i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            w5i w5iVar = w5i.this;
            Map<K, V> g = w5iVar.g();
            return g != null ? g.values().iterator() : new v5i(w5iVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return w5i.this.size();
        }
    }

    public static <K, V> w5i<K, V> d() {
        w5i<K, V> w5iVar = new w5i<>();
        w5iVar.j(3);
        return w5iVar;
    }

    public static <K, V> w5i<K, V> e(int i) {
        w5i<K, V> w5iVar = new w5i<>();
        w5iVar.j(i);
        return w5iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(lhg.a(readInt, "Invalid size: "));
        }
        j(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> g = g();
        Iterator<Map.Entry<K, V>> it = g != null ? g.entrySet().iterator() : new u5i(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (l()) {
            return;
        }
        this.f += 32;
        Map<K, V> g = g();
        if (g != null) {
            this.f = Math.min(Math.max(size(), 3), 1073741823);
            g.clear();
            this.b = null;
            this.g = 0;
            return;
        }
        Arrays.fill(o(), 0, this.g, (Object) null);
        Arrays.fill(p(), 0, this.g, (Object) null);
        Object obj = this.b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(n(), 0, this.g, 0);
        this.g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> g = g();
        return g != null ? g.containsKey(obj) : i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> g = g();
        if (g != null) {
            return g.containsValue(obj);
        }
        for (int i = 0; i < this.g; i++) {
            if (pli.l(obj, p()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.i = aVar2;
        return aVar2;
    }

    public final Map<K, V> g() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> g = g();
        if (g != null) {
            return g.get(obj);
        }
        int i = i(obj);
        if (i == -1) {
            return null;
        }
        return (V) p()[i];
    }

    public final int h() {
        return (1 << (this.f & 31)) - 1;
    }

    public final int i(Object obj) {
        if (l()) {
            return -1;
        }
        int r = egi.r(obj);
        int h = h();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int z = alk.z(r & h, obj2);
        if (z == 0) {
            return -1;
        }
        int i = ~h;
        int i2 = r & i;
        do {
            int i3 = z - 1;
            int i4 = n()[i3];
            if ((i4 & i) == i2 && pli.l(obj, o()[i3])) {
                return i3;
            }
            z = i4 & h;
        } while (z != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void j(int i) {
        fxc0.q(i >= 0, "Expected size must be >= 0");
        this.f = Math.min(Math.max(i, 1), 1073741823);
    }

    public final void k(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] n = n();
        Object[] o = o();
        Object[] p = p();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            o[i] = null;
            p[i] = null;
            n[i] = 0;
            return;
        }
        Object obj2 = o[i3];
        o[i] = obj2;
        p[i] = p[i3];
        o[i3] = null;
        p[i3] = null;
        n[i] = n[i3];
        n[i3] = 0;
        int r = egi.r(obj2) & i2;
        int z = alk.z(r, obj);
        if (z == size) {
            alk.A(r, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = z - 1;
            int i5 = n[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                n[i4] = alk.s(i5, i + 1, i2);
                return;
            }
            z = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.h = cVar2;
        return cVar2;
    }

    public final boolean l() {
        return this.b == null;
    }

    public final Object m(Object obj) {
        if (!l()) {
            int h = h();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int v = alk.v(obj, null, h, obj2, n(), o(), null);
            if (v != -1) {
                Object obj3 = p()[v];
                k(v, h);
                this.g--;
                this.f += 32;
                return obj3;
            }
        }
        return k;
    }

    public final int[] n() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] o() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] p() {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V put(K k2, V v) {
        int i;
        int i2;
        int i3 = 32;
        int i4 = 1;
        if (l()) {
            fxc0.A(l(), "Arrays already allocated");
            int i5 = this.f;
            int max = Math.max(i5 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.b = alk.m(max2);
            this.f = alk.s(this.f, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.c = new int[i5];
            this.d = new Object[i5];
            this.e = new Object[i5];
        }
        Map<K, V> g = g();
        if (g != null) {
            return g.put(k2, v);
        }
        int[] n = n();
        Object[] o = o();
        Object[] p = p();
        int i6 = this.g;
        int i7 = i6 + 1;
        int r = egi.r(k2);
        int h = h();
        int i8 = r & h;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int z = alk.z(i8, obj);
        if (z == 0) {
            if (i7 > h) {
                h = q(h, (h + 1) * (h < 32 ? 4 : 2), r, i6);
            } else {
                Object obj2 = this.b;
                Objects.requireNonNull(obj2);
                alk.A(i8, i7, obj2);
            }
            i = 1;
        } else {
            int i9 = ~h;
            int i10 = r & i9;
            int i11 = 0;
            while (true) {
                int i12 = z - i4;
                i = i4;
                int i13 = n[i12];
                int i14 = i3;
                if ((i13 & i9) == i10 && pli.l(k2, o[i12])) {
                    V v2 = (V) p[i12];
                    p[i12] = v;
                    return v2;
                }
                int i15 = i13 & h;
                int i16 = i11 + 1;
                if (i15 != 0) {
                    i11 = i16;
                    z = i15;
                    i4 = i;
                    i3 = i14;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h() + 1, 1.0f);
                        if (!isEmpty()) {
                            i2 = 0;
                            while (i2 >= 0) {
                                linkedHashMap.put(o()[i2], p()[i2]);
                                int i17 = i2 + 1;
                                if (i17 < this.g) {
                                    i2 = i17;
                                }
                            }
                            this.b = linkedHashMap;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f += 32;
                            return (V) linkedHashMap.put(k2, v);
                        }
                        i2 = -1;
                        while (i2 >= 0) {
                        }
                        this.b = linkedHashMap;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f += 32;
                        return (V) linkedHashMap.put(k2, v);
                    }
                    if (i7 > h) {
                        h = q(h, (h + 1) * (h < i14 ? 4 : 2), r, i6);
                    } else {
                        n[i12] = alk.s(i13, i7, h);
                    }
                }
            }
        }
        int length = n().length;
        if (i7 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                this.c = Arrays.copyOf(n(), min);
                this.d = Arrays.copyOf(o(), min);
                this.e = Arrays.copyOf(p(), min);
            }
        }
        n()[i6] = alk.s(r, 0, h);
        o()[i6] = k2;
        p()[i6] = v;
        this.g = i7;
        this.f += 32;
        return null;
    }

    public final int q(int i, int i2, int i3, int i4) {
        Object m = alk.m(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            alk.A(i3 & i5, i4 + 1, m);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] n = n();
        for (int i6 = 0; i6 <= i; i6++) {
            int z = alk.z(i6, obj);
            while (z != 0) {
                int i7 = z - 1;
                int i8 = n[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int z2 = alk.z(i10, m);
                alk.A(i10, z, m);
                n[i7] = alk.s(i9, z2, i5);
                z = i8 & i;
            }
        }
        this.b = m;
        this.f = alk.s(this.f, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> g = g();
        if (g != null) {
            return g.remove(obj);
        }
        V v = (V) m(obj);
        if (v == k) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> g = g();
        return g != null ? g.size() : this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.j;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.j = eVar2;
        return eVar2;
    }
}
