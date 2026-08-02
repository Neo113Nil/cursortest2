package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.cza1;
import defpackage.lqa1;
import defpackage.ny61;
import defpackage.qqa1;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
final class zzbd extends AbstractMap implements Serializable {
    public static final Object C = new Object();
    public transient i A;
    public transient k B;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] w;
    public transient int x = Math.min(Math.max(12, 1), 1073741823);
    public transient int y;
    public transient i z;

    public final Map a() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i, int i2) {
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.w;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int k = qqa1.k(obj2) & i2;
        int e = lqa1.e(k, obj);
        if (e == size) {
            lqa1.g(k, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = e - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr[i4] = ((~i2) & i5) | ((i + 1) & i2);
                return;
            }
            e = i6;
        }
    }

    public final boolean c() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.x += 32;
        Map a = a();
        if (a != null) {
            this.x = Math.min(Math.max(size(), 3), 1073741823);
            a.clear();
            this.a = null;
            this.y = 0;
            return;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.y, (Object) null);
        Object[] objArr2 = this.w;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.y, (Object) null);
        Object obj = this.a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.y, 0);
        this.y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a = a();
        return a != null ? a.containsKey(obj) : g(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a = a();
        if (a != null) {
            return a.containsValue(obj);
        }
        for (int i = 0; i < this.y; i++) {
            Object[] objArr = this.w;
            objArr.getClass();
            if (cza1.c(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        i iVar = this.A;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 0);
        this.A = iVar2;
        return iVar2;
    }

    public final int f() {
        return (1 << (this.x & 31)) - 1;
    }

    public final int g(Object obj) {
        if (c()) {
            return -1;
        }
        int k = qqa1.k(obj);
        int f = f();
        Object obj2 = this.a;
        obj2.getClass();
        int e = lqa1.e(k & f, obj2);
        if (e != 0) {
            int i = ~f;
            int i2 = k & i;
            do {
                int i3 = e - 1;
                int[] iArr = this.b;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.c;
                    objArr.getClass();
                    if (cza1.c(obj, objArr[i3])) {
                        return i3;
                    }
                }
                e = i4 & f;
            } while (e != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a = a();
        if (a != null) {
            return a.get(obj);
        }
        int g = g(obj);
        if (g == -1) {
            return null;
        }
        Object[] objArr = this.w;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(int i, int i2, int i3, int i4) {
        Object f = lqa1.f(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            lqa1.g(i3 & i5, i4 + 1, f);
        }
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int e = lqa1.e(i6, obj);
            while (e != 0) {
                int i7 = e - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int e2 = lqa1.e(i10, f);
                lqa1.g(i10, e, f);
                iArr[i7] = ((~i5) & i9) | (e2 & i5);
                e = i8 & i;
            }
        }
        this.a = f;
        this.x = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.x & (-32));
        return i5;
    }

    public final Object i(Object obj) {
        if (!c()) {
            int f = f();
            Object obj2 = this.a;
            obj2.getClass();
            int[] iArr = this.b;
            iArr.getClass();
            Object[] objArr = this.c;
            objArr.getClass();
            int d = lqa1.d(obj, null, f, obj2, iArr, objArr, null);
            if (d != -1) {
                Object[] objArr2 = this.w;
                objArr2.getClass();
                Object obj3 = objArr2[d];
                b(d, f);
                this.y--;
                this.x += 32;
                return obj3;
            }
        }
        return C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.z;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 1);
        this.z = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (c()) {
            if (!c()) {
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
            this.a = lqa1.f(max2);
            this.x = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.x & (-32));
            this.b = new int[i3];
            this.c = new Object[i3];
            this.w = new Object[i3];
        }
        Map a = a();
        if (a != null) {
            return a.put(obj, obj2);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.w;
        objArr2.getClass();
        int i4 = this.y;
        int i5 = i4 + 1;
        int k = qqa1.k(obj);
        int f = f();
        int i6 = k & f;
        Object obj3 = this.a;
        obj3.getClass();
        int e = lqa1.e(i6, obj3);
        if (e == 0) {
            if (i5 > f) {
                f = h(f, (f + 1) * (f < 32 ? 4 : 2), k, i4);
            } else {
                Object obj4 = this.a;
                obj4.getClass();
                lqa1.g(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~f;
            int i8 = k & i7;
            int i9 = 0;
            while (true) {
                int i10 = e - 1;
                int i11 = iArr[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && cza1.c(obj, objArr[i10])) {
                    Object obj5 = objArr2[i10];
                    objArr2[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & f;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    e = i14;
                    i9 = i15;
                    i2 = i13;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(f() + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            Object[] objArr3 = this.c;
                            objArr3.getClass();
                            Object obj6 = objArr3[i16];
                            Object[] objArr4 = this.w;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i16]);
                            int i17 = i16 + 1;
                            i16 = i17 < this.y ? i17 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.w = null;
                        this.x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > f) {
                        f = h(f, (f + 1) * (f < i13 ? 4 : 2), k, i4);
                    } else {
                        iArr[i10] = i12 | (i5 & f);
                    }
                }
            }
        }
        int[] iArr2 = this.b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i5 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                int[] iArr3 = this.b;
                iArr3.getClass();
                this.b = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.c;
                objArr5.getClass();
                this.c = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.w;
                objArr6.getClass();
                this.w = Arrays.copyOf(objArr6, min);
            }
        }
        int[] iArr4 = this.b;
        iArr4.getClass();
        iArr4[i4] = (~f) & k;
        Object[] objArr7 = this.c;
        objArr7.getClass();
        objArr7[i4] = obj;
        Object[] objArr8 = this.w;
        objArr8.getClass();
        objArr8[i4] = obj2;
        this.y = i5;
        this.x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a = a();
        if (a != null) {
            return a.remove(obj);
        }
        Object i = i(obj);
        if (i == C) {
            return null;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a = a();
        return a != null ? a.size() : this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k kVar = this.B;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.B = kVar2;
        return kVar2;
    }
}
