package xsna;

import android.util.SparseArray;
import java.util.Iterator;

/* compiled from: SparseArrayExt.kt */
/* loaded from: classes17.dex */
public final class ajk0<V> implements Iterator<V>, gcy {
    public final SparseArray<V> b;
    public int c;

    public ajk0(SparseArray<V> sparseArray) {
        this.b = sparseArray;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public final V next() {
        int i = this.c;
        this.c = i + 1;
        return this.b.valueAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
