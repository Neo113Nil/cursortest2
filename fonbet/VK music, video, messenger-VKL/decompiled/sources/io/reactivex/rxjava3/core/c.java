package io.reactivex.rxjava3.core;

/* compiled from: CompletableObserver.java */
/* loaded from: classes11.dex */
public interface c {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(io.reactivex.rxjava3.disposables.c cVar);
}
