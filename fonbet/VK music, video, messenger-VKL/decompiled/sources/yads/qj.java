package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class qj implements el1 {
    public final MediaCodec a;
    public final uj b;
    public final tj c;
    public final boolean d;
    public boolean e;
    public int f = 0;

    public qj(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.a = mediaCodec;
        this.b = new uj(handlerThread);
        this.c = new tj(mediaCodec, handlerThread2);
        this.d = z;
    }

    @Override // yads.el1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    @Override // yads.el1
    public final int b() {
        uj ujVar = this.b;
        synchronized (ujVar.a) {
            try {
                int i = -1;
                if (ujVar.k <= 0 && !ujVar.l) {
                    IllegalStateException illegalStateException = ujVar.m;
                    if (illegalStateException != null) {
                        ujVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = ujVar.j;
                    if (codecException != null) {
                        ujVar.j = null;
                        throw codecException;
                    }
                    vb1 vb1Var = ujVar.d;
                    int i2 = vb1Var.c;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            throw new NoSuchElementException();
                        }
                        int[] iArr = vb1Var.d;
                        int i3 = vb1Var.a;
                        i = iArr[i3];
                        vb1Var.a = (i3 + 1) & vb1Var.e;
                        vb1Var.c = i2 - 1;
                    }
                    return i;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void c() {
        if (this.d) {
            try {
                tj tjVar = this.c;
                vy vyVar = tjVar.e;
                synchronized (vyVar) {
                    vyVar.a = false;
                }
                rj rjVar = tjVar.c;
                rjVar.getClass();
                rjVar.obtainMessage(2).sendToTarget();
                tjVar.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // yads.el1
    public final void flush() {
        this.c.a();
        this.a.flush();
        this.b.a();
        this.a.start();
    }

    @Override // yads.el1
    public final void release() {
        try {
            if (this.f == 1) {
                tj tjVar = this.c;
                if (tjVar.f) {
                    tjVar.a();
                    tjVar.b.quit();
                }
                tjVar.f = false;
                uj ujVar = this.b;
                synchronized (ujVar.a) {
                    try {
                        ujVar.l = true;
                        ujVar.b.quit();
                        if (!ujVar.g.isEmpty()) {
                            ujVar.i = (MediaFormat) ujVar.g.getLast();
                        }
                        vb1 vb1Var = ujVar.d;
                        vb1Var.a = 0;
                        vb1Var.b = -1;
                        vb1Var.c = 0;
                        vb1 vb1Var2 = ujVar.e;
                        vb1Var2.a = 0;
                        vb1Var2.b = -1;
                        vb1Var2.c = 0;
                        ujVar.f.clear();
                        ujVar.g.clear();
                        ujVar.j = null;
                    } finally {
                    }
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            this.a.release();
            this.e = true;
        } catch (Throwable th) {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
            throw th;
        }
    }

    @Override // yads.el1
    public final void setVideoScalingMode(int i) {
        c();
        this.a.setVideoScalingMode(i);
    }

    @Override // yads.el1
    public final ByteBuffer a(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // yads.el1
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        uj ujVar = this.b;
        synchronized (ujVar.a) {
            try {
                mediaFormat = ujVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.b.a(this.a);
        h83.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, 0);
        h83.a();
        tj tjVar = this.c;
        if (!tjVar.f) {
            tjVar.b.start();
            tjVar.c = new rj(tjVar, tjVar.b.getLooper());
            tjVar.f = true;
        }
        h83.a("startCodec");
        this.a.start();
        h83.a();
        this.f = 1;
    }

    @Override // yads.el1
    public final ByteBuffer b(int i) {
        return this.a.getOutputBuffer(i);
    }

    public final void a(dl1 dl1Var, MediaCodec mediaCodec, long j, long j2) {
        bm1 bm1Var = (bm1) dl1Var;
        bm1Var.getClass();
        if (mc3.a < 30) {
            bm1Var.b.sendMessageAtFrontOfQueue(Message.obtain(bm1Var.b, 0, (int) (j >> 32), (int) j));
            return;
        }
        cm1 cm1Var = bm1Var.c;
        if (bm1Var != cm1Var.n1) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            cm1Var.z0 = true;
            return;
        }
        try {
            cm1Var.b(j);
            cm1Var.D();
            cm1Var.B0.e++;
            cm1Var.V0 = true;
            if (!cm1Var.T0) {
                cm1Var.T0 = true;
                cm1Var.I0.a(cm1Var.P0);
                cm1Var.R0 = true;
            }
            cm1Var.a(j);
        } catch (qn0 e) {
            bm1Var.c.A0 = e;
        }
    }

    @Override // yads.el1
    public final void a(int i, int i2, long j, int i3) {
        tj tjVar = this.c;
        RuntimeException runtimeException = (RuntimeException) tjVar.d.getAndSet(null);
        if (runtimeException == null) {
            sj b = tj.b();
            b.a = i;
            b.b = 0;
            b.c = i2;
            b.e = j;
            b.f = i3;
            rj rjVar = tjVar.c;
            int i4 = mc3.a;
            rjVar.obtainMessage(0, b).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // yads.el1
    public final void a(int i, m20 m20Var, long j) {
        this.c.a(i, m20Var, j);
    }

    @Override // yads.el1
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // yads.el1
    public final void a(boolean z, int i) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // yads.el1
    public final void a(final dl1 dl1Var, Handler handler) {
        c();
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: xsna.uaz0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                yads.qj.this.a(dl1Var, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // yads.el1
    public final void a(Surface surface) {
        c();
        this.a.setOutputSurface(surface);
    }

    @Override // yads.el1
    public final void a(Bundle bundle) {
        c();
        this.a.setParameters(bundle);
    }
}
