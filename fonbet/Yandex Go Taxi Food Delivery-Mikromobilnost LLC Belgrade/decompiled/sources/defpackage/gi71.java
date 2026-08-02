package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import yads.ac1;
import yads.uw1;

/* loaded from: classes7.dex */
public final class gi71 implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator w = ac1.b;
    public final /* synthetic */ uw1 x;

    public gi71(uw1 uw1Var) {
        this.x = uw1Var;
        this.a = uw1Var.w.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.w.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.w = collection.iterator();
        }
        return this.w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.w.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        uw1 uw1Var = this.x;
        uw1Var.x--;
    }
}
