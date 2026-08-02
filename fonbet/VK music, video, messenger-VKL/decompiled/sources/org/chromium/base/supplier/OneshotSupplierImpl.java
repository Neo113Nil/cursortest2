package org.chromium.base.supplier;

import org.chromium.base.Callback;
import org.chromium.base.Promise;
import org.chromium.base.ThreadUtils;

/* loaded from: classes8.dex */
public class OneshotSupplierImpl<T> implements OneshotSupplier<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Promise<T> mPromise = new Promise<>();
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();

    @Override // java.util.function.Supplier
    public T get() {
        this.mThreadChecker.assertOnValidThread();
        if (this.mPromise.isFulfilled()) {
            return this.mPromise.getResult();
        }
        return null;
    }

    @Override // org.chromium.base.supplier.OneshotSupplier
    public T onAvailable(Callback<T> callback) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.then(callback);
        return get();
    }

    public void set(T t) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.fulfill(t);
    }
}
