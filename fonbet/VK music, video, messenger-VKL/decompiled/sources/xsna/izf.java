package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Codec.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class izf extends FunctionReferenceImpl implements izs<MediaCodec, MediaFormat> {
    public static final izf b = new izf(1, MediaCodec.class, "getInputFormat", "getInputFormat()Landroid/media/MediaFormat;", 0);

    @Override // xsna.izs
    public final MediaFormat invoke(MediaCodec mediaCodec) {
        return mediaCodec.getInputFormat();
    }
}
