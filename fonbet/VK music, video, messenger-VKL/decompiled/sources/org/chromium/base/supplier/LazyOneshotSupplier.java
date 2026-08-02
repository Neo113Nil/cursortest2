package org.chromium.base.supplier;

import org.chromium.base.Callback;

/* loaded from: classes8.dex */
public interface LazyOneshotSupplier<T> {
    static <T> LazyOneshotSupplier<T> fromSupplier(final Supplier<T> supplier) {
        return new LazyOneshotSupplierImpl<T>() { // from class: org.chromium.base.supplier.LazyOneshotSupplier.2
            @Override // org.chromium.base.supplier.LazyOneshotSupplierImpl
            public void doSet() {
                set(Supplier.this.get());
            }
        };
    }

    static <T> LazyOneshotSupplier<T> fromValue(final T t) {
        return new LazyOneshotSupplierImpl<T>() { // from class: org.chromium.base.supplier.LazyOneshotSupplier.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.chromium.base.supplier.LazyOneshotSupplierImpl
            public void doSet() {
                set(t);
            }
        };
    }

    T get();

    boolean hasValue();

    void onAvailable(Callback<T> callback);
}
