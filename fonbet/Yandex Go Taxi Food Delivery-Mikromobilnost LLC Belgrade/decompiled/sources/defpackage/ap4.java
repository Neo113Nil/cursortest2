package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;

/* loaded from: classes5.dex */
public final class ap4 extends n430 {
    public final float h;
    public final Paint i;

    public ap4(Context context, float f, float f2) {
        super(context, f, f2);
        this.h = a(50.0f);
        Typeface typeface = xub1.b;
        typeface = typeface == null ? wuj0.b(e5h0.ya_bold, context) : typeface;
        xub1.b = typeface;
        int i = mqg0.black;
        float a = a(24.0f);
        Paint paint = new Paint(1);
        paint.setColor(context.getResources().getColor(i));
        if (a != 0.0f) {
            paint.setTextSize(a);
        }
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(typeface);
        this.i = paint;
    }

    public final uo4 b(float f, float f2, float f3, float f4, int i) {
        String string = this.a.getResources().getString(i);
        float a = this.d - a(f3);
        float a2 = this.e - a(f4);
        kce0 kce0Var = new kce0(a, a2);
        Rect rect = new Rect();
        int length = string.length();
        Paint paint = this.i;
        paint.getTextBounds(string, 0, length, rect);
        return new uo4(string, paint, new RectF(-(a(f2) + a(f) + rect.width()), a2, 0.0f, this.h + a2), this.f, this.g, kce0Var);
    }
}
