package xsna;

import android.graphics.Paint;
import android.graphics.RectF;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: VoiceoverDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class kcw0 extends yc6 {
    public static final float m = dn70.a() * 4.0f;
    public static final float n = dn70.a() * 10.0f;
    public final RectF g;
    public final RectF h;
    public final RectF i;
    public final Paint j;
    public final Paint k;
    public final float l;

    public kcw0(mwo0 mwo0Var) {
        super(mwo0Var);
        this.g = new RectF();
        this.h = new RectF();
        this.i = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.c.getColor(R.color.vk_black_alpha60));
        this.j = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.c.getColor(R.color.vk_white));
        com.vk.typography.b.j(paint2, this.c, FontFamily.MEDIUM, Float.valueOf(13.0f), 8);
        paint2.setTextAlign(Paint.Align.LEFT);
        this.k = paint2;
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        this.l = fontMetrics.descent - fontMetrics.ascent;
    }
}
