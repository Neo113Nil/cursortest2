package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.ixd;

/* compiled from: AudioEditingDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class wm4 extends yc6 {
    public static final float p = dn70.a() * 2.0f;
    public static final float q = dn70.a() * 9.0f;
    public static final float r = dn70.a() * 10.0f;
    public static final int s = dn70.b(6);
    public final g05 g;
    public final h7i0 h;
    public final Drawable i;
    public final Rect j;
    public final int k;
    public final int l;
    public final Paint m;
    public final Paint n;
    public final float o;

    public wm4(mwo0 mwo0Var, g05 g05Var) {
        super(mwo0Var);
        this.g = g05Var;
        this.h = new h7i0(mwo0Var);
        Context context = this.c;
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        e3m.a aVar = e3m.a;
        this.i = m33.a(R.drawable.vk_icon_music_pin_fill_yellow_28, context);
        this.j = new Rect();
        this.k = this.c.getColor(R.color.vk_white_alpha20);
        this.l = this.c.getColor(R.color.vk_yellow);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(fz4.L);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.m = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.c.getColor(R.color.vk_white));
        com.vk.typography.b.j(paint2, this.c, FontFamily.MEDIUM, Float.valueOf(13.0f), 8);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.n = paint2;
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        this.o = (fontMetrics.bottom - fontMetrics.top) - fontMetrics.descent;
    }

    public final Rect d(b05 b05Var, Rect rect, float f, float f2) {
        Float valueOf = b05Var.h != null ? Float.valueOf(b05Var.i[0]) : null;
        Drawable drawable = this.i;
        if (drawable == null || valueOf == null) {
            rect.setEmpty();
            return rect;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int floatValue = (int) ((valueOf.floatValue() - (intrinsicWidth / 2.0f)) + f);
        rect.left = floatValue;
        int i = (int) (((-intrinsicHeight) - r) + f2);
        rect.top = i;
        rect.right = floatValue + intrinsicWidth;
        rect.bottom = i + intrinsicWidth;
        return rect;
    }
}
