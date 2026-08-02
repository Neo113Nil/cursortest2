package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.util.Size;
import com.vk.media.pipeline.gl.GlException;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import xsna.b0u;
import xsna.dkt0;
import xsna.q0u;

/* compiled from: VideoTrackHandler.kt */
/* loaded from: classes3.dex */
public final class plt0 extends gjp0 {
    public final ju4 e;
    public final HandlerThread f;
    public final HandlerThread g;
    public q0u h;
    public final b0u i;
    public final hds0 j;
    public final int k;
    public final e7s0 l;
    public Integer m;

    /* compiled from: VideoTrackHandler.kt */
    public final class a extends xmt0 {
        public a(hds0 hds0Var) {
            super(hds0Var, new olt0(plt0.this, 0));
        }

        @Override // xsna.r6t0
        public final void a(MediaCodec.BufferInfo bufferInfo) {
            plt0.this.a.d.c(bufferInfo);
        }

        @Override // xsna.r6t0
        public final x7l e(MediaCodec.BufferInfo bufferInfo) {
            return plt0.this.a.d.a(bufferInfo);
        }
    }

    /* compiled from: VideoTrackHandler.kt */
    public final class b extends ir6 {
        public b(csp cspVar, ncl nclVar, hds0 hds0Var, ErrorStatBuilder errorStatBuilder) {
            super(cspVar, nclVar, plt0.this.f.getLooper(), plt0.this.g.getLooper(), hds0Var, plt0.this.i, plt0.this.k, plt0.this.new a(hds0Var), true, false, null, errorStatBuilder, 1024);
        }

        @Override // xsna.llt0
        public final void b() {
            e(true);
            plt0 plt0Var = plt0.this;
            hds0 hds0Var = plt0Var.j;
            hds0Var.getClass();
            hds0Var.f(new yqd0(hds0Var, 18));
            q0u q0uVar = plt0Var.h;
            if (q0uVar != null) {
                q0uVar.a();
            }
            plt0Var.h = null;
        }

        @Override // xsna.ir6, xsna.llt0
        public final void c(c7s0 c7s0Var, VideoItem videoItem, tht0 tht0Var, int i) {
            Integer e = tht0Var.e();
            plt0 plt0Var = plt0.this;
            plt0Var.m = e;
            MediaSource t = videoItem.t();
            b0u b0uVar = plt0Var.i;
            Size b = t instanceof ImageMediaSource ? nka0.b((ImageMediaSource) t, plt0Var.k) : new Size(tht0Var.getWidth(), tht0Var.getHeight());
            q0u q0uVar = plt0Var.h;
            if (q0uVar != null) {
                q0uVar.a();
            }
            plt0Var.h = null;
            q0u a = q0u.a.a(b0uVar, b.getWidth(), b.getHeight(), plt0Var.b);
            EGLDisplay eGLDisplay = b0uVar.b;
            EGLSurface eGLSurface = a.c;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b0uVar.c)) {
                throw new GlException("eglMakeCurrent failed");
            }
            plt0Var.h = a;
            super.c(c7s0Var, videoItem, tht0Var, i);
            plt0Var.a.d.b(c7s0Var, videoItem);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public plt0(csp cspVar, rfp0 rfp0Var, pms0 pms0Var, ju4 ju4Var) {
        super(rfp0Var, r0, "VideoTrackHandler");
        f100 f100Var = cspVar.d;
        this.e = ju4Var;
        HandlerThread a2 = h5s.a("video-transcode-rendering-handler-thread");
        this.f = a2;
        this.g = h5s.a("decoder-surface-frame-available-callback-handler-thread");
        this.i = b0u.a.a(f100Var);
        hds0 hds0Var = new hds0(cspVar, rfp0Var, pms0Var, a2, ju4Var);
        this.j = hds0Var;
        MediaFormat mediaFormat = rfp0Var.c.b;
        this.k = Math.max(mediaFormat.getInteger("width"), mediaFormat.getInteger("height"));
        this.l = new e7s0(cspVar, rfp0Var.a.a, new b(cspVar, rfp0Var.b, hds0Var, (ErrorStatBuilder) ju4Var.b));
    }

    @Override // xsna.gjp0
    public final boolean a() {
        return !this.l.a().c;
    }

    @Override // xsna.gjp0
    public final void b() {
        String str = this.c;
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.v(str, "release video track handler");
        }
        ir6 ir6Var = this.l.b;
        try {
            ir6Var.e(false);
            ir6Var.l.e();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            f100 f100Var2 = ir6Var.a.d;
            if (f100Var2 != null) {
                f100Var2.e("DefaultVideoTrackDecoderHelper", "Failed to release BaseVideoTrackDecoderHelper: " + th);
            }
        }
        hds0 hds0Var = this.j;
        hds0Var.getClass();
        try {
            hds0Var.f(new ud5(hds0Var, 5));
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
        this.i.a();
        q0u q0uVar = this.h;
        if (q0uVar != null) {
            q0uVar.a();
        }
        this.h = null;
        if (!this.f.quit() && f100Var != null) {
            f100Var.c(str, new IllegalStateException("Failed to quit transcoder rendering thread"));
        }
        if (!this.g.quit() && f100Var != null) {
            f100Var.c(str, new IllegalStateException("Failed to quit transcoder output surface callback thread"));
        }
        super.b();
    }

    @Override // xsna.gjp0
    public final void c() {
        dkt0.a aVar;
        e7s0 e7s0Var = this.l;
        if (e7s0Var.b.d() && (aVar = e7s0Var.a().f) != null) {
            aVar.c = true;
        }
        e7s0Var.a().a();
    }
}
