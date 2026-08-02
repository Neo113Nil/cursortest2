package com.yandex.div.core.util;

import java.util.Iterator;
import xsna.gcy;
import xsna.wik0;

/* compiled from: SparseArrays.kt */
/* loaded from: classes7.dex */
final class SparseArrayIterator<T> implements Iterator<T>, gcy {
    private final wik0<T> array;
    private int index;

    public SparseArrayIterator(wik0<T> wik0Var) {
        this.array = wik0Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.array.d > this.index;
    }

    @Override // java.util.Iterator
    public T next() {
        wik0<T> wik0Var = this.array;
        int i = this.index;
        this.index = i + 1;
        return wik0Var.i(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
