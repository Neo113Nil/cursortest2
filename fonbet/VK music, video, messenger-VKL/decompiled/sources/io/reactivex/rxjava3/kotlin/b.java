package io.reactivex.rxjava3.kotlin;

import kotlin.Pair;

/* compiled from: Singles.kt */
/* loaded from: classes8.dex */
public final class b<T1, T2, R> implements io.reactivex.rxjava3.functions.c<Object, Object, Pair<Object, Object>> {
    public static final b b = new b();

    @Override // io.reactivex.rxjava3.functions.c
    public final Pair<Object, Object> apply(Object obj, Object obj2) {
        return new Pair<>(obj, obj2);
    }
}
