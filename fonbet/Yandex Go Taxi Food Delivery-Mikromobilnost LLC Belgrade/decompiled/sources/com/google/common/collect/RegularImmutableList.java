package com.google.common.collect;

import defpackage.ffx;
import java.util.Objects;

/* loaded from: classes.dex */
final class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList x = new RegularImmutableList(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public RegularImmutableList(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.w;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] f() {
        return this.c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int g() {
        return this.w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ffx.n(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
