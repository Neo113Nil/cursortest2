package yads;

import com.ironsource.X3;

/* loaded from: classes10.dex */
public final class b13 extends x51 {
    public final transient Object d;

    public b13(Object obj) {
        this.d = oh2.a(obj);
    }

    @Override // yads.x51, yads.m51
    public final s51 a() {
        return s51.a(this.d);
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // yads.m51
    public final boolean e() {
        return false;
    }

    @Override // yads.x51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final nb3 iterator() {
        return new ae1(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return X3.j.d + this.d.toString() + ']';
    }

    @Override // yads.m51
    public final int a(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }
}
