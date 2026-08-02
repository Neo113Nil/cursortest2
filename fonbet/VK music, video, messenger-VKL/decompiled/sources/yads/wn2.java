package yads;

/* loaded from: classes10.dex */
public final class wn2 extends x51 {
    public final transient v51 d;
    public final transient s51 e;

    public wn2(v51 v51Var, xn2 xn2Var) {
        this.d = v51Var;
        this.e = xn2Var;
    }

    @Override // yads.x51, yads.m51
    public final s51 a() {
        return this.e;
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // yads.m51
    public final boolean e() {
        return true;
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final nb3 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((yn2) this.d).g;
    }

    @Override // yads.m51
    public final int a(int i, Object[] objArr) {
        return this.e.a(i, objArr);
    }
}
