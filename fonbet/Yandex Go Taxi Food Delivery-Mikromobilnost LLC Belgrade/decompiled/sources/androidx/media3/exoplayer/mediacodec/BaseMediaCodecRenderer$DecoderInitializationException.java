package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import defpackage.sb10;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class BaseMediaCodecRenderer$DecoderInitializationException extends Exception {
    public final sb10 codecInfo;
    public final String diagnosticInfo;
    public final BaseMediaCodecRenderer$DecoderInitializationException fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    public BaseMediaCodecRenderer$DecoderInitializationException(androidx.media3.common.a aVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + aVar, mediaCodecUtil$DecoderQueryException, aVar.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i), null);
    }

    public BaseMediaCodecRenderer$DecoderInitializationException(androidx.media3.common.a aVar, Exception exc, boolean z, sb10 sb10Var) {
        this("Decoder init failed: " + sb10Var.a + Extension.FIX_SPACE + aVar, exc, aVar.n, z, sb10Var, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null, null);
    }

    public BaseMediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, sb10 sb10Var, String str3, BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = sb10Var;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = baseMediaCodecRenderer$DecoderInitializationException;
    }
}
