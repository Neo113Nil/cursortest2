package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class o9o implements p9o {
    public final List a;
    public int b;

    public o9o(List list) {
        this.a = list;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return (Long) this.a.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
