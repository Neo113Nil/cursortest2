package androidx.camera.core;

/* loaded from: classes10.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = i;
    }

    public final int a() {
        return this.mImageCaptureError;
    }
}
