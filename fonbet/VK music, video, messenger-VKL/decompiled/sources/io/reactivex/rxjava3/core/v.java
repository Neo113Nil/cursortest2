package io.reactivex.rxjava3.core;

/* compiled from: Observer.java */
/* loaded from: classes11.dex */
public interface v<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(io.reactivex.rxjava3.disposables.c cVar);
}
