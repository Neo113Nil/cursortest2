package defpackage;

import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes10.dex */
public final class nyu0 implements ListIterator, xfx {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ oyu0 b;

    public nyu0(Ref$IntRef ref$IntRef, oyu0 oyu0Var) {
        this.a = ref$IntRef;
        this.b = oyu0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.element < this.b.w - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.element >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Ref$IntRef ref$IntRef = this.a;
        int i = ref$IntRef.element + 1;
        oyu0 oyu0Var = this.b;
        d6z.b(i, oyu0Var.w);
        ref$IntRef.element = i;
        return oyu0Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.element + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Ref$IntRef ref$IntRef = this.a;
        int i = ref$IntRef.element;
        oyu0 oyu0Var = this.b;
        d6z.b(i, oyu0Var.w);
        ref$IntRef.element = i - 1;
        return oyu0Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.element;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
