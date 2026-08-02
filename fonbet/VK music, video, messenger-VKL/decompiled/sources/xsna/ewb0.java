package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PopupArrowDrawable.kt */
/* loaded from: classes6.dex */
public final class ewb0 extends Drawable {
    public static final int e = iah0.a(5);
    public static final int f = iah0.a(7);
    public final Paint a;
    public Bitmap b;
    public int c;
    public final Rect d;

    public ewb0(int i) {
        Paint paint = new Paint();
        this.a = paint;
        this.c = 200;
        this.d = new Rect();
        paint.setColor(i);
        paint.setShadowLayer(iah0.a(4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.a(1), 1426063360);
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = this.d;
        copyBounds(rect);
        Bitmap bitmap = this.b;
        int i = f;
        int i2 = e;
        Paint paint = this.a;
        if (bitmap == null || rect.width() != bitmap.getWidth() || rect.height() != bitmap.getHeight()) {
            bitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmap);
            Rect rect2 = new Rect(rect);
            rect2.offsetTo(0, 0);
            rect2.inset(i2, i2);
            rect2.bottom -= i;
            Path path = new Path();
            path.addRect(new RectF(rect2), Path.Direction.CW);
            path.moveTo(this.c - i, rect2.bottom);
            path.lineTo(this.c, rect2.bottom + i);
            path.lineTo(this.c + i, rect2.bottom);
            path.close();
            canvas2.drawPath(path, paint);
            this.b = bitmap;
        }
        Rect rect3 = new Rect(0, 0, rect.width(), i2);
        int i3 = rect.left;
        int i4 = rect.top;
        canvas.drawBitmap(bitmap, rect3, new Rect(i3, i4, rect.right, i4 + i2), paint);
        Rect rect4 = new Rect(0, (rect.height() - i2) - i, rect.width(), rect.height());
        int i5 = rect.left;
        int i6 = rect.bottom;
        canvas.drawBitmap(bitmap, rect4, new Rect(i5, (i6 - i2) - i, rect.right, i6), paint);
        Rect rect5 = new Rect(0, i2, i2, (rect.bottom - i2) - i);
        int i7 = rect.left;
        canvas.drawBitmap(bitmap, rect5, new Rect(i7, rect.top + i2, i7 + i2, (rect.bottom - i2) - i), paint);
        Rect rect6 = new Rect(rect.width() - i2, i2, rect.width(), (rect.bottom - i2) - i);
        int i8 = rect.right;
        canvas.drawBitmap(bitmap, rect6, new Rect(i8 - i2, rect.top + i2, i8, (rect.bottom - i2) - i), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = f;
        int i2 = e;
        rect.set(i2, i2, i2, i + i2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
