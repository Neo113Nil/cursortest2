package yads;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class m33 extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final Handler e;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public final void a() {
        Surface surface = this.h;
        if (surface != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((xn0) ((l33) it.next())).a.a((Surface) null);
            }
        }
        SurfaceTexture surfaceTexture = this.g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }

    public final void b() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        if (z) {
            this.b.registerListener((SensorEventListener) null, sensor, 0);
        } else {
            this.b.unregisterListener((SensorEventListener) null);
        }
        this.k = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new xsna.o1(this, 17));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        b();
    }

    public void setDefaultStereoMode(int i) {
        throw null;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        b();
    }
}
