package one.video.calls.audio.opus;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class FileWriter implements Closeable {
    private static native FileWriter nativeAudioStartRecord(String str, int i, int i2);

    private native boolean nativeAudioWriteFrame(ByteBuffer byteBuffer, int i);

    private native IOException nativeGetError();

    private native void nativeRelease();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        nativeRelease();
    }
}
