package xsna;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class l0a0<K, V> implements Iterator<odz<V>>, gcy {
    public Object b;
    public final g0a0<K, V> c;
    public Object d = po40.e;
    public boolean e;
    public int f;
    public int g;

    public l0a0(Object obj, g0a0<K, V> g0a0Var) {
        this.b = obj;
        this.c = g0a0Var;
        this.f = g0a0Var.e.f;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final odz<V> next() {
        g0a0<K, V> g0a0Var = this.c;
        if (g0a0Var.e.f != this.f) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        this.d = obj;
        this.e = true;
        this.g++;
        odz<V> odzVar = g0a0Var.e.get(obj);
        if (odzVar == null) {
            throw new ConcurrentModificationException(tk5.c(new StringBuilder("Hash code of a key ("), this.b, ") has changed after it was added to the persistent map."));
        }
        odz<V> odzVar2 = odzVar;
        this.b = odzVar2.c;
        return odzVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.c.getSize();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException();
        }
        Object obj = this.d;
        g0a0<K, V> g0a0Var = this.c;
        g0a0Var.remove(obj);
        this.d = null;
        this.e = false;
        this.f = g0a0Var.e.f;
        this.g--;
    }
}
