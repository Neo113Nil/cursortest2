package xsna;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import app.effectum.filter.image.GPUImage$ScaleType;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.rotation.Flip;
import com.vk.media.rotation.Rotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes12.dex */
public final class r2t implements GLSurfaceView.Renderer {
    public static final float[] p = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public n2t b;
    public final FloatBuffer e;
    public final FloatBuffer f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Rotation m;
    public Flip n;
    public final Object c = new Object();
    public int d = -1;
    public GPUImage$ScaleType o = GPUImage$ScaleType.CENTER_CROP;
    public final LinkedList k = new LinkedList();
    public final LinkedList l = new LinkedList();

    public r2t(n2t n2tVar) {
        this.b = n2tVar;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.e = asFloatBuffer;
        asFloatBuffer.put(p).position(0);
        this.f = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Rotation rotation = Rotation.ROTATION_0;
        this.n = Flip.NO_FLIP;
        this.m = rotation;
        k();
    }

    public static float d(float f, float f2) {
        return f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f2 : 1.0f - f2;
    }

    public static void l(LinkedList linkedList) {
        synchronized (linkedList) {
            while (!linkedList.isEmpty()) {
                try {
                    ((Runnable) linkedList.poll()).run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void k() {
        float f = this.g;
        float f2 = this.h;
        Rotation rotation = this.m;
        if (rotation == Rotation.ROTATION_270 || rotation == Rotation.ROTATION_90) {
            f2 = f;
            f = f2;
        }
        float max = Math.max(f / this.i, f2 / this.j);
        float round = Math.round(this.i * max) / f;
        float round2 = Math.round(this.j * max) / f2;
        float[] d = koo0.d(this.m, this.n, false);
        GPUImage$ScaleType gPUImage$ScaleType = this.o;
        GPUImage$ScaleType gPUImage$ScaleType2 = GPUImage$ScaleType.CENTER_CROP;
        float[] fArr = p;
        if (gPUImage$ScaleType == gPUImage$ScaleType2) {
            float f3 = (1.0f - (1.0f / round)) / 2.0f;
            float f4 = (1.0f - (1.0f / round2)) / 2.0f;
            d = new float[]{d(d[0], f3), d(d[1], f4), d(d[2], f3), d(d[3], f4), d(d[4], f3), d(d[5], f4), d(d[6], f3), d(d[7], f4)};
        } else {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        FloatBuffer floatBuffer = this.e;
        floatBuffer.clear();
        floatBuffer.put(fArr).position(0);
        FloatBuffer floatBuffer2 = this.f;
        floatBuffer2.clear();
        floatBuffer2.put(d).position(0);
    }

    public final void m(Runnable runnable) {
        synchronized (this.k) {
            this.k.add(runnable);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        l(this.k);
        this.b.d(this.d, this.e, this.f);
        l(this.l);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.g = i;
        this.h = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.b.a());
        this.b.f(i, i2);
        k();
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glDisable(2929);
        this.b.b();
    }
}
