package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* compiled from: Decoder.kt */
/* loaded from: classes3.dex */
public final class y7l {
    public final wky a;
    public boolean b = true;

    public y7l(MediaFormat mediaFormat) {
        this.a = new wky(mediaFormat);
    }

    public final boolean a(long j, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2) {
        boolean z;
        wky wkyVar = this.a;
        MediaCodec mediaCodec = wkyVar.a;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10L);
        if (dequeueInputBuffer < 0) {
            z = false;
        } else {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
            inputBuffer.put(byteBuffer);
            inputBuffer.flip();
            wkyVar.a.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.remaining(), j, (i & 1) != 0 ? 1 : 0);
            z = true;
        }
        this.b = z;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec2 = wkyVar.a;
        int dequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer < 0) {
            return false;
        }
        byteBuffer2.put(mediaCodec2.getOutputBuffer(dequeueOutputBuffer));
        byteBuffer2.flip();
        mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer, false);
        return true;
    }
}
