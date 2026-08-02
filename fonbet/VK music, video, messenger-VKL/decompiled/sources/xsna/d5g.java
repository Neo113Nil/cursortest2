package xsna;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: IteratorsJVM.kt */
/* loaded from: classes11.dex */
public final class d5g implements Iterator<Object>, gcy {
    public final /* synthetic */ Enumeration<Object> b;

    public d5g(Enumeration<Object> enumeration) {
        this.b = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
