package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;

/* compiled from: LLSimpleAudioDecoder.kt */
/* loaded from: classes3.dex */
public final class wky {
    public final MediaCodec a;

    /* compiled from: LLSimpleAudioDecoder.kt */
    public static final class a extends RuntimeException {
    }

    public wky(MediaFormat mediaFormat) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = jq10.b(new jq10(new bv10()), mediaFormat, null, 6);
            mediaCodec.start();
            this.a = mediaCodec;
        } catch (Throwable th) {
            if (mediaCodec != null) {
                try {
                    mediaCodec.release();
                } catch (Throwable unused) {
                }
            }
            a aVar = new a("Failed to init decoder for " + mediaFormat, th);
            com.vk.metrics.eventtracking.b.a.a(aVar);
            throw aVar;
        }
    }
}
