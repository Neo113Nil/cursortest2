package com.yandex.div.core.util;

import java.util.Iterator;
import xsna.gcy;
import xsna.wik0;

/* compiled from: SparseArrays.kt */
/* loaded from: classes7.dex */
public final class SparseArrayIterable<T> implements Iterable<T>, gcy {
    private final wik0<T> array;

    public SparseArrayIterable(wik0<T> wik0Var) {
        this.array = wik0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new SparseArrayIterator(this.array);
    }
}
