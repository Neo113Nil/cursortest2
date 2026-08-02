package xsna;

import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes8.dex */
public abstract class z8x implements Iterator<Integer>, gcy {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
