package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class h77 implements Iterator, xfx {
    public abstract byte a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
