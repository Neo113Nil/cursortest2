package xsna;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.gj50;

/* compiled from: Encoder.java */
/* loaded from: classes8.dex */
public final class xip {
    public final MediaCodec a;
    public final abt0 b;
    public final Surface c;

    public xip(int i, int i2, int i3, int i4, abt0 abt0Var) throws IOException {
        this.b = abt0Var;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, i4);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.a = createEncoderByType;
        createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.c = createEncoderByType.createInputSurface();
        createEncoderByType.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(MediaFormat mediaFormat, MediaFormat mediaFormat2, String str) {
        Integer valueOf;
        if (mediaFormat.containsKey(str)) {
            try {
                valueOf = Integer.valueOf(mediaFormat.getInteger(str));
            } catch (Throwable unused) {
            }
            if (valueOf == null) {
                mediaFormat2.setInteger(str, valueOf.intValue());
                return;
            }
            return;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public final void a() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = this.a;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer != -3) {
            abt0 abt0Var = this.b;
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                gj50 gj50Var = abt0Var.t;
                gj50Var.c = gj50Var.a.addTrack(outputFormat);
                return;
            }
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer < 0) {
                    Log.e("Encoder", "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
                    return;
                }
                if (bufferInfo.size > 0) {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                    if ((bufferInfo.flags & 2) == 0) {
                        abt0Var.a.onProgress((float) (((int) (((bufferInfo.presentationTimeUs / abt0Var.j) * 100.0d) * 100.0d)) / 100.0d));
                    }
                    gj50 gj50Var2 = abt0Var.t;
                    MediaMuxer mediaMuxer = gj50Var2.a;
                    if (gj50Var2.b()) {
                        if (!gj50Var2.b) {
                            mediaMuxer.start();
                            gj50Var2.b = true;
                        }
                        gj50Var2.a();
                        mediaMuxer.writeSampleData(gj50Var2.c, outputBuffer, bufferInfo);
                    } else {
                        gj50Var2.g.add(new gj50.a(gj50Var2.c, outputBuffer, bufferInfo));
                    }
                }
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    MediaCodec mediaCodec2 = abt0Var.m.a;
                    if (mediaCodec2 != null) {
                        mediaCodec2.stop();
                    }
                    abt0Var.m.c();
                    q190 q190Var = abt0Var.l;
                    q190Var.c.release();
                    q190Var.f = null;
                    q190Var.c = null;
                    q190Var.b = null;
                    abt0Var.t.a.stop();
                    abt0Var.t.c();
                    abt0Var.s = true;
                }
            }
        }
    }

    public final void c() {
        MediaCodec mediaCodec = this.a;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        this.c.release();
    }

    public xip(int i, int i2, int i3, int i4, MediaFormat mediaFormat, abt0 abt0Var) throws IOException {
        this.b = abt0Var;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/hevc", i, i2);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, i4);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", 1);
        b(mediaFormat, createVideoFormat, "color-standard");
        b(mediaFormat, createVideoFormat, "color-range");
        b(mediaFormat, createVideoFormat, "color-transfer");
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/hevc");
        this.a = createEncoderByType;
        createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.c = createEncoderByType.createInputSurface();
        createEncoderByType.start();
    }
}
