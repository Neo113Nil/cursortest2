package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements io.reactivex.rxjava3.internal.fuseable.g<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
