package xsna;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.ironsource.X3;
import xsna.lwx;

/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes13.dex */
public final class owj0<E> extends ImmutableSet<E> {
    public final transient E e;

    public owj0(E e) {
        e.getClass();
        this.e = e;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> d() {
        return ImmutableList.p(this.e);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i, Object[] objArr) {
        objArr[i] = this.e;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final s4q0<E> iterator() {
        return new lwx.d(this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return X3.j.d + this.e.toString() + ']';
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
