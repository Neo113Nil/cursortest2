package yads;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class y extends w implements ListIterator {
    public final /* synthetic */ z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(zVar);
        this.e = zVar;
    }

    public final ListIterator a() {
        this.d.c();
        if (this.d.c == this.c) {
            return (ListIterator) this.b;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.e.isEmpty();
        a().add(obj);
        z zVar = this.e;
        zVar.g.g++;
        if (isEmpty) {
            zVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return a().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return a().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, int i) {
        super(zVar, zVar.e().listIterator(i));
        this.e = zVar;
    }
}
