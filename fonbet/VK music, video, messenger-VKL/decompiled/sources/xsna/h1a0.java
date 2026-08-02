package xsna;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: PersistentVectorMutableIterator.kt */
/* loaded from: classes8.dex */
public final class h1a0<T> extends gf<T> {
    public final d1a0<T> d;
    public int e;
    public eqp0<? extends T> f;
    public int g;

    public h1a0(d1a0<T> d1a0Var, int i) {
        super(i, d1a0Var.size());
        this.d = d1a0Var;
        this.e = d1a0Var.d();
        this.g = -1;
        b();
    }

    public final void a() {
        if (this.e != this.d.d()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // xsna.gf, java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.b;
        d1a0<T> d1a0Var = this.d;
        d1a0Var.add(i, t);
        this.b++;
        this.c = d1a0Var.size();
        this.e = d1a0Var.d();
        this.g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        d1a0<T> d1a0Var = this.d;
        Object[] objArr = d1a0Var.g;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int size = (d1a0Var.size() - 1) & (-32);
        int i = this.b;
        if (i > size) {
            i = size;
        }
        int i2 = (d1a0Var.e / 5) + 1;
        eqp0<? extends T> eqp0Var = this.f;
        if (eqp0Var == null) {
            this.f = new eqp0<>(objArr, i, size, i2);
            return;
        }
        eqp0Var.b = i;
        eqp0Var.c = size;
        eqp0Var.d = i2;
        if (eqp0Var.e.length < i2) {
            eqp0Var.e = new Object[i2];
        }
        eqp0Var.e[0] = objArr;
        ?? r6 = i == size ? 1 : 0;
        eqp0Var.f = r6;
        eqp0Var.b(i - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i;
        eqp0<? extends T> eqp0Var = this.f;
        d1a0<T> d1a0Var = this.d;
        if (eqp0Var == null) {
            Object[] objArr = d1a0Var.h;
            this.b = i + 1;
            return (T) objArr[i];
        }
        if (eqp0Var.hasNext()) {
            this.b++;
            return eqp0Var.next();
        }
        Object[] objArr2 = d1a0Var.h;
        int i2 = this.b;
        this.b = i2 + 1;
        return (T) objArr2[i2 - eqp0Var.c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i - 1;
        eqp0<? extends T> eqp0Var = this.f;
        d1a0<T> d1a0Var = this.d;
        if (eqp0Var == null) {
            Object[] objArr = d1a0Var.h;
            int i2 = i - 1;
            this.b = i2;
            return (T) objArr[i2];
        }
        int i3 = eqp0Var.c;
        if (i <= i3) {
            this.b = i - 1;
            return eqp0Var.previous();
        }
        Object[] objArr2 = d1a0Var.h;
        int i4 = i - 1;
        this.b = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // xsna.gf, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        d1a0<T> d1a0Var = this.d;
        d1a0Var.remove(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = d1a0Var.size();
        this.e = d1a0Var.d();
        this.g = -1;
        b();
    }

    @Override // xsna.gf, java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        d1a0<T> d1a0Var = this.d;
        d1a0Var.set(i, t);
        this.e = d1a0Var.d();
        b();
    }
}
