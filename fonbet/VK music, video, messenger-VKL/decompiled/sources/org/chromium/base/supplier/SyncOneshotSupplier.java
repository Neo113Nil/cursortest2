package org.chromium.base.supplier;

import org.chromium.base.Callback;

/* loaded from: classes8.dex */
public interface SyncOneshotSupplier<T> extends Supplier<T> {
    T onAvailable(Callback<T> callback);
}
