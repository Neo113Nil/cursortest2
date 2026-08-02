package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LegoFadeOverlay.kt */
/* loaded from: classes17.dex */
public final class u1z {
    public static final float[] a = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f, 0.5f, 0.7f, 1.0f};
    public static final float[] b = {0.12f, 0.32f, 0.6f, 0.8f, 1.0f};

    /* compiled from: LegoFadeOverlay.kt */
    public static final class a extends Drawable {
        public final int[] a;
        public final float[] b;
        public final Paint c = new Paint();
        public int d = -1;

        public a(int[] iArr, float[] fArr) {
            this.a = iArr;
            this.b = fArr;
        }

        public final void a() {
            int i = this.d;
            float f = 1.0f;
            if (i >= 0) {
                float f2 = i;
                if (f2 >= 1.0f) {
                    f = f2;
                }
            } else if (getBounds().height() > 0) {
                f = getBounds().height() / 2.0f;
            }
            this.c.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.a, this.b, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.d <= 0) {
                return;
            }
            Rect bounds = getBounds();
            canvas.drawRect(bounds.left, bounds.top, bounds.right, this.d + 2, this.c);
        }

        @Override // android.graphics.drawable.Drawable
        @ozl
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            a();
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            this.c.setAlpha(i);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.c.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }
}
