package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import defpackage.sb10;
import defpackage.z9c;

/* loaded from: classes10.dex */
public class MediaCodecRecoverException extends MediaCodecDecoderException {
    public final z9c recoverOptions;
    public final Throwable sourceException;

    public MediaCodecRecoverException(RuntimeException runtimeException, sb10 sb10Var, MediaCodecVideoDecoderException mediaCodecVideoDecoderException, z9c z9cVar) {
        super(runtimeException, sb10Var);
        this.sourceException = mediaCodecVideoDecoderException;
        this.recoverOptions = z9cVar;
    }
}
