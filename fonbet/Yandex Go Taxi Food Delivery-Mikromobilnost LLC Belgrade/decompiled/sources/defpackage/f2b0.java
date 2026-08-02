package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class f2b0 extends p8 {
    public final d2b0 a;

    public f2b0(d2b0 d2b0Var) {
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

    @Override // defpackage.p8
    public final boolean b(Map.Entry entry) {
        Object key = entry.getKey();
        d2b0 d2b0Var = this.a;
        Object obj = d2b0Var.get(key);
        return obj != null ? obj.equals(entry.getValue()) : entry.getValue() == null && d2b0Var.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.p8
    public final boolean f(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new xab(this.a);
    }
}
