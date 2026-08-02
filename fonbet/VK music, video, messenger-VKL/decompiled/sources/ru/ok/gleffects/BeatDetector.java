package ru.ok.gleffects;

/* loaded from: classes9.dex */
public class BeatDetector {
    private long instance;

    public BeatDetector(int i, int i2, int i3, long j) {
        this.instance = createBeatDetector(i, i2, i3, j);
    }

    private static native long createBeatDetector(int i, int i2, int i3, long j);

    private static native long[] getBeats(long j);

    private static native boolean isFilled(long j);

    private static native void processDecodedSamples(long j, byte[] bArr, int i, int i2, boolean z);

    private static native void release(long j);

    public long[] getBeats() {
        return getBeats(this.instance);
    }

    public boolean isFilled() {
        return isFilled(this.instance);
    }

    public void processDecodedSamples(byte[] bArr, int i, int i2, boolean z) {
        processDecodedSamples(this.instance, bArr, i, i2, z);
    }

    public void release() {
        release(this.instance);
        this.instance = 0L;
    }
}
