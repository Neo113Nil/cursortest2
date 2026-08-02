package org.chromium.base.supplier;

import org.chromium.base.Callback;

/* loaded from: classes8.dex */
public interface OneshotSupplier<T> extends Supplier<T> {
    T onAvailable(Callback<T> callback);

    default void runSyncOrOnAvailable(Callback<T> callback) {
        if (hasValue()) {
            callback.lambda$bind$0(get());
        } else {
            onAvailable(callback);
        }
    }
}
