package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.hua1;
import defpackage.ny61;
import defpackage.ooa1;
import defpackage.toa1;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
final class zzal extends AbstractMap implements Serializable {
    public static final Object C = new Object();
    public transient b A;
    public transient d B;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] w;
    public transient int x = Math.min(Math.max(12, 1), 1073741823);
    public transient int y;
    public transient b z;

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
        int i4 = i + 1;
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int c = toa1.c(obj2) & i2;
        int g = ooa1.g(c, obj);
        if (g == size) {
            ooa1.i(c, i4, obj);
            return;
        }
        while (true) {
            int i5 = g - 1;
            int i6 = iArr[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArr[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            g = i7;
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
            if (hua1.i(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.A;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.A = bVar2;
        return bVar2;
    }

    public final int f() {
        return (1 << (this.x & 31)) - 1;
    }

    public final int g(Object obj) {
        if (c()) {
            return -1;
        }
        int c = toa1.c(obj);
        int f = f();
        Object obj2 = this.a;
        obj2.getClass();
        int g = ooa1.g(c & f, obj2);
        if (g != 0) {
            int i = ~f;
            int i2 = c & i;
            do {
                int i3 = g - 1;
                int[] iArr = this.b;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.c;
                    objArr.getClass();
                    if (hua1.i(obj, objArr[i3])) {
                        return i3;
                    }
                }
                g = i4 & f;
            } while (g != 0);
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
        int i5 = i2 - 1;
        Object h = ooa1.h(i2);
        if (i4 != 0) {
            ooa1.i(i3 & i5, i4 + 1, h);
        }
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int g = ooa1.g(i6, obj);
            while (g != 0) {
                int i7 = g - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int g2 = ooa1.g(i10, h);
                ooa1.i(i10, g, h);
                iArr[i7] = ((~i5) & i9) | (g2 & i5);
                g = i8 & i;
            }
        }
        this.a = h;
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
            int f2 = ooa1.f(obj, null, f, obj2, iArr, objArr, null);
            if (f2 != -1) {
                Object[] objArr2 = this.w;
                objArr2.getClass();
                Object obj3 = objArr2[f2];
                b(f2, f);
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
        b bVar = this.z;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 1);
        this.z = bVar2;
        return bVar2;
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
            this.a = ooa1.h(max2);
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
        int c = toa1.c(obj);
        int f = f();
        int i6 = c & f;
        Object obj3 = this.a;
        obj3.getClass();
        int g = ooa1.g(i6, obj3);
        if (g == 0) {
            if (i5 > f) {
                f = h(f, (f + 1) * (f < 32 ? 4 : 2), c, i4);
            } else {
                Object obj4 = this.a;
                obj4.getClass();
                ooa1.i(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~f;
            int i8 = c & i7;
            int i9 = 0;
            while (true) {
                int i10 = g - 1;
                int i11 = iArr[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && hua1.i(obj, objArr[i10])) {
                    Object obj5 = objArr2[i10];
                    objArr2[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & f;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    g = i14;
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
                        f = h(f, (f + 1) * (f < i13 ? 4 : 2), c, i4);
                    } else {
                        iArr[i10] = (i5 & f) | i12;
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
        int i19 = (~f) & c;
        int[] iArr4 = this.b;
        iArr4.getClass();
        iArr4[i4] = i19;
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
        d dVar = this.B;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.B = dVar2;
        return dVar2;
    }
}
