package yads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class w93 implements Iterator {
    public final Iterator b;

    public w93(Iterator it) {
        this.b = (Iterator) oh2.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
