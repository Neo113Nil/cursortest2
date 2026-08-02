package xsna;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.vk.media.pipeline.gl.GlException;

/* compiled from: SurfaceVideoDecoderFrameHandler.kt */
/* loaded from: classes3.dex */
public final class fkn0 extends rql {
    public final ajs0 q;

    public fkn0(csp cspVar, ajs0 ajs0Var, pms0 pms0Var) {
        super(cspVar, new z4d0(ajs0Var, 17), pms0Var);
        this.q = ajs0Var;
        q0u q0uVar = ajs0Var.a;
        b0u b0uVar = q0uVar.d;
        EGLDisplay eGLDisplay = b0uVar.b;
        EGLSurface eGLSurface = q0uVar.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b0uVar.c)) {
            throw new GlException("eglMakeCurrent failed");
        }
    }

    @Override // xsna.rql
    public final void h() {
        q0u q0uVar = this.q.a;
        b0u b0uVar = q0uVar.d;
        EGLDisplay eGLDisplay = b0uVar.b;
        EGLSurface eGLSurface = q0uVar.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b0uVar.c)) {
            throw new GlException("eglMakeCurrent failed");
        }
    }

    @Override // xsna.rql
    public final void j(ckn0 ckn0Var, long j) {
        super.j(ckn0Var, j);
        this.q.a.b(j * 1000);
    }
}
