package com.google.common.collect;

import defpackage.h221;
import defpackage.vng;

/* loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final Object[] B;
    public static final RegularImmutableSet C;
    public final transient int A;
    public final transient Object[] w;
    public final transient int x;
    public final transient Object[] y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        B = objArr;
        C = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.w = objArr;
        this.x = i;
        this.y = objArr2;
        this.z = i2;
        this.A = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.w;
        int i2 = this.A;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.y;
            if (objArr.length != 0) {
                int G = vng.G(obj);
                while (true) {
                    int i = G & this.z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    G = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] f() {
        return this.w;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int g() {
        return this.A;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.x;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: j */
    public final h221 iterator() {
        return a().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList p() {
        return ImmutableList.k(this.A, this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
