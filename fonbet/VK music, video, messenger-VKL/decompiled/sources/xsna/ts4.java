package xsna;

/* compiled from: AudioPlayerLoadParams.kt */
/* loaded from: classes3.dex */
public final class ts4 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts4)) {
            return false;
        }
        ((ts4) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + shy.a(60000, shy.a(5000, shy.a(2500, shy.a(600000, Integer.hashCode(480000) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "AudioPlayerLoadParams(minBufferMs=480000, maxBufferMs=600000, bufferForPlaybackMs=2500, bufferForPlaybackAfterRebufferMs=5000, backBufferDurationMs=60000, prioritizeTimeOverSizeThresholds=true)";
    }
}
