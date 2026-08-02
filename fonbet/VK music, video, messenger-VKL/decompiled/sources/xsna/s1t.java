package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Parcelable;
import android.util.Size;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import one.video.gl.EGL14Utils;

/* compiled from: GLInputSurface.kt */
/* loaded from: classes8.dex */
public final class s1t {
    public final Parcelable a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public s1t(m0g0 m0g0Var, p1t p1tVar, Surface surface) {
        EGLSurface eGLSurface;
        this.a = surface;
        EGLDisplay eGLDisplay = (EGLDisplay) m0g0Var.b;
        this.b = eGLDisplay;
        this.c = (EGLContext) p1tVar.c;
        try {
            eGLSurface = EGL14.eglCreateWindowSurface(eGLDisplay, (EGLConfig) p1tVar.b, surface, new int[]{12344}, 0);
            if (epx.f(eGLSurface, EGL14.EGL_NO_SURFACE)) {
                EGL14Utils.a("eglCreateWindowSurface", 12291, 12299);
            }
        } catch (IllegalArgumentException unused) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        }
        this.d = eGLSurface;
        this.e = new Size(0, 0);
    }

    public void a(izs izsVar) {
        int i;
        int i2;
        EGLDisplay eGLDisplay = (EGLDisplay) this.b;
        if (epx.f((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) this.d;
        boolean eglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.c);
        EGL14Utils.a("eglMakeCurrent", 12291, 12297, 12299);
        if (eglMakeCurrent) {
            if (epx.f((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
                i = 0;
            } else {
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, (EGLSurface) this.d, 12375, iArr, 0);
                EGL14Utils.a("eglQuerySurface", new int[0]);
                i = iArr[0];
            }
            if (epx.f((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
                i2 = 0;
            } else {
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, (EGLSurface) this.d, 12374, iArr2, 0);
                EGL14Utils.a("eglQuerySurface", new int[0]);
                i2 = iArr2[0];
            }
            if (i != ((Size) this.e).getWidth() || i2 != ((Size) this.e).getHeight()) {
                this.e = new Size(i, i2);
            }
            try {
                izsVar.invoke((Size) this.e);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                EGL14Utils.a("eglMakeCurrent", new int[0]);
            } catch (Throwable th) {
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                EGL14Utils.a("eglMakeCurrent", new int[0]);
                throw th;
            }
        }
    }

    public void b() {
        if (epx.f((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface((EGLDisplay) this.b, (EGLSurface) this.d);
        EGL14Utils.a("eglDestroySurface", new int[0]);
        this.d = EGL14.EGL_NO_SURFACE;
    }

    public Bitmap c(cdu cduVar) {
        Matrix matrix = (Matrix) this.c;
        lyk0 lyk0Var = (lyk0) this.d;
        RectF rectF = (RectF) this.a;
        RectF rectF2 = (RectF) this.b;
        vlo vloVar = cduVar.c.get(cduVar.b);
        rho rhoVar = cduVar.e;
        List<uap> list = vloVar.a;
        kif0 kif0Var = vloVar.b;
        if (list.isEmpty()) {
            return null;
        }
        float f = kif0Var.a;
        float f2 = kif0Var.b;
        rectF.setEmpty();
        rectF2.setEmpty();
        uap uapVar = (uap) j5g.Y(list);
        if (uapVar instanceof mmb0) {
            fa8.b((mmb0) uapVar, rectF);
        }
        if (uapVar instanceof hq90) {
            fa8.a((hq90) uapVar, rectF);
        }
        rectF2.set(rectF);
        for (uap uapVar2 : j5g.S(list, 1)) {
            if (uapVar2 instanceof mmb0) {
                fa8.b((mmb0) uapVar2, rectF);
            }
            if (uapVar2 instanceof hq90) {
                fa8.a((hq90) uapVar2, rectF);
            }
            rectF2.set(Math.min(rectF.left, rectF2.left), Math.min(rectF.top, rectF2.top), Math.max(rectF.right, rectF2.right), Math.max(rectF.bottom, rectF2.bottom));
        }
        float a = iah0.a(50) * rhoVar.d;
        float f3 = rectF2.left - a;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = 0.0f;
        }
        rectF2.left = f3;
        float f4 = rectF2.top - a;
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = 0.0f;
        }
        rectF2.top = f4;
        float f5 = rectF2.right + a;
        if (f5 > f) {
            f5 = f;
        }
        rectF2.right = f5;
        float f6 = rectF2.bottom + a;
        if (f6 > f2) {
            f6 = f2;
        }
        rectF2.bottom = f6;
        matrix.reset();
        matrix.postTranslate(-rectF2.left, -rectF2.top);
        float min = Math.min(f / rectF2.width(), f2 / rectF2.height());
        if (2.0f <= min) {
            min = 2.0f;
        }
        float width = rectF2.width() * min;
        float height = rectF2.height() * min;
        if (width > 720.0f || height > 720.0f) {
            float f7 = 720.0f / (width < height ? height : width);
            min *= f7;
            width *= f7;
            height *= f7;
        }
        int i = (int) width;
        int i2 = (int) height;
        matrix.postScale(min, min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        qcy<Object>[] qcyVarArr = xlo.a;
        if (!kif0Var.equals(kif0.c)) {
            edi.z(xlo.d(), kif0Var);
            float[] a2 = xlo.d().a();
            matrix.mapPoints(a2);
            edi.A(xlo.d(), a2);
            vloVar = vlo.b(vloVar, edi.D(xlo.d()), 2);
            for (uap uapVar3 : vloVar.a) {
                x980 x980Var = uapVar3 instanceof x980 ? (x980) uapVar3 : null;
                if (x980Var != null) {
                    x980Var.d(matrix);
                }
            }
        }
        Bitmap d = kd7.d(i, i2);
        if (d == null) {
            return null;
        }
        Canvas canvas = new Canvas(d);
        ((pb7) lyk0Var.c).a(i, i2);
        xlo.a(vloVar, lyk0Var);
        pb7 pb7Var = (pb7) lyk0Var.c;
        pb7Var.b();
        Bitmap bitmap = pb7Var.a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) this.e);
            s3q0 s3q0Var = s3q0.a;
        }
        lyk0Var.clear();
        return d;
    }

    public boolean d() {
        if (epx.f((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return false;
        }
        boolean eglSwapBuffers = EGL14.eglSwapBuffers((EGLDisplay) this.b, (EGLSurface) this.d);
        EGL14Utils.a("eglSwapBuffers", 12299, 12301, 12291);
        return eglSwapBuffers;
    }

    public s1t() {
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new lyk0();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.e = paint;
    }
}
