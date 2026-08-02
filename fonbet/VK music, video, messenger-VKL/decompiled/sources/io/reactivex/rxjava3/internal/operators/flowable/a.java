package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* compiled from: AbstractFlowableWithUpstream.java */
/* loaded from: classes11.dex */
public abstract class a<T, R> extends io.reactivex.rxjava3.core.g<R> {
    public final io.reactivex.rxjava3.core.g<T> c;

    public a(io.reactivex.rxjava3.core.g<T> gVar) {
        Objects.requireNonNull(gVar, "source is null");
        this.c = gVar;
    }
}
