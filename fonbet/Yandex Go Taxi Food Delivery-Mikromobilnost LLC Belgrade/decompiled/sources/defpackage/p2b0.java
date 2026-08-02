package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class p2b0 extends w8 implements Collection, yfx {
    public o2b0 a;
    public Object b;
    public Object c;
    public final d2b0 w;

    public p2b0(o2b0 o2b0Var) {
        this.a = o2b0Var;
        this.b = o2b0Var.a;
        this.c = o2b0Var.b;
        this.w = o2b0Var.c.a();
    }

    @Override // defpackage.w8
    public final int a() {
        return this.w.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        d2b0 d2b0Var = this.w;
        if (d2b0Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            d2b0Var.put(obj, new bqy());
            return true;
        }
        d2b0Var.put(this.c, new bqy(((bqy) d2b0Var.get(this.c)).a, obj));
        d2b0Var.put(obj, new bqy(this.c));
        this.c = obj;
        return true;
    }

    public final o2b0 b() {
        b2b0 b = this.w.b();
        o2b0 o2b0Var = this.a;
        if (b != o2b0Var.c) {
            o2b0Var = new o2b0(this.b, this.c, b);
        }
        this.a = o2b0Var;
        return o2b0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.w.clear();
        kl40 kl40Var = kl40.y;
        this.b = kl40Var;
        this.c = kl40Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.w.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new r2b0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        d2b0 d2b0Var = this.w;
        bqy bqyVar = (bqy) d2b0Var.remove(obj);
        if (bqyVar == null) {
            return false;
        }
        Object obj2 = bqyVar.b;
        Object obj3 = bqyVar.a;
        kl40 kl40Var = kl40.y;
        if (obj3 != kl40Var) {
            d2b0Var.put(obj3, new bqy(((bqy) d2b0Var.get(obj3)).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != kl40Var) {
            d2b0Var.put(obj2, new bqy(obj3, ((bqy) d2b0Var.get(obj2)).b));
            return true;
        }
        this.c = obj3;
        return true;
    }
}
