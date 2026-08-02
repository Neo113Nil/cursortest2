package xsna;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import xsna.agn;
import xsna.k2t;

/* compiled from: GLRenderer.kt */
/* loaded from: classes3.dex */
public final class z1t implements GLSurfaceView.Renderer {
    public volatile Size b;
    public List<? extends k2t.a> c;
    public agn.a d;
    public u1t e;

    public final void d() {
        List<? extends k2t.a> list;
        if (this.e != null || (list = this.c) == null) {
            return;
        }
        List<? extends k2t.a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k2t.a) it.next()).a(this.b));
        }
        this.e = new u1t(arrayList, new agn(this.d.a), this.b);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.b.getWidth() == 0 || this.b.getHeight() == 0) {
            return;
        }
        GLES20.glClear(16640);
        d();
        u1t u1tVar = this.e;
        if (u1tVar == null || u1tVar.c.getWidth() == 0 || u1tVar.c.getHeight() == 0) {
            return;
        }
        boolean z = u1tVar.d;
        Iterator it = u1tVar.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            k2t k2tVar = (k2t) it.next();
            z = k2tVar.b(i, z);
            i = k2tVar.c.c;
        }
        u1tVar.b.a(i, u1tVar.c);
        u1tVar.d = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b = new Size(i, i2);
        u1t u1tVar = this.e;
        if (u1tVar != null) {
            Size size = this.b;
            u1tVar.c = size;
            Iterator it = u1tVar.a.iterator();
            while (it.hasNext()) {
                k2t k2tVar = (k2t) it.next();
                k2tVar.a = size;
                x1t x1tVar = k2tVar.c;
                GLES20.glDeleteFramebuffers(1, new int[]{x1tVar.a}, 0);
                GLES20.glDeleteTextures(1, new int[]{x1tVar.c}, 0);
                GLES20.glDeleteRenderbuffers(1, new int[]{x1tVar.b}, 0);
                k2tVar.c = k2t.a(size);
            }
            u1tVar.d = true;
        }
        d();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.e = null;
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
    }
}
