package org.chromium.base.supplier;

import java.util.function.Function;
import org.chromium.base.Callback;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.base.supplier.UnwrapObservableSupplier;

/* loaded from: classes8.dex */
public class UnwrapObservableSupplier<P, T> implements ObservableSupplier<T> {
    private final ObservableSupplierImpl<T> mDelegateSupplier = new ObservableSupplierImpl<>();
    private final Callback<P> mOnParentSupplierChangeCallback = new Callback() { // from class: xsna.y6q0
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            UnwrapObservableSupplier.this.onParentSupplierChange(obj);
        }
    };
    private final ObservableSupplier<P> mParentSupplier;
    private final Function<P, T> mUnwrapFunction;

    public UnwrapObservableSupplier(ObservableSupplier<P> observableSupplier, Function<P, T> function) {
        this.mParentSupplier = observableSupplier;
        this.mUnwrapFunction = function;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onParentSupplierChange(P p) {
        this.mDelegateSupplier.set(this.mUnwrapFunction.apply(p));
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public T addObserver(Callback<T> callback, @ObservableSupplier.NotifyBehavior int i) {
        if (!this.mDelegateSupplier.hasObservers()) {
            this.mParentSupplier.addSyncObserverAndCallIfNonNull(this.mOnParentSupplierChangeCallback);
        }
        return this.mDelegateSupplier.addObserver(callback, i);
    }

    @Override // java.util.function.Supplier
    public T get() {
        return (T) this.mUnwrapFunction.apply(this.mParentSupplier.get());
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public void removeObserver(Callback<T> callback) {
        this.mDelegateSupplier.removeObserver(callback);
        if (this.mDelegateSupplier.hasObservers()) {
            return;
        }
        this.mParentSupplier.removeObserver(this.mOnParentSupplierChangeCallback);
    }
}
