package xsna;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Result;
import xsna.moo0;

/* compiled from: GLRenderer.kt */
/* loaded from: classes4.dex */
public final class y1t implements GLSurfaceView.Renderer {
    public final gzs<p0u> b;
    public List<? extends moo0.a> d;
    public t1t e;
    public volatile h1t f;
    public volatile Size c = new Size(0, 0);
    public final HashSet<Integer> g = new HashSet<>();
    public final ArrayList<e2t> h = new ArrayList<>();

    public y1t(gzs<p0u> gzsVar) {
        this.b = gzsVar;
    }

    public final void d() {
        List<? extends moo0.a> list;
        if (this.e != null || (list = this.d) == null) {
            return;
        }
        List<? extends moo0.a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((moo0.a) it.next()).a(this.c));
        }
        this.e = new t1t(arrayList, new bgn(this.b.invoke()), this.c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.c.getWidth() == 0 || this.c.getHeight() == 0) {
            return;
        }
        GLES20.glClear(16640);
        synchronized (this.g) {
            try {
                Iterator<Integer> it = this.g.iterator();
                while (it.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
                }
                this.g.clear();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            try {
                Iterator<e2t> it2 = this.h.iterator();
                while (it2.hasNext()) {
                    e2t next = it2.next();
                    List<Bitmap> b = next.b();
                    ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                    Iterator<T> it3 = b.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(up2.b((Bitmap) it3.next()));
                    }
                    next.a(arrayList);
                }
                this.h.clear();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h1t h1tVar = this.f;
        int i = -1;
        if (h1tVar != null) {
            List<? extends moo0.a> list = this.d;
            if (list != null) {
                Size size = new Size(h1tVar.a, h1tVar.b);
                List<? extends moo0.a> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((moo0.a) it4.next()).a(size));
                }
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    Iterator it5 = arrayList2.iterator();
                    int i2 = -1;
                    boolean z = true;
                    while (it5.hasNext()) {
                        moo0 moo0Var = (moo0) it5.next();
                        z = moo0Var.b(i2, z);
                        i2 = moo0Var.d.c;
                    }
                    try {
                        Bitmap b2 = n3p.b(h1tVar.a, h1tVar.b);
                        PhotoEditorEngine.g(b2);
                        h1tVar.a();
                        h1tVar.d.c.resumeWith(new ld7(b2.copy(Bitmap.Config.ARGB_8888, true)));
                    } catch (Exception e) {
                        h1tVar.a();
                        h1tVar.d.c.resumeWith(new Result.Failure(e));
                    }
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    ((moo0) it6.next()).a();
                }
            }
            this.f = null;
        }
        d();
        t1t t1tVar = this.e;
        if (t1tVar == null || t1tVar.c.getWidth() == 0 || t1tVar.c.getHeight() == 0) {
            return;
        }
        boolean z2 = t1tVar.d;
        Iterator it7 = t1tVar.a.iterator();
        while (it7.hasNext()) {
            moo0 moo0Var2 = (moo0) it7.next();
            z2 = moo0Var2.b(i, z2);
            i = moo0Var2.d.c;
        }
        bgn bgnVar = t1tVar.b;
        Size size2 = t1tVar.c;
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, size2.getWidth(), size2.getHeight());
        bpn0 bpn0Var = (bpn0) bgnVar.b;
        ((ksj0) bpn0Var.getValue()).a = i;
        ((ksj0) bpn0Var.getValue()).b(size2);
        t1tVar.d = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.c = new Size(i, i2);
        t1t t1tVar = this.e;
        if (t1tVar != null) {
            Size size = this.c;
            t1tVar.c = size;
            Iterator it = t1tVar.a.iterator();
            while (it.hasNext()) {
                ((moo0) it.next()).e(size);
            }
            t1tVar.d = true;
        }
        d();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
    }
}
