package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.os.Trace;
import android.view.Surface;
import defpackage.jb3;
import defpackage.n;
import defpackage.nb10;
import defpackage.ob10;
import defpackage.pb10;
import defpackage.rb10;
import defpackage.tw21;
import defpackage.ucf;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class a implements pb10 {
    public final MediaCodec a;
    public final AsynchronousMediaCodecCallback b;
    public final rb10 c;
    public final f w;
    public boolean x;
    public int y = 0;

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, rb10 rb10Var, f fVar) {
        this.a = mediaCodec;
        this.b = new AsynchronousMediaCodecCallback(handlerThread);
        this.c = rb10Var;
        this.w = fVar;
    }

    public static void d(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        f fVar;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = aVar.b;
        MediaCodec mediaCodec = aVar.a;
        asynchronousMediaCodecCallback.initialize(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        aVar.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (tw21.a >= 35 && (fVar = aVar.w) != null) {
            fVar.a(mediaCodec);
        }
        aVar.y = 1;
    }

    public static String h(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            n.A(sb, "Unknown(", i, Extension.C_BRAKE);
        }
        return sb.toString();
    }

    @Override // defpackage.pb10
    public final void A(ob10 ob10Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new jb3(this, ob10Var, 0), handler);
    }

    @Override // defpackage.pb10
    public final void a(int i, int i2, long j, int i3) {
        this.c.a(i, i2, j, i3);
    }

    @Override // defpackage.pb10
    public final void b(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.pb10
    public final void c(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.pb10
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.pb10
    public final void f(int i, ucf ucfVar, long j, int i2) {
        this.c.f(i, ucfVar, j, i2);
    }

    @Override // defpackage.pb10
    public final void flush() {
        this.c.flush();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        this.b.flush();
        mediaCodec.start();
    }

    @Override // defpackage.pb10
    public final void g(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.pb10
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.pb10
    public final PersistableBundle getMetrics() {
        return this.a.getMetrics();
    }

    @Override // defpackage.pb10
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.pb10
    public final MediaFormat getOutputFormat() {
        return this.b.getOutputFormat();
    }

    @Override // defpackage.pb10
    public final boolean i(nb10 nb10Var) {
        this.b.setOnBufferAvailableListener(nb10Var);
        return true;
    }

    @Override // defpackage.pb10
    public final void release() {
        f fVar = this.w;
        MediaCodec mediaCodec = this.a;
        try {
            if (this.y == 1) {
                this.c.shutdown();
                this.b.shutdown();
            }
            this.y = 2;
            if (this.x) {
                return;
            }
            try {
                int i = tw21.a;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
                if (i >= 35 && fVar != null) {
                    fVar.b(mediaCodec);
                }
                mediaCodec.release();
                this.x = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.x) {
                try {
                    int i2 = tw21.a;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                    }
                    if (i2 >= 35 && fVar != null) {
                        fVar.b(mediaCodec);
                    }
                    mediaCodec.release();
                    this.x = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.pb10
    public final int s(MediaCodec.BufferInfo bufferInfo) {
        this.c.j();
        return this.b.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // defpackage.pb10
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }

    @Override // defpackage.pb10
    public final void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.pb10
    public final int y() {
        this.c.j();
        return this.b.dequeueInputBufferIndex();
    }
}
