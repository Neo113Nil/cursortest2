package xsna;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import xsna.fap;

/* compiled from: EglSurface.java */
/* loaded from: classes3.dex */
public class map {
    public final fap a;
    public EGLSurface b = EGL14.EGL_NO_SURFACE;
    public int c = -1;
    public int d = -1;

    /* compiled from: EglSurface.java */
    public static class a extends map {
        public a(fap fapVar, int i, int i2) {
            super(fapVar);
            if (this.b != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            fap fapVar2 = this.a;
            fap.a aVar = fap.g;
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(fapVar2.b, fapVar2.d, new int[]{12375, i, 12374, i2, 12344}, 0);
            fap.a("eglCreatePbufferSurface:" + i + "x" + i2);
            if (eglCreatePbufferSurface == null) {
                throw new fap.b("surface was null info=" + aVar.toString());
            }
            aVar.c.incrementAndGet();
            this.b = eglCreatePbufferSurface;
            this.c = i;
            this.d = i2;
        }
    }

    /* compiled from: EglSurface.java */
    public static class b extends map {
        public Surface e;
        public final boolean f;

        public b(fap fapVar, Surface surface, boolean z) {
            super(fapVar);
            a(surface);
            this.e = surface;
            this.f = z;
        }

        public final void e() {
            c(false);
            Surface surface = this.e;
            if (surface != null) {
                if (this.f) {
                    surface.release();
                }
                this.e = null;
            }
        }
    }

    public map(fap fapVar) {
        this.a = fapVar;
    }

    public final void a(Object obj) {
        if (this.b != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException("surface already created");
        }
        fap fapVar = this.a;
        fapVar.getClass();
        fap.a aVar = fap.g;
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new fap.b(cqi.c(obj, "invalid surface: "));
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(fapVar.b, fapVar.d, obj, new int[]{12344}, 0);
        fap.a("eglCreateWindowSurface");
        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
            throw new fap.b("surface was null info=" + aVar.toString());
        }
        aVar.b.incrementAndGet();
        fapVar.e.a(fapVar.a, "createWindowSurface #" + eglCreateWindowSurface.hashCode());
        this.b = eglCreateWindowSurface;
    }

    public final void b() {
        fap fapVar = this.a;
        EGLSurface eGLSurface = this.b;
        if (fapVar.b == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        synchronized (fap.f) {
            try {
                if (!EGL14.eglMakeCurrent(fapVar.b, eGLSurface, eGLSurface, fapVar.c)) {
                    throw new IllegalStateException("eglMakeCurrent failed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z) {
        EGLSurface eGLSurface = this.b;
        fap fapVar = this.a;
        fapVar.getClass();
        fap.a aVar = fap.g;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            fapVar.e.a(fapVar.a, "releaseSurface #" + eGLSurface.hashCode());
            if (!EGL14.eglDestroySurface(fapVar.b, eGLSurface)) {
                StringBuilder a2 = t33.a("destroy surface failed, error=", "0x" + Integer.toHexString(EGL14.eglGetError()), ", info=");
                a2.append(aVar.toString());
                throw new fap.b(a2.toString());
            }
            if (z) {
                aVar.c.decrementAndGet();
            } else {
                aVar.b.decrementAndGet();
            }
        }
        this.b = EGL14.EGL_NO_SURFACE;
        this.d = -1;
        this.c = -1;
    }

    public final void d(long j) {
        fap fapVar = this.a;
        EGLSurface eGLSurface = this.b;
        fapVar.getClass();
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        synchronized (fap.f) {
            EGLExt.eglPresentationTimeANDROID(fapVar.b, eGLSurface, j);
            EGL14.eglSwapBuffers(fapVar.b, eGLSurface);
        }
    }
}
