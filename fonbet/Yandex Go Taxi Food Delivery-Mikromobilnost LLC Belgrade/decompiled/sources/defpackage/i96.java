package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class i96 extends p9 implements bqw, RandomAccess, j2f0 {
    public static final boolean[] w;
    public static final i96 x;
    public boolean[] b;
    public int c;

    static {
        boolean[] zArr = new boolean[0];
        w = zArr;
        x = new i96(zArr, 0, false);
    }

    public i96() {
        this(w, 0, true);
    }

    public static i96 d() {
        return x;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            ny61.i(b64.t(i, "Index:", ", Size:"), this.c);
            return;
        }
        boolean[] zArr = this.b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[oo31.c(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, zArr2, 0, i);
            System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
            this.b = zArr2;
        }
        this.b[i] = booleanValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.p9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = rqw.a;
        collection.getClass();
        if (!(collection instanceof i96)) {
            return super.addAll(collection);
        }
        i96 i96Var = (i96) collection;
        int i = i96Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.b;
        if (i3 > zArr.length) {
            this.b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(i96Var.b, 0, this.b, this.c, i96Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z) {
        a();
        int i = this.c;
        boolean[] zArr = this.b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[oo31.c(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, zArr2, 0, this.c);
            this.b = zArr2;
        }
        boolean[] zArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.c) {
            ny61.i(b64.t(i, "Index:", ", Size:"), this.c);
        }
    }

    @Override // defpackage.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i96)) {
            return super.equals(obj);
        }
        i96 i96Var = (i96) obj;
        if (this.c != i96Var.c) {
            return false;
        }
        boolean[] zArr = i96Var.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(int i) {
        e(i);
        return this.b[i];
    }

    @Override // defpackage.oqw
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final i96 w(int i) {
        if (i >= this.c) {
            return new i96(i == 0 ? w : Arrays.copyOf(this.b, i), this.c, true);
        }
        w511.q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Boolean.valueOf(f(i));
    }

    @Override // defpackage.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            int i3 = i * 31;
            boolean z = this.b[i2];
            Charset charset = rqw.a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.p9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        e(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        if (i < this.c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            ny61.m("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        e(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public i96(boolean[] zArr, int i, boolean z) {
        super(z);
        this.b = zArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
