package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import ru.yandex.taxi.plus.badge.BadgeContainer;

/* loaded from: classes6.dex */
public final class hk4 {
    public final BadgeContainer a;
    public int c;
    public final int d;
    public int e;
    public float g;
    public float h;
    public RectF i;
    public xyt j;
    public final Paint b = new Paint();
    public boolean f = true;
    public final g191 k = new g191(this);

    public hk4(Context context, BadgeContainer badgeContainer) {
        this.a = badgeContainer;
        this.d = context.getColor(tqg0.cashback_small_shadow_color);
        this.g = context.getResources().getDimension(hsg0.cashback_oval_corner_radius);
        this.h = context.getResources().getDimension(gsg0.cashback_gradient_shadow_radius);
    }

    public final xyt a() {
        boolean z = this.f;
        RectF rectF = this.i;
        return new xyt(this.b, this.k, true, z, rectF != null ? (int) rectF.bottom : this.e, (int) this.g, this.h, this.c, this.d);
    }
}
