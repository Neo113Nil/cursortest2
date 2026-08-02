package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: CircleBorderDrawableWrapper.kt */
/* loaded from: classes17.dex */
public final class occ extends alo {
    public final int b;
    public final Paint c;

    public occ(Drawable drawable, float f, int i, int i2) {
        super(drawable);
        this.b = i2;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.STROKE);
        c.setColor(i);
        c.setStrokeWidth(f);
        this.c = c;
    }

    @Override // xsna.alo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.a;
        float f = 2;
        canvas.drawCircle(drawable.getIntrinsicWidth() / f, drawable.getIntrinsicHeight() / f, (Math.min(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / f) - this.b, this.c);
    }
}
