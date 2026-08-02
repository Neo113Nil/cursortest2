package io.reactivex.rxjava3.internal.operators.observable;

import xsna.v7o;

/* compiled from: ObservableInternalHelper.java */
/* loaded from: classes8.dex */
public final class d1<T, S> implements io.reactivex.rxjava3.functions.c<S, io.reactivex.rxjava3.core.f<T>, S> {
    public final v7o b;

    public d1(v7o v7oVar) {
        this.b = v7oVar;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) throws Throwable {
        this.b.accept((io.reactivex.rxjava3.core.f) obj2);
        return obj;
    }
}
