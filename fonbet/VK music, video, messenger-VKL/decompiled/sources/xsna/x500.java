package xsna;

import com.ironsource.B5;
import java.util.Arrays;

/* compiled from: LongSparseArray.jvm.kt */
/* loaded from: classes.dex */
public class x500<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public x500() {
        this(0, 1, null);
    }

    public void append(long j, E e) {
        int i = this.size;
        if (i != 0 && j <= this.keys[i - 1]) {
            put(j, e);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i >= jArr.length) {
                Object[] objArr = this.values;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != ahn.e) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.garbage = false;
                this.size = i2;
            }
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            this.keys = Arrays.copyOf(this.keys, i8);
            this.values = Arrays.copyOf(this.values, i8);
        }
        this.keys[i4] = j;
        this.values[i4] = e;
        this.size = i4 + 1;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    @ozl
    public void delete(long j) {
        int d = ey2.d(this.keys, this.size, j);
        if (d >= 0) {
            Object[] objArr = this.values;
            Object obj = objArr[d];
            Object obj2 = ahn.e;
            if (obj != obj2) {
                objArr[d] = obj2;
                this.garbage = true;
            }
        }
    }

    public E get(long j) {
        E e;
        int d = ey2.d(this.keys, this.size, j);
        if (d < 0 || (e = (E) this.values[d]) == ahn.e) {
            return null;
        }
        return e;
    }

    public int indexOfKey(long j) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ahn.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return ey2.d(this.keys, this.size, j);
    }

    public int indexOfValue(E e) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ahn.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.values[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        if (!(i >= 0 && i < this.size)) {
            alk.B("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ahn.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.keys[i];
    }

    public void put(long j, E e) {
        Object obj = ahn.e;
        int d = ey2.d(this.keys, this.size, j);
        if (d >= 0) {
            this.values[d] = e;
            return;
        }
        int i = ~d;
        int i2 = this.size;
        if (i < i2) {
            Object[] objArr = this.values;
            if (objArr[i] == obj) {
                this.keys[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.values;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != obj) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.garbage = false;
                this.size = i3;
                i = ~ey2.d(this.keys, i3, j);
            }
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.keys = Arrays.copyOf(this.keys, i9);
            this.values = Arrays.copyOf(this.values, i9);
        }
        int i10 = this.size;
        if (i10 - i != 0) {
            long[] jArr2 = this.keys;
            int i11 = i + 1;
            jw5.g(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.values;
            jw5.h(objArr3, i11, objArr3, i, this.size);
        }
        this.keys[i] = j;
        this.values[i] = e;
        this.size++;
    }

    public void putAll(x500<? extends E> x500Var) {
        int size = x500Var.size();
        for (int i = 0; i < size; i++) {
            put(x500Var.keyAt(i), x500Var.valueAt(i));
        }
    }

    public E putIfAbsent(long j, E e) {
        E e2 = get(j);
        if (e2 == null) {
            put(j, e);
        }
        return e2;
    }

    public void remove(long j) {
        int d = ey2.d(this.keys, this.size, j);
        if (d >= 0) {
            Object[] objArr = this.values;
            Object obj = objArr[d];
            Object obj2 = ahn.e;
            if (obj != obj2) {
                objArr[d] = obj2;
                this.garbage = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.values;
        Object obj = objArr[i];
        Object obj2 = ahn.e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.garbage = true;
        }
    }

    public E replace(long j, E e) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e2 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i, E e) {
        if (!(i >= 0 && i < this.size)) {
            alk.B("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ahn.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        this.values[i] = e;
    }

    public int size() {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ahn.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append(B5.U);
            E valueAt = valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i) {
        if (!(i >= 0 && i < this.size)) {
            alk.B("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ahn.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return (E) this.values[i];
    }

    public x500(int i) {
        if (i == 0) {
            this.keys = ey2.c;
            this.values = ey2.d;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.keys = new long[i5];
        this.values = new Object[i5];
    }

    public x500<E> clone() {
        x500<E> x500Var = (x500) super.clone();
        x500Var.keys = (long[]) this.keys.clone();
        x500Var.values = (Object[]) this.values.clone();
        return x500Var;
    }

    public E get(long j, E e) {
        E e2;
        int d = ey2.d(this.keys, this.size, j);
        return (d < 0 || (e2 = (E) this.values[d]) == ahn.e) ? e : e2;
    }

    public boolean replace(long j, E e, E e2) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey < 0 || !epx.f(this.values[indexOfKey], e)) {
            return false;
        }
        this.values[indexOfKey] = e2;
        return true;
    }

    public boolean remove(long j, E e) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey < 0 || !epx.f(e, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public /* synthetic */ x500(int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
