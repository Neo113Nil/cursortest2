package org.chromium.base.supplier;

import org.chromium.base.Callback;

/* loaded from: classes8.dex */
public interface ObservableSupplier<E> extends Supplier<E> {

    public @interface NotifyBehavior {
        public static final int NONE = 0;
        public static final int NOTIFY_ON_ADD = 1;
        public static final int POST_ON_ADD = 2;
    }

    default E addObserver(Callback<E> callback) {
        return addSyncObserverAndPostIfNonNull(callback);
    }

    E addObserver(Callback<E> callback, @NotifyBehavior int i);

    default E addSyncObserver(Callback<E> callback) {
        return addObserver(callback, 0);
    }

    default E addSyncObserverAndCallIfNonNull(Callback<E> callback) {
        return addObserver(callback, 1);
    }

    default E addSyncObserverAndPostIfNonNull(Callback<E> callback) {
        return addObserver(callback, 3);
    }

    void removeObserver(Callback<E> callback);
}
