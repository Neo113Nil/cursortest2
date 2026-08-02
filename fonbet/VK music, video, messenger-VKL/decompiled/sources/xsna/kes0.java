package xsna;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import com.vk.media.pipeline.gl.GlException;
import com.vk.media.pipeline.gl.codec.surface.GLSurfaceWrapper;
import com.vk.media.pipeline.gl.codec.surface.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: VideoDecoderOutputSurface.kt */
/* loaded from: classes3.dex */
public final class kes0 {
    public final Surface a;
    public final f100 b;
    public final Object c = new Object();
    public final AtomicBoolean d = new AtomicBoolean();

    /* compiled from: VideoDecoderOutputSurface.kt */
    public static final class a {
        public static kes0 a(b0u b0uVar, int i, Size size, Looper looper, f100 f100Var, boolean z) {
            Surface surface;
            if (b0uVar != null) {
                EGLContext eGLContext = b0uVar.c;
                if (!epx.f(eGLContext, EGL14.eglGetCurrentContext())) {
                    EGLDisplay eGLDisplay = b0uVar.b;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        throw new GlException("eglMakeCurrent failed");
                    }
                    if (f100Var != null) {
                        f100Var.w("VideoDecoderOutputSurface", "egl context hasn't been current");
                    }
                }
            }
            if (f100Var != null) {
                f100Var.d("VideoDecoderOutputSurface", "created video decoder surface texId=" + i);
            }
            ckn0 ckn0Var = new ckn0(i, size.getWidth(), size.getHeight(), f100Var);
            if (!z || b0uVar == null) {
                try {
                    surface = new Surface(ckn0Var, f100Var);
                } finally {
                }
            } else {
                try {
                    surface = new GLSurfaceWrapper(b0uVar, ckn0Var, f100Var);
                } finally {
                }
            }
            surface.d();
            return new kes0(looper, surface, f100Var);
        }
    }

    public kes0(Looper looper, Surface surface, f100 f100Var) {
        this.a = surface;
        this.b = f100Var;
        surface.b.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: xsna.jes0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                kes0 kes0Var = kes0.this;
                kes0Var.d.set(true);
                synchronized (kes0Var.c) {
                    kes0Var.c.notifyAll();
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }, looper != null ? new Handler(looper) : null);
    }

    public final void a() {
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.v("VideoDecoderOutputSurface", "release");
        }
        this.a.release();
    }
}
