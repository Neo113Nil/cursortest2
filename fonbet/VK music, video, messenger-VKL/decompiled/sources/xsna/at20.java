package xsna;

import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;

/* compiled from: MixingTrackSample.kt */
/* loaded from: classes3.dex */
public final class at20 {
    public final ByteBuffer a;
    public final AudioPcm b;
    public final yl4 c;
    public final float[] d;
    public final byte[] e;
    public final int f;

    public at20(ByteBuffer byteBuffer, AudioPcm audioPcm, yl4 yl4Var) {
        this.a = byteBuffer;
        this.b = audioPcm;
        this.c = yl4Var;
        this.d = new float[yl4Var.a];
        AudioPcm.EncodingType encodingType = AudioPcm.EncodingType.UNSET;
        this.e = byteBuffer.array();
        this.f = byteBuffer.arrayOffset();
    }
}
