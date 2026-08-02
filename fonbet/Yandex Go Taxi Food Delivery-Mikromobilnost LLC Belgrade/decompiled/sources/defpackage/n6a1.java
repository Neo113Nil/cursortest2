package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class n6a1 extends fw91 implements RandomAccess, c7a1, rea1 {
    public static final int[] w;
    public static final n6a1 x;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        w = iArr;
        x = new n6a1(0, false, iArr);
    }

    public n6a1(int i, boolean z, int[] iArr) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    public static n6a1 e() {
        return x;
    }

    @Override // defpackage.i7a1
    public final /* bridge */ /* synthetic */ i7a1 D(int i) {
        if (i >= this.c) {
            return new n6a1(this.c, true, i == 0 ? w : Arrays.copyOf(this.b, i));
        }
        w511.q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            ny61.m(oyr.h(i, this.c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[oo31.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i3, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.fw91, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = q7a1.a;
        collection.getClass();
        if (!(collection instanceof n6a1)) {
            return super.addAll(collection);
        }
        n6a1 n6a1Var = (n6a1) collection;
        int i = n6a1Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(n6a1Var.b, 0, this.b, this.c, n6a1Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.fw91, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a1)) {
            return super.equals(obj);
        }
        n6a1 n6a1Var = (n6a1) obj;
        if (this.c != n6a1Var.c) {
            return false;
        }
        int[] iArr = n6a1Var.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        a();
        int i2 = this.c;
        int length = this.b.length;
        if (i2 == length) {
            int[] iArr = new int[oo31.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = i;
    }

    public final void g(int i) {
        int length = this.b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.b = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = oo31.c(length, 3, 2, 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Integer.valueOf(this.b[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.c) {
            ny61.m(oyr.h(i, this.c, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.fw91, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.fw91, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            ny61.m("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        h(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
