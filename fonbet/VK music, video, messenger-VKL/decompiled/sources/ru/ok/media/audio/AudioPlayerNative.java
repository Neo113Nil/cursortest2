package ru.ok.media.audio;

import android.os.Environment;
import java.nio.ByteBuffer;
import ru.ok.audio.util.SystemAudioConfiguration;
import xsna.ne7;

/* loaded from: classes9.dex */
public class AudioPlayerNative {
    private static final String TAG = "ru.ok.media.audio.AudioPlayerNative";
    private final int bufferMs;
    private final int channelCount;
    private long nativeHandle;
    private final int sampleRate;
    private final SystemAudioConfiguration systemConfig;
    private boolean voice;
    private float volume = 1.0f;

    public AudioPlayerNative(SystemAudioConfiguration systemAudioConfiguration, int i, int i2, int i3) {
        this.systemConfig = systemAudioConfiguration;
        this.sampleRate = i;
        this.channelCount = i2;
        this.bufferMs = i3;
    }

    private native int nativeGetBufferSize(long j);

    private native void nativeSetVoice(long j, boolean z);

    private native void nativeSetVolume(long j, float f);

    private native long nativeStart(int i, int i2, int i3, int i4, int i5, String str);

    private native void nativeStop(long j);

    private native void nativeWriteAudioSamples(long j, ByteBuffer byteBuffer, int i);

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.nativeHandle;
        if (j != 0) {
            nativeStop(j);
            this.nativeHandle = 0L;
        }
    }

    public synchronized int getBufferedMS() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetBufferSize(j);
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public float getVolume() {
        return this.volume;
    }

    public synchronized void play() {
        try {
            try {
                if (this.nativeHandle != 0) {
                    return;
                }
                ne7.t(TAG, "audio config: " + this.systemConfig);
                long nativeStart = nativeStart(this.systemConfig.getSamplerate(), this.systemConfig.getBufferSize(), this.sampleRate, this.channelCount, this.bufferMs, Environment.getExternalStorageDirectory().getAbsolutePath());
                this.nativeHandle = nativeStart;
                nativeSetVoice(nativeStart, this.voice);
                nativeSetVolume(this.nativeHandle, this.volume);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void setVoice(boolean z) {
        this.voice = z;
        long j = this.nativeHandle;
        if (j != 0) {
            nativeSetVoice(j, z);
        }
    }

    public synchronized void setVolume(float f) {
        if (f != this.volume) {
            this.volume = f;
            long j = this.nativeHandle;
            if (j != 0) {
                nativeSetVolume(j, f);
            }
        }
    }

    public synchronized void stop() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeStop(j);
            this.nativeHandle = 0L;
        }
    }

    public synchronized void writeAudioSamples(ByteBuffer byteBuffer, int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return;
        }
        nativeWriteAudioSamples(j, byteBuffer, i / 2);
    }
}
