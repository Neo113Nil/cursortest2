package defpackage;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class i8 extends h8 implements ListIterator {
    public final /* synthetic */ k8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(k8 k8Var, int i) {
        super(0, k8Var);
        this.w = k8Var;
        g8 g8Var = k8.Companion;
        int size = k8Var.size();
        g8Var.getClass();
        g8.c(i, size);
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ny61.p();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return this.w.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
