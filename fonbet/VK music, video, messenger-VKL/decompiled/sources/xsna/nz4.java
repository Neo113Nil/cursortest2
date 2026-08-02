package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.codec.CodecFeeder;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz4;

/* compiled from: AudioTrackTranscoder.kt */
/* loaded from: classes3.dex */
public final class nz4 implements dz4.a {
    public final /* synthetic */ mz4 a;

    /* compiled from: AudioTrackTranscoder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements zzs<CodecFeeder<in4>, ByteBuffer, MediaCodec.BufferInfo, ByteBuffer, CodecFeeder.FeedStatus> {
        @Override // xsna.zzs
        public final CodecFeeder.FeedStatus invoke(CodecFeeder<in4> codecFeeder, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer2) {
            ByteBuffer byteBuffer3 = byteBuffer;
            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
            ByteBuffer byteBuffer4 = byteBuffer2;
            mz4 mz4Var = (mz4) this.receiver;
            mz4Var.getClass();
            int remaining = byteBuffer3.remaining();
            int remaining2 = byteBuffer4.remaining();
            bufferInfo2.offset = byteBuffer4.position();
            int limit = byteBuffer3.limit();
            byteBuffer3.limit(Math.min(remaining2, remaining) + byteBuffer3.position());
            bufferInfo2.size = byteBuffer3.remaining();
            byteBuffer4.put(byteBuffer3);
            byteBuffer3.limit(limit);
            codecFeeder.c(bufferInfo2);
            mz4Var.i.d.b(bufferInfo2);
            if (!byteBuffer3.hasRemaining()) {
                return CodecFeeder.FeedStatus.STOP;
            }
            bufferInfo2.presentationTimeUs = mz4Var.e.b(bufferInfo2.size) + bufferInfo2.presentationTimeUs;
            return CodecFeeder.FeedStatus.CONTINUE;
        }
    }

    /* compiled from: AudioTrackTranscoder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CodecFeeder<in4>, CodecFeeder.FeedStatus> {
        @Override // xsna.izs
        public final CodecFeeder.FeedStatus invoke(CodecFeeder<in4> codecFeeder) {
            mz4 mz4Var = (mz4) this.receiver;
            if (!mz4Var.i.b.b()) {
                return CodecFeeder.FeedStatus.STOP;
            }
            mz4Var.d.a();
            return CodecFeeder.FeedStatus.CONTINUE;
        }
    }

    public nz4(mz4 mz4Var) {
        this.a = mz4Var;
    }

    @Override // xsna.dz4.a
    public final void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        mz4 mz4Var = this.a;
        sk3<Byte> sk3Var = mz4Var.g;
        int i = bufferInfo.offset;
        int i2 = bufferInfo.size + i;
        while (i < i2) {
            sk3Var.addLast(Byte.valueOf(byteBuffer.get(i)));
            i++;
        }
        byte[] bArr = new byte[sk3Var.size()];
        Iterator<Byte> it = sk3Var.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            bArr[i3] = it.next().byteValue();
            i3++;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, wrap.remaining(), mz4Var.h, bufferInfo.flags);
        mz4Var.d.f.a(wrap, bufferInfo2, new a(4, mz4Var, mz4.class, "onEncoderInputBuffer", "onEncoderInputBuffer(Lcom/vk/media/pipeline/codec/CodecFeeder;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Ljava/nio/ByteBuffer;)Lcom/vk/media/pipeline/codec/CodecFeeder$FeedStatus;", 0), new b(1, mz4Var, mz4.class, "onEncoderInputAbsent", "onEncoderInputAbsent(Lcom/vk/media/pipeline/codec/CodecFeeder;)Lcom/vk/media/pipeline/codec/CodecFeeder$FeedStatus;", 0));
        int position = wrap.position();
        for (int i4 = 0; i4 < position; i4++) {
            sk3Var.removeFirst();
        }
        mz4Var.h = mz4Var.e.b(position) + mz4Var.h;
        mz4Var.f = Math.max(mz4Var.f, sk3Var.size());
    }
}
