package androidx.camera.core;

/* loaded from: classes10.dex */
public class CameraUnavailableException extends Exception {
    private final int mReason;

    public CameraUnavailableException(String str) {
        super(str);
        this.mReason = 3;
    }

    public CameraUnavailableException(int i, Exception exc) {
        super(exc);
        this.mReason = i;
    }
}
