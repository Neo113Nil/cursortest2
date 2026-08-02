package org.chromium.base.supplier;

import java.lang.ref.WeakReference;
import org.chromium.base.Callback;

/* loaded from: classes8.dex */
public class OneShotCallback<E> {
    private final Callback<E> mCallback;
    private final Callback<E> mCallbackWrapper;
    private final WeakReference<ObservableSupplier<E>> mWeakSupplier;

    public class CallbackWrapper implements Callback<E> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public /* synthetic */ CallbackWrapper(OneShotCallback oneShotCallback, int i) {
            this();
        }

        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public void lambda$bind$0(E e) {
            OneShotCallback.this.mCallback.lambda$bind$0(e);
            ((ObservableSupplier) OneShotCallback.this.mWeakSupplier.get()).removeObserver(OneShotCallback.this.mCallbackWrapper);
        }

        private CallbackWrapper() {
        }
    }

    public OneShotCallback(ObservableSupplier<E> observableSupplier, Callback<E> callback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(this, 0);
        this.mCallbackWrapper = callbackWrapper;
        this.mWeakSupplier = new WeakReference<>(observableSupplier);
        this.mCallback = callback;
        observableSupplier.addObserver(callbackWrapper);
    }
}
