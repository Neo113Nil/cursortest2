package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class q23 {
    public final m23 a = new m23();
    public final Matrix b = new Matrix();
    public final Paint c;
    public final Rect d;

    public q23() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.c = paint;
        this.d = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, k23 k23Var) {
        float f;
        float f2;
        float f3;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        boolean z = width / height > width2 / height2;
        float f4 = z ? width / width2 : height / height2;
        float f5 = width2 * f4;
        float f6 = height2 * f4;
        if (z) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f = 0.0f;
            f2 = (width / 2) - (((k23Var.c / 2) + k23Var.a) * f4);
            Float valueOf2 = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? valueOf : f2 + f5 < width ? Float.valueOf(width - f5) : null;
            if (valueOf2 != null) {
                f2 = valueOf2.floatValue();
            }
        }
        if (z) {
            float f7 = (height / 2) - (((k23Var.d / 2) + k23Var.b) * f4);
            if (f7 <= f) {
                valueOf = f7 + f6 < height ? Float.valueOf(height - f6) : null;
            }
            f3 = valueOf != null ? valueOf.floatValue() : f7;
        } else {
            f3 = f;
        }
        this.b.setScale(f4, f4);
        this.b.postTranslate(f2, f3);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.b);
        m23 m23Var = this.a;
        Context context = imageView.getContext();
        m23Var.getClass();
        if (((uh1) vh1.a(context, "YadPreferenceFile")).a("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.d;
            int i = k23Var.a;
            int i2 = k23Var.b;
            rect.set(i, i2, k23Var.c + i, k23Var.d + i2);
            canvas.drawRect(rect, this.c);
            imageView.setImageBitmap(copy);
        }
    }
}
