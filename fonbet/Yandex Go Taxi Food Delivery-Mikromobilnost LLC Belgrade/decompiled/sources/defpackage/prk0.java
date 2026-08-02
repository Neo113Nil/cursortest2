package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class prk0 extends k8 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int w;

    public prk0(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            w511.f(oyr.i(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            w511.n(b64.t(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "), objArr.length);
            throw null;
        }
        this.b = objArr.length;
        this.w = i;
    }

    public final void a(Object obj) {
        if (f()) {
            ny61.r("ring buffer is full");
            return;
        }
        this.a[(size() + this.c) % this.b] = obj;
        this.w = size() + 1;
    }

    public final prk0 b(int i) {
        int i2 = this.b;
        int i3 = i2 + (i2 >> 1) + 1;
        if (i3 <= i) {
            i = i3;
        }
        return new prk0(size(), this.c == 0 ? Arrays.copyOf(this.a, i) : toArray(new Object[i]));
    }

    public final boolean f() {
        return size() == this.b;
    }

    public final void g(int i) {
        if (i < 0) {
            w511.f(oyr.i(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            w511.n(b64.t(i, "n shouldn't be greater than the buffer size: n = ", ", size = "), size());
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.w = size() - i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.b(i, size);
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.w;
    }

    @Override // defpackage.k8, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ork0(this);
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.a;
            if (i3 >= size || i >= this.b) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public prk0(int i) {
        this(0, new Object[i]);
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
