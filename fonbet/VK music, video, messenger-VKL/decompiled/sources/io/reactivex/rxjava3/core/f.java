package io.reactivex.rxjava3.core;

/* compiled from: Emitter.java */
/* loaded from: classes11.dex */
public interface f<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
