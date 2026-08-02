package ru.ok.audioeffects;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public class AudioEffects {
    private static final String TAG = "AudioEffects";
    private ByteBuffer byteBuffer;
    private final long instance = create();
    private short[] shortBuffer;

    static {
        System.loadLibrary("audio-effects");
    }

    private static native void addAudioEffect(long j, int i, float[] fArr, boolean z);

    private static native void clear(long j);

    private static native long create();

    private static native void flush(long j);

    public static native int getVersionId();

    public static native String getVersionString();

    private static native int isEmpty(long j);

    private static native int numChannels(long j);

    private static native int numSamples(long j);

    private static native int numUnprocessedSamples(long j);

    private static native void putSamples(long j, short[] sArr, int i);

    private static native int receiveSamples(long j, int i);

    private static native int receiveSamples(long j, short[] sArr, int i);

    private static native long release(long j);

    private static native void setChannels(long j, int i);

    private static native void setSampleRate(long j, int i);

    public void addEffect(int i, float[] fArr, boolean z) {
        addAudioEffect(this.instance, i, fArr, z);
    }

    public void clear() {
        clear(this.instance);
    }

    public void flush() {
        flush(this.instance);
    }

    public int isEmpty() {
        return isEmpty(this.instance);
    }

    public int numChannels() {
        return numChannels(this.instance);
    }

    public int numSamples() {
        return numSamples(this.instance);
    }

    public int numUnprocessedSamples() {
        return numUnprocessedSamples(this.instance);
    }

    public void putSamples(short[] sArr, int i) {
        putSamples(this.instance, sArr, i);
    }

    public int receiveSamples(short[] sArr, int i) {
        return receiveSamples(this.instance, sArr, i);
    }

    public void release() {
        release(this.instance);
    }

    public void setChannels(int i) {
        setChannels(this.instance, i);
    }

    public void setSampleRate(int i) {
        setSampleRate(this.instance, i);
    }

    public void putSamples(byte[] bArr, int i) {
        int i2 = i / 2;
        short[] sArr = this.shortBuffer;
        if (sArr == null || sArr.length < i2) {
            this.shortBuffer = new short[i2];
        }
        ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(this.shortBuffer, 0, i2);
        putSamples(this.instance, this.shortBuffer, i2);
    }

    public int receiveSamples(byte[] bArr, int i) {
        int i2 = i / 2;
        short[] sArr = this.shortBuffer;
        if (sArr == null || sArr.length < i2) {
            this.shortBuffer = new short[i2];
        }
        int receiveSamples = receiveSamples(this.instance, this.shortBuffer, i2);
        ByteBuffer byteBuffer = this.byteBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.byteBuffer = ByteBuffer.allocate(i).order(ByteOrder.nativeOrder());
        } else {
            this.byteBuffer.clear();
        }
        this.byteBuffer.asShortBuffer().put(this.shortBuffer, 0, receiveSamples);
        this.byteBuffer.get(bArr);
        return receiveSamples * 2;
    }

    public int receiveSamples(int i) {
        return receiveSamples(this.instance, i);
    }
}
