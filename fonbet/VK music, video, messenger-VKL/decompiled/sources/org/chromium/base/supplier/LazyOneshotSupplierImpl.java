package org.chromium.base.supplier;

import org.chromium.base.Callback;
import org.chromium.base.Promise;
import org.chromium.base.ThreadUtils;

/* loaded from: classes8.dex */
public abstract class LazyOneshotSupplierImpl<T> implements LazyOneshotSupplier<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mDoSetCalled;
    private final Promise<T> mPromise = new Promise<>();
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();

    private void tryDoSet() {
        if (this.mDoSetCalled) {
            return;
        }
        doSet();
        this.mDoSetCalled = true;
    }

    public abstract void doSet();

    @Override // org.chromium.base.supplier.LazyOneshotSupplier
    public T get() {
        this.mThreadChecker.assertOnValidThread();
        if (!hasValue()) {
            tryDoSet();
        }
        if (hasValue()) {
            return this.mPromise.getResult();
        }
        return null;
    }

    @Override // org.chromium.base.supplier.LazyOneshotSupplier
    public boolean hasValue() {
        return this.mPromise.isFulfilled();
    }

    @Override // org.chromium.base.supplier.LazyOneshotSupplier
    public void onAvailable(Callback<T> callback) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.then(callback);
    }

    public void set(T t) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.fulfill(t);
    }
}
