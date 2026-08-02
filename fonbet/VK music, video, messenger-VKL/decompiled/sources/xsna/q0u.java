package xsna;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.vk.media.pipeline.gl.GlException;

/* compiled from: GlSurface.kt */
/* loaded from: classes3.dex */
public final class q0u {
    public final int a;
    public final int b;
    public final EGLSurface c;
    public final b0u d;
    public final f100 e;

    /* compiled from: GlSurface.kt */
    public static final class a {
        public static q0u a(b0u b0uVar, int i, int i2, f100 f100Var) {
            int i3;
            int i4;
            EGLDisplay eGLDisplay = b0uVar.b;
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, b0uVar.a, new int[]{12375, i, 12374, i2, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                if (eglCreatePbufferSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    eglCreatePbufferSurface = null;
                }
                EGLSurface eGLSurface = eglCreatePbufferSurface;
                if (eGLSurface != null) {
                    int[] iArr = new int[1];
                    if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0) || (i3 = iArr[0]) <= 0) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        throw new GlException("eglQuerySurface (width) failed");
                    }
                    iArr[0] = 0;
                    if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0) && (i4 = iArr[0]) > 0) {
                        return new q0u(i3, i4, eGLSurface, b0uVar, f100Var);
                    }
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    throw new GlException("eglQuerySurface (height) failed");
                }
            }
            throw new GlException("eglCreatePbufferSurface (" + i + 'x' + i2 + ") failed, glError = " + GLES20.glGetError());
        }

        public static q0u b(b0u b0uVar, Surface surface, f100 f100Var) {
            int i;
            int i2;
            EGLDisplay eGLDisplay = b0uVar.b;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, b0uVar.a, surface, new int[]{12344}, 0);
            if (eglCreateWindowSurface != null) {
                if (eglCreateWindowSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    eglCreateWindowSurface = null;
                }
                EGLSurface eGLSurface = eglCreateWindowSurface;
                if (eGLSurface != null) {
                    int[] iArr = new int[1];
                    if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0) || (i = iArr[0]) <= 0) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        throw new GlException("eglQuerySurface (width) failed");
                    }
                    iArr[0] = 0;
                    if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0) && (i2 = iArr[0]) > 0) {
                        return new q0u(i, i2, eGLSurface, b0uVar, f100Var);
                    }
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    throw new GlException("eglQuerySurface (height) failed");
                }
            }
            throw new GlException("eglCreateWindowSurface failed, glError = " + GLES20.glGetError());
        }
    }

    public q0u(int i, int i2, EGLSurface eGLSurface, b0u b0uVar, f100 f100Var) {
        this.a = i;
        this.b = i2;
        this.c = eGLSurface;
        this.d = b0uVar;
        this.e = f100Var;
    }

    public final void a() {
        f100 f100Var = this.e;
        if (f100Var != null) {
            f100Var.v("GlSurface", "release egl surface");
        }
        if (EGL14.eglDestroySurface(this.d.b, this.c) || f100Var == null) {
            return;
        }
        f100Var.a("GlSurface", new GlException("eglDestroySurface failed"));
    }

    public final void b(long j) {
        f100 f100Var;
        b0u b0uVar = this.d;
        EGLDisplay eGLDisplay = b0uVar.b;
        EGLSurface eGLSurface = this.c;
        if (!EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j) && (f100Var = b0uVar.d) != null) {
            f100Var.e("GlContext", "eglPresentationTimeANDROID failed, ptsNanos=" + j);
        }
        if (!EGL14.eglSwapBuffers(eGLDisplay, eGLSurface)) {
            throw new GlException("eglSwapBuffers failed");
        }
    }
}
