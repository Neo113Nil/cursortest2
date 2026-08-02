package xsna;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: PosterParallaxImageLayer.kt */
/* loaded from: classes15.dex */
public final class kac0 {
    public final cac0 a;
    public final float b;
    public final Matrix c = new Matrix();
    public final Matrix d = new Matrix();
    public final Paint e;
    public Bitmap f;
    public Bitmap g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public int j;
    public int k;

    /* compiled from: PosterParallaxImageLayer.kt */
    public static final class a implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public kac0(cac0 cac0Var, float f) {
        this.a = cac0Var;
        this.b = f;
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.e = paint;
        new jwx(2, 1);
    }

    public final void a(Canvas canvas) {
        canvas.save();
        float f = this.b;
        canvas.scale(f, f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            bitmap = this.g;
        }
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.d, this.e);
        }
        canvas.restore();
    }

    public final void b() {
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            bitmap = this.g;
        }
        if (bitmap == null || this.j == 0) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        float max = Math.max(this.j / bitmap.getWidth(), this.k / bitmap.getHeight());
        matrix.setScale(max, max);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.e.getAlpha() != 0 || this.f == null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new l7d(this, 2));
        ofInt.addListener(new oac0(this));
        ofInt.start();
    }

    public final void c(Image image) {
        Bitmap k;
        cac0 cac0Var = this.a;
        io.reactivex.rxjava3.disposables.c cVar = null;
        if (image == null || image.b.isEmpty()) {
            this.f = null;
            this.g = null;
            cac0Var.invalidate();
            return;
        }
        ImageSize Cb = image.Cb(iah0.f().widthPixels, true, true);
        if (Cb != null) {
            com.vk.dto.common.im.Image image2 = Cb.d;
            io.reactivex.rxjava3.disposables.c cVar2 = this.h;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.f = null;
            String str = image2.d;
            String str2 = image2.d;
            if (!mcr0.p(str) || (k = mcr0.k(str2)) == null) {
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = mcr0.h(Uri.parse(str2)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                a aVar = new a(new mac0(this));
                int i = kwg0.a;
                cVar = a0.subscribe(aVar, new iwg0());
            } else {
                io.reactivex.rxjava3.disposables.c cVar3 = this.i;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                this.f = k;
                b();
                cac0Var.invalidate();
            }
            this.h = cVar;
        }
    }
}
