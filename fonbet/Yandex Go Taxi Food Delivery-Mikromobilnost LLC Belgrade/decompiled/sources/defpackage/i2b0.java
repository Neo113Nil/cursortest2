package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class i2b0 extends u8 {
    public final d2b0 a;

    public i2b0(d2b0 d2b0Var) {
        this.a = d2b0Var;
    }

    @Override // defpackage.u8
    public final int a() {
        return this.a.y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        de11[] de11VarArr = new de11[8];
        for (int i = 0; i < 8; i++) {
            de11VarArr[i] = new he11();
        }
        return new h2b0(this.a, de11VarArr);
    }
}
