package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
final class CameraManagerCompat$AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
    private final Executor mExecutor;
    final CameraManager.AvailabilityCallback mWrappedCallback;
    private final Object mLock = new Object();
    private boolean mDisabled = false;

    public CameraManagerCompat$AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mExecutor = executor;
        this.mWrappedCallback = availabilityCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCameraAccessPrioritiesChanged$0() {
        this.mWrappedCallback.onCameraAccessPrioritiesChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCameraAvailable$1(String str) {
        this.mWrappedCallback.onCameraAvailable(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCameraUnavailable$2(String str) {
        this.mWrappedCallback.onCameraUnavailable(str);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        synchronized (this.mLock) {
            try {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraManagerCompat$AvailabilityCallbackExecutorWrapper.this.lambda$onCameraAccessPrioritiesChanged$0();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAvailable(String str) {
        synchronized (this.mLock) {
            try {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new i(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraUnavailable(String str) {
        synchronized (this.mLock) {
            try {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new i(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDisabled() {
        synchronized (this.mLock) {
            this.mDisabled = true;
        }
    }
}
