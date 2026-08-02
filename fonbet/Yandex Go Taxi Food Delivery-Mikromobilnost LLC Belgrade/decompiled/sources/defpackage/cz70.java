package defpackage;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes6.dex */
public final class cz70 {
    public final y3u0 a;
    public final h080 b;
    public final ow70 c;

    public cz70(y3u0 y3u0Var, h080 h080Var, ow70 ow70Var) {
        this.a = y3u0Var;
        this.b = h080Var;
        this.c = ow70Var;
    }

    public final ScreenRect a(int i, int i2, int i3) {
        if (this.c.a() == null) {
            return null;
        }
        h080 h080Var = this.b;
        if (i3 <= 0) {
            i3 = h080Var.b;
        }
        int i4 = h080Var.d;
        if (this.a.a()) {
            int i5 = h080Var.a;
            i3 += i5;
            i4 -= i5;
        }
        return new ScreenRect(new ScreenPoint(i2, i3), new ScreenPoint(r0.getWidth() - i2, Math.max(i3 + h080Var.m, i - i4)));
    }
}
