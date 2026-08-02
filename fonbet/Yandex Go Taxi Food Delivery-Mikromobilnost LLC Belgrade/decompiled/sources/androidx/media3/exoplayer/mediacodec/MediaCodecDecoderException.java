package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.sb10;
import defpackage.tw21;

/* loaded from: classes10.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final sb10 codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(RuntimeException runtimeException, sb10 sb10Var) {
        super(r0.toString(), runtimeException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(sb10Var == null ? null : sb10Var.a);
        this.codecInfo = sb10Var;
        boolean z = runtimeException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) runtimeException).getDiagnosticInfo() : null;
        this.diagnosticInfo = diagnosticInfo;
        this.errorCode = tw21.a >= 23 ? z ? ((MediaCodec.CodecException) runtimeException).getErrorCode() : 0 : tw21.B(diagnosticInfo);
    }
}
