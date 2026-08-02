package xsna;

import java.util.NoSuchElementException;

/* compiled from: PersistentVectorIterator.kt */
/* loaded from: classes11.dex */
public final class g1a0<T> extends hf<T> {
    public final T[] d;
    public final fqp0<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public g1a0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new fqp0<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        fqp0<T> fqp0Var = this.e;
        if (fqp0Var.hasNext()) {
            this.b++;
            return fqp0Var.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - fqp0Var.c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        fqp0<T> fqp0Var = this.e;
        int i2 = fqp0Var.c;
        if (i <= i2) {
            this.b = i - 1;
            return fqp0Var.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
