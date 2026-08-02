package com.google.common.collect;

import defpackage.h221;
import defpackage.n3x;

/* loaded from: classes.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public final transient Object w;

    public SingletonImmutableSet(Object obj) {
        obj.getClass();
        this.w = obj;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        return ImmutableList.r(this.w);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.w;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: j */
    public final h221 iterator() {
        return new n3x(this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.w.toString() + ']';
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
