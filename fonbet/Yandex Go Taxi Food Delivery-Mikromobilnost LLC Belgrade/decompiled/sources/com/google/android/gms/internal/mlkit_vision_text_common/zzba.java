package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.ny61;
import defpackage.vpa1;
import defpackage.wpa1;
import defpackage.xya1;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes11.dex */
final class zzba extends AbstractMap implements Serializable {
    public static final Object C = new Object();
    public transient h A;
    public transient j B;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] w;
    public transient int x = Math.min(Math.max(12, 1), 1073741823);
    public transient int y;
    public transient h z;

    public final int[] a() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.x += 32;
        Map f = f();
        if (f != null) {
            this.x = Math.min(Math.max(size(), 3), 1073741823);
            f.clear();
            this.a = null;
            this.y = 0;
            return;
        }
        Arrays.fill(b(), 0, this.y, (Object) null);
        Arrays.fill(c(), 0, this.y, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.y, 0);
        this.y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f = f();
        return f != null ? f.containsKey(obj) : j(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f = f();
        if (f != null) {
            return f.containsValue(obj);
        }
        for (int i = 0; i < this.y; i++) {
            if (xya1.g(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h hVar = this.A;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.A = hVar2;
        return hVar2;
    }

    public final Map f() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void g(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] a = a();
        Object[] b = b();
        Object[] c = c();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            b[i] = null;
            c[i] = null;
            a[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = b[i3];
        b[i] = obj2;
        c[i] = c[i3];
        b[i3] = null;
        c[i3] = null;
        a[i] = a[i3];
        a[i3] = 0;
        int d = wpa1.d(obj2) & i2;
        int e = vpa1.e(d, obj);
        if (e == size) {
            vpa1.g(d, i4, obj);
            return;
        }
        while (true) {
            int i5 = e - 1;
            int i6 = a[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                a[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            e = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f = f();
        if (f != null) {
            return f.get(obj);
        }
        int j = j(obj);
        if (j == -1) {
            return null;
        }
        return c()[j];
    }

    public final boolean h() {
        return this.a == null;
    }

    public final int i() {
        return (1 << (this.x & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        if (h()) {
            return -1;
        }
        int d = wpa1.d(obj);
        int i = i();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int e = vpa1.e(d & i, obj2);
        if (e != 0) {
            int i2 = ~i;
            int i3 = d & i2;
            do {
                int i4 = e - 1;
                int i5 = a()[i4];
                if ((i5 & i2) == i3 && xya1.g(obj, b()[i4])) {
                    return i4;
                }
                e = i5 & i;
            } while (e != 0);
        }
        return -1;
    }

    public final int k(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object f = vpa1.f(i2);
        if (i4 != 0) {
            vpa1.g(i3 & i5, i4 + 1, f);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] a = a();
        for (int i6 = 0; i6 <= i; i6++) {
            int e = vpa1.e(i6, obj);
            while (e != 0) {
                int i7 = e - 1;
                int i8 = a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int e2 = vpa1.e(i10, f);
                vpa1.g(i10, e, f);
                a[i7] = ((~i5) & i9) | (e2 & i5);
                e = i8 & i;
            }
        }
        this.a = f;
        this.x = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.x & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        h hVar = this.z;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.z = hVar2;
        return hVar2;
    }

    public final Object l(Object obj) {
        if (!h()) {
            int i = i();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int d = vpa1.d(obj, null, i, obj2, a(), b(), null);
            if (d != -1) {
                Object obj3 = c()[d];
                g(d, i);
                this.y--;
                this.x += 32;
                return obj3;
            }
        }
        return C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (h()) {
            if (!h()) {
                ny61.r("Arrays already allocated");
                return null;
            }
            int i3 = this.x;
            int max = Math.max(i3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = vpa1.f(max2);
            this.x = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.x & (-32));
            this.b = new int[i3];
            this.c = new Object[i3];
            this.w = new Object[i3];
        }
        Map f = f();
        if (f != null) {
            return f.put(obj, obj2);
        }
        int[] a = a();
        Object[] b = b();
        Object[] c = c();
        int i4 = this.y;
        int i5 = i4 + 1;
        int d = wpa1.d(obj);
        int i6 = i();
        int i7 = d & i6;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int e = vpa1.e(i7, obj3);
        if (e == 0) {
            if (i5 > i6) {
                i6 = k(i6, (i6 + 1) * (i6 < 32 ? 4 : 2), d, i4);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                vpa1.g(i7, i5, obj4);
            }
            i = 1;
        } else {
            int i8 = ~i6;
            int i9 = d & i8;
            int i10 = 0;
            while (true) {
                int i11 = e - 1;
                int i12 = a[i11];
                i = 1;
                int i13 = i12 & i8;
                int i14 = i2;
                if (i13 == i9 && xya1.g(obj, b[i11])) {
                    Object obj5 = c[i11];
                    c[i11] = obj2;
                    return obj5;
                }
                int i15 = i12 & i6;
                int i16 = i10 + 1;
                if (i15 != 0) {
                    e = i15;
                    i10 = i16;
                    i2 = i14;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i() + 1, 1.0f);
                        int i17 = isEmpty() ? -1 : 0;
                        while (i17 >= 0) {
                            linkedHashMap.put(b()[i17], c()[i17]);
                            int i18 = i17 + 1;
                            i17 = i18 < this.y ? i18 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.w = null;
                        this.x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > i6) {
                        i6 = k(i6, (i6 + 1) * (i6 < i14 ? 4 : 2), d, i4);
                    } else {
                        a[i11] = i13 | (i5 & i6);
                    }
                }
            }
        }
        int length = a().length;
        if (i5 > length) {
            int i19 = i;
            int min = Math.min(1073741823, (Math.max(i19, length >>> 1) + length) | i19);
            if (min != length) {
                this.b = Arrays.copyOf(a(), min);
                this.c = Arrays.copyOf(b(), min);
                this.w = Arrays.copyOf(c(), min);
            }
        }
        a()[i4] = (~i6) & d;
        b()[i4] = obj;
        c()[i4] = obj2;
        this.y = i5;
        this.x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f = f();
        if (f != null) {
            return f.remove(obj);
        }
        Object l = l(obj);
        if (l == C) {
            return null;
        }
        return l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f = f();
        return f != null ? f.size() : this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        j jVar = this.B;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.B = jVar2;
        return jVar2;
    }
}
