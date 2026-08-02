package yads;

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

/* loaded from: classes10.dex */
public final class cy extends AbstractMap implements Serializable {
    public static final Object k = new Object();
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int g;
    public transient yx h;
    public transient wx i;
    public transient ay j;

    public cy(int i) {
        a(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(nh2.a("Invalid size: ", readInt));
        }
        a(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map a = a();
        Iterator it = a != null ? a.entrySet().iterator() : new ux(this);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map a() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean c() {
        return this.b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f += 32;
        Map a = a();
        if (a != null) {
            this.f = Math.min(Math.max(size(), 3), 1073741823);
            a.clear();
            this.b = null;
            this.g = 0;
            return;
        }
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        Arrays.fill(objArr, 0, this.g, (Object) null);
        Object[] objArr2 = this.e;
        Objects.requireNonNull(objArr2);
        Arrays.fill(objArr2, 0, this.g, (Object) null);
        Object obj = this.b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        Arrays.fill(iArr, 0, this.g, 0);
        this.g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a = a();
        return a != null ? a.containsKey(obj) : a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a = a();
        if (a != null) {
            return a.containsValue(obj);
        }
        for (int i = 0; i < this.g; i++) {
            if (ma2.a(obj, c(i))) {
                return true;
            }
        }
        return false;
    }

    public final int[] d() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] e() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        wx wxVar = this.i;
        if (wxVar != null) {
            return wxVar;
        }
        wx wxVar2 = new wx(this);
        this.i = wxVar2;
        return wxVar2;
    }

    public final Object f() {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] g() {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a = a();
        if (a != null) {
            return a.get(obj);
        }
        int a2 = a(obj);
        if (a2 == -1) {
            return null;
        }
        return c(a2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yx yxVar = this.h;
        if (yxVar != null) {
            return yxVar;
        }
        yx yxVar2 = new yx(this);
        this.h = yxVar2;
        return yxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i3 = this.f;
            int max = Math.max(i3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            if (max2 < 2 || max2 > 1073741824 || Integer.highestOneBit(max2) != max2) {
                throw new IllegalArgumentException(nh2.a("must be power of 2 between 2^1 and 2^30: ", max2));
            }
            this.b = max2 <= 256 ? new byte[max2] : max2 <= 65536 ? new short[max2] : new int[max2];
            this.f = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f & (-32));
            this.c = new int[i3];
            this.d = new Object[i3];
            this.e = new Object[i3];
        }
        Map a = a();
        if (a != null) {
            return a.put(obj, obj2);
        }
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int i4 = this.g;
        int i5 = i4 + 1;
        int a2 = q01.a(obj == null ? 0 : obj.hashCode());
        int i6 = 1 << (this.f & 31);
        int i7 = i6 - 1;
        int i8 = a2 & i7;
        Object obj3 = this.b;
        Objects.requireNonNull(obj3);
        int a3 = dy.a(i8, obj3);
        if (a3 == 0) {
            if (i5 > i7) {
                i7 = a(i7, i6 * (i7 < 32 ? 4 : 2), a2, i4);
            } else {
                Object obj4 = this.b;
                Objects.requireNonNull(obj4);
                dy.a(i8, i5, obj4);
            }
            i = 1;
        } else {
            int i9 = ~i7;
            i = 1;
            int i10 = a2 & i9;
            int i11 = 0;
            while (true) {
                int i12 = a3 - 1;
                int i13 = iArr2[i12];
                int i14 = i2;
                int i15 = i13 & i9;
                if (i15 == i10 && ma2.a(obj, objArr2[i12])) {
                    Object obj5 = objArr4[i12];
                    objArr4[i12] = obj2;
                    return obj5;
                }
                int i16 = i13 & i7;
                int[] iArr3 = iArr2;
                int i17 = i11 + 1;
                if (i16 != 0) {
                    i11 = i17;
                    a3 = i16;
                    iArr2 = iArr3;
                    i2 = i14;
                } else {
                    if (i17 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(1 << (this.f & 31), 1.0f);
                        int b = b();
                        while (b >= 0) {
                            linkedHashMap.put(b(b), c(b));
                            b++;
                            if (b >= this.g) {
                                b = -1;
                            }
                        }
                        this.b = linkedHashMap;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > i7) {
                        i7 = a(i7, i6 * (i7 < i14 ? 4 : 2), a2, i4);
                    } else {
                        iArr3[i12] = (i5 & i7) | i15;
                    }
                }
            }
        }
        int[] iArr4 = this.c;
        Objects.requireNonNull(iArr4);
        int length = iArr4.length;
        if (i5 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                int[] iArr5 = this.c;
                Objects.requireNonNull(iArr5);
                this.c = Arrays.copyOf(iArr5, min);
                Object[] objArr5 = this.d;
                Objects.requireNonNull(objArr5);
                this.d = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.e;
                Objects.requireNonNull(objArr6);
                this.e = Arrays.copyOf(objArr6, min);
            }
        }
        int i19 = (~i7) & a2;
        int[] iArr6 = this.c;
        Objects.requireNonNull(iArr6);
        iArr6[i4] = i19;
        Object[] objArr7 = this.d;
        Objects.requireNonNull(objArr7);
        objArr7[i4] = obj;
        a(i4, obj2);
        this.g = i5;
        this.f += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a = a();
        if (a != null) {
            return a.remove(obj);
        }
        Object b = b(obj);
        if (b == k) {
            return null;
        }
        return b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a = a();
        return a != null ? a.size() : this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ay ayVar = this.j;
        if (ayVar != null) {
            return ayVar;
        }
        ay ayVar2 = new ay(this);
        this.j = ayVar2;
        return ayVar2;
    }

    public final Object b(int i) {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final Object c(int i) {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final int a(Object obj) {
        if (c()) {
            return -1;
        }
        int a = q01.a(obj == null ? 0 : obj.hashCode());
        int i = (1 << (this.f & 31)) - 1;
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int a2 = dy.a(a & i, obj2);
        if (a2 == 0) {
            return -1;
        }
        int i2 = ~i;
        int i3 = a & i2;
        do {
            int i4 = a2 - 1;
            int[] iArr = this.c;
            Objects.requireNonNull(iArr);
            int i5 = iArr[i4];
            if ((i5 & i2) == i3 && ma2.a(obj, b(i4))) {
                return i4;
            }
            a2 = i5 & i;
        } while (a2 != 0);
        return -1;
    }

    public final Object b(Object obj) {
        if (c()) {
            return k;
        }
        int i = (1 << (this.f & 31)) - 1;
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        int a = dy.a(obj, null, i, obj2, iArr2, objArr, null);
        if (a == -1) {
            return k;
        }
        Object c = c(a);
        a(a, i);
        this.g--;
        this.f += 32;
        return c;
    }

    public final void a(int i) {
        if (i >= 0) {
            this.f = Math.min(Math.max(i, 1), 1073741823);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final void a(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArr2[i3];
            objArr2[i] = obj2;
            objArr4[i] = objArr4[i3];
            objArr2[i3] = null;
            objArr4[i3] = null;
            iArr2[i] = iArr2[i3];
            iArr2[i3] = 0;
            int a = q01.a(obj2 != null ? obj2.hashCode() : 0) & i2;
            int a2 = dy.a(a, obj);
            if (a2 == size) {
                dy.a(a, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = a2 - 1;
                int i5 = iArr2[i4];
                int i6 = i5 & i2;
                if (i6 == size) {
                    iArr2[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
                a2 = i6;
            }
        } else {
            objArr2[i] = null;
            objArr4[i] = null;
            iArr2[i] = 0;
        }
    }

    public final int a(int i, int i2, int i3, int i4) {
        Object obj;
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            if (i2 <= 256) {
                obj = new byte[i2];
            } else if (i2 <= 65536) {
                obj = new short[i2];
            } else {
                obj = new int[i2];
            }
            int i5 = i2 - 1;
            if (i4 != 0) {
                dy.a(i3 & i5, i4 + 1, obj);
            }
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int[] iArr = this.c;
            Objects.requireNonNull(iArr);
            int[] iArr2 = iArr;
            for (int i6 = 0; i6 <= i; i6++) {
                int a = dy.a(i6, obj2);
                while (a != 0) {
                    int i7 = a - 1;
                    int i8 = iArr2[i7];
                    int i9 = ((~i) & i8) | i6;
                    int i10 = i9 & i5;
                    int a2 = dy.a(i10, obj);
                    dy.a(i10, a, obj);
                    iArr2[i7] = ((~i5) & i9) | (a2 & i5);
                    a = i8 & i;
                }
            }
            this.b = obj;
            this.f = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f & (-32));
            return i5;
        }
        throw new IllegalArgumentException(nh2.a("must be power of 2 between 2^1 and 2^30: ", i2));
    }

    public final void a(int i, Object obj) {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        objArr[i] = obj;
    }
}
