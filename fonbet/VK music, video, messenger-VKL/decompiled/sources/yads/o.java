package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
public abstract class o implements Iterator {
    public final Iterator b;
    public Object c = null;
    public Collection d = null;
    public Iterator e = be1.b;
    public final /* synthetic */ a0 f;

    public o(a0 a0Var) {
        this.f = a0Var;
        this.b = a0Var.f.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.d = collection;
            this.e = collection.iterator();
        }
        return a(this.c, this.e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.e.remove();
        Collection collection = this.d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.b.remove();
        }
        a0 a0Var = this.f;
        a0Var.g--;
    }
}
