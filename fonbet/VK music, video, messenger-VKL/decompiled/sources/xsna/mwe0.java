package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.ixd;

/* compiled from: RangeDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class mwe0 extends yc6 {
    public static final float q = h7i0.l;
    public static final float r = dn70.a() * 5.0f;
    public static final float s = dn70.a() * 3.0f;
    public static final float t = dn70.a() * 5.0f;
    public static final float u = dn70.a() * 2.0f;
    public static final float v = dn70.a() * 16.0f;
    public final RectF g;
    public final dkk0 h;
    public final Bitmap i;
    public final Bitmap j;
    public final Bitmap k;
    public final Paint l;
    public final Paint m;
    public final h7i0 n;
    public final float o;
    public final int p;

    public mwe0(mwo0 mwo0Var) {
        super(mwo0Var);
        this.g = new RectF();
        this.h = new dkk0(mwo0Var);
        Paint paint = new Paint(1);
        paint.setColor(this.c.getColor(R.color.vk_white));
        com.vk.typography.b.j(paint, this.c, FontFamily.MEDIUM, Float.valueOf(12.0f), 8);
        paint.setTextAlign(Paint.Align.CENTER);
        this.l = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.m = paint2;
        this.n = new h7i0(mwo0Var);
        int color = this.c.getColor(R.color.vk_black_alpha35);
        this.p = Color.alpha(color);
        paint2.setColor(color);
        Context context = this.c;
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        Drawable a = m33.a(R.drawable.vk_icon_deprecated_ic_chevron_16, context);
        Bitmap b = a != null ? xjo.b(a, 0, 0, 7) : null;
        if (b != null) {
            this.i = b;
            this.j = kd7.k(b, 180, false);
        }
        Context context2 = this.c;
        ixd ixdVar2 = ad0.g;
        ixd.b bVar2 = (ixdVar2 != null ? ixdVar2 : null).a;
        VectorDrawable vectorDrawable = (VectorDrawable) m33.a(R.drawable.vk_icon_line_16, context2);
        if (vectorDrawable != null) {
            vectorDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.k = xjo.b(vectorDrawable, 0, 0, 7);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.o = (-(fontMetrics.descent + fontMetrics.ascent)) / 2.0f;
    }
}
