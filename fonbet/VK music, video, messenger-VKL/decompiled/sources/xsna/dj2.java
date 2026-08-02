package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimatedDrawableBackendImpl.java */
/* loaded from: classes12.dex */
public final class dj2 implements bj2 {
    public final hj2 a;
    public final wk2 b;
    public final pk2 c;
    public final Rect d;
    public final int[] e;
    public final int f;
    public final AnimatedDrawableFrameInfo[] g;
    public final Rect h = new Rect();
    public final Rect i = new Rect();
    public final boolean j;
    public final Paint k;
    public Bitmap l;

    public dj2(hj2 hj2Var, wk2 wk2Var, Rect rect, boolean z) {
        this.a = hj2Var;
        this.b = wk2Var;
        pk2 pk2Var = wk2Var.a;
        this.c = pk2Var;
        int[] w = pk2Var.w();
        this.e = w;
        hj2Var.getClass();
        int length = w.length;
        for (int i = 0; i < length; i++) {
            if (w[i] < 11) {
                w[i] = 100;
            }
        }
        hj2 hj2Var2 = this.a;
        int[] iArr = this.e;
        hj2Var2.getClass();
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        this.f = i2;
        hj2 hj2Var3 = this.a;
        int[] iArr2 = this.e;
        hj2Var3.getClass();
        int[] iArr3 = new int[iArr2.length];
        int length2 = iArr2.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            iArr3[i5] = i4;
            i4 += iArr2[i5];
        }
        this.d = a(this.c, rect);
        this.j = z;
        this.g = new AnimatedDrawableFrameInfo[this.c.getFrameCount()];
        for (int i6 = 0; i6 < this.c.getFrameCount(); i6++) {
            this.g[i6] = this.c.y(i6);
        }
        Paint paint = new Paint();
        this.k = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect a(pk2 pk2Var, Rect rect) {
        return rect == null ? new Rect(0, 0, pk2Var.getWidth(), pk2Var.getHeight()) : new Rect(0, 0, Math.min(rect.width(), pk2Var.getWidth()), Math.min(rect.height(), pk2Var.getHeight()));
    }

    public final void b(Canvas canvas, float f, float f2, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.f == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            int ceil = (int) Math.ceil(animatedDrawableFrameInfo.c * f);
            int ceil2 = (int) Math.ceil(animatedDrawableFrameInfo.d * f2);
            int ceil3 = (int) Math.ceil(animatedDrawableFrameInfo.a * f);
            int ceil4 = (int) Math.ceil(animatedDrawableFrameInfo.b * f2);
            canvas.drawRect(new Rect(ceil3, ceil4, ceil + ceil3, ceil2 + ceil4), this.k);
        }
    }

    public final synchronized Bitmap c(int i, int i2) {
        try {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                if (bitmap.getWidth() >= i) {
                    if (this.l.getHeight() < i2) {
                    }
                }
                synchronized (this) {
                    Bitmap bitmap2 = this.l;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.l = null;
                    }
                }
            }
            if (this.l == null) {
                this.l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            this.l.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public final void d(Canvas canvas, int i) {
        pk2 pk2Var = this.c;
        vk2 v = pk2Var.v(i);
        try {
            if (v.getWidth() > 0 && v.getHeight() > 0) {
                if (pk2Var.x()) {
                    f(canvas, v);
                } else {
                    e(canvas, v);
                }
                v.dispose();
            }
        } finally {
            v.dispose();
        }
    }

    public final void e(Canvas canvas, vk2 vk2Var) {
        int width;
        int height;
        int b;
        int c;
        if (this.j) {
            float max = Math.max(vk2Var.getWidth() / Math.min(vk2Var.getWidth(), canvas.getWidth()), vk2Var.getHeight() / Math.min(vk2Var.getHeight(), canvas.getHeight()));
            width = (int) (vk2Var.getWidth() / max);
            height = (int) (vk2Var.getHeight() / max);
            b = (int) (vk2Var.b() / max);
            c = (int) (vk2Var.c() / max);
        } else {
            width = vk2Var.getWidth();
            height = vk2Var.getHeight();
            b = vk2Var.b();
            c = vk2Var.c();
        }
        synchronized (this) {
            Bitmap c2 = c(width, height);
            this.l = c2;
            vk2Var.a(width, height, c2);
            canvas.save();
            canvas.translate(b, c);
            canvas.drawBitmap(this.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, vk2 vk2Var) {
        double width = this.d.width() / this.c.getWidth();
        double height = this.d.height() / this.c.getHeight();
        int round = (int) Math.round(vk2Var.getWidth() * width);
        int round2 = (int) Math.round(vk2Var.getHeight() * height);
        int b = (int) (vk2Var.b() * width);
        int c = (int) (vk2Var.c() * height);
        synchronized (this) {
            try {
                int width2 = this.d.width();
                int height2 = this.d.height();
                c(width2, height2);
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    vk2Var.a(round, round2, bitmap);
                }
                this.h.set(0, 0, width2, height2);
                this.i.set(b, c, width2 + b, height2 + c);
                Bitmap bitmap2 = this.l;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.h, this.i, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Canvas canvas, vk2 vk2Var, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        Rect rect = this.d;
        if (rect == null || rect.width() <= 0 || this.d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.d.width();
        if (animatedDrawableFrameInfo2 != null) {
            b(canvas, width, width, animatedDrawableFrameInfo2);
        }
        int width2 = vk2Var.getWidth();
        int height = vk2Var.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i = (int) (width2 * width);
        int i2 = (int) (height * width);
        int b = (int) (vk2Var.b() * width);
        int c = (int) (vk2Var.c() * width);
        Rect rect3 = new Rect(b, c, i + b, i2 + c);
        if (animatedDrawableFrameInfo.e == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect3, this.k);
        }
        synchronized (this) {
            Bitmap c2 = c(width2, height);
            vk2Var.a(width2, height, c2);
            canvas.drawBitmap(c2, rect2, rect3, (Paint) null);
        }
    }

    public final void h(Canvas canvas, vk2 vk2Var, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        float f5 = width;
        float f6 = height;
        int width2 = vk2Var.getWidth();
        int height2 = vk2Var.getHeight();
        int b = vk2Var.b();
        int c = vk2Var.c();
        if (f5 > canvas.getWidth() || f6 > canvas.getHeight()) {
            int min = Math.min(canvas.getWidth(), width);
            int min2 = Math.min(canvas.getHeight(), height);
            float f7 = f5 / f6;
            if (min > min2) {
                f2 = min;
                f = f2 / f7;
            } else {
                f = min2;
                f2 = f * f7;
            }
            f3 = f2 / f5;
            f4 = f / f6;
            width2 = (int) Math.ceil(vk2Var.getWidth() * f3);
            height2 = (int) Math.ceil(vk2Var.getHeight() * f4);
            b = (int) Math.ceil(vk2Var.b() * f3);
            c = (int) Math.ceil(vk2Var.c() * f4);
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(b, c, b + width2, c + height2);
        if (animatedDrawableFrameInfo2 != null) {
            b(canvas, f3, f4, animatedDrawableFrameInfo2);
        }
        if (animatedDrawableFrameInfo.e == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect2, this.k);
        }
        synchronized (this) {
            Bitmap c2 = c(width2, height2);
            vk2Var.a(width2, height2, c2);
            canvas.drawBitmap(c2, rect, rect2, (Paint) null);
        }
    }
}
