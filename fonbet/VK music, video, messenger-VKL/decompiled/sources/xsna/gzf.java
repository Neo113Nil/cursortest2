package xsna;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.log.L;
import java.nio.ByteBuffer;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.gl.util.ScaledTime;
import xsna.jq10;

/* compiled from: Codec.java */
/* loaded from: classes3.dex */
public final class gzf {

    @NonNull
    public final MediaCodec a;

    @NonNull
    public final MediaFormat b;
    public final long c;
    public long d;
    public final b e = new b();
    public ScaledTime f;
    public ScaledTime g;

    /* compiled from: Codec.java */
    public static final class b {
        public final MediaCodec.BufferInfo a = new MediaCodec.BufferInfo();
        public ByteBuffer b;
    }

    /* compiled from: Codec.java */
    public static final class c {
        public final float a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;

        public c(float f, int i, int i2, int i3, long j) {
            this.a = f;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.a == cVar.a && this.e == cVar.e;
        }

        public final int hashCode() {
            return (((((((((((Float.floatToIntBits(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + 1) * 31) + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31;
        }
    }

    public gzf(MediaCodec mediaCodec, MediaFormat mediaFormat, long j) {
        this.a = mediaCodec;
        this.b = mediaFormat;
        this.c = j;
    }

    public static MediaFormat a(c cVar, boolean z) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", cVar.c, cVar.d);
        float f = cVar.a;
        createVideoFormat.setFloat("frame-rate", f);
        createVideoFormat.setFloat("capture-rate", f);
        createVideoFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, cVar.b);
        createVideoFormat.setInteger("i-frame-interval", 1);
        if (z) {
            createVideoFormat.setInteger("color-format", 2130708361);
        }
        return createVideoFormat;
    }

    public static void c(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                L.j(e, "failed to stop media codec");
            }
            try {
                mediaCodec.release();
            } catch (Exception e2) {
                L.j(e2, "failed to release media codec");
            }
        }
    }

    public static gzf d(@NonNull a aVar, @Nullable ScaledTime scaledTime, @Nullable ScaledTime scaledTime2, float f) {
        MediaCodec mediaCodec;
        MediaFormat createAudioFormat;
        int minBufferSize;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int i = aVar.b;
            createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, i);
            createAudioFormat.setInteger("aac-profile", aVar.a);
            createAudioFormat.setInteger("channel-count", i);
            createAudioFormat.setInteger("sample-rate", aVar.c);
            createAudioFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, aVar.d);
            bv10 bv10Var = new bv10();
            jq10 jq10Var = new jq10(bv10Var, new gq10(bv10Var), new jq10.a(bv10Var), true);
            new djp().a(createAudioFormat);
            int integer = createAudioFormat.getInteger("channel-count");
            int integer2 = createAudioFormat.getInteger("sample-rate");
            if (integer2 <= 0) {
                minBufferSize = -2;
            } else {
                minBufferSize = AudioRecord.getMinBufferSize(integer2, integer == 2 ? 12 : 16, 2);
            }
            if (minBufferSize > 0) {
                createAudioFormat.setInteger("max-input-size", minBufferSize);
            }
            if (f != 1.0d) {
                createAudioFormat.setFloat("operating-rate", createAudioFormat.getInteger("sample-rate") * f);
                createAudioFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            }
            mediaCodec = jq10Var.a(null, createAudioFormat, true, null, false);
        } catch (Exception e) {
            e = e;
            mediaCodec = null;
        }
        try {
            mediaCodec.start();
            gzf gzfVar = new gzf(mediaCodec, createAudioFormat, System.currentTimeMillis() - currentTimeMillis);
            if (scaledTime != null) {
                gzfVar.g = scaledTime;
            }
            if (scaledTime2 != null) {
                gzfVar.f = scaledTime2;
            }
            return gzfVar;
        } catch (Exception e2) {
            e = e2;
            L.j(e, "failed to start audio aac encoder");
            com.vk.metrics.eventtracking.b.a.a(e);
            c(mediaCodec);
            return null;
        }
    }

    public final boolean b(@NonNull u2s0 u2s0Var, @Nullable t2s0 t2s0Var, boolean z) {
        int i;
        ScaledTime scaledTime = this.f;
        long micros = scaledTime != null ? scaledTime.toMicros() : 0L;
        while (true) {
            b bVar = this.e;
            MediaCodec.BufferInfo bufferInfo = bVar.a;
            MediaCodec.BufferInfo bufferInfo2 = bVar.a;
            bufferInfo.flags = 0;
            bVar.b = null;
            MediaCodec mediaCodec = this.a;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, micros);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                bVar.b = outputBuffer;
                if (outputBuffer != null && (bufferInfo2.flags & 2) == 0 && (i = bufferInfo2.size) != 0) {
                    outputBuffer.limit(bufferInfo2.offset + i);
                    bVar.b.position(bufferInfo2.offset);
                    u2s0Var.accept(bVar);
                }
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((bufferInfo2.flags & 4) != 0) {
                    return true;
                }
            } else if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return false;
                }
            } else if (dequeueOutputBuffer != -3 && dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                if (t2s0Var != null) {
                    t2s0Var.accept(outputFormat);
                }
            }
        }
    }

    /* compiled from: Codec.java */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;

        public a(int i, float f, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.e) + ((((((((16368 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31);
        }

        public a(@NonNull MediaFormat mediaFormat) {
            this.e = 1.0f;
            this.a = mediaFormat.getInteger("aac-profile");
            this.b = mediaFormat.getInteger("channel-count");
            this.c = mediaFormat.getInteger("sample-rate");
            this.d = mediaFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
        }
    }
}
