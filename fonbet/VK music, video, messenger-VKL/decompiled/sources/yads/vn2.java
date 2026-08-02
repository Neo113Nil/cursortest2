package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class vn2 extends x51 {
    public final transient v51 d;
    public final transient Object[] e;
    public final transient int f = 0;
    public final transient int g;

    public vn2(v51 v51Var, Object[] objArr, int i) {
        this.d = v51Var;
        this.e = objArr;
        this.g = i;
    }

    @Override // yads.m51
    public final int a(int i, Object[] objArr) {
        return a().a(i, objArr);
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.m51
    public final boolean e() {
        return true;
    }

    @Override // yads.x51
    public final s51 f() {
        return new un2(this);
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final nb3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
