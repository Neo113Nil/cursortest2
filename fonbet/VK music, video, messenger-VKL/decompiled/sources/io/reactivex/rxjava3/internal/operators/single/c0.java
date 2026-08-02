package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.maybe.y;

/* compiled from: SingleOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class c0<T> extends io.reactivex.rxjava3.core.k<T> {
    public final io.reactivex.rxjava3.core.x<T> b;
    public final a.x c = io.reactivex.rxjava3.internal.functions.a.g;

    public c0(io.reactivex.rxjava3.core.x xVar) {
        this.b = xVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new y.a(mVar, this.c));
    }
}
