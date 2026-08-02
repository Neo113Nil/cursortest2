package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class bor extends p9 implements iqw, RandomAccess, j2f0 {
    public static final float[] w;
    public static final bor x;
    public float[] b;
    public int c;

    static {
        float[] fArr = new float[0];
        w = fArr;
        x = new bor(fArr, 0, false);
    }

    public bor() {
        this(w, 0, true);
    }

    public static bor d() {
        return x;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            ny61.i(b64.t(i, "Index:", ", Size:"), this.c);
            return;
        }
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[oo31.c(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i + 1, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = floatValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.p9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = rqw.a;
        collection.getClass();
        if (!(collection instanceof bor)) {
            return super.addAll(collection);
        }
        bor borVar = (bor) collection;
        int i = borVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.b;
        if (i3 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(borVar.b, 0, this.b, this.c, borVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f) {
        a();
        int i = this.c;
        float[] fArr = this.b;
        if (i == fArr.length) {
            float[] fArr2 = new float[oo31.c(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, fArr2, 0, this.c);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        float[] fArr = this.b;
        if (i <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.b = new float[Math.max(i, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i) {
            length = oo31.c(length, 3, 2, 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // defpackage.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bor)) {
            return super.equals(obj);
        }
        bor borVar = (bor) obj;
        if (this.c != borVar.c) {
            return false;
        }
        float[] fArr = borVar.b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.c) {
            ny61.i(b64.t(i, "Index:", ", Size:"), this.c);
        }
    }

    public final float g(int i) {
        f(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Float.valueOf(g(i));
    }

    @Override // defpackage.oqw
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final bor w(int i) {
        if (i >= this.c) {
            return new bor(i == 0 ? w : Arrays.copyOf(this.b, i), this.c, true);
        }
        w511.q();
        return null;
    }

    @Override // defpackage.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.p9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        f(i);
        float[] fArr = this.b;
        float f = fArr[i];
        if (i < this.c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            ny61.m("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        f(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public bor(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
