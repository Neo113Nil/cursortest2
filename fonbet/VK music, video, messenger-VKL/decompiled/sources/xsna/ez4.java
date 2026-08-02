package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.codec.CodecFeeder;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k0h0;

/* compiled from: AudioTrackDecoder.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez4 extends FunctionReferenceImpl implements zzs<CodecFeeder<qm4>, k0h0.b, MediaCodec.BufferInfo, ByteBuffer, CodecFeeder.FeedStatus> {
    @Override // xsna.zzs
    public final CodecFeeder.FeedStatus invoke(CodecFeeder<qm4> codecFeeder, k0h0.b bVar, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        ((dz4) this.receiver).getClass();
        byteBuffer.put(bVar.getData());
        codecFeeder.c(bufferInfo);
        return CodecFeeder.FeedStatus.STOP;
    }
}
