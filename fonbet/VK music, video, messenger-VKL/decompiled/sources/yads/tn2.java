package yads;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class tn2 extends s51 {
    public static final tn2 f = new tn2(0, new Object[0]);
    public final transient Object[] d;
    public final transient int e;

    public tn2(int i, Object[] objArr) {
        this.d = objArr;
        this.e = i;
    }

    @Override // yads.s51, yads.m51
    public final int a(int i, Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // yads.m51
    public final Object[] b() {
        return this.d;
    }

    @Override // yads.m51
    public final int c() {
        return this.e;
    }

    @Override // yads.m51
    public final int d() {
        return 0;
    }

    @Override // yads.m51
    public final boolean e() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oh2.a(i, this.e);
        Object obj = this.d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
