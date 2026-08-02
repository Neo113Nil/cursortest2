package xsna;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.Surface;
import one.video.gl.GLESUtils;

/* compiled from: RendererItem.kt */
/* loaded from: classes8.dex */
public final class dzf0 {
    public final m0g0 a;
    public final p1t b;
    public final com.vk.catalog2.common.ui.holders.a c;
    public final k22 d;
    public boolean e;
    public int f;
    public final d2t g;
    public a2t h;
    public final a i;
    public Size j;
    public s1t k;
    public boolean l;

    /* compiled from: RendererItem.kt */
    public final class a extends Handler {
        public final int a;

        public a(Looper looper) {
            super(looper);
            this.a = 1;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == this.a) {
                dzf0.this.b();
            }
        }
    }

    public dzf0(m0g0 m0g0Var, p1t p1tVar, Looper looper, uzc0 uzc0Var, com.vk.catalog2.common.ui.holders.a aVar, k22 k22Var) {
        this.a = m0g0Var;
        this.b = p1tVar;
        this.c = aVar;
        this.d = k22Var;
        final fr20 fr20Var = new fr20(this, 28);
        d2t d2tVar = new d2t();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLESUtils.c("glGenTextures", new int[0]);
        int i = iArr[0];
        GLESUtils.b(36197, i);
        GLESUtils.e(36197);
        GLESUtils.b(36197, 0);
        d2tVar.a = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(d2tVar.a);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: xsna.c2t
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                fr20.this.invoke();
            }
        });
        d2tVar.b = surfaceTexture;
        Surface surface = new Surface(d2tVar.b);
        uzc0Var.invoke(surface);
        d2tVar.c = surface;
        this.g = d2tVar;
        zsa0 zsa0Var = new zsa0();
        zsa0Var.b = this;
        this.h = zsa0Var;
        this.i = new a(looper);
    }

    public final void a() {
        this.h.b = null;
        d2t d2tVar = this.g;
        Surface surface = d2tVar.c;
        if (surface != null) {
            surface.release();
        }
        d2tVar.c = null;
        SurfaceTexture surfaceTexture = d2tVar.b;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = d2tVar.b;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        d2tVar.b = null;
        GLES20.glDeleteTextures(1, new int[]{d2tVar.a}, 0);
        GLESUtils.c("glDeleteTextures", new int[0]);
        d2tVar.a = -1;
        s1t s1tVar = this.k;
        if (s1tVar != null) {
            s1tVar.b();
        }
    }

    public final void b() {
        s1t s1tVar;
        Surface surface;
        s1t s1tVar2;
        Surface surface2;
        a aVar = this.i;
        aVar.removeMessages(aVar.a);
        Size size = this.j;
        if (size != null) {
            if (!this.e || size.getWidth() <= 0 || size.getHeight() <= 0) {
                size = null;
            }
            if (size != null) {
                s1t s1tVar3 = this.k;
                if ((s1tVar3 == null || (surface2 = (Surface) s1tVar3.a) == null || surface2.isValid()) && (s1tVar2 = this.k) != null) {
                    s1tVar2.a(new ojg(this, size, s1tVar2, 3));
                    return;
                }
                return;
            }
        }
        s1t s1tVar4 = this.k;
        if ((s1tVar4 == null || (surface = (Surface) s1tVar4.a) == null || surface.isValid()) && (s1tVar = this.k) != null) {
            s1tVar.a(new w910(s1tVar, 22));
        }
    }

    public final void c(Surface surface) {
        s1t s1tVar = this.k;
        if (!epx.f(s1tVar != null ? (Surface) s1tVar.a : null, surface)) {
            this.l = false;
        }
        this.b.a(new com.vk.movika.sdk.base.ui.m(20, this, surface));
        if (this.k != null) {
            b();
        }
    }
}
