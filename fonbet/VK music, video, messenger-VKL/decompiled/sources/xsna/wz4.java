package xsna;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;

/* compiled from: AudioVisualizerDrawable.java */
/* loaded from: classes14.dex */
public final class wz4 extends Drawable {
    public final boolean a;
    public final Paint b;
    public boolean i;
    public final float m;
    public final float[] c = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public final float[] d = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public final TimeInterpolator[] e = {null, null, null};
    public final DecelerateInterpolator f = new DecelerateInterpolator();
    public final AccelerateInterpolator g = new AccelerateInterpolator();
    public long h = 0;
    public boolean j = false;
    public final Random k = new Random();
    public final Rect l = new Rect();

    public wz4(Context context) {
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-11435592);
        this.a = !qq2.d(context);
        this.m = context.getResources().getDisplayMetrics().density;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Paint paint = this.b;
        if (paint.getAlpha() == 0) {
            return;
        }
        Rect rect = this.l;
        if (rect.isEmpty()) {
            rect = getBounds();
        }
        int height = rect.height();
        canvas.translate(r7.left, r7.top);
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        TimeInterpolator[] timeInterpolatorArr = this.e;
        float[] fArr = this.d;
        float[] fArr2 = this.c;
        if (currentTimeMillis > 150) {
            this.h = System.currentTimeMillis();
            for (int i = 0; i < 3; i++) {
                fArr2[i] = fArr[i];
                boolean z = this.j;
                Random random = this.k;
                if (z) {
                    if (fArr[i] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fArr[i] = (float) (Math.cbrt(random.nextInt(1000000)) / 100.0d);
                    }
                } else if (this.i) {
                    fArr[i] = (float) (Math.cbrt(random.nextInt(1000000)) / 100.0d);
                } else {
                    fArr[i] = 0.0f;
                }
                timeInterpolatorArr[i] = fArr[i] > fArr2[i] ? this.g : this.f;
            }
        }
        float currentTimeMillis2 = (System.currentTimeMillis() - this.h) / 150.0f;
        float width = r7.width() / 4.0f;
        float width2 = r7.width() / 8.0f;
        float f = 0.0f;
        int i2 = 0;
        for (int i3 = 3; i2 < i3; i3 = 3) {
            float f2 = fArr2[i2];
            float f3 = f + f2;
            float f4 = height;
            int max = Math.max((int) this.m, Math.round(((timeInterpolatorArr[i2].getInterpolation(currentTimeMillis2) * (fArr[i2] - f2)) + f2) * f4));
            float f5 = (width + width2) * i2;
            canvas.drawRect(f5, height - max, f5 + width, f4, paint);
            i2++;
            f = f3;
        }
        canvas.translate(-r7.left, -r7.top);
        if ((f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.i) && this.a) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        this.i = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            int i2 = iArr[i];
            boolean z2 = this.i;
            if (i2 != 16842913) {
                z = false;
            }
            this.i = z | z2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
