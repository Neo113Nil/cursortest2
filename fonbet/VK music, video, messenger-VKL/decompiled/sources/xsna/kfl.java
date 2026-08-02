package xsna;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayList;

/* compiled from: DefaultGlObjectsProvider.java */
/* loaded from: classes12.dex */
public final class kfl implements k0u {
    public final EGLContext a = EGL14.EGL_NO_CONTEXT;
    public final ArrayList b = new ArrayList();

    @Override // xsna.k0u
    public final EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException {
        int[] iArr;
        int[] iArr2 = GlUtil.e;
        if (i == 3 || i == 10) {
            iArr = GlUtil.a;
        } else {
            if (i != 7 && i != 6) {
                throw new IllegalArgumentException(lhg.a(i, "Unsupported color transfer: "));
            }
            iArr = GlUtil.b;
            if (!z) {
                if (i == 6) {
                    if (!GlUtil.r()) {
                        throw new GlUtil.GlException("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr2 = GlUtil.c;
                } else {
                    if (!GlUtil.s("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        throw new GlUtil.GlException("BT.2020 HLG OpenGL output isn't supported.");
                    }
                    iArr2 = GlUtil.d;
                }
            }
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, GlUtil.q(eGLDisplay, iArr), obj, iArr2, 0);
        GlUtil.c("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    @Override // xsna.k0u
    public final r0u b(int i, int i2, int i3) throws GlUtil.GlException {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GlUtil.d();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GlUtil.d();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GlUtil.d();
        return new r0u(i, iArr[0], i2, i3);
    }

    @Override // xsna.k0u
    public final EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException {
        return GlUtil.j(eGLContext, eGLDisplay);
    }

    @Override // xsna.k0u
    public final EGLContext d(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
        EGLContext i2 = GlUtil.i(this.a, eGLDisplay, i, iArr);
        this.b.add(i2);
        return i2;
    }

    @Override // xsna.k0u
    public final void e(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                EGL14.eglReleaseThread();
                GlUtil.c("Error releasing thread");
                EGL14.eglTerminate(eGLDisplay);
                GlUtil.c("Error terminating display");
                return;
            }
            GlUtil.l((EGLContext) arrayList.get(i), eGLDisplay);
            i++;
        }
    }
}
