package xsna;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.gpu.SharedEglContext;

/* compiled from: EglBase.java */
/* loaded from: classes3.dex */
public final class fap {
    public static final Object f = new Object();
    public static final a g;
    public final String a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLConfig d;
    public final g100 e;

    /* compiled from: EglBase.java */
    public static class a {
        public AtomicInteger a;
        public AtomicInteger b;
        public AtomicInteger c;

        public final String toString() {
            return "DebugInfo: displays=" + this.a + ", windowSurfaces=" + this.b + ", offscreenWindows=" + this.c;
        }
    }

    /* compiled from: EglBase.java */
    public static class b extends RuntimeException {
    }

    static {
        a aVar = new a();
        aVar.a = new AtomicInteger();
        aVar.b = new AtomicInteger();
        aVar.c = new AtomicInteger();
        g = aVar;
    }

    public fap(int i, g100 g100Var) {
        EGLConfig b2;
        float[] fArr = nap.a;
        this.a = "nap";
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.b = eGLDisplay;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = null;
        this.e = g100Var;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new b("EGL already set up");
        }
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.b = eglGetDisplay;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        a aVar = g;
        if (eglGetDisplay == eGLDisplay2) {
            throw new b("unable to get EGL14 display info=" + aVar.toString());
        }
        aVar.a.incrementAndGet();
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.b, iArr, 0, iArr, 1)) {
            this.b = null;
            throw new b("unable to initialize EGL14 info=" + aVar.toString());
        }
        if ((i & 2) != 0 && (b2 = b(i, 3)) != null) {
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.b, b2, eGLContext, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.d = b2;
                this.c = eglCreateContext;
            }
        }
        if (this.c == EGL14.EGL_NO_CONTEXT) {
            EGLConfig b3 = b(i, 2);
            if (b3 == null) {
                throw new b("Unable to find a suitable EGLConfig info=" + aVar.toString());
            }
            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.b, b3, eGLContext, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
            a("eglCreateContext");
            this.d = b3;
            this.c = eglCreateContext2;
        }
        EGL14.eglQueryContext(this.b, this.c, SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder b2 = ho8.b(str, ": EGL error: 0x");
        ky80.b(eglGetError, ", info=", b2);
        b2.append(g.toString());
        throw new b(b2.toString());
    }

    public final EGLConfig b(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344};
        if ((i & 4) != 0) {
            iArr = Arrays.copyOf(iArr, 15);
            iArr[iArr.length - 5] = 12325;
            iArr[iArr.length - 4] = 0;
            iArr[iArr.length - 3] = 12326;
            iArr[iArr.length - 2] = 0;
        }
        if ((i & 1) != 0) {
            iArr = Arrays.copyOf(iArr, iArr.length + 2);
            iArr[iArr.length - 3] = 12610;
            iArr[iArr.length - 2] = 1;
        }
        int[] iArr2 = iArr;
        iArr2[iArr2.length - 1] = 12344;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.b, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public final void c() {
        if (this.b != EGL14.EGL_NO_DISPLAY) {
            synchronized (f) {
                try {
                    if (EGL14.eglGetCurrentContext().equals(this.c)) {
                        EGLDisplay eGLDisplay = this.b;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                            Log.e(this.a, "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            EGL14.eglDestroyContext(this.b, this.c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.b);
        }
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = null;
        g.a.decrementAndGet();
    }

    public final void finalize() throws Throwable {
        try {
            if (this.b != EGL14.EGL_NO_DISPLAY) {
                c();
            }
        } finally {
            super.finalize();
        }
    }
}
