package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.SparseArray;
import com.vk.media.pipeline.audio.AudioPcm;
import com.vk.media.pipeline.codec.CodecDrainer;
import java.nio.ByteBuffer;
import xsna.jz4;
import xsna.kfp0;
import xsna.v6e0;

/* compiled from: AudioTrackTranscoder.kt */
/* loaded from: classes3.dex */
public final class mz4 {
    public final csp a;
    public final rfp0 b;
    public final in4 c;
    public final kfp0<in4> d;
    public final AudioPcm e;
    public int f;
    public final sk3<Byte> g;
    public long h;
    public final dz4 i;

    /* compiled from: AudioTrackTranscoder.kt */
    public static final class a implements kfp0.a<in4> {
        public final e020 a;
        public final kfp0<in4> b;

        public a(e020 e020Var, kfp0 kfp0Var) {
            this.a = e020Var;
            this.b = kfp0Var;
        }

        @Override // xsna.kfp0.a
        public final CodecDrainer.DrainStatus a(MediaFormat mediaFormat) {
            this.a.c(mediaFormat);
            return CodecDrainer.DrainStatus.CONTINUE;
        }

        @Override // xsna.kfp0.a
        public final CodecDrainer.DrainStatus b(CodecDrainer<in4> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.a.b(byteBuffer, bufferInfo);
            return this.b.b(codecDrainer, bufferInfo);
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    public mz4(csp cspVar, rfp0 rfp0Var, d80 d80Var, f8l f8lVar, SparseArray sparseArray, jz4.a aVar) {
        this.a = cspVar;
        this.b = rfp0Var;
        ncl nclVar = rfp0Var.b;
        v6e0.a aVar2 = rfp0Var.c;
        in4 e = nclVar.e(aVar2.a, aVar2.b);
        this.c = e;
        kfp0<in4> kfp0Var = new kfp0<>(cspVar, e, "AudioTrackTranscoder");
        kfp0Var.d = new a(rfp0Var.e, kfp0Var);
        this.d = kfp0Var;
        gr10 gr10Var = (gr10) kfp0Var.e.getValue();
        int intValue = gr10Var.o.intValue();
        int intValue2 = gr10Var.p.intValue();
        Integer num = (Integer) gr10Var.r.getValue();
        AudioPcm audioPcm = new AudioPcm(intValue, intValue2, (num != null && num.intValue() == 4) ? AudioPcm.EncodingType.PCM_FLOAT : AudioPcm.EncodingType.PCM_16BIT);
        this.e = audioPcm;
        this.g = new sk3<>();
        this.i = new dz4(new n3q0(audioPcm, d80Var, cspVar.d, 0L), f8lVar, sparseArray, aVar, null, new nz4(this));
    }
}
