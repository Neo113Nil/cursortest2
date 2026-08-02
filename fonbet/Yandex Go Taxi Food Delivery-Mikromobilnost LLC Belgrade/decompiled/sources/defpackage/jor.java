package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class jor implements Iterator, xfx {
    public abstract float a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
