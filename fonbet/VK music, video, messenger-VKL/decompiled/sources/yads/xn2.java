package yads;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class xn2 extends s51 {
    public final transient Object[] d;
    public final transient int e;
    public final transient int f;

    public xn2(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.f = i2;
    }

    @Override // yads.m51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oh2.a(i, this.f);
        Object obj = this.d[(i * 2) + this.e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
