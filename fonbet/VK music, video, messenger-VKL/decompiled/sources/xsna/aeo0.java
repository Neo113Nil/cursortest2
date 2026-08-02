package xsna;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* compiled from: TextDrawable.java */
/* loaded from: classes17.dex */
public final class aeo0 extends Drawable {
    public final Paint a;
    public final CharSequence b;
    public final int c;
    public final int d;

    public aeo0(Resources resources, String str, int i, float f, int i2) {
        this.b = str;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(i2);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setFakeBoldText(true);
        paint.setTextSize(TypedValue.applyDimension(2, f, resources.getDisplayMetrics()));
        this.c = (i * 2) + ((int) (paint.measureText((CharSequence) str, 0, str.length()) + 0.5d));
        this.d = paint.getFontMetricsInt(null) + i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        String charSequence = this.b.toString();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        canvas.drawText(charSequence, centerX, (int) ((Math.abs(r3.ascent()) * 0.45f) + centerY), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
