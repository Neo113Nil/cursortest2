package androidx.camera.core.impl;

/* loaded from: classes10.dex */
public class CameraValidator$CameraIdListIncorrectException extends Exception {
    private final int mAvailableCameraCount;

    public CameraValidator$CameraIdListIncorrectException(int i, IllegalArgumentException illegalArgumentException) {
        super("Expected camera missing from device.", illegalArgumentException);
        this.mAvailableCameraCount = i;
    }

    public final int a() {
        return this.mAvailableCameraCount;
    }
}
