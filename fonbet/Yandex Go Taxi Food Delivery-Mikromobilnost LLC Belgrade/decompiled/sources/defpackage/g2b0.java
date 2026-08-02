package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class g2b0 extends w8 {
    public final d2b0 a;

    public g2b0(d2b0 d2b0Var) {
        this.a = d2b0Var;
    }

    @Override // defpackage.w8
    public final int a() {
        return this.a.y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        de11[] de11VarArr = new de11[8];
        for (int i = 0; i < 8; i++) {
            de11VarArr[i] = new fe11();
        }
        return new h2b0(this.a, de11VarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        d2b0 d2b0Var = this.a;
        if (!d2b0Var.containsKey(obj)) {
            return false;
        }
        d2b0Var.remove(obj);
        return true;
    }
}
