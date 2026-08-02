package xsna;

import android.graphics.Paint;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: RuleDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class org0 extends yc6 {
    public static final float k = dn70.a() * 14.0f;
    public static final float l = dn70.a() * 8.0f;
    public static final float m = dn70.a() * 24.0f;
    public static final float n = dn70.a() * 57.0f;
    public final Paint g;
    public final Paint h;
    public final float i;
    public float[] j;

    public org0(mwo0 mwo0Var) {
        super(mwo0Var);
        Paint paint = new Paint(1);
        paint.setColor(this.c.getColor(R.color.vk_gray_400));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dn70.a() * 2.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.g = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.c.getColor(R.color.vk_gray_400));
        com.vk.typography.b.j(paint2, this.c, FontFamily.REGULAR, Float.valueOf(11.0f), 8);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.h = paint2;
        this.j = new float[40];
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        this.i = ((k - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
    }
}
