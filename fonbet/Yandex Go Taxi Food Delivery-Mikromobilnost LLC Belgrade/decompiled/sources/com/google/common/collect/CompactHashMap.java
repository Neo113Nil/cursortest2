package com.google.common.collect;

import defpackage.ffx;
import defpackage.oyr;
import defpackage.tob1;
import defpackage.vng;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes11.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object C = new Object();
    public transient p A;
    public transient m B;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] w;
    public transient int x;
    public transient int y;
    public transient p z;

    public static CompactHashMap a() {
        CompactHashMap compactHashMap = new CompactHashMap();
        compactHashMap.h(3);
        return compactHashMap;
    }

    public static CompactHashMap b(int i) {
        CompactHashMap compactHashMap = new CompactHashMap();
        compactHashMap.h(i);
        return compactHashMap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(oyr.i(readInt, "Invalid size: "));
        }
        h(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map c = c();
        Iterator<Map.Entry<K, V>> it = c != null ? c.entrySet().iterator() : new o(this, 1);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (j()) {
            return;
        }
        this.x += 32;
        Map c = c();
        if (c != null) {
            this.x = Math.min(Math.max(size(), 3), 1073741823);
            c.clear();
            this.a = null;
            this.y = 0;
            return;
        }
        Arrays.fill(m(), 0, this.y, (Object) null);
        Arrays.fill(n(), 0, this.y, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(l(), 0, this.y, 0);
        this.y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c = c();
        return c != null ? c.containsKey(obj) : g(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c = c();
        if (c != null) {
            return c.containsValue(obj);
        }
        for (int i = 0; i < this.y; i++) {
            if (Objects.equals(obj, n()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        p pVar = this.A;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this, 0);
        this.A = pVar2;
        return pVar2;
    }

    public final int f() {
        return (1 << (this.x & 31)) - 1;
    }

    public final int g(Object obj) {
        if (j()) {
            return -1;
        }
        int G = vng.G(obj);
        int f = f();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int h = tob1.h(G & f, obj2);
        if (h == 0) {
            return -1;
        }
        int i = ~f;
        int i2 = G & i;
        do {
            int i3 = h - 1;
            int i4 = l()[i3];
            if ((i4 & i) == i2 && Objects.equals(obj, m()[i3])) {
                return i3;
            }
            h = i4 & f;
        } while (h != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c = c();
        if (c != null) {
            return c.get(obj);
        }
        int g = g(obj);
        if (g == -1) {
            return null;
        }
        return n()[g];
    }

    public final void h(int i) {
        ffx.l("Expected size must be >= 0", i >= 0);
        this.x = Math.min(Math.max(i, 1), 1073741823);
    }

    public final void i(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] l = l();
        Object[] m = m();
        Object[] n = n();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            m[i] = null;
            n[i] = null;
            l[i] = 0;
            return;
        }
        Object obj2 = m[i3];
        m[i] = obj2;
        n[i] = n[i3];
        m[i3] = null;
        n[i3] = null;
        l[i] = l[i3];
        l[i3] = 0;
        int G = vng.G(obj2) & i2;
        int h = tob1.h(G, obj);
        if (h == size) {
            tob1.i(G, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = h - 1;
            int i5 = l[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                l[i4] = tob1.e(i5, i + 1, i2);
                return;
            }
            h = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean j() {
        return this.a == null;
    }

    public final Object k(Object obj) {
        if (!j()) {
            int f = f();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int f2 = tob1.f(obj, null, f, obj2, l(), m(), null);
            if (f2 != -1) {
                Object obj3 = n()[f2];
                i(f2, f);
                this.y--;
                this.x += 32;
                return obj3;
            }
        }
        return C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        p pVar = this.z;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this, 1);
        this.z = pVar2;
        return pVar2;
    }

    public final int[] l() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] m() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] n() {
        Object[] objArr = this.w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int p(int i, int i2, int i3, int i4) {
        Object c = tob1.c(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            tob1.i(i3 & i5, i4 + 1, c);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] l = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int h = tob1.h(i6, obj);
            while (h != 0) {
                int i7 = h - 1;
                int i8 = l[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int h2 = tob1.h(i10, c);
                tob1.i(i10, h, c);
                l[i7] = tob1.e(i9, h2, i5);
                h = i8 & i;
            }
        }
        this.a = c;
        this.x = tob1.e(this.x, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 32;
        int i4 = 1;
        if (j()) {
            ffx.r("Arrays already allocated", j());
            int i5 = this.x;
            int max = Math.max(i5 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = tob1.c(max2);
            this.x = tob1.e(this.x, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i5];
            this.c = new Object[i5];
            this.w = new Object[i5];
        }
        Map c = c();
        if (c != null) {
            return c.put(obj, obj2);
        }
        int[] l = l();
        Object[] m = m();
        Object[] n = n();
        int i6 = this.y;
        int i7 = i6 + 1;
        int G = vng.G(obj);
        int f = f();
        int i8 = G & f;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int h = tob1.h(i8, obj3);
        if (h == 0) {
            if (i7 > f) {
                f = p(f, (f + 1) * (f < 32 ? 4 : 2), G, i6);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                tob1.i(i8, i7, obj4);
            }
            i = 1;
        } else {
            int i9 = ~f;
            int i10 = G & i9;
            int i11 = 0;
            while (true) {
                int i12 = h - i4;
                i = i4;
                int i13 = l[i12];
                int i14 = i3;
                if ((i13 & i9) == i10 && Objects.equals(obj, m[i12])) {
                    Object obj5 = n[i12];
                    n[i12] = obj2;
                    return obj5;
                }
                int i15 = i13 & f;
                int i16 = i11 + 1;
                if (i15 != 0) {
                    i11 = i16;
                    h = i15;
                    i4 = i;
                    i3 = i14;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(f() + 1, 1.0f);
                        if (!isEmpty()) {
                            i2 = 0;
                            while (i2 >= 0) {
                                linkedHashMap.put(m()[i2], n()[i2]);
                                int i17 = i2 + 1;
                                if (i17 < this.y) {
                                    i2 = i17;
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.w = null;
                            this.x += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i2 = -1;
                        while (i2 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.w = null;
                        this.x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i7 > f) {
                        f = p(f, (f + 1) * (f < i14 ? 4 : 2), G, i6);
                    } else {
                        l[i12] = tob1.e(i13, i7, f);
                    }
                }
            }
        }
        int length = l().length;
        if (i7 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                this.b = Arrays.copyOf(l(), min);
                this.c = Arrays.copyOf(m(), min);
                this.w = Arrays.copyOf(n(), min);
            }
        }
        l()[i6] = tob1.e(G, 0, f);
        m()[i6] = obj;
        n()[i6] = obj2;
        this.y = i7;
        this.x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c = c();
        if (c != null) {
            return c.remove(obj);
        }
        Object k = k(obj);
        if (k == C) {
            return null;
        }
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c = c();
        return c != null ? c.size() : this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        m mVar = this.B;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(1, this);
        this.B = mVar2;
        return mVar2;
    }
}
