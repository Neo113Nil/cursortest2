package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.SparseArray;
import com.vk.media.pipeline.codec.CodecController;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.media.pipeline.session.transform.task.transcode.producer.framerate.FrameRateController;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k0h0;

/* compiled from: VideoDecoderProducer.kt */
/* loaded from: classes3.dex */
public final class les0 extends n6t0 {
    public final f8l<ies0> e;
    public final ErrorStatBuilder f;

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodedSampleStatus.values().length];
            try {
                iArr[DecodedSampleStatus.CONSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodedSampleStatus.END_OF_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodedSampleStatus.END_OF_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<CodecDrainer<ies0>, ByteBuffer, MediaCodec.BufferInfo, CodecDrainer.DrainStatus> {
        @Override // xsna.yzs
        public final CodecDrainer.DrainStatus invoke(CodecDrainer<ies0> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            ErrorStatBuilder errorStatBuilder;
            CodecDrainer<ies0> codecDrainer2 = codecDrainer;
            ByteBuffer byteBuffer2 = byteBuffer;
            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
            ies0 ies0Var = codecDrainer2.b;
            les0 les0Var = (les0) this.receiver;
            x7l e = les0Var.b.e(bufferInfo2);
            if (les0Var.h(e)) {
                FrameRateController.a aVar = e.b;
                long j = bufferInfo2.presentationTimeUs;
                ies0 ies0Var2 = ies0Var;
                kes0 kes0Var = ies0Var2.h;
                int i = les0Var.d;
                if (i > 0) {
                    les0Var.b.c(i, j, kes0Var);
                    les0Var.d = 0;
                }
                les0Var.d = aVar != null ? aVar.b : 0;
                CodecDrainer.c(codecDrainer2, Long.valueOf(bufferInfo2.presentationTimeUs), 2);
                if (byteBuffer2.remaining() == 0 && bufferInfo2.flags == 0 && bufferInfo2.presentationTimeUs == 0 && (errorStatBuilder = les0Var.f) != null) {
                    errorStatBuilder.k.add(ErrorStatBuilder.EmptySampleDataOrigin.DECODER.toString());
                }
                les0Var.b.a(bufferInfo2);
                les0Var.b.b(ies0Var2.h, bufferInfo2.presentationTimeUs);
            } else {
                CodecDrainer.c(codecDrainer2, null, 3);
            }
            int i2 = a.$EnumSwitchMapping$0[e.a.ordinal()];
            return (codecDrainer2.b() || (i2 == 1 || i2 == 2 || i2 == 3)) ? CodecDrainer.DrainStatus.STOP : CodecDrainer.DrainStatus.CONTINUE;
        }
    }

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<CodecDrainer<ies0>, MediaFormat, CodecDrainer.DrainStatus> {
        @Override // xsna.wzs
        public final CodecDrainer.DrainStatus invoke(CodecDrainer<ies0> codecDrainer, MediaFormat mediaFormat) {
            CodecDrainer<ies0> codecDrainer2 = codecDrainer;
            MediaFormat mediaFormat2 = mediaFormat;
            les0 les0Var = (les0) this.receiver;
            f100 f100Var = les0Var.a.d;
            if (f100Var != null) {
                f100Var.v("VideoDecoderProducer", "obtained video decoder output format=" + mediaFormat2);
            }
            kes0 kes0Var = codecDrainer2.b.h;
            r6t0 r6t0Var = les0Var.b;
            ckn0 ckn0Var = kes0Var.a.b;
            r6t0Var.d(new l8l(ckn0Var.b, ckn0Var.c, mediaFormat2));
            return CodecDrainer.DrainStatus.CONTINUE;
        }
    }

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CodecDrainer<ies0>, CodecDrainer.DrainStatus> {
        @Override // xsna.izs
        public final CodecDrainer.DrainStatus invoke(CodecDrainer<ies0> codecDrainer) {
            CodecDrainer<ies0> codecDrainer2 = codecDrainer;
            les0 les0Var = (les0) this.receiver;
            les0Var.getClass();
            if (!codecDrainer2.b()) {
                f8l<D>.a<ies0> aVar = les0Var.e.e.get(codecDrainer2.a);
                if ((aVar != null ? aVar.b : null).e.a.e) {
                    f100 f100Var = les0Var.a.d;
                    if (f100Var != null) {
                        f100Var.v("VideoDecoderProducer", "spinning to await video decoder EOS...");
                    }
                    return CodecDrainer.DrainStatus.CONTINUE;
                }
            }
            les0Var.b.getClass();
            return CodecDrainer.DrainStatus.STOP;
        }
    }

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements zzs<CodecFeeder<ies0>, k0h0.b, MediaCodec.BufferInfo, ByteBuffer, CodecFeeder.FeedStatus> {
        @Override // xsna.zzs
        public final CodecFeeder.FeedStatus invoke(CodecFeeder<ies0> codecFeeder, k0h0.b bVar, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
            f100 f100Var;
            CodecFeeder<ies0> codecFeeder2 = codecFeeder;
            k0h0.b bVar2 = bVar;
            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
            ByteBuffer byteBuffer2 = byteBuffer;
            les0 les0Var = (les0) this.receiver;
            les0Var.getClass();
            if (bVar2.b() && (f100Var = les0Var.a.d) != null) {
                f100Var.v("VideoDecoderProducer", "send KF to the video decoder, sample=" + bVar2);
            }
            byteBuffer2.put(bVar2.getData());
            codecFeeder2.c(bufferInfo2);
            return CodecFeeder.FeedStatus.STOP;
        }
    }

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<CodecDrainer<ies0>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CodecDrainer<ies0> codecDrainer) {
            ((les0) this.receiver).i(codecDrainer);
            return s3q0.a;
        }
    }

    /* compiled from: VideoDecoderProducer.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<CodecDrainer<ies0>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CodecDrainer<ies0> codecDrainer) {
            ((les0) this.receiver).i(codecDrainer);
            return s3q0.a;
        }
    }

    public les0(csp cspVar, r6t0 r6t0Var, f8l<ies0> f8lVar, ErrorStatBuilder errorStatBuilder) {
        super(cspVar, r6t0Var);
        this.e = f8lVar;
        this.f = errorStatBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.n6t0
    public final void a(k0h0 k0h0Var) {
        f8l<ies0> f8lVar = this.e;
        f8l<D>.a<ies0> aVar = f8lVar.e.get(k0h0Var.m());
        CodecDrainer codecDrainer = aVar != null ? aVar.c : null;
        if (codecDrainer == null) {
            codecDrainer = f8lVar.a(k0h0Var).c;
        }
        i(codecDrainer);
    }

    @Override // xsna.n6t0
    public final void b(k0h0 k0h0Var, k0h0.b bVar, MediaCodec.BufferInfo bufferInfo) {
        f8l<ies0> f8lVar = this.e;
        f8l<D>.a<ies0> aVar = f8lVar.e.get(k0h0Var.m());
        CodecFeeder codecFeeder = aVar != null ? aVar.b : null;
        if (codecFeeder == null) {
            codecFeeder = f8lVar.a(k0h0Var).b;
        }
        codecFeeder.a(bVar, bufferInfo, new e(4, this, les0.class, "onDecoderInputBuffer", "onDecoderInputBuffer(Lcom/vk/media/pipeline/codec/CodecFeeder;Lcom/vk/media/pipeline/mediasource/SampleSource$Sample;Landroid/media/MediaCodec$BufferInfo;Ljava/nio/ByteBuffer;)Lcom/vk/media/pipeline/codec/CodecFeeder$FeedStatus;", 0), new mz80(19, this, k0h0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.n6t0
    public final void c(k0h0 k0h0Var) {
        f8l<D>.a<ies0> aVar = this.e.e.get(k0h0Var.m());
        if (aVar != null) {
            CodecController<C> codecController = aVar.b.e;
            C c2 = codecController.a;
            if (c2 instanceof ies0) {
                c2.b();
                codecController.d = null;
                codecController.e = null;
            } else {
                if (c2 instanceof qm4) {
                    c2.b();
                    codecController.d = null;
                    codecController.e = null;
                    return;
                }
                f100 f100Var = codecController.b;
                if (f100Var != null) {
                    f100Var.e(codecController.c, "Improper flush usage for encoder: " + c2);
                }
            }
        }
    }

    @Override // xsna.n6t0
    public final boolean d() {
        return this.c || this.e.b();
    }

    @Override // xsna.n6t0
    public final boolean e() {
        return this.e.c();
    }

    @Override // xsna.n6t0
    public final void f() {
        this.e.d();
    }

    @Override // xsna.n6t0
    public final void g(boolean z) {
        f8l<ies0> f8lVar = this.e;
        if (z) {
            f8lVar.e(new f(1, this, les0.class, "drainDecoder", "drainDecoder(Lcom/vk/media/pipeline/codec/CodecDrainer;)V", 0));
            return;
        }
        g gVar = new g(1, this, les0.class, "drainDecoder", "drainDecoder(Lcom/vk/media/pipeline/codec/CodecDrainer;)V", 0);
        SparseArray<f8l<D>.a<ies0>> sparseArray = f8lVar.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            f8l<D>.a<ies0> valueAt = sparseArray.valueAt(i);
            if (!valueAt.c.b()) {
                valueAt.b.b(new gb(12, gVar, valueAt));
            }
        }
    }

    public final void i(CodecDrainer<ies0> codecDrainer) {
        b bVar = new b(3, this, les0.class, "onDecoderOutputBuffer", "onDecoderOutputBuffer(Lcom/vk/media/pipeline/codec/CodecDrainer;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0);
        codecDrainer.a(new d(1, this, les0.class, "onDecoderOutputAbsent", "onDecoderOutputAbsent(Lcom/vk/media/pipeline/codec/CodecDrainer;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0), new c(2, this, les0.class, "onDecoderOutputFormat", "onDecoderOutputFormat(Lcom/vk/media/pipeline/codec/CodecDrainer;Landroid/media/MediaFormat;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0), bVar);
    }
}
