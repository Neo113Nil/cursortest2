package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.EmptyList;

/* compiled from: MemoryMappedMap.kt */
/* loaded from: classes6.dex */
public final class x220<K, V> implements Map<K, V>, gcy {
    public final int b;
    public final MappedByteBuffer c;
    public final a<K> d;
    public final a<V> e;
    public final int f;
    public final c g;
    public final int h;

    /* compiled from: MemoryMappedMap.kt */
    public interface a<T> {
        int a(T t, ByteBuffer byteBuffer);

        T read(ByteBuffer byteBuffer);
    }

    /* compiled from: MemoryMappedMap.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2) {
            this.a = i;
            int i3 = ((i2 + 5) * i) + 5;
            this.b = i3;
            this.c = i3 + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("KeyIndex(index=");
            sb.append(this.a);
            sb.append(", keyOffset=");
            sb.append(this.b);
            sb.append(", valueIndexOffset=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MemoryMappedMap.kt */
    public static final class c {
        public final ByteBuffer a;
        public final int b;

        public c(ByteBuffer byteBuffer, int i, int i2) {
            this.a = byteBuffer;
            this.b = i2;
        }

        public final boolean a(int i) {
            int i2 = (this.b + 5) * i;
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(i2);
            return byteBuffer.get() == 1;
        }
    }

    public x220(int i, MappedByteBuffer mappedByteBuffer, a aVar, a aVar2, Collection collection) {
        int i2;
        this.b = i;
        this.c = mappedByteBuffer;
        this.d = aVar;
        this.e = aVar2;
        mappedByteBuffer.position(0);
        int i3 = mappedByteBuffer.getInt();
        this.h = i3;
        this.f = ((i + 5) * i3) + 5 + i + 4;
        ByteBuffer slice = mappedByteBuffer.slice();
        int i4 = this.h;
        c cVar = new c(slice, i4, i);
        this.g = cVar;
        if (collection.isEmpty()) {
            return;
        }
        if (i4 >= 0) {
            int i5 = 0;
            while (true) {
                slice.position((cVar.b + 5) * i5);
                slice.put((byte) 0);
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        int size = collection.size();
        this.h = size;
        int i6 = this.b;
        this.f = ((i6 + 5) * size) + 5 + i6 + 4;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            MappedByteBuffer mappedByteBuffer2 = this.c;
            c cVar2 = this.g;
            int i7 = this.b;
            int hashCode = key != null ? key.hashCode() : 0;
            int i8 = this.h;
            b bVar = new b(hashCode & (i8 - 1), i7);
            int i9 = 0;
            while (true) {
                i2 = bVar.a;
                if (i9 >= i8) {
                    break;
                }
                K b2 = b(i2);
                if ((cVar2.a(i2) && b2.equals(key)) || !cVar2.a(i2)) {
                    break;
                }
                bVar = new b((i2 + 1) % this.h, i7);
                i9++;
            }
            mappedByteBuffer2.position(bVar.b);
            this.d.a(key, mappedByteBuffer2.slice());
            mappedByteBuffer2.position(bVar.c);
            mappedByteBuffer2.putInt(this.f);
            mappedByteBuffer2.position(this.f);
            this.f = this.e.a(value, mappedByteBuffer2.slice()) + 4 + this.f;
            ByteBuffer byteBuffer = cVar2.a;
            byteBuffer.position((cVar2.b + 5) * i2);
            byteBuffer.put((byte) 1);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"key=" + key + ", value=" + value + ", keyIndex=" + bVar});
            }
        }
        MappedByteBuffer mappedByteBuffer3 = this.c;
        mappedByteBuffer3.position(0);
        mappedByteBuffer3.putInt(this.h);
        mappedByteBuffer3.force();
    }

    public final b a(K k) {
        int hashCode = k != null ? k.hashCode() : 0;
        int i = this.h;
        int i2 = this.b;
        b bVar = new b(hashCode & (i - 1), i2);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bVar.a;
            K b2 = b(i4);
            if (this.g.a(i4) && b2.equals(k)) {
                return bVar;
            }
            bVar = new b((i4 + 1) % this.h, i2);
        }
        return null;
    }

    public final K b(int i) {
        int i2 = ((this.b + 5) * i) + 5;
        MappedByteBuffer mappedByteBuffer = this.c;
        mappedByteBuffer.position(i2);
        return this.d.read(mappedByteBuffer.slice());
    }

    public final x220<K, V> c(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        return new x220<>(this.b, this.c, this.d, this.e, collection);
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((ArrayList) values()).contains(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<K> keySet = keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new y220(it.next(), this));
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        MappedByteBuffer mappedByteBuffer = this.c;
        try {
            b a2 = a(obj);
            if (a2 == null) {
                return null;
            }
            mappedByteBuffer.position(a2.c);
            mappedByteBuffer.position(mappedByteBuffer.getInt());
            V read = this.e.read(mappedByteBuffer.slice());
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return read;
            }
            L.u(l, L.LogType.d, new Object[]{"key=" + obj + ", value=" + read + " keyIndex=" + a2});
            return read;
        } catch (Throwable th) {
            L.i(th);
            return null;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.h <= 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < this.h; i++) {
            linkedHashSet.add(b(i));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public x220(MappedByteBuffer mappedByteBuffer, cdy cdyVar, bkr0 bkr0Var) {
        this(32, mappedByteBuffer, cdyVar, bkr0Var, EmptyList.b);
    }
}
