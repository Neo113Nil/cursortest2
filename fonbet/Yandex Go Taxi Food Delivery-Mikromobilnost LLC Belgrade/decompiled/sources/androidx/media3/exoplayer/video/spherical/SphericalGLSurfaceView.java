package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil$GlException;
import defpackage.blf0;
import defpackage.clf0;
import defpackage.cnm0;
import defpackage.hfs;
import defpackage.hzz0;
import defpackage.lk91;
import defpackage.lxa1;
import defpackage.m8t0;
import defpackage.mq80;
import defpackage.qr7;
import defpackage.tpt0;
import defpackage.upt0;
import defpackage.w8z0;
import defpackage.xl31;
import defpackage.ykf0;
import defpackage.zkf0;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes10.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    public static final /* synthetic */ int a = 0;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final Handler mainHandler;
    private final OrientationListener orientationListener;
    private final Sensor orientationSensor;
    private final cnm0 scene;
    private final SensorManager sensorManager;
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private final TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final CopyOnWriteArrayList<upt0> videoSurfaceListeners;

    public final class Renderer implements GLSurfaceView.Renderer, hzz0, mq80 {
        private final float[] deviceOrientationMatrix;
        private float deviceRoll;
        private final cnm0 scene;
        private float touchPitch;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] projectionMatrix = new float[16];
        private final float[] viewProjectionMatrix = new float[16];
        private final float[] viewMatrix = new float[16];
        private final float[] tempMatrix = new float[16];

        public Renderer(cnm0 cnm0Var) {
            float[] fArr = new float[16];
            this.deviceOrientationMatrix = fArr;
            float[] fArr2 = new float[16];
            this.touchPitchMatrix = fArr2;
            float[] fArr3 = new float[16];
            this.touchYawMatrix = fArr3;
            this.scene = cnm0Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.deviceRoll = SphericalGLSurfaceView.UPRIGHT_ROLL;
        }

        private float calculateFieldOfViewInYDirection(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        private void updatePitchMatrix() {
            Matrix.setRotateM(this.touchPitchMatrix, 0, -this.touchPitch, (float) Math.cos(this.deviceRoll), (float) Math.sin(this.deviceRoll), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            Object d;
            synchronized (this) {
                Matrix.multiplyMM(this.tempMatrix, 0, this.deviceOrientationMatrix, 0, this.touchYawMatrix, 0);
                Matrix.multiplyMM(this.viewMatrix, 0, this.touchPitchMatrix, 0, this.tempMatrix, 0);
            }
            Matrix.multiplyMM(this.viewProjectionMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
            cnm0 cnm0Var = this.scene;
            float[] fArr = this.viewProjectionMatrix;
            cnm0Var.getClass();
            GLES20.glClear(16384);
            try {
                lxa1.c();
            } catch (GlUtil$GlException e) {
                lk91.f("SceneRenderer", "Failed to draw a frame", e);
            }
            if (cnm0Var.a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = cnm0Var.C;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    lxa1.c();
                } catch (GlUtil$GlException e2) {
                    lk91.f("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (cnm0Var.b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(cnm0Var.z, 0);
                }
                long timestamp = cnm0Var.C.getTimestamp();
                w8z0 w8z0Var = cnm0Var.x;
                synchronized (w8z0Var) {
                    d = w8z0Var.d(timestamp, false);
                }
                Long l = (Long) d;
                if (l != null) {
                    hfs hfsVar = cnm0Var.w;
                    float[] fArr2 = cnm0Var.z;
                    float[] fArr3 = (float[]) hfsVar.c.f(l.longValue());
                    if (fArr3 != null) {
                        float[] fArr4 = hfsVar.b;
                        float f = fArr3[0];
                        float f2 = -fArr3[1];
                        float f3 = -fArr3[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!hfsVar.d) {
                            hfs.a(hfsVar.a, hfsVar.b);
                            hfsVar.d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, hfsVar.a, 0, hfsVar.b, 0);
                    }
                }
                zkf0 zkf0Var = (zkf0) cnm0Var.y.f(timestamp);
                if (zkf0Var != null) {
                    clf0 clf0Var = cnm0Var.c;
                    clf0Var.getClass();
                    if (clf0.b(zkf0Var)) {
                        clf0Var.a = zkf0Var.c;
                        clf0Var.b = new blf0(zkf0Var.a.a[0]);
                        if (!zkf0Var.d) {
                            ykf0 ykf0Var = zkf0Var.b.a[0];
                            float[] fArr5 = ykf0Var.c;
                            int length2 = fArr5.length;
                            lxa1.f(fArr5);
                            lxa1.f(ykf0Var.d);
                        }
                    }
                }
            }
            Matrix.multiplyMM(cnm0Var.A, 0, fArr, 0, cnm0Var.z, 0);
            clf0 clf0Var2 = cnm0Var.c;
            int i = cnm0Var.B;
            float[] fArr6 = cnm0Var.A;
            blf0 blf0Var = clf0Var2.b;
            if (blf0Var == null) {
                return;
            }
            int i2 = clf0Var2.a;
            GLES20.glUniformMatrix3fv(clf0Var2.e, 1, false, i2 == 1 ? clf0.j : i2 == 2 ? clf0.k : clf0.i, 0);
            GLES20.glUniformMatrix4fv(clf0Var2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(clf0Var2.h, 0);
            try {
                lxa1.c();
            } catch (GlUtil$GlException e3) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(clf0Var2.f, 3, 5126, false, 12, (Buffer) blf0Var.b);
            try {
                lxa1.c();
            } catch (GlUtil$GlException e4) {
                Log.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(clf0Var2.g, 2, 5126, false, 8, (Buffer) blf0Var.c);
            try {
                lxa1.c();
            } catch (GlUtil$GlException e5) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(blf0Var.d, 0, blf0Var.a);
            try {
                lxa1.c();
            } catch (GlUtil$GlException e6) {
                Log.e("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // defpackage.mq80
        public synchronized void onOrientationChange(float[] fArr, float f) {
            float[] fArr2 = this.deviceOrientationMatrix;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.deviceRoll = -f;
            updatePitchMatrix();
        }

        @Override // defpackage.hzz0
        public synchronized void onScrollChange(PointF pointF) {
            this.touchPitch = pointF.y;
            updatePitchMatrix();
            Matrix.setRotateM(this.touchYawMatrix, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // defpackage.hzz0
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.projectionMatrix, 0, calculateFieldOfViewInYDirection(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.onSurfaceTextureAvailable(this.scene.d());
        }
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoSurfaceListeners = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.orientationSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        cnm0 cnm0Var = new cnm0();
        this.scene = cnm0Var;
        Renderer renderer = new Renderer(cnm0Var);
        TouchTracker touchTracker = new TouchTracker(context, renderer, PX_PER_DEGREES);
        this.touchTracker = touchTracker;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.orientationListener = new OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.useSensorRotation = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDetachedFromWindow$0() {
        Surface surface = this.surface;
        if (surface != null) {
            Iterator<upt0> it = this.videoSurfaceListeners.iterator();
            while (it.hasNext()) {
                it.next().onVideoSurfaceDestroyed(surface);
            }
        }
        releaseSurface(this.surfaceTexture, surface);
        this.surfaceTexture = null;
        this.surface = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceTextureAvailable$1(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.surfaceTexture;
        Surface surface = this.surface;
        Surface surface2 = new Surface(surfaceTexture);
        this.surfaceTexture = surfaceTexture;
        this.surface = surface2;
        Iterator<upt0> it = this.videoSurfaceListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSurfaceCreated(surface2);
        }
        releaseSurface(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        this.mainHandler.post(new tpt0(0, this, surfaceTexture));
    }

    private static void releaseSurface(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void updateOrientationListenerRegistration() {
        boolean z = this.useSensorRotation && this.isStarted;
        Sensor sensor = this.orientationSensor;
        if (sensor == null || z == this.isOrientationListenerRegistered) {
            return;
        }
        SensorManager sensorManager = this.sensorManager;
        if (z) {
            sensorManager.registerListener(this.orientationListener, sensor, 0);
        } else {
            sensorManager.unregisterListener(this.orientationListener);
        }
        this.isOrientationListenerRegistered = z;
    }

    public void addVideoSurfaceListener(upt0 upt0Var) {
        this.videoSurfaceListeners.add(upt0Var);
    }

    public qr7 getCameraMotionListener() {
        return this.scene;
    }

    public xl31 getVideoFrameMetadataListener() {
        return this.scene;
    }

    public Surface getVideoSurface() {
        return this.surface;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainHandler.post(new m8t0(16, this));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.isStarted = false;
        updateOrientationListenerRegistration();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.isStarted = true;
        updateOrientationListenerRegistration();
    }

    public void removeVideoSurfaceListener(upt0 upt0Var) {
        this.videoSurfaceListeners.remove(upt0Var);
    }

    public void setDefaultStereoMode(int i) {
        this.scene.D = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.useSensorRotation = z;
        updateOrientationListenerRegistration();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }
}
