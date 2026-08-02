package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.vk.media.pipeline.codec.CodecDrainer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.kfp0;

/* compiled from: MediaProcessor.kt */
/* loaded from: classes3.dex */
public final class kv10 implements kfp0.a<in4> {
    public final /* synthetic */ Ref$ObjectRef<MediaFormat> a;

    public kv10(Ref$ObjectRef<MediaFormat> ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kfp0.a
    public final CodecDrainer.DrainStatus a(MediaFormat mediaFormat) {
        this.a.element = mediaFormat;
        return CodecDrainer.DrainStatus.STOP;
    }

    @Override // xsna.kfp0.a
    public final CodecDrainer.DrainStatus b(CodecDrainer<in4> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        CodecDrainer.c(codecDrainer, null, 3);
        return this.a.element != null ? CodecDrainer.DrainStatus.STOP : CodecDrainer.DrainStatus.CONTINUE;
    }
}
