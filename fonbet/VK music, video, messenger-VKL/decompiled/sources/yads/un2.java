package yads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class un2 extends s51 {
    public final /* synthetic */ vn2 d;

    public un2(vn2 vn2Var) {
        this.d = vn2Var;
    }

    @Override // yads.m51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oh2.a(i, this.d.g);
        vn2 vn2Var = this.d;
        int i2 = i * 2;
        Object obj = vn2Var.e[vn2Var.f + i2];
        Objects.requireNonNull(obj);
        vn2 vn2Var2 = this.d;
        Object obj2 = vn2Var2.e[i2 + (vn2Var2.f ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.g;
    }
}
