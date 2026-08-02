package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: TimeDurationDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class qto0 extends ik {
    public static final float v = dn70.a() * 22.0f;
    public static final float w = dn70.a() * 12.0f;
    public static final float x = dn70.a() * 12.0f;
    public static final float y = dn70.a() * 25.0f;
    public static final float z = dn70.a() * 7.0f;
    public final int g;
    public final int h;
    public long i;
    public long j;
    public String k;
    public String l;
    public String m;
    public float n;
    public float o;
    public float p;
    public final Paint q;
    public final int r;
    public final int s;
    public final Paint t;
    public final Paint.FontMetrics u;

    public qto0(mwo0 mwo0Var) {
        super(mwo0Var);
        this.g = R.id.time_duration_item;
        this.h = 1;
        this.i = -1L;
        this.j = -1L;
        this.k = "";
        this.l = "";
        this.m = "";
        Paint paint = new Paint(1);
        paint.setColor(this.c.getColor(R.color.vk_white));
        Context context = this.c;
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.j(paint, context, fontFamily, Float.valueOf(14.0f), 8);
        this.q = paint;
        this.r = this.c.getColor(R.color.vk_gray_100);
        this.s = this.c.getColor(R.color.vk_gray_400);
        Paint paint2 = new Paint(1);
        com.vk.typography.b.j(paint2, this.c, fontFamily, Float.valueOf(12.0f), 8);
        this.t = paint2;
        this.u = paint.getFontMetrics();
    }

    @Override // xsna.yc6
    public final void b() {
        RectF rectF = this.d;
        float f = rectF.left;
        float f2 = z;
        rectF.right = f + f2 + this.n + this.o + this.p + f2;
    }

    @Override // xsna.ik
    public final int d() {
        return this.h;
    }

    @Override // xsna.ik
    public final int e() {
        return this.g;
    }

    @Override // xsna.ik
    public final String f() {
        return this.k + this.l + this.m;
    }
}
