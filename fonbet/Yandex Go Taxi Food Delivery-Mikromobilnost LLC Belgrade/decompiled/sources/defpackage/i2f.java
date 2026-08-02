package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes12.dex */
public final class i2f extends r8 {
    public final xm00 c;
    public n3e0 w;
    public final int x;
    public int y;
    public boolean z;

    public i2f(Context context, ah00 ah00Var, xm00 xm00Var) {
        super(5, ah00Var);
        this.c = xm00Var.p();
        int color = context.getColor(xqg0.grey_500_30_opacity);
        this.x = color;
        this.y = color;
    }

    public final void Hg(float f) {
        int i = (((int) ((r0 >>> 24) * f)) << 24) | (this.x & 16777215);
        this.y = i;
        n3e0 n3e0Var = this.w;
        if (n3e0Var == null) {
            Ig();
        } else if (n3e0Var != null) {
            n3e0Var.r(i);
        }
    }

    public final void Ig() {
        xm00 xm00Var = this.c;
        xm00Var.m();
        Polygon j = k.j(scc.g(new Point(89.2d, -180.0d), new Point(89.2d, 180.0d), new Point(-89.2d, 180.0d), new Point(-89.2d, -180.0d)), EmptyList.a);
        if (j == null) {
            return;
        }
        n3e0 n3e0Var = new n3e0(j);
        n3e0Var.b(xm00Var);
        n3e0Var.r(this.y);
        n3e0Var.p(0.0f);
        this.w = n3e0Var;
    }

    public final void setVisible(boolean z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        if (z) {
            Ig();
        } else {
            this.c.m();
        }
    }
}
