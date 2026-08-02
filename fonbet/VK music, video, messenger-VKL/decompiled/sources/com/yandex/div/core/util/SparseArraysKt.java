package com.yandex.div.core.util;

import xsna.wik0;

/* compiled from: SparseArrays.kt */
/* loaded from: classes7.dex */
public final class SparseArraysKt {
    public static final <T> Iterable<T> toIterable(wik0<T> wik0Var) {
        return new SparseArrayIterable(wik0Var);
    }
}
