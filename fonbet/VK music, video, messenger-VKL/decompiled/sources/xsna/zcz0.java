package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zcz0 extends FrameLayout {
    public final Paint b;

    public zcz0(Context context) {
        super(context);
        Paint paint = new Paint();
        this.b = paint;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        setWillNotDraw(false);
        paint.setColor(1711276032);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        ImageView imageView = new ImageView(context);
        int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, displayMetrics);
        Bitmap createBitmap = Bitmap.createBitmap(applyDimension, applyDimension, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Path d = rq90.d("M 0.263 0.264 C 0.615 -0.088 1.185 -0.088 1.536 0.264 L 7 5.727 L 12.463 0.264 C 12.815 -0.088 13.385 -0.088 13.736 0.264 C 14.088 0.615 14.088 1.185 13.736 1.536 L 8.272 7 L 13.736 12.464 C 14.088 12.815 14.088 13.385 13.736 13.736 C 13.385 14.088 12.815 14.088 12.463 13.736 L 7 8.273 L 1.536 13.736 C 1.185 14.088 0.615 14.088 0.263 13.736 C -0.088 13.385 -0.088 12.815 0.263 12.464 L 5.727 7 L 0.263 1.536 C -0.088 1.185 -0.088 0.615 0.263 0.264 Z");
        RectF rectF = new RectF();
        d.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = applyDimension;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        d.transform(matrix);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        canvas.drawPath(d, paint2);
        imageView.setImageBitmap(createBitmap);
        int applyDimension2 = (int) TypedValue.applyDimension(1, 36.0f, displayMetrics);
        int applyDimension3 = (int) TypedValue.applyDimension(1, 24.0f, displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(applyDimension3, applyDimension3);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        setLayoutParams(new FrameLayout.LayoutParams(applyDimension2, applyDimension2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, this.b);
        super.onDraw(canvas);
    }
}
