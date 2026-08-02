package defpackage;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class anu implements ListIterator, xfx {
    public int a;
    public final int b;
    public final int c;
    public final /* synthetic */ cnu w;

    public anu(cnu cnuVar, int i, int i2) {
        this(cnuVar, (i2 & 1) != 0 ? 0 : i, 0, cnuVar.a.b);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        xy40 xy40Var = this.w.a;
        int i = this.a;
        this.a = i + 1;
        return (e530) xy40Var.b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a - this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        xy40 xy40Var = this.w.a;
        int i = this.a - 1;
        this.a = i;
        return (e530) xy40Var.b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.a - this.b) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public anu(cnu cnuVar, int i, int i2, int i3) {
        this.w = cnuVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
