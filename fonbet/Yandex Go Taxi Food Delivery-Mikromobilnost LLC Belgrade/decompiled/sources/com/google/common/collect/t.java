package com.google.common.collect;

import defpackage.tw01;
import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class t extends tw01 implements ListIterator {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 0);
        this.c = i;
        this.w = abstractList;
    }

    @Override // defpackage.tw01
    public final Object a(Object obj) {
        int i = this.c;
        AbstractList abstractList = this.w;
        switch (i) {
            case 0:
                return ((Lists$TransformingRandomAccessList) abstractList).function.mo489apply(obj);
            default:
                return ((Lists$TransformingSequentialList) abstractList).function.mo489apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
