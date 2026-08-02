package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: MsgFwdLinesDrawable.java */
/* loaded from: classes2.dex */
public final class aj30 extends Drawable {
    public final Paint a;
    public final RectF b;
    public int c;
    public int d;
    public int e;

    public aj30() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.b = new RectF();
        this.c = 0;
        this.d = 4;
        this.e = 4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.bottom;
        for (int i4 = 0; i4 < this.c; i4++) {
            RectF rectF = this.b;
            rectF.set(i, i2, this.d + i, i3);
            i += this.d + this.e;
            canvas.drawRect(rectF, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.d;
        int i2 = this.c;
        return (Math.max(0, i2 - 1) * this.e) + (i * i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
