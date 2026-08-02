package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraManager;
import defpackage.gt7;

/* loaded from: classes10.dex */
final class Camera2CameraImpl$CameraAvailability extends CameraManager.AvailabilityCallback implements gt7 {
    private boolean mCameraAvailable = true;
    private final String mCameraId;
    final /* synthetic */ l this$0;

    public Camera2CameraImpl$CameraAvailability(l lVar, String str) {
        this.this$0 = lVar;
        this.mCameraId = str;
    }

    public boolean isCameraAvailable() {
        return this.mCameraAvailable;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAvailable(String str) {
        if (this.mCameraId.equals(str)) {
            this.mCameraAvailable = true;
            if (this.this$0.x == Camera2CameraImpl$InternalState.PENDING_OPEN || this.this$0.x == Camera2CameraImpl$InternalState.OPENING_WITH_ERROR) {
                this.this$0.L(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraUnavailable(String str) {
        if (this.mCameraId.equals(str)) {
            this.mCameraAvailable = false;
        }
    }

    @Override // defpackage.gt7
    public void onOpenAvailable() {
        if (this.this$0.x == Camera2CameraImpl$InternalState.PENDING_OPEN || this.this$0.x == Camera2CameraImpl$InternalState.OPENING_WITH_ERROR) {
            this.this$0.L(false);
        }
    }
}
