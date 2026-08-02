package androidx.media3.common;

/* loaded from: classes10.dex */
public final class VideoFrameProcessingException extends Exception {
    public static final /* synthetic */ int a = 0;
    public final long presentationTimeUs;

    public VideoFrameProcessingException(Exception exc) {
        super(exc);
        this.presentationTimeUs = -9223372036854775807L;
    }
}
