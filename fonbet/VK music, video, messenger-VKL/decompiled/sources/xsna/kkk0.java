package xsna;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import xsna.f4e0;
import xsna.h4e0;
import xsna.wy80;

/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes12.dex */
public final class kkk0 extends GLSurfaceView {
    public final CopyOnWriteArrayList<b> b;
    public final SensorManager c;

    @Nullable
    public final Sensor d;
    public final wy80 e;
    public final Handler f;
    public final t5h0 g;

    @Nullable
    public SurfaceTexture h;

    @Nullable
    public Surface i;
    public boolean j;
    public boolean k;
    public boolean l;

    /* compiled from: SphericalGLSurfaceView.java */
    public final class a implements GLSurfaceView.Renderer, wy80.a {
        public final t5h0 b;
        public final float[] e;
        public final float[] f;
        public final float[] g;
        public float h;
        public float i;
        public final float[] c = new float[16];
        public final float[] d = new float[16];
        public final float[] j = new float[16];
        public final float[] k = new float[16];

        public a(t5h0 t5h0Var) {
            float[] fArr = new float[16];
            this.e = fArr;
            float[] fArr2 = new float[16];
            this.f = fArr2;
            float[] fArr3 = new float[16];
            this.g = fArr3;
            this.b = t5h0Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.i = 3.1415927f;
        }

        @Override // xsna.wy80.a
        public final synchronized void d(float[] fArr, float f) {
            float[] fArr2 = this.e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.i = f2;
            Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(f2), (float) Math.sin(this.i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Long d;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.k, 0, this.e, 0, this.g, 0);
                Matrix.multiplyMM(this.j, 0, this.f, 0, this.k, 0);
            }
            Matrix.multiplyMM(this.d, 0, this.c, 0, this.j, 0);
            t5h0 t5h0Var = this.b;
            float[] fArr2 = this.d;
            GLES20.glClear(16384);
            try {
                GlUtil.d();
            } catch (GlUtil.GlException e) {
                ahn.o("SceneRenderer", "Failed to draw a frame", e);
            }
            if (t5h0Var.b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = t5h0Var.k;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.d();
                } catch (GlUtil.GlException e2) {
                    ahn.o("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (t5h0Var.c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(t5h0Var.h, 0);
                }
                long timestamp = t5h0Var.k.getTimestamp();
                dwo0<Long> dwo0Var = t5h0Var.f;
                synchronized (dwo0Var) {
                    d = dwo0Var.d(timestamp, false);
                }
                Long l = d;
                if (l != null) {
                    cgs cgsVar = t5h0Var.e;
                    float[] fArr3 = t5h0Var.h;
                    float[] f = cgsVar.c.f(l.longValue());
                    if (f != null) {
                        float[] fArr4 = cgsVar.b;
                        float f2 = f[0];
                        float f3 = -f[1];
                        float f4 = -f[2];
                        float length = Matrix.length(f2, f3, f4);
                        if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!cgsVar.d) {
                            cgs.a(cgsVar.a, cgsVar.b);
                            cgsVar.d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, cgsVar.a, 0, cgsVar.b, 0);
                    }
                }
                f4e0 f5 = t5h0Var.g.f(timestamp);
                if (f5 != null) {
                    h4e0 h4e0Var = t5h0Var.d;
                    h4e0Var.getClass();
                    if (h4e0.b(f5)) {
                        h4e0Var.a = f5.c;
                        h4e0Var.b = new h4e0.a(f5.a.a[0]);
                        if (!f5.d) {
                            f4e0.b bVar = f5.b.a[0];
                            float[] fArr5 = bVar.c;
                            int length2 = fArr5.length;
                            GlUtil.h(fArr5);
                            GlUtil.h(bVar.d);
                        }
                    }
                }
            }
            Matrix.multiplyMM(t5h0Var.i, 0, fArr2, 0, t5h0Var.h, 0);
            h4e0 h4e0Var2 = t5h0Var.d;
            int i = t5h0Var.j;
            float[] fArr6 = t5h0Var.i;
            h4e0.a aVar = h4e0Var2.b;
            if (aVar == null) {
                return;
            }
            int i2 = h4e0Var2.a;
            GLES20.glUniformMatrix3fv(h4e0Var2.e, 1, false, i2 == 1 ? h4e0.j : i2 == 2 ? h4e0.k : h4e0.i, 0);
            GLES20.glUniformMatrix4fv(h4e0Var2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(h4e0Var2.h, 0);
            try {
                GlUtil.d();
            } catch (GlUtil.GlException e3) {
                ahn.o("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(h4e0Var2.f, 3, 5126, false, 12, (Buffer) aVar.b);
            try {
                GlUtil.d();
            } catch (GlUtil.GlException e4) {
                ahn.o("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(h4e0Var2.g, 2, 5126, false, 8, (Buffer) aVar.c);
            try {
                GlUtil.d();
            } catch (GlUtil.GlException e5) {
                ahn.o("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(aVar.d, 0, aVar.a);
            try {
                GlUtil.d();
            } catch (GlUtil.GlException e6) {
                ahn.o("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.c, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            kkk0 kkk0Var = kkk0.this;
            kkk0Var.f.post(new aw(6, kkk0Var, this.b.b()));
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    public interface b {
        void x(Surface surface);

        void z();
    }

    public kkk0(Context context) {
        super(context, null);
        this.b = new CopyOnWriteArrayList<>();
        this.f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        t5h0 t5h0Var = new t5h0();
        this.g = t5h0Var;
        a aVar = new a(t5h0Var);
        View.OnTouchListener jdp0Var = new jdp0(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.e = new wy80(windowManager.getDefaultDisplay(), jdp0Var, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(jdp0Var);
    }

    public final void a() {
        boolean z = this.j && this.k;
        Sensor sensor = this.d;
        if (sensor == null || z == this.l) {
            return;
        }
        wy80 wy80Var = this.e;
        SensorManager sensorManager = this.c;
        if (z) {
            sensorManager.registerListener(wy80Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(wy80Var);
        }
        this.l = z;
    }

    public kj9 getCameraMotionListener() {
        return this.g;
    }

    public gms0 getVideoFrameMetadataListener() {
        return this.g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.post(new b04(this, 13));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.k = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.k = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.g.l = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.j = z;
        a();
    }
}
