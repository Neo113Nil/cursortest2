package org.chromium.base;

import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import org.chromium.base.Promise;
import xsna.j4e0;
import xsna.m4e0;

/* loaded from: classes8.dex */
public class Promise<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Exception mRejectReason;
    private T mResult;
    private boolean mThrowingRejectionHandler;
    private int mState = 0;
    private final List<Callback<T>> mFulfillCallbacks = new LinkedList();
    private final List<Callback<Exception>> mRejectCallbacks = new LinkedList();
    private final Thread mThread = Thread.currentThread();
    private final Handler mHandler = new Handler();

    public interface AsyncFunction<A, RT> extends Function<A, Promise<RT>> {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PromiseState {
        public static final int FULFILLED = 1;
        public static final int REJECTED = 2;
        public static final int UNFULFILLED = 0;
    }

    public static class UnhandledRejectionException extends RuntimeException {
        public UnhandledRejectionException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void exceptInner(Callback<Exception> callback) {
        int i = this.mState;
        if (i == 2) {
            postCallbackToLooper(callback, this.mRejectReason);
        } else if (i == 0) {
            this.mRejectCallbacks.add(callback);
        }
    }

    public static <T> Promise<T> fulfilled(T t) {
        Promise<T> promise = new Promise<>();
        promise.fulfill(t);
        return promise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$then$0(Exception exc) {
        throw new UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$then$1(Promise promise, Function function, Object obj) {
        try {
            promise.fulfill(function.apply(obj));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$then$2(AsyncFunction asyncFunction, final Promise promise, Object obj) {
        try {
            Promise apply = asyncFunction.apply(obj);
            Objects.requireNonNull(promise);
            apply.then(new Callback() { // from class: xsna.i4e0
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void lambda$bind$0(Object obj2) {
                    Promise.this.fulfill(obj2);
                }
            }, new j4e0(promise));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    private <S> void postCallbackToLooper(Callback<S> callback, S s) {
        this.mHandler.post(callback.bind(s));
    }

    public static <T> Promise<T> rejected() {
        Promise<T> promise = new Promise<>();
        promise.reject();
        return promise;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void thenInner(Callback<T> callback) {
        int i = this.mState;
        if (i == 1) {
            postCallbackToLooper(callback, this.mResult);
        } else if (i == 0) {
            this.mFulfillCallbacks.add(callback);
        }
    }

    public Promise<T> andFinally(final Runnable runnable) {
        Callback<T> callback = new Callback() { // from class: xsna.n4e0
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(Object obj) {
                runnable.run();
            }
        };
        thenInner(callback);
        exceptInner(callback);
        return this;
    }

    public void except(Callback<Exception> callback) {
        checkThread();
        exceptInner(callback);
    }

    public void fulfill(T t) {
        checkThread();
        this.mState = 1;
        this.mResult = t;
        Iterator<Callback<T>> it = this.mFulfillCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper(it.next(), t);
        }
        this.mFulfillCallbacks.clear();
    }

    public T getResult() {
        return this.mResult;
    }

    public boolean isFulfilled() {
        checkThread();
        return this.mState == 1;
    }

    public boolean isPending() {
        checkThread();
        return this.mState == 0;
    }

    public boolean isRejected() {
        checkThread();
        return this.mState == 2;
    }

    public void reject(Exception exc) {
        checkThread();
        this.mState = 2;
        this.mRejectReason = exc;
        Iterator<Callback<Exception>> it = this.mRejectCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper((Callback) it.next(), exc);
        }
        this.mRejectCallbacks.clear();
    }

    public void then(Callback<T> callback) {
        checkThread();
        if (this.mThrowingRejectionHandler) {
            thenInner(callback);
        } else {
            then(callback, new m4e0());
            this.mThrowingRejectionHandler = true;
        }
    }

    public void reject() {
        reject(null);
    }

    public void then(Callback<T> callback, Callback<Exception> callback2) {
        checkThread();
        thenInner(callback);
        exceptInner(callback2);
    }

    public <RT> Promise<RT> then(final Function<T, RT> function) {
        checkThread();
        final Promise<RT> promise = new Promise<>();
        thenInner(new Callback() { // from class: xsna.k4e0
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(Object obj) {
                Promise.lambda$then$1(Promise.this, function, obj);
            }
        });
        exceptInner(new j4e0(promise));
        return promise;
    }

    public <RT> Promise<RT> then(final AsyncFunction<T, RT> asyncFunction) {
        checkThread();
        final Promise<RT> promise = new Promise<>();
        thenInner(new Callback() { // from class: xsna.l4e0
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(Object obj) {
                Promise.lambda$then$2(Promise.AsyncFunction.this, promise, obj);
            }
        });
        exceptInner(new j4e0(promise));
        return promise;
    }

    private void checkThread() {
    }
}
