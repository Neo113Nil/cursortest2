package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes11.dex */
public abstract class jqp0<K, V, T> implements Iterator<T>, gcy {
    public Object[] b = gqp0.e.d;
    public int c;
    public int d;

    public final void a(int i, int i2, Object[] objArr) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
