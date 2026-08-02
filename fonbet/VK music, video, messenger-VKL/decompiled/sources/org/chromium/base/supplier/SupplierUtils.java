package org.chromium.base.supplier;

import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.supplier.SupplierUtils;

/* loaded from: classes8.dex */
public class SupplierUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static class Barrier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Runnable mCallback;
        private final ThreadUtils.ThreadChecker mThreadChecker;
        private int mWaitingCount;

        public /* synthetic */ Barrier(int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$waitForAll$0(Object obj) {
            onSupplierAvailable();
        }

        private void notifyCallbackIfAppropriate() {
            Runnable runnable;
            if (this.mWaitingCount == 0 && (runnable = this.mCallback) != null) {
                runnable.run();
                this.mCallback = null;
            }
        }

        private void onSupplierAvailable() {
            this.mThreadChecker.assertOnValidThread();
            this.mWaitingCount--;
            notifyCallbackIfAppropriate();
        }

        public void waitForAll(Runnable runnable, Supplier<?>... supplierArr) {
            this.mThreadChecker.assertOnValidThread();
            this.mCallback = runnable;
            Callback callback = new Callback() { // from class: org.chromium.base.supplier.a
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void lambda$bind$0(Object obj) {
                    SupplierUtils.Barrier.this.lambda$waitForAll$0(obj);
                }
            };
            int i = 0;
            for (Supplier<?> supplier : supplierArr) {
                if (!supplier.hasValue()) {
                    i++;
                    if (supplier instanceof ObservableSupplier) {
                        new OneShotCallback((ObservableSupplier) supplier, callback);
                    } else if (supplier instanceof OneshotSupplier) {
                        ((OneshotSupplier) supplier).onAvailable(callback);
                    } else if (supplier instanceof SyncOneshotSupplier) {
                        ((SyncOneshotSupplier) supplier).onAvailable(callback);
                    }
                }
            }
            this.mWaitingCount = i;
            notifyCallbackIfAppropriate();
        }

        private Barrier() {
            this.mThreadChecker = new ThreadUtils.ThreadChecker();
        }
    }

    private SupplierUtils() {
    }

    public static void waitForAll(Runnable runnable, Supplier<?>... supplierArr) {
        new Barrier(0).waitForAll(runnable, supplierArr);
    }
}
