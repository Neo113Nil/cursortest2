package xsna;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;
import xsna.o0u;

/* compiled from: DebugViewShaderProgram.java */
/* loaded from: classes12.dex */
public final class i7l implements o0u {
    public final Context a;
    public final g7l b;

    @Nullable
    public mml c;
    public final m6g d;
    public EGLDisplay i;
    public int j = -1;
    public int k = -1;
    public o0u.b e = new a();
    public o0u.c f = new b();
    public o0u.a g = new wp(8);
    public Executor h = kzm.INSTANCE;

    /* compiled from: DebugViewShaderProgram.java */
    public class a implements o0u.b {
    }

    /* compiled from: DebugViewShaderProgram.java */
    public class b implements o0u.c {
    }

    public i7l(Context context, g7l g7lVar, m6g m6gVar) {
        this.a = context;
        this.b = g7lVar;
        this.d = m6gVar;
    }

    @Override // xsna.o0u
    public final void a(Executor executor, tp1 tp1Var) {
        this.g = tp1Var;
        this.h = executor;
    }

    @Override // xsna.o0u
    public final void b(o0u.b bVar) {
        this.e = bVar;
        bVar.e();
    }

    @Override // xsna.o0u
    public final void c(k0u k0uVar, r0u r0uVar, long j) {
        try {
            g(r0uVar.c, r0uVar.d);
            this.c.getClass();
            throw null;
        } catch (VideoFrameProcessingException | GlUtil.GlException e) {
            this.h.execute(new h7l(this, e, j));
        }
    }

    @Override // xsna.o0u
    public final void d(o0u.c cVar) {
        this.f = cVar;
    }

    @Override // xsna.o0u
    public final void e(r0u r0uVar) {
        this.e.b(r0uVar);
        this.e.e();
    }

    @Override // xsna.o0u
    public final void f() {
        this.f.c();
    }

    @Override // xsna.o0u
    public final void flush() {
        mml mmlVar = this.c;
        if (mmlVar != null) {
            mmlVar.flush();
        }
        this.e.a();
        this.e.e();
    }

    public final void g(int i, int i2) throws VideoFrameProcessingException, GlUtil.GlException {
        if (this.i == null) {
            this.i = GlUtil.p();
        }
        EGL14.eglGetCurrentContext();
        if (this.j == -1 || this.k == -1) {
            this.j = i;
            this.k = i2;
        }
        this.b.getClass();
        if (this.c == null) {
            ImmutableList.a aVar = new ImmutableList.a();
            aVar.c(i2d0.h(this.j, this.k));
            com.google.common.collect.g g = aVar.g();
            com.google.common.collect.g gVar = com.google.common.collect.g.f;
            m6g m6gVar = this.d;
            this.c = mml.k(this.a, g, gVar, m6gVar, m6gVar.c == 1 ? 2 : 0);
        }
    }

    @Override // xsna.o0u
    public final void release() throws VideoFrameProcessingException {
        mml mmlVar = this.c;
        if (mmlVar != null) {
            mmlVar.release();
        }
        try {
            GlUtil.d();
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
