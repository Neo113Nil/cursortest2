package xsna;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import java.io.IOException;

/* compiled from: Decoder.java */
/* loaded from: classes8.dex */
public final class z7l {
    public final MediaCodec a;
    public final abt0 b;

    public z7l(String str, MediaFormat mediaFormat, q190 q190Var, abt0 abt0Var) throws IOException {
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
        this.a = createDecoderByType;
        createDecoderByType.configure(mediaFormat, q190Var.c, (MediaCrypto) null, 0);
        createDecoderByType.start();
        this.b = abt0Var;
    }

    public final void a() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = this.a;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer == -3 || dequeueOutputBuffer == -2 || dequeueOutputBuffer == -1) {
            return;
        }
        if (dequeueOutputBuffer < 0) {
            Log.e("Decoder", "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
            return;
        }
        boolean z = bufferInfo.size != 0;
        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, z);
        abt0 abt0Var = this.b;
        if (abt0Var != null) {
            if (z) {
                abt0Var.p.a(new ydn0(3, abt0Var, bufferInfo));
            }
            if ((bufferInfo.flags & 4) != 0) {
                abt0Var.m.a.signalEndOfInputStream();
                MediaCodec mediaCodec2 = abt0Var.k.a;
                if (mediaCodec2 != null) {
                    mediaCodec2.stop();
                }
                abt0Var.k.b();
                abt0Var.p.b();
                abt0Var.o.b();
                abt0Var.n.f();
                abt0Var.r = true;
            }
        }
    }

    public final void b() {
        MediaCodec mediaCodec = this.a;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }
}
