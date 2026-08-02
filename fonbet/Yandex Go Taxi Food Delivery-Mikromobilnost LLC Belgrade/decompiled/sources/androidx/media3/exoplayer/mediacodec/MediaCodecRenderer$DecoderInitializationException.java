package androidx.media3.exoplayer.mediacodec;

import defpackage.sb10;

/* loaded from: classes10.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final sb10 codecInfo;
    public final String diagnosticInfo;
    public final MediaCodecRenderer$DecoderInitializationException fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    public MediaCodecRenderer$DecoderInitializationException(androidx.media3.common.a aVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + aVar, mediaCodecUtil$DecoderQueryException, aVar.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i), null);
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, sb10 sb10Var, String str3, MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = sb10Var;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = mediaCodecRenderer$DecoderInitializationException;
    }
}
