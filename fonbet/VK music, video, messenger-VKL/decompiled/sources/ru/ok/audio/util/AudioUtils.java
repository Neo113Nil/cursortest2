package ru.ok.audio.util;

import android.os.Build;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class AudioUtils {
    private final long handle;

    public AudioUtils(SystemAudioConfiguration systemAudioConfiguration) {
        this.handle = nativeStartAudio(systemAudioConfiguration.getSamplerate(), systemAudioConfiguration.getBufferSize(), Build.VERSION.SDK_INT);
    }

    private native boolean nativePitchShiftBenchmark(long j);

    private native int nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native void nativeReleaseHandle(long j);

    private native long nativeStartAudio(int i, int i2, int i3);

    private native void nativeStartDelayMeasure(long j, int i);

    private native void nativeStopAudio(long j);

    private native int nativeStopDelayMeasure(long j);

    public void finalize() throws Throwable {
        nativeReleaseHandle(this.handle);
        super.finalize();
    }

    public boolean pitchShiftBenchmark() {
        return nativePitchShiftBenchmark(this.handle);
    }

    public int readData(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return nativeReadData(this.handle, byteBuffer, i, i2, i3);
    }

    public void startDelayMeasure(int i) {
        nativeStartDelayMeasure(this.handle, i);
    }

    public void stop() {
        nativeStopAudio(this.handle);
    }

    public int stopDelayMeasure() {
        return nativeStopDelayMeasure(this.handle);
    }
}
