package io.reactivex.rxjava3.internal.fuseable;

/* compiled from: SimpleQueue.java */
/* loaded from: classes11.dex */
public interface l<T> {
    void clear();

    boolean isEmpty();

    boolean offer(T t);

    T poll() throws Throwable;
}
