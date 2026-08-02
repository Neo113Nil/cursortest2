package one.video.calls.audio.opus;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* loaded from: classes8.dex */
public class FileReader implements Closeable {
    private native long nativeAudioGetTotalPcmDuration();

    private static native FileReader nativeAudioOpenOpusFile(String str);

    private native void nativeAudioReadOpusFile(ByteBuffer byteBuffer, int i, int[] iArr);

    private native boolean nativeAudioSeekOpusFile(float f);

    private native IOException nativeGetError();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        JniCommon.nativeReleaseRef(0L);
    }
}
