package xsna;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: PersistentVectorMutableIterator.kt */
/* loaded from: classes11.dex */
public final class i1a0<T> extends hf<T> {
    public final e1a0<T> d;
    public int e;
    public fqp0<? extends T> f;
    public int g;

    public i1a0(e1a0<T> e1a0Var, int i) {
        super(i, e1a0Var.size());
        this.d = e1a0Var;
        this.e = e1a0Var.g();
        this.g = -1;
        b();
    }

    public final void a() {
        if (this.e != this.d.g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // xsna.hf, java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.b;
        e1a0<T> e1a0Var = this.d;
        e1a0Var.add(i, t);
        this.b++;
        this.c = e1a0Var.size();
        this.e = e1a0Var.g();
        this.g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        e1a0<T> e1a0Var = this.d;
        Object[] objArr = e1a0Var.g;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int size = (e1a0Var.size() - 1) & (-32);
        int i = this.b;
        if (i > size) {
            i = size;
        }
        int i2 = (e1a0Var.e / 5) + 1;
        fqp0<? extends T> fqp0Var = this.f;
        if (fqp0Var == null) {
            this.f = new fqp0<>(objArr, i, size, i2);
            return;
        }
        fqp0Var.b = i;
        fqp0Var.c = size;
        fqp0Var.d = i2;
        if (fqp0Var.e.length < i2) {
            fqp0Var.e = new Object[i2];
        }
        fqp0Var.e[0] = objArr;
        ?? r6 = i == size ? 1 : 0;
        fqp0Var.f = r6;
        fqp0Var.b(i - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i;
        fqp0<? extends T> fqp0Var = this.f;
        e1a0<T> e1a0Var = this.d;
        if (fqp0Var == null) {
            Object[] objArr = e1a0Var.h;
            this.b = i + 1;
            return (T) objArr[i];
        }
        if (fqp0Var.hasNext()) {
            this.b++;
            return fqp0Var.next();
        }
        Object[] objArr2 = e1a0Var.h;
        int i2 = this.b;
        this.b = i2 + 1;
        return (T) objArr2[i2 - fqp0Var.c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i - 1;
        fqp0<? extends T> fqp0Var = this.f;
        e1a0<T> e1a0Var = this.d;
        if (fqp0Var == null) {
            Object[] objArr = e1a0Var.h;
            int i2 = i - 1;
            this.b = i2;
            return (T) objArr[i2];
        }
        int i3 = fqp0Var.c;
        if (i <= i3) {
            this.b = i - 1;
            return fqp0Var.previous();
        }
        Object[] objArr2 = e1a0Var.h;
        int i4 = i - 1;
        this.b = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // xsna.hf, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        e1a0<T> e1a0Var = this.d;
        e1a0Var.remove(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = e1a0Var.size();
        this.e = e1a0Var.g();
        this.g = -1;
        b();
    }

    @Override // xsna.hf, java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        e1a0<T> e1a0Var = this.d;
        e1a0Var.set(i, t);
        this.e = e1a0Var.g();
        b();
    }
}
