package xsna;

import java.util.NoSuchElementException;

/* compiled from: PersistentVectorIterator.kt */
/* loaded from: classes8.dex */
public final class f1a0<T> extends gf<T> {
    public final T[] d;
    public final eqp0<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public f1a0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new eqp0<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        eqp0<T> eqp0Var = this.e;
        if (eqp0Var.hasNext()) {
            this.b++;
            return eqp0Var.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - eqp0Var.c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        eqp0<T> eqp0Var = this.e;
        int i2 = eqp0Var.c;
        if (i <= i2) {
            this.b = i - 1;
            return eqp0Var.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
