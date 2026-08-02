package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.i;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements i<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
