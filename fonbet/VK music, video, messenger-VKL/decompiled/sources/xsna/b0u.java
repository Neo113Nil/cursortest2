package xsna;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.vk.media.pipeline.gl.GlException;
import kotlin.Pair;
import ru.ok.gpu.SharedEglContext;

/* compiled from: GlContext.kt */
/* loaded from: classes3.dex */
public final class b0u {
    public final EGLConfig a;
    public final EGLDisplay b;
    public final EGLContext c;
    public final f100 d;

    /* compiled from: GlContext.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static b0u a(f100 f100Var) {
            EGLContext eglCreateContext;
            Pair pair;
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                Pair pair2 = null;
                if (eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    eglGetDisplay = null;
                }
                if (eglGetDisplay != null) {
                    int[] iArr = new int[2];
                    if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        throw new GlException("eglInitialize failed");
                    }
                    EGLConfig c = c(eglGetDisplay, 3, f100Var);
                    if (c != null) {
                        EGLContext eglCreateContext2 = EGL14.eglCreateContext(eglGetDisplay, c, eGLContext, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 3, 12344}, 0);
                        if (eglCreateContext2 != null) {
                            if (eglCreateContext2.equals(EGL14.EGL_NO_CONTEXT)) {
                                eglCreateContext2 = null;
                            }
                            if (eglCreateContext2 != null) {
                                pair = new Pair(c, eglCreateContext2);
                                if (pair != null) {
                                    pair2 = pair;
                                    if (pair2 != null) {
                                        b(f100Var);
                                        EGL14.eglTerminate(eglGetDisplay);
                                        throw new GlException("eglCreateContext failed");
                                    }
                                    iArr[0] = -1;
                                    if (EGL14.eglQueryContext(eglGetDisplay, (EGLContext) pair2.j(), SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, iArr, 0)) {
                                        return new b0u((EGLConfig) pair2.i(), eglGetDisplay, (EGLContext) pair2.j(), f100Var);
                                    }
                                    EGL14.eglDestroyContext(eglGetDisplay, (EGLContext) pair2.j());
                                    b(f100Var);
                                    EGL14.eglTerminate(eglGetDisplay);
                                    throw new GlException("eglQueryContext (version) failed");
                                }
                            }
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    }
                    EGLConfig c2 = c(eglGetDisplay, 2, f100Var);
                    if (c2 != null && (eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, c2, eGLContext, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0)) != null) {
                        if (eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                            eglCreateContext = null;
                        }
                        if (eglCreateContext != null) {
                            pair2 = new Pair(c2, eglCreateContext);
                        }
                    }
                    if (pair2 != null) {
                    }
                }
            }
            throw new GlException("eglGetDisplay failed");
        }

        public static void b(f100 f100Var) {
            if (EGL14.eglReleaseThread() || f100Var == null) {
                return;
            }
            f100Var.a("GlContext", new GlException("eglReleaseThread failed"));
        }

        public static EGLConfig c(EGLDisplay eGLDisplay, int i, f100 f100Var) {
            int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
            if (i >= 3) {
                iArr[7] = 68;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                if (f100Var != null) {
                    f100Var.d("GlContext", "Found egl config for version=" + i);
                }
                return eGLConfigArr[0];
            }
            if (f100Var == null) {
                return null;
            }
            f100Var.w("GlContext", "Unable to find egl config for version=" + i);
            return null;
        }
    }

    public b0u(EGLConfig eGLConfig, EGLDisplay eGLDisplay, EGLContext eGLContext, f100 f100Var) {
        this.a = eGLConfig;
        this.b = eGLDisplay;
        this.c = eGLContext;
        this.d = f100Var;
    }

    public final void a() {
        f100 f100Var = this.d;
        if (f100Var != null) {
            f100Var.v("GlContext", "release egl context");
        }
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLContext eGLContext = this.c;
        boolean f = epx.f(eGLContext, eglGetCurrentContext);
        EGLDisplay eGLDisplay = this.b;
        if (f) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT) && f100Var != null) {
                f100Var.a("GlContext", new GlException("eglMakeCurrent (detach) failed"));
            }
        }
        if (!EGL14.eglDestroyContext(eGLDisplay, eGLContext) && f100Var != null) {
            f100Var.a("GlContext", new GlException("eglDestroyContext failed"));
        }
        a.b(f100Var);
        if (EGL14.eglTerminate(eGLDisplay) || f100Var == null) {
            return;
        }
        f100Var.a("GlContext", new GlException("eglTerminate failed"));
    }
}
