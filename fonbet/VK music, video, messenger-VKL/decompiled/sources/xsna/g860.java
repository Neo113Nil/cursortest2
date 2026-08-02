package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: NewPosterColorAdapter.kt */
/* loaded from: classes4.dex */
public final class g860 extends View {
    public static final float f = iah0.a(1);
    public static final float g = iah0.a(5);
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public boolean e;

    public g860(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint3.setStyle(style);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(637534208);
        paint2.setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        canvas.drawCircle(measuredHeight, measuredHeight, measuredHeight, this.b);
        canvas.drawCircle(measuredHeight, measuredHeight, measuredHeight - (f / 2), this.c);
        if (this.e) {
            canvas.drawCircle(measuredHeight, measuredHeight, g, this.d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size);
    }
}
