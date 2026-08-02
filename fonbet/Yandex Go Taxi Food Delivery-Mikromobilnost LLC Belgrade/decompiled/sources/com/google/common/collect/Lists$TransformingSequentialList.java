package com.google.common.collect;

import defpackage.vls;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
final class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final List<F> fromList;
    final vls function;

    public Lists$TransformingSequentialList(List list, vls vlsVar) {
        list.getClass();
        this.fromList = list;
        this.function = vlsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new t(this, this.fromList.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.fromList.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.fromList.size();
    }
}
