package xsna;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;

/* compiled from: PosterParallaxImageLayer.kt */
/* loaded from: classes4.dex */
public final class pac0 {
    public final bac0 a;
    public final float b;
    public final Matrix c = new Matrix();
    public final Matrix d = new Matrix();
    public final Paint e;
    public final Paint f;
    public final jwx g;
    public Bitmap h;
    public Bitmap i;
    public Bitmap j;
    public io.reactivex.rxjava3.disposables.c k;
    public io.reactivex.rxjava3.disposables.c l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public float r;
    public float s;

    public pac0(bac0 bac0Var, float f) {
        this.a = bac0Var;
        this.b = f;
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
        this.f = paint2;
        this.g = new jwx(2, 1);
    }

    public final void a(Canvas canvas) {
        Bitmap bitmap;
        canvas.save();
        float f = this.b;
        canvas.scale(f, f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        boolean z = this.q;
        Matrix matrix = this.d;
        if (z && (bitmap = this.j) != null) {
            canvas.drawBitmap(bitmap, matrix, this.f);
        }
        Bitmap bitmap2 = this.h;
        if (bitmap2 == null) {
            bitmap2 = this.i;
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, matrix, this.e);
        }
        canvas.restore();
    }

    public final void b() {
        Bitmap bitmap = this.h;
        if (bitmap == null) {
            bitmap = this.i;
        }
        if (bitmap == null || this.o == 0) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        float max = Math.max(this.o / bitmap.getWidth(), this.p / bitmap.getHeight());
        matrix.setScale(max, max);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.postTranslate(this.r, this.s);
        float f = this.o;
        float f2 = this.b - 1.0f;
        this.m = (int) (((f * f2) / 2.0f) * 0.8f);
        this.n = (int) (((f2 * this.p) / 2.0f) * 0.8f);
        if (this.e.getAlpha() != 0 || this.h == null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ys5(this, 4));
        ofInt.addListener(new nac0(this));
        ofInt.start();
    }

    public final void c(Image image, boolean z) {
        Bitmap k;
        ImageSize imageSize;
        io.reactivex.rxjava3.disposables.c subscribe;
        Bitmap k2;
        bac0 bac0Var = this.a;
        io.reactivex.rxjava3.disposables.c cVar = null;
        if (image != null) {
            ArrayList arrayList = image.b;
            if (!arrayList.isEmpty()) {
                int i = 1;
                if (this.q) {
                    Bitmap bitmap = this.h;
                    if (bitmap == null) {
                        bitmap = this.i;
                    }
                    this.j = bitmap;
                    this.e.setAlpha(0);
                    this.f.setAlpha(255);
                    Bitmap bitmap2 = this.h;
                    if (bitmap2 == null) {
                        bitmap2 = this.i;
                    }
                    if (bitmap2 != null) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
                        ofInt.setDuration(300L);
                        ofInt.addUpdateListener(new lrb0(this, 1));
                        ofInt.start();
                    }
                }
                if (z && (imageSize = (ImageSize) ixj0.m(arrayList)) != null) {
                    com.vk.dto.common.im.Image image2 = imageSize.d;
                    io.reactivex.rxjava3.disposables.c cVar2 = this.l;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    this.i = null;
                    String str = image2.d;
                    String str2 = image2.d;
                    if (!mcr0.p(str) || (k2 = mcr0.k(str2)) == null) {
                        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = mcr0.i(Uri.parse(str2), 0, 0, 0, null, this.g).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                        lac0 lac0Var = new lac0(this);
                        int i2 = kwg0.a;
                        subscribe = a0.subscribe(lac0Var, new iwg0());
                    } else {
                        this.i = k2;
                        b();
                        bac0Var.invalidate();
                        subscribe = null;
                    }
                    this.l = subscribe;
                }
                ImageSize Cb = image.Cb(iah0.f().widthPixels, true, true);
                if (Cb != null) {
                    com.vk.dto.common.im.Image image3 = Cb.d;
                    io.reactivex.rxjava3.disposables.c cVar3 = this.k;
                    if (cVar3 != null) {
                        cVar3.dispose();
                    }
                    this.h = null;
                    String str3 = image3.d;
                    String str4 = image3.d;
                    if (!mcr0.p(str3) || (k = mcr0.k(str4)) == null) {
                        io.reactivex.rxjava3.internal.operators.observable.m1 a02 = mcr0.h(Uri.parse(str4)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                        eyp eypVar = new eyp(this, i);
                        int i3 = kwg0.a;
                        cVar = a02.subscribe(eypVar, new iwg0());
                    } else {
                        io.reactivex.rxjava3.disposables.c cVar4 = this.l;
                        if (cVar4 != null) {
                            cVar4.dispose();
                        }
                        this.h = k;
                        b();
                        bac0Var.invalidate();
                    }
                    this.k = cVar;
                    return;
                }
                return;
            }
        }
        this.h = null;
        this.i = null;
        bac0Var.invalidate();
    }

    public final void d(float f, float f2) {
        Bitmap bitmap = this.h;
        if (bitmap == null) {
            bitmap = this.i;
        }
        if (bitmap == null) {
            return;
        }
        this.r = f * this.m;
        this.s = f2 * this.n;
        Matrix matrix = this.c;
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.postTranslate(this.r, this.s);
    }
}
