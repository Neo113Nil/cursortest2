package xsna;

import android.graphics.Bitmap;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PixelBuffer.java */
/* loaded from: classes12.dex */
public final class bqa0 {
    public r2t a;
    public int b;
    public int c;
    public Bitmap d;
    public EGL10 e;
    public EGLDisplay f;
    public EGLConfig[] g;
    public EGLContext h;
    public EGLSurface i;
    public GL10 j;
    public long k;

    public final boolean a(String str) {
        if (Thread.currentThread().getId() == this.k) {
            return false;
        }
        Log.e("PixelBuffer", str.concat(": This thread does not own the OpenGL context."));
        return true;
    }
}
