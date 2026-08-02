package xsna;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.media3.common.util.GlUtil;

/* compiled from: GlObjectsProvider.java */
/* loaded from: classes12.dex */
public interface k0u {
    EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException;

    r0u b(int i, int i2, int i3) throws GlUtil.GlException;

    EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException;

    EGLContext d(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException;

    void e(EGLDisplay eGLDisplay) throws GlUtil.GlException;
}
