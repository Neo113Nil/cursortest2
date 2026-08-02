package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class jg91 implements Iterator {
    public final Iterator a;
    public boolean b;
    public Object c;

    public jg91(Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b) {
            ny61.r("Can't remove after you've peeked at next");
        } else {
            this.a.remove();
        }
    }
}
