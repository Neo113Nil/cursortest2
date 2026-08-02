package org.chromium.base.supplier;

import java.util.function.Function;
import org.chromium.base.Callback;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.base.supplier.TransitiveObservableSupplier;

/* loaded from: classes8.dex */
public class TransitiveObservableSupplier<P, T> implements ObservableSupplier<T> {
    private ObservableSupplier<T> mCurrentTargetSupplier;
    private final ObservableSupplierImpl<T> mDelegateSupplier = new ObservableSupplierImpl<>();
    private final Callback<P> mOnParentSupplierChangeCallback = new Callback() { // from class: xsna.lnp0
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            TransitiveObservableSupplier.this.onParentSupplierChange(obj);
        }
    };
    private final Callback<T> mOnTargetSupplierChangeCallback = new Callback() { // from class: xsna.mnp0
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            TransitiveObservableSupplier.this.onTargetSupplierChange(obj);
        }
    };
    private final ObservableSupplier<P> mParentSupplier;
    private final Function<P, ObservableSupplier<T>> mUnwrapFunction;

    public TransitiveObservableSupplier(ObservableSupplier<P> observableSupplier, Function<P, ObservableSupplier<T>> function) {
        this.mParentSupplier = observableSupplier;
        this.mUnwrapFunction = function;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onParentSupplierChange(P p) {
        ObservableSupplier<T> observableSupplier = this.mCurrentTargetSupplier;
        if (observableSupplier != null) {
            observableSupplier.removeObserver(this.mOnTargetSupplierChangeCallback);
        }
        ObservableSupplier<T> apply = p == null ? null : this.mUnwrapFunction.apply(p);
        this.mCurrentTargetSupplier = apply;
        onTargetSupplierChange(apply != null ? apply.addSyncObserver(this.mOnTargetSupplierChangeCallback) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTargetSupplierChange(T t) {
        this.mDelegateSupplier.set(t);
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public T addObserver(Callback<T> callback, @ObservableSupplier.NotifyBehavior int i) {
        if (!this.mDelegateSupplier.hasObservers()) {
            onParentSupplierChange(this.mParentSupplier.addSyncObserver(this.mOnParentSupplierChangeCallback));
        }
        return this.mDelegateSupplier.addObserver(callback, i);
    }

    @Override // java.util.function.Supplier
    public T get() {
        ObservableSupplier<T> apply;
        if (this.mDelegateSupplier.hasObservers()) {
            return this.mDelegateSupplier.get();
        }
        P p = this.mParentSupplier.get();
        if (p == null || (apply = this.mUnwrapFunction.apply(p)) == null) {
            return null;
        }
        return apply.get();
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public void removeObserver(Callback<T> callback) {
        this.mDelegateSupplier.removeObserver(callback);
        if (this.mDelegateSupplier.hasObservers()) {
            return;
        }
        this.mParentSupplier.removeObserver(this.mOnParentSupplierChangeCallback);
        ObservableSupplier<T> observableSupplier = this.mCurrentTargetSupplier;
        if (observableSupplier != null) {
            observableSupplier.removeObserver(this.mOnTargetSupplierChangeCallback);
            this.mCurrentTargetSupplier = null;
        }
    }
}
