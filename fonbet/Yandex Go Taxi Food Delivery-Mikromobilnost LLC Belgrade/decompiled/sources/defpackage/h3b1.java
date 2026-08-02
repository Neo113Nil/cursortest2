package defpackage;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class h3b1 extends h221 implements ListIterator {
    public final int b;
    public int c;
    public final zzp w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b1(zzp zzpVar, int i) {
        super(1);
        int size = zzpVar.size();
        if (i < 0 || i > size) {
            ny61.m(q5z.r0(i, size, "index"));
            throw null;
        }
        this.b = size;
        this.c = i;
        this.w = zzpVar;
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
