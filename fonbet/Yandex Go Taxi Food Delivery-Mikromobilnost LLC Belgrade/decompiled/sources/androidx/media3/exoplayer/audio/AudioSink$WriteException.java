package androidx.media3.exoplayer.audio;

import defpackage.oyr;

/* loaded from: classes10.dex */
public final class AudioSink$WriteException extends Exception {
    public final int errorCode;
    public final androidx.media3.common.a format;
    public final boolean isRecoverable;

    public AudioSink$WriteException(androidx.media3.common.a aVar, int i, boolean z) {
        super(oyr.i(i, "AudioTrack write failed: "));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = aVar;
    }
}
