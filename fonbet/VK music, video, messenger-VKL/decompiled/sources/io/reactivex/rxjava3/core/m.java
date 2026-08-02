package io.reactivex.rxjava3.core;

/* compiled from: MaybeObserver.java */
/* loaded from: classes8.dex */
public interface m<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(io.reactivex.rxjava3.disposables.c cVar);

    void onSuccess(T t);
}
