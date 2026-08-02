package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import xsna.hzf;

/* compiled from: DecoderListener.kt */
/* loaded from: classes3.dex */
public interface j8l<D extends hzf> {
    DecodedSampleStatus a(MediaCodec.BufferInfo bufferInfo);

    void b(MediaCodec.BufferInfo bufferInfo);

    void c(hzf hzfVar);
}
