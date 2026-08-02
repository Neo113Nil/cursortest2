package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public final class k081 {
    public final Matrix a = new Matrix();
    public final Paint b;
    public final Rect c;

    public k081() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.b = paint;
        this.c = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, vh71 vh71Var) {
        float f;
        float f2;
        float f3;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float valueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
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
            f2 = (width / 2.0f) - (((vh71Var.c / 2) + vh71Var.a) * f4);
            Float valueOf2 = f2 > 0.0f ? valueOf : f2 + f5 < width ? Float.valueOf(width - f5) : null;
            if (valueOf2 != null) {
                f2 = valueOf2.floatValue();
            }
        }
        if (z) {
            float f7 = (height / 2.0f) - (((vh71Var.d / 2) + vh71Var.b) * f4);
            if (f7 <= f) {
                valueOf = f7 + f6 < height ? Float.valueOf(height - f6) : null;
            }
            f3 = valueOf != null ? valueOf.floatValue() : f7;
        } else {
            f3 = f;
        }
        Matrix matrix = this.a;
        matrix.setScale(f4, f4);
        matrix.postTranslate(f2, f3);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(matrix);
        if (s881.a(imageView.getContext(), "YadPreferenceFile").a("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            int i = vh71Var.a;
            int i2 = vh71Var.b;
            int i3 = vh71Var.c + i;
            int i4 = vh71Var.d + i2;
            Rect rect = this.c;
            rect.set(i, i2, i3, i4);
            canvas.drawRect(rect, this.b);
            imageView.setImageBitmap(copy);
        }
    }
}
