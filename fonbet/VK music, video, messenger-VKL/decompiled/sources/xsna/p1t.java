package xsna;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import one.video.gl.EGL14Utils;
import ru.ok.gpu.SharedEglContext;

/* compiled from: GLContext.kt */
/* loaded from: classes8.dex */
public final class p1t {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    public p1t(m0g0 m0g0Var) {
        EGLDisplay eGLDisplay = (EGLDisplay) m0g0Var.b;
        this.a = eGLDisplay;
        EGLConfig b = EGL14Utils.b(eGLDisplay, 4);
        this.b = b;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, b, EGL14.EGL_NO_CONTEXT, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
        if (epx.f(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            EGL14Utils.a("eglCreateContext", new int[0]);
        }
        this.c = eglCreateContext;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, EGL14Utils.b(eGLDisplay, 1), new int[]{12375, 1, 12374, 1, 12417, 12380, 12416, 12380, 12344}, 0);
        if (epx.f(eglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            EGL14Utils.a("eglCreatePbufferSurface", new int[0]);
        }
        this.d = eglCreatePbufferSurface;
    }

    public void a(gzs gzsVar) {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        if (epx.f((EGLContext) this.c, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) this.d;
        boolean eglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.c);
        EGL14Utils.a("eglMakeCurrent", 12291, 12297, 12299);
        if (eglMakeCurrent) {
            try {
                gzsVar.invoke();
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                EGL14Utils.a("eglMakeCurrent", new int[0]);
            } catch (Throwable th) {
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                EGL14Utils.a("eglMakeCurrent", new int[0]);
                throw th;
            }
        }
    }

    public void b() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        if (epx.f((EGLContext) this.c, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) this.d);
        EGL14Utils.a("eglDestroySurface", new int[0]);
        this.d = EGL14.EGL_NO_SURFACE;
        EGL14.eglDestroyContext(eGLDisplay, (EGLContext) this.c);
        EGL14Utils.a("eglDestroyContext", new int[0]);
        this.c = EGL14.EGL_NO_CONTEXT;
    }

    public p1t(wlg wlgVar, FragmentManager fragmentManager, VideoProfileFragmentOld.c cVar, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = wlgVar;
        this.b = fragmentManager;
        this.c = cVar;
        this.d = searchStatsLoggingInfo;
    }
}
