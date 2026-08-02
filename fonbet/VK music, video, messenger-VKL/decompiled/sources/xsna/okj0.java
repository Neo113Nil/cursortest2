package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.ShutterButton;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ShutterButtonDrawingController.kt */
/* loaded from: classes.dex */
public final class okj0 {
    public static final int A0;
    public static final int[] B0;
    public static final float[] C0;
    public static final float D0;
    public static final float E0;
    public static final int F0;
    public static final int G0;
    public static final int z0;
    public boolean A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public Bitmap W;
    public Bitmap X;
    public String Y;
    public String Z;
    public final ShutterButton a;
    public int a0;
    public final Paint b;
    public int b0;
    public final Paint c;
    public int c0;
    public final Paint d;
    public int d0;
    public final Paint e;
    public Typeface e0;
    public final Paint f;
    public Typeface f0;
    public final Paint g;
    public Rect g0;
    public final TextPaint h;
    public Rect h0;
    public final TextPaint i;
    public Rect i0;
    public final Paint j;
    public Rect j0;
    public final Paint k;
    public boolean k0;
    public final Paint l;
    public float l0;
    public final float m;
    public final RectF m0;
    public final float n;
    public float n0;
    public final float o;
    public float o0;
    public final RectF p;
    public float p0;
    public final RectF q;
    public float q0;
    public final SparseArray<Rect> r;
    public float r0;
    public final SparseArray<String> s;
    public float s0;
    public Rect t;
    public boolean t0;
    public Rect u;
    public boolean u0;
    public final Matrix v;
    public boolean v0;
    public LinearGradient w;
    public float w0;
    public final Matrix x;
    public float x0;
    public final Matrix y;
    public float y0;
    public boolean z;

    /* compiled from: ShutterButtonDrawingController.kt */
    public static final class a {
        public static final float[] a(float f, float f2, float f3) {
            int i = okj0.z0;
            float f4 = 2;
            float f5 = f / f4;
            float f6 = f5 * f3;
            float f7 = f5 - f6;
            float f8 = f2 / f4;
            float f9 = f3 * f8;
            float f10 = f8 - f9;
            float f11 = f5 + f6;
            float f12 = f8 + f9;
            return new float[]{f7, f10, f11, f10, f7, f12, f11, f12};
        }

        public static final float[] b(float f, float f2, float f3, float f4) {
            float f5;
            int i = okj0.z0;
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f5 = 1.0f - f4;
                }
                float f6 = f2 / 2;
                float f7 = f3 * f6;
                float f8 = f6 * f4;
                return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - f7, f, f2 - f8};
            }
            f5 = 1.0f - f3;
            f *= f5;
            float f62 = f2 / 2;
            float f72 = f3 * f62;
            float f82 = f62 * f4;
            return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f72 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f82, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - f72, f, f2 - f82};
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        z0 = context.getColor(R.color.vk_white);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        A0 = context2.getColor(R.color.vk_white);
        B0 = new int[]{0, 0, -65536};
        C0 = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.04f, 0.33f};
        D0 = iah0.a(6.0f);
        E0 = iah0.a(3.0f);
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        F0 = context3.getColor(R.color.camera_ui_live_button1);
        Context context4 = e43.a;
        G0 = (context4 != null ? context4 : null).getColor(R.color.camera_ui_live_button2);
    }

    public okj0(ShutterButton shutterButton) {
        this.a = shutterButton;
        Paint paint = new Paint(1);
        paint.setColor(z0);
        float f = D0;
        paint.setStrokeWidth(f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ShutterButton.P);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(f);
        paint2.setStyle(style);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        Context context = e43.a;
        context = context == null ? null : context;
        e3m.a aVar = e3m.a;
        paint3.setColor(context.getColor(R.color.vk_steel_gray_200));
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(f);
        paint3.setStyle(style);
        this.d = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(A0);
        this.e = paint4;
        Paint paint5 = new Paint(2);
        paint5.setDither(true);
        this.f = paint5;
        Paint paint6 = new Paint(2);
        paint6.setDither(true);
        this.g = paint6;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-16777216);
        this.h = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(-16777216);
        this.i = textPaint2;
        Paint paint7 = new Paint(1);
        paint7.setColor(ShutterButton.O);
        paint7.setStrokeWidth(ShutterButton.Q);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        this.j = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(l8g.f(0.3f, -1));
        this.k = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(l8g.f(0.4f, -1));
        paint9.setStrokeCap(cap);
        paint9.setStrokeWidth(iah0.b(6.0f));
        paint9.setStyle(style);
        this.l = paint9;
        this.m = iah0.b(3.0f);
        this.n = 7.0f;
        this.o = 360.0f;
        this.p = new RectF();
        this.q = new RectF();
        this.r = new SparseArray<>();
        this.s = new SparseArray<>();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Matrix();
        this.w = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -65536, -16711936, Shader.TileMode.MIRROR);
        this.x = new Matrix();
        this.y = new Matrix();
        this.T = 255;
        this.U = 255;
        this.a0 = 1;
        this.b0 = 1;
        this.g0 = new Rect();
        this.h0 = new Rect();
        this.i0 = new Rect();
        this.j0 = new Rect();
        this.l0 = 1.0f;
        this.m0 = new RectF();
        this.y0 = -90.0f;
    }

    public final void a(Canvas canvas) {
        float signum;
        float f;
        float f2 = this.q0;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.rotate(f2, this.E, this.F);
        if (this.s0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = ((this.K - this.M) / 2.0f) * Math.signum(this.q0);
            signum = this.s0;
        } else {
            signum = Math.signum(this.q0);
            f = (this.J - this.L) / 2.0f;
        }
        float f3 = -(f * signum);
        canvas.translate(f3, f3);
    }

    public final String b(ShutterButton.d dVar, TextPaint textPaint, int i) {
        if (dVar.b() == null) {
            return null;
        }
        ShutterButton shutterButton = this.a;
        if (shutterButton.getWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return null;
        }
        SparseArray<String> sparseArray = this.s;
        if (zik0.a(sparseArray, i)) {
            return sparseArray.get(i);
        }
        String obj = TextUtils.ellipsize(dVar.b(), textPaint, ((shutterButton.getWidth() - dVar.i()) - dVar.v().left) - dVar.v().right, TextUtils.TruncateAt.END).toString();
        sparseArray.put(i, obj);
        return obj;
    }

    public final Rect c(int i, TextPaint textPaint, String str) {
        SparseArray<Rect> sparseArray = this.r;
        if (zik0.a(sparseArray, i)) {
            return sparseArray.get(i);
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        sparseArray.put(i, rect);
        return rect;
    }

    public final float d(String str, Rect rect, Rect rect2, Rect rect3, ShutterButton.d dVar) {
        float f;
        float i = dVar.i();
        if (dVar.g()) {
            f = ((this.a.getWidth() - rect2.left) - rect2.right) + rect3.left + rect3.right;
        } else {
            if (str != null) {
                i = rect.width() + rect3.left + rect3.right;
            }
            f = i;
        }
        return (f <= dVar.t() || !this.t0) ? f : dVar.t();
    }

    @SuppressLint({"RtlHardcoded"})
    public final float e(int i, Rect rect, float f) {
        int i2 = this.q0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rect.left - rect.right : 0;
        if (i == 3) {
            return (f / 2.0f) + i2;
        }
        ShutterButton shutterButton = this.a;
        return i != 5 ? i != 17 ? shutterButton.getWidth() / 2.0f : (shutterButton.getWidth() / 2.0f) + i2 : (shutterButton.getWidth() - (f / 2)) + i2;
    }

    public final float f(int i, Rect rect, float f) {
        int height;
        float f2;
        int i2 = this.q0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rect.top - rect.bottom : 0;
        ShutterButton shutterButton = this.a;
        if (i == 17) {
            height = shutterButton.getHeight();
        } else {
            if (i == 48) {
                return (f / 2.0f) + i2;
            }
            if (i == 80) {
                f2 = shutterButton.getHeight() - (f / 2.0f);
                return f2 + i2;
            }
            height = shutterButton.getHeight();
        }
        f2 = height / 2.0f;
        return f2 + i2;
    }
}
