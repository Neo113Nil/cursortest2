package xsna;

import android.media.MediaCodec;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Codec.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class kzf extends FunctionReferenceImpl implements izs<MediaCodec, s3q0> {
    public static final kzf b = new kzf(1, MediaCodec.class, "signalEndOfInputStream", "signalEndOfInputStream()V", 0);

    @Override // xsna.izs
    public final s3q0 invoke(MediaCodec mediaCodec) {
        mediaCodec.signalEndOfInputStream();
        return s3q0.a;
    }
}
