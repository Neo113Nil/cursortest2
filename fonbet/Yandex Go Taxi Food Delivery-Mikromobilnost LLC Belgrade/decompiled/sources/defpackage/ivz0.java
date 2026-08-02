package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import ru.yandex.taxi.widget.TooltipPointerDrawer$Direction;
import ru.yandex.taxi.widget.TooltipPointerDrawer$PointerGravity;

/* loaded from: classes10.dex */
public final class ivz0 {
    public static final TooltipPointerDrawer$PointerGravity l = TooltipPointerDrawer$PointerGravity.UNSPECIFIED;
    public final Drawable a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public TooltipPointerDrawer$PointerGravity j = l;
    public TooltipPointerDrawer$Direction k = TooltipPointerDrawer$Direction.NONE;

    public ivz0(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
    }

    public final void a() {
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction = this.k;
        tooltipPointerDrawer$Direction.getClass();
        if (tooltipPointerDrawer$Direction == TooltipPointerDrawer$Direction.NONE) {
            this.f = 0;
            this.e = 0;
            this.g = 0;
            this.h = 0;
            return;
        }
        Drawable drawable = this.a;
        this.c = drawable.getIntrinsicWidth();
        this.d = drawable.getIntrinsicHeight();
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction2 = this.k;
        tooltipPointerDrawer$Direction2.getClass();
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction3 = TooltipPointerDrawer$Direction.UP;
        this.f = (tooltipPointerDrawer$Direction2 == tooltipPointerDrawer$Direction3 || tooltipPointerDrawer$Direction2 == TooltipPointerDrawer$Direction.DOWN) ? this.c : this.d;
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction4 = this.k;
        tooltipPointerDrawer$Direction4.getClass();
        int i = (tooltipPointerDrawer$Direction4 == tooltipPointerDrawer$Direction3 || tooltipPointerDrawer$Direction4 == TooltipPointerDrawer$Direction.DOWN) ? this.d : this.c;
        this.e = i;
        this.g = this.f / 2;
        this.h = i / 2;
    }
}
