package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* loaded from: classes12.dex */
public final class lgr0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final RectF f;
    public final Canvas g;
    public Bitmap h;
    public final Paint i;
    public final Paint j;

    public lgr0(Context context, float f) {
        float r = tje.r(qtg0.map_items_shadow_radius, context);
        int color = context.getColor(xqg0.opaque_20_black);
        float r2 = tje.r(qtg0.map_items_shadow_offset_x, context);
        float r3 = tje.r(qtg0.map_items_shadow_offset_y, context);
        this.a = f;
        this.b = r;
        this.c = r2;
        this.d = r3;
        this.e = 2.0f * r;
        this.f = new RectF();
        this.g = new Canvas();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(color);
        paint.setMaskFilter(new BlurMaskFilter(r, BlurMaskFilter.Blur.NORMAL));
        this.i = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStyle(style);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.j = paint2;
    }
}
