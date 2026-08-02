package yads;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class r51 extends s51 {
    public final transient int d;
    public final transient int e;
    public final /* synthetic */ s51 f;

    public r51(s51 s51Var, int i, int i2) {
        this.f = s51Var;
        this.d = i;
        this.e = i2;
    }

    @Override // yads.s51, java.util.List
    /* renamed from: a */
    public final s51 subList(int i, int i2) {
        oh2.a(i, i2, this.e);
        s51 s51Var = this.f;
        int i3 = this.d;
        return s51Var.subList(i + i3, i2 + i3);
    }

    @Override // yads.m51
    public final Object[] b() {
        return this.f.b();
    }

    @Override // yads.m51
    public final int c() {
        return this.f.d() + this.d + this.e;
    }

    @Override // yads.m51
    public final int d() {
        return this.f.d() + this.d;
    }

    @Override // yads.m51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oh2.a(i, this.e);
        return this.f.get(i + this.d);
    }

    @Override // yads.s51, yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.s51, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // yads.s51, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
