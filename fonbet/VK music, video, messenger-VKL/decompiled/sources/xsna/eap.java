package xsna;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import ru.ok.gpu.SharedEglContext;
import xsna.l2t;

/* compiled from: Egl2ContextFactory.java */
/* loaded from: classes3.dex */
public final class eap implements l2t.f {
    @Override // xsna.l2t.f
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
    }

    @Override // xsna.l2t.f
    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        Log.e("EglContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
        throw new RuntimeException("eglDestroyContex" + egl10.eglGetError());
    }
}
