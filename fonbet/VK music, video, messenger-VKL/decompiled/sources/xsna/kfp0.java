package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.media.pipeline.session.transform.task.transcode.WrongPipelineStateException;
import com.vk.media.pipeline.utils.exception.ReleaseTranscodeException;
import java.nio.ByteBuffer;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hzf;

/* compiled from: TrackEncoder.kt */
/* loaded from: classes3.dex */
public final class kfp0<E extends hzf> {
    public final csp a;
    public final E b;
    public final String c;
    public a<E> d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new gd40(this, 28));
    public final CodecFeeder<E> f;
    public final CodecDrainer<E> g;

    /* compiled from: TrackEncoder.kt */
    public interface a<E extends hzf> {
        CodecDrainer.DrainStatus a(MediaFormat mediaFormat);

        CodecDrainer.DrainStatus b(CodecDrainer<E> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
    }

    /* compiled from: TrackEncoder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<CodecDrainer<E>, ByteBuffer, MediaCodec.BufferInfo, CodecDrainer.DrainStatus> {
        @Override // xsna.yzs
        public final CodecDrainer.DrainStatus invoke(Object obj, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            CodecDrainer.DrainStatus b;
            CodecDrainer<E> codecDrainer = (CodecDrainer) obj;
            ByteBuffer byteBuffer2 = byteBuffer;
            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
            kfp0 kfp0Var = (kfp0) this.receiver;
            a<E> aVar = kfp0Var.d;
            return (aVar == null || (b = aVar.b(codecDrainer, byteBuffer2, bufferInfo2)) == null) ? kfp0Var.b(codecDrainer, bufferInfo2) : b;
        }
    }

    /* compiled from: TrackEncoder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<CodecDrainer<E>, MediaFormat, CodecDrainer.DrainStatus> {
        @Override // xsna.wzs
        public final CodecDrainer.DrainStatus invoke(Object obj, MediaFormat mediaFormat) {
            CodecDrainer.DrainStatus a;
            MediaFormat mediaFormat2 = mediaFormat;
            a<E> aVar = ((kfp0) this.receiver).d;
            return (aVar == null || (a = aVar.a(mediaFormat2)) == null) ? CodecDrainer.DrainStatus.CONTINUE : a;
        }
    }

    /* compiled from: TrackEncoder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CodecDrainer<E>, CodecDrainer.DrainStatus> {
        @Override // xsna.izs
        public final CodecDrainer.DrainStatus invoke(Object obj) {
            CodecDrainer codecDrainer = (CodecDrainer) obj;
            kfp0 kfp0Var = (kfp0) this.receiver;
            if (!kfp0Var.f.e.a.e || codecDrainer.b()) {
                return CodecDrainer.DrainStatus.STOP;
            }
            f100 f100Var = kfp0Var.a.d;
            if (f100Var != null) {
                f100Var.v(kfp0Var.c, "spinning to await track encoder EOS...");
            }
            return CodecDrainer.DrainStatus.CONTINUE;
        }
    }

    public kfp0(csp cspVar, E e, String str) {
        this.a = cspVar;
        this.b = e;
        this.c = str;
        this.f = new CodecFeeder<>(e, 0L, cspVar.c, cspVar.d);
        this.g = new CodecDrainer<>(0, e, cspVar.c, cspVar.d);
    }

    public final void a() {
        b bVar = new b(3, this, kfp0.class, "onEncoderOutputBuffer", "onEncoderOutputBuffer(Lcom/vk/media/pipeline/codec/CodecDrainer;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0);
        c cVar = new c(2, this, kfp0.class, "onEncoderOutputFormat", "onEncoderOutputFormat(Lcom/vk/media/pipeline/codec/CodecDrainer;Landroid/media/MediaFormat;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0);
        this.g.a(new d(1, this, kfp0.class, "onEncoderOutputAbsent", "onEncoderOutputAbsent(Lcom/vk/media/pipeline/codec/CodecDrainer;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0), cVar, bVar);
    }

    public final CodecDrainer.DrainStatus b(CodecDrainer codecDrainer, MediaCodec.BufferInfo bufferInfo) {
        CodecDrainer.DrainStatus drainStatus;
        f100 f100Var;
        csp cspVar = this.a;
        try {
            if ((bufferInfo.flags & 4) != 0) {
                f100 f100Var2 = cspVar.d;
                String str = this.c;
                if (f100Var2 != null) {
                    f100Var2.d(str, "track encoder EOS reached");
                }
                if (!codecDrainer.b() && (f100Var = cspVar.d) != null) {
                    f100Var.c(str, new WrongPipelineStateException("drainer's eos is not received"));
                }
                drainStatus = CodecDrainer.DrainStatus.STOP;
            } else {
                drainStatus = CodecDrainer.DrainStatus.CONTINUE;
            }
            CodecDrainer.c(codecDrainer, null, 3);
            return drainStatus;
        } catch (Throwable th) {
            CodecDrainer.c(codecDrainer, null, 3);
            throw th;
        }
    }

    public final void c() {
        CodecDrainer<E> codecDrainer = this.g;
        if (codecDrainer.b()) {
            return;
        }
        csp cspVar = this.a;
        f100 f100Var = cspVar.d;
        f100 f100Var2 = cspVar.d;
        String str = this.c;
        if (f100Var != null) {
            f100Var.d(str, "send EOS to track encoder ...");
        }
        this.f.b(new gda0(this, 24));
        if (codecDrainer.b()) {
            return;
        }
        if (f100Var2 != null) {
            f100Var2.d(str, "spinning to await track encoder EOS ...");
        }
        a();
        if (((Boolean) cspVar.c.get()).booleanValue() || Thread.currentThread().isInterrupted() || codecDrainer.b() || f100Var2 == null) {
            return;
        }
        f100Var2.c(str, new WrongPipelineStateException("releasing track's encoder, but drainers haven't been drained"));
    }

    public final void d() {
        csp cspVar = this.a;
        f100 f100Var = cspVar.d;
        if (f100Var != null) {
            f100Var.w(this.c, "release track encoder");
        }
        try {
            c();
        } catch (Throwable th) {
            f100 f100Var2 = cspVar.d;
            if (f100Var2 != null) {
                f100Var2.c("TrackEncoder", new ReleaseTranscodeException(th));
            }
        }
        this.d = null;
    }
}
