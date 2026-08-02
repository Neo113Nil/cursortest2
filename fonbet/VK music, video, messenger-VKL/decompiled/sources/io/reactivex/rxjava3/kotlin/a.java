package io.reactivex.rxjava3.kotlin;

import kotlin.Pair;

/* compiled from: Observables.kt */
/* loaded from: classes8.dex */
public final class a<T1, T2, R> implements io.reactivex.rxjava3.functions.c<T1, T2, Pair<? extends T1, ? extends T2>> {
    public static final a b = new a();

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}
