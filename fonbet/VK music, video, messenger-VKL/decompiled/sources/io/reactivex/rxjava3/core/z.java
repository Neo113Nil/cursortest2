package io.reactivex.rxjava3.core;

/* compiled from: SingleObserver.java */
/* loaded from: classes11.dex */
public interface z<T> {
    void onError(Throwable th);

    void onSubscribe(io.reactivex.rxjava3.disposables.c cVar);

    void onSuccess(T t);
}
