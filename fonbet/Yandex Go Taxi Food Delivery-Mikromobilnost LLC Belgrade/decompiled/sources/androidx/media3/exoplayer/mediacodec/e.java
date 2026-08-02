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
import defpackage.hd10;
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
public class e implements pb10 {
    public boolean a;
    public final hd10 b;
    public final BaseAsynchronousMediaCodecCallback c;
    public final rb10 w;
    public final f x;
    public int y = 0;
    public final boolean z;

    public e(hd10 hd10Var, HandlerThread handlerThread, rb10 rb10Var, f fVar, boolean z) {
        this.b = hd10Var;
        this.c = new BaseAsynchronousMediaCodecCallback(handlerThread);
        this.w = rb10Var;
        this.x = fVar;
        this.z = z;
    }

    public static String d(int i, String str) {
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
        this.b.m(new jb3(this, ob10Var, 1), handler);
    }

    @Override // defpackage.pb10
    public final void a(int i, int i2, long j, int i3) {
        this.w.a(i, i2, j, i3);
    }

    @Override // defpackage.pb10
    public final void b(int i) {
        this.b.b(i);
    }

    @Override // defpackage.pb10
    public final void c(int i, long j) {
        this.b.c(i, j);
    }

    @Override // defpackage.pb10
    public final void e() {
        this.b.e();
    }

    @Override // defpackage.pb10
    public final void f(int i, ucf ucfVar, long j, int i2) {
        this.w.f(i, ucfVar, j, i2);
    }

    @Override // defpackage.pb10
    public final void flush() {
        this.w.flush();
        hd10 hd10Var = this.b;
        hd10Var.flush();
        this.c.flush();
        hd10Var.start();
    }

    @Override // defpackage.pb10
    public final void g(Surface surface) {
        this.b.g(surface);
    }

    @Override // defpackage.pb10
    public final ByteBuffer getInputBuffer(int i) {
        return this.b.getInputBuffer(i);
    }

    @Override // defpackage.pb10
    public final PersistableBundle getMetrics() {
        return this.b.getMetrics();
    }

    @Override // defpackage.pb10
    public final ByteBuffer getOutputBuffer(int i) {
        return this.b.getOutputBuffer(i);
    }

    @Override // defpackage.pb10
    public final MediaFormat getOutputFormat() {
        return this.c.getOutputFormat();
    }

    public final void h(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        f fVar;
        BaseAsynchronousMediaCodecCallback baseAsynchronousMediaCodecCallback = this.c;
        hd10 hd10Var = this.b;
        baseAsynchronousMediaCodecCallback.initialize(hd10Var);
        Trace.beginSection("configureCodec");
        hd10Var.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.w.start();
        Trace.beginSection("startCodec");
        hd10Var.start();
        Trace.endSection();
        if (tw21.a >= 35 && (fVar = this.x) != null) {
            fVar.a(hd10Var.i());
        }
        this.y = 1;
    }

    @Override // defpackage.pb10
    public final boolean i(nb10 nb10Var) {
        this.c.setOnBufferAvailableListener(nb10Var);
        return true;
    }

    @Override // defpackage.pb10
    public void release() {
        boolean z = this.z;
        hd10 hd10Var = this.b;
        try {
            if (this.y == 1) {
                this.w.shutdown();
                this.c.shutdown();
            }
            this.y = 2;
            if (this.a) {
                return;
            }
            if (z) {
                try {
                    int i = tw21.a;
                    if (i >= 30 && i < 33) {
                        hd10Var.stop();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.a) {
                if (z) {
                    try {
                        int i2 = tw21.a;
                        if (i2 >= 30 && i2 < 33) {
                            hd10Var.stop();
                        }
                    } finally {
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.pb10
    public final int s(MediaCodec.BufferInfo bufferInfo) {
        this.w.j();
        return this.c.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // defpackage.pb10
    public final void setParameters(Bundle bundle) {
        this.w.setParameters(bundle);
    }

    @Override // defpackage.pb10
    public final void setVideoScalingMode(int i) {
        this.b.setVideoScalingMode(i);
    }

    @Override // defpackage.pb10
    public final int y() {
        this.w.j();
        return this.c.dequeueInputBufferIndex();
    }
}
