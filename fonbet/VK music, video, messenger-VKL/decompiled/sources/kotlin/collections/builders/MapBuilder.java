package kotlin.collections.builders;

import com.ironsource.B5;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import xsna.epx;
import xsna.ff;
import xsna.gcy;
import xsna.kcy;
import xsna.omi0;
import xsna.ro;

/* compiled from: MapBuilder.kt */
/* loaded from: classes11.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, kcy {
    public static final MapBuilder b;
    private kotlin.collections.builders.a<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private kotlin.collections.builders.b<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kotlin.collections.builders.c<V> valuesView;

    /* compiled from: MapBuilder.kt */
    public static final class a {
    }

    /* compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, gcy {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.c;
            MapBuilder<K, V> mapBuilder = this.b;
            if (i >= ((MapBuilder) mapBuilder).length) {
                throw new NoSuchElementException();
            }
            int i2 = this.c;
            this.c = i2 + 1;
            this.d = i2;
            c cVar = new c(mapBuilder, i2);
            b();
            return cVar;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, kcy.a {
        public final MapBuilder<K, V> b;
        public final int c;
        public final int d;

        public c(MapBuilder<K, V> mapBuilder, int i) {
            this.b = mapBuilder;
            this.c = i;
            this.d = ((MapBuilder) mapBuilder).modCount;
        }

        public final void a() {
            if (((MapBuilder) this.b).modCount != this.d) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return epx.f(entry.getKey(), getKey()) && epx.f(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return (K) ((MapBuilder) this.b).keysArray[this.c];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            return (V) ((MapBuilder) this.b).valuesArray[this.c];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            a();
            MapBuilder<K, V> mapBuilder = this.b;
            mapBuilder.i();
            V[] g = mapBuilder.g();
            int i = this.c;
            V v2 = g[i];
            g[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(B5.U);
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static class d<K, V> {
        public final MapBuilder<K, V> b;
        public int c;
        public int d = -1;
        public int e;

        public d(MapBuilder<K, V> mapBuilder) {
            this.b = mapBuilder;
            this.e = ((MapBuilder) mapBuilder).modCount;
            b();
        }

        public final void a() {
            if (((MapBuilder) this.b).modCount != this.e) {
                throw new ConcurrentModificationException();
            }
        }

        public final void b() {
            while (true) {
                int i = this.c;
                MapBuilder<K, V> mapBuilder = this.b;
                if (i >= ((MapBuilder) mapBuilder).length) {
                    return;
                }
                int[] iArr = ((MapBuilder) mapBuilder).presenceArray;
                int i2 = this.c;
                if (iArr[i2] >= 0) {
                    return;
                } else {
                    this.c = i2 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.c < ((MapBuilder) this.b).length;
        }

        public final void remove() {
            a();
            if (this.d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            MapBuilder<K, V> mapBuilder = this.b;
            mapBuilder.i();
            mapBuilder.s(this.d);
            this.d = -1;
            this.e = ((MapBuilder) mapBuilder).modCount;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, gcy {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i = this.c;
            MapBuilder<K, V> mapBuilder = this.b;
            if (i >= ((MapBuilder) mapBuilder).length) {
                throw new NoSuchElementException();
            }
            int i2 = this.c;
            this.c = i2 + 1;
            this.d = i2;
            K k = (K) ((MapBuilder) mapBuilder).keysArray[this.d];
            b();
            return k;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes8.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, gcy {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i = this.c;
            MapBuilder<K, V> mapBuilder = this.b;
            if (i >= ((MapBuilder) mapBuilder).length) {
                throw new NoSuchElementException();
            }
            int i2 = this.c;
            this.c = i2 + 1;
            this.d = i2;
            V v = (V) ((MapBuilder) mapBuilder).valuesArray[this.d];
            b();
            return v;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        b = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new omi0(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public final void clear() {
        i();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ro.n(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ro.n(0, this.length, vArr);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return n(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        kotlin.collections.builders.a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.size != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry == null) {
                return false;
            }
            try {
                if (!k(entry)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public final int f(K k) {
        i();
        while (true) {
            int o = o(k);
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[o];
                if (i3 <= 0) {
                    int i4 = this.length;
                    K[] kArr = this.keysArray;
                    if (i4 < kArr.length) {
                        int i5 = i4 + 1;
                        this.length = i5;
                        kArr[i4] = k;
                        this.presenceArray[i4] = o;
                        iArr[o] = i5;
                        this.size++;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    l(1);
                } else {
                    if (epx.f(this.keysArray[i3 - 1], k)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        q(this.hashArray.length * 2);
                        break;
                    }
                    o = o == 0 ? this.hashArray.length - 1 : o - 1;
                }
            }
        }
    }

    public final V[] g() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        int length = this.keysArray.length;
        if (length < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        V[] vArr2 = (V[]) new Object[length];
        this.valuesArray = vArr2;
        return vArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int m = m(obj);
        if (m < 0) {
            return null;
        }
        return this.valuesArray[m];
    }

    public final MapBuilder h() {
        i();
        this.isReadOnly = true;
        return this.size > 0 ? this : b;
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.c;
            MapBuilder<K, V> mapBuilder = bVar.b;
            if (i2 >= mapBuilder.length) {
                throw new NoSuchElementException();
            }
            int i3 = bVar.c;
            bVar.c = i3 + 1;
            bVar.d = i3;
            Object obj = mapBuilder.keysArray[bVar.d];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = mapBuilder.valuesArray[bVar.d];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            bVar.b();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final void i() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final void j(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ro.n(i3, i, this.keysArray);
        if (vArr != null) {
            ro.n(i3, this.length, vArr);
        }
        this.length = i3;
    }

    public final boolean k(Map.Entry<? extends K, ? extends V> entry) {
        int m = m(entry.getKey());
        if (m < 0) {
            return false;
        }
        return epx.f(this.valuesArray[m], entry.getValue());
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        kotlin.collections.builders.b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public final void l(int i) {
        K[] kArr = this.keysArray;
        int length = kArr.length;
        int i2 = this.length;
        int i3 = length - i2;
        int i4 = i2 - this.size;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            j(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            ff.a aVar = ff.Companion;
            int length2 = kArr.length;
            aVar.getClass();
            int e2 = ff.a.e(length2, i5);
            this.keysArray = (K[]) Arrays.copyOf(this.keysArray, e2);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) Arrays.copyOf(vArr, e2) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, e2);
            int highestOneBit = Integer.highestOneBit((e2 >= 1 ? e2 : 1) * 3);
            if (highestOneBit > this.hashArray.length) {
                q(highestOneBit);
            }
        }
    }

    public final int m(K k) {
        int o = o(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[o];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (epx.f(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            o = o == 0 ? this.hashArray.length - 1 : o - 1;
        }
    }

    public final int n(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0 && epx.f(this.valuesArray[i], v)) {
                return i;
            }
        }
    }

    public final int o(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    public final boolean p() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        i();
        int f2 = f(k);
        V[] g = g();
        if (f2 >= 0) {
            g[f2] = v;
            return null;
        }
        int i = (-f2) - 1;
        V v2 = g[i];
        g[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        l(entrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int f2 = f(entry.getKey());
            V[] g = g();
            if (f2 >= 0) {
                g[f2] = entry.getValue();
            } else {
                int i = (-f2) - 1;
                if (!epx.f(entry.getValue(), g[i])) {
                    g[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.presenceArray[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i) {
        this.modCount++;
        int i2 = 0;
        if (this.length > this.size) {
            j(false);
        }
        this.hashArray = new int[i];
        this.hashShift = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.length) {
            int i3 = i2 + 1;
            int o = o(this.keysArray[i2]);
            int i4 = this.maxProbeDistance;
            while (true) {
                int[] iArr = this.hashArray;
                if (iArr[o] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                o = o == 0 ? iArr.length - 1 : o - 1;
            }
        }
    }

    public final boolean r(Map.Entry<? extends K, ? extends V> entry) {
        i();
        int m = m(entry.getKey());
        if (m < 0 || !epx.f(this.valuesArray[m], entry.getValue())) {
            return false;
        }
        s(m);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        i();
        int m = m(obj);
        if (m < 0) {
            return null;
        }
        V v = this.valuesArray[m];
        s(m);
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x001f->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i) {
        this.keysArray[i] = null;
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            vArr[i] = null;
        }
        int i2 = this.presenceArray[i];
        int i3 = this.maxProbeDistance * 2;
        int length = this.hashArray.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.hashArray.length - 1 : i2 - 1;
            i5++;
            if (i5 > this.maxProbeDistance) {
                this.hashArray[i6] = 0;
                break;
            }
            int[] iArr = this.hashArray;
            int i7 = iArr[i2];
            if (i7 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                int o = o(this.keysArray[i8]) - i2;
                int[] iArr2 = this.hashArray;
                if ((o & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i7;
                    this.presenceArray[i8] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.hashArray[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.presenceArray[i] = -1;
        this.size--;
        this.modCount++;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = bVar.c;
            MapBuilder<K, V> mapBuilder = bVar.b;
            if (i2 >= mapBuilder.length) {
                throw new NoSuchElementException();
            }
            int i3 = bVar.c;
            bVar.c = i3 + 1;
            bVar.d = i3;
            Object obj = mapBuilder.keysArray[bVar.d];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(B5.U);
            Object obj2 = mapBuilder.valuesArray[bVar.d];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            bVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        kotlin.collections.builders.c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[highestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
