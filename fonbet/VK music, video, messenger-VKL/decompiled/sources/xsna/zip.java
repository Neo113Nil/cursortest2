package xsna;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;

/* compiled from: EncoderAudio.java */
/* loaded from: classes3.dex */
public final class zip extends ajp {
    public static final /* synthetic */ int e = 0;

    public zip(MediaCodec mediaCodec, MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (mediaFormat == null) {
            throw new IllegalArgumentException();
        }
        this.a = mediaCodec;
        this.b = mediaFormat;
        this.c = codecCapabilities;
    }
}
