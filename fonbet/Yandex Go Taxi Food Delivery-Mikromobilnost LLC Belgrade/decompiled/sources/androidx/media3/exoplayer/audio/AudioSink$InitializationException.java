package androidx.media3.exoplayer.audio;

import defpackage.b64;
import defpackage.vfc;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int audioTrackState;
    public final androidx.media3.common.a format;
    public final boolean isRecoverable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, androidx.media3.common.a aVar, boolean z, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder s = b64.s(i, i2, "AudioTrack init failed ", " Config(", Extension.FIX_SPACE);
        vfc.u(i3, i4, Extension.FIX_SPACE, Extension.C_BRAKE_SPACE, s);
        s.append(aVar);
        s.append(z ? " (recoverable)" : "");
        this.audioTrackState = i;
        this.isRecoverable = z;
        this.format = aVar;
    }
}
