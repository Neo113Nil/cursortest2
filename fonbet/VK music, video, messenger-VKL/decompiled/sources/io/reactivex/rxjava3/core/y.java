package io.reactivex.rxjava3.core;

/* compiled from: SingleEmitter.java */
/* loaded from: classes8.dex */
public interface y<T> {
    void a(io.reactivex.rxjava3.functions.e eVar);

    boolean b(Throwable th);

    boolean h();

    void i(io.reactivex.rxjava3.disposables.c cVar);

    void onError(Throwable th);

    void onSuccess(T t);
}
