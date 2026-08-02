package androidx.camera.core.impl;

/* loaded from: classes10.dex */
public enum CameraInternal$State {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    private final boolean mHoldsCameraSlot;

    CameraInternal$State(boolean z) {
        this.mHoldsCameraSlot = z;
    }

    public final boolean a() {
        return this.mHoldsCameraSlot;
    }
}
