package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class k extends c implements ListIterator {
    public final /* synthetic */ l x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i) {
        super(lVar, ((List) lVar.b).listIterator(i));
        this.x = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l lVar = this.x;
        boolean isEmpty = lVar.isEmpty();
        b().add(obj);
        lVar.y.x++;
        if (isEmpty) {
            lVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(lVar);
        this.x = lVar;
    }
}
