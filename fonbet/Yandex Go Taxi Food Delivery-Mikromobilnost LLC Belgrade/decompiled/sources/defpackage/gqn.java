package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class gqn {
    public EGLDisplay a;
    public EGLContext b;
    public EGLSurface c;
    public Surface d;

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        kbs.g(oyr.r(oyr.v(str, ": EGL error: 0x"), eglGetError));
    }

    public final void b() {
        EGLDisplay eGLDisplay = this.a;
        EGLSurface eGLSurface = this.c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.b)) {
            return;
        }
        kbs.g("eglMakeCurrent failed");
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.a;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        kbs.g("eglMakeCurrent failed");
    }

    public final void d() {
        if (!Objects.equals(this.a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglDestroySurface(this.a, this.c);
            EGL14.eglDestroyContext(this.a, this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.d.release();
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_SURFACE;
        this.d = null;
    }
}
