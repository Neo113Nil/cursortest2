package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import xsna.gg90;

/* compiled from: CircleColorDrawable.java */
@Deprecated
/* loaded from: classes17.dex */
public final class pcc extends ColorDrawable {
    public float a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public Drawable e;

    public pcc(int i) {
        super(i);
        this.a = iah0.a(0.5f);
        gg90.a a = gg90.a();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = a.a;
        paint.setStyle(style);
        paint.setStrokeWidth(this.a);
        paint.setColor(805306368);
        this.b = paint;
        gg90.a a2 = gg90.a();
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = a2.a;
        paint2.setStyle(style2);
        paint2.setColor(0);
        this.c = paint2;
        gg90.a a3 = gg90.a();
        int max = Math.max(8, 16);
        Paint paint3 = gg90.a().a;
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int round = Math.round(max / 2.0f);
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                if ((i2 + i3) % 2 == 0) {
                    paint3.setColor(-1);
                } else {
                    paint3.setColor(-3092272);
                }
                canvas.drawRect(i2 * round, i3 * round, (i2 + 1) * round, r12 * round, paint3);
            }
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        a3.a.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.d = true;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = canvas.getWidth() / 2.0f;
        float f = this.a;
        Paint paint = this.b;
        paint.setStrokeWidth(f);
        int color = getColor();
        Paint paint2 = this.c;
        paint2.setColor(color);
        float f2 = width - 0;
        canvas.drawCircle(width, width, f2, paint2);
        if (this.d) {
            canvas.drawCircle(width, width, f2 - (this.a / 2.0f), paint);
        }
        if (this.e != null) {
            int height = (canvas.getHeight() - this.e.getIntrinsicHeight()) >> 1;
            int width2 = (canvas.getWidth() - this.e.getIntrinsicWidth()) >> 1;
            Drawable drawable = this.e;
            drawable.setBounds(width2, height, drawable.getIntrinsicWidth() + width2, this.e.getIntrinsicHeight() + height);
            this.e.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.ColorDrawable
    public final void setColor(int i) {
        super.setColor(i);
        invalidateSelf();
    }
}
