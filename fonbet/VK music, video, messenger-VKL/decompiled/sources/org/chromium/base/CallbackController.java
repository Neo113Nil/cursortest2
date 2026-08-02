package org.chromium.base;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class CallbackController {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ArrayList<WeakReference<Cancelable>> mCancelables = new ArrayList<>();

    public interface Cancelable {
        void cancel();
    }

    public class CancelableCallback<T> implements Cancelable, Callback<T> {
        private Callback<T> mCallback;

        public /* synthetic */ CancelableCallback(CallbackController callbackController, Callback callback, int i) {
            this(callback);
        }

        @Override // org.chromium.base.CallbackController.Cancelable
        public void cancel() {
            this.mCallback = null;
        }

        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public void lambda$bind$0(T t) {
            synchronized (CallbackController.this) {
                try {
                    Callback<T> callback = this.mCallback;
                    if (callback != null) {
                        callback.lambda$bind$0(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private CancelableCallback(Callback<T> callback) {
            this.mCallback = callback;
        }
    }

    public class CancelableRunnable implements Cancelable, Runnable {
        private Runnable mRunnable;

        public /* synthetic */ CancelableRunnable(CallbackController callbackController, Runnable runnable, int i) {
            this(runnable);
        }

        @Override // org.chromium.base.CallbackController.Cancelable
        public void cancel() {
            this.mRunnable = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CallbackController.this) {
                try {
                    Runnable runnable = this.mRunnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private CancelableRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    private void addInternal(Cancelable cancelable) {
        ArrayList<WeakReference<Cancelable>> arrayList = this.mCancelables;
        arrayList.add(new WeakReference<>(cancelable));
        if (arrayList.size() % 1024 == 0) {
            CollectionUtil.strengthen(arrayList);
        }
    }

    public synchronized void destroy() {
        try {
            checkNotCanceled();
            Iterator it = CollectionUtil.strengthen(this.mCancelables).iterator();
            while (it.hasNext()) {
                ((Cancelable) it.next()).cancel();
            }
            this.mCancelables = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized <T> Callback<T> makeCancelable(Callback<T> callback) {
        CancelableCallback cancelableCallback;
        checkNotCanceled();
        cancelableCallback = new CancelableCallback(this, callback, 0);
        addInternal(cancelableCallback);
        return cancelableCallback;
    }

    public synchronized Runnable makeCancelable(Runnable runnable) {
        CancelableRunnable cancelableRunnable;
        checkNotCanceled();
        cancelableRunnable = new CancelableRunnable(this, runnable, 0);
        addInternal(cancelableRunnable);
        return cancelableRunnable;
    }

    private void checkNotCanceled() {
    }
}
