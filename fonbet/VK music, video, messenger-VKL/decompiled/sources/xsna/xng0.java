package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;

/* compiled from: IndeterminateProgressBarWithLogoView.kt */
/* loaded from: classes.dex */
public class xng0 extends ColorDrawable {
    public final Paint a;
    public final RectF b;

    public xng0(int i) {
        super(i);
        Paint paint = new Paint();
        paint.setColor(i);
        this.a = paint;
        this.b = new RectF();
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        float height = getBounds().height();
        canvas.drawRoundRect(rectF, height, height, this.a);
    }
}
