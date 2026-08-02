package xsna;

import androidx.compose.runtime.Recomposer;
import java.util.Iterator;

/* compiled from: PersistentOrderedSet.kt */
/* loaded from: classes11.dex */
public final class v0a0<E> extends sh<E> implements z0a0<E> {
    public static final v0a0 e;
    public final Object b;
    public final Object c;
    public final wy90<E, pdz> d;

    static {
        ahn ahnVar = ahn.b;
        e = new v0a0(ahnVar, ahnVar, wy90.d);
    }

    public v0a0(Object obj, Object obj2, wy90<E, pdz> wy90Var) {
        this.b = obj;
        this.c = obj2;
        this.d = wy90Var;
    }

    @Override // xsna.z0a0
    public final v0a0 N2(Recomposer.c cVar) {
        wy90<E, pdz> wy90Var = this.d;
        pdz pdzVar = wy90Var.get(cVar);
        if (pdzVar == null) {
            return this;
        }
        Object obj = pdzVar.a;
        Object obj2 = pdzVar.b;
        gqp0<E, pdz> gqp0Var = wy90Var.b;
        gqp0<E, pdz> v = gqp0Var.v(cVar != null ? cVar.hashCode() : 0, 0, cVar);
        if (gqp0Var != v) {
            wy90Var = v == null ? wy90.d : new wy90<>(v, wy90Var.c - 1);
        }
        ahn ahnVar = ahn.b;
        if (obj != ahnVar) {
            wy90Var = wy90Var.f(obj, new pdz(wy90Var.get(obj).a, obj2));
        }
        if (obj2 != ahnVar) {
            wy90Var = wy90Var.f(obj2, new pdz(obj, wy90Var.get(obj2).b));
        }
        Object obj3 = obj != ahnVar ? this.b : obj2;
        if (obj2 != ahnVar) {
            obj = this.c;
        }
        return new v0a0(obj3, obj, wy90Var);
    }

    @Override // java.util.Collection, java.util.Set, xsna.z0a0
    public final v0a0 add(Object obj) {
        wy90<E, pdz> wy90Var = this.d;
        if (wy90Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new v0a0(obj, obj, wy90Var.f(obj, new pdz()));
        }
        Object obj2 = this.c;
        return new v0a0(this.b, obj, wy90Var.f(obj2, new pdz(wy90Var.get(obj2).a, obj)).f(obj, new pdz(obj2, ahn.b)));
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.d.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new w0a0(this.b, this.d);
    }
}
