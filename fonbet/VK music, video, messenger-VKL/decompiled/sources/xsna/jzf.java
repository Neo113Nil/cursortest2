package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Codec.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class jzf extends FunctionReferenceImpl implements izs<MediaCodec, MediaFormat> {
    public static final jzf b = new jzf(1, MediaCodec.class, "getOutputFormat", "getOutputFormat()Landroid/media/MediaFormat;", 0);

    @Override // xsna.izs
    public final MediaFormat invoke(MediaCodec mediaCodec) {
        return mediaCodec.getOutputFormat();
    }
}
