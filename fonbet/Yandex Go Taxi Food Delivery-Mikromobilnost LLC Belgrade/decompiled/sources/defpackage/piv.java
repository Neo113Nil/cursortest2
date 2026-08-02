package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class piv extends h221 implements ListIterator {
    public final int b;
    public int c;
    public final ImmutableList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piv(int i, ImmutableList immutableList) {
        super(0);
        int size = immutableList.size();
        ffx.p(i, size);
        this.b = size;
        this.c = i;
        this.w = immutableList;
    }

    public final Object a(int i) {
        return this.w.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        int i = this.c;
        this.c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ny61.p();
            return null;
        }
        int i = this.c - 1;
        this.c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
