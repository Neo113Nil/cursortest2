package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes14.dex */
public final class n58 {
    public f4c0 a;
    public final uz8 b;
    public final xm00 c;
    public final pb30 d;
    public final ArrayList e = new ArrayList();
    public float f;
    public w4e0 g;

    public n58(f4c0 f4c0Var, uz8 uz8Var, pb30 pb30Var, xm00 xm00Var) {
        this.a = f4c0Var;
        this.b = uz8Var;
        this.c = xm00Var;
        this.d = pb30Var;
        new IconStyle().setRotationType(RotationType.ROTATE);
        a(this.d);
    }

    public final void a(pb30 pb30Var) {
        String str = pb30Var.a;
        pb30 pb30Var2 = this.d;
        boolean l = jl40.l(str, pb30Var2.a);
        boolean l2 = jl40.l(pb30Var.y, pb30Var2.y);
        if (!l || !l2) {
            d(pb30Var);
        }
        f4c0 f4c0Var = this.a;
        if (f4c0Var != null) {
            Point point = pb30Var.x;
            if (!pb30Var.b || !pb30Var.c || point == null) {
                f4c0Var.j(false, new Animation(Animation.Type.SMOOTH, 0.3f), null);
                return;
            }
            f4c0Var.o(point);
            f4c0Var.v(pb30Var.w);
            f4c0Var.j(true, new Animation(Animation.Type.SMOOTH, 0.3f), null);
        }
    }

    public final void b() {
        f4c0 f4c0Var = this.a;
        if (f4c0Var != null) {
            f4c0Var.j(false, new Animation(Animation.Type.SMOOTH, 0.3f), new a75(f4c0Var, 1));
            this.a = null;
        }
        xm00 xm00Var = this.c;
        ArrayList arrayList = this.e;
        a.B(xm00Var, arrayList);
        arrayList.clear();
        w4e0 w4e0Var = this.g;
        if (w4e0Var != null) {
            xm00Var.o(w4e0Var);
            this.g = null;
        }
    }

    public final void c(float f) {
        if (f == this.f) {
            return;
        }
        this.f = f;
        d(this.d);
    }

    public final void d(pb30 pb30Var) {
        f4c0 f4c0Var = this.a;
        if (f4c0Var == null) {
            return;
        }
        IconStyle iconStyle = f4c0Var.m;
        if (iconStyle == null) {
            iconStyle = new IconStyle().setFlat(Boolean.FALSE).setRotationType(RotationType.ROTATE);
        }
        ImageProvider imageProvider = f4c0Var.k;
        ImageProvider imageProvider2 = pb30Var.y;
        String str = pb30Var.a;
        uz8 uz8Var = this.b;
        ImageProvider imageProvider3 = (ImageProvider) uz8Var.b.get(str);
        if (imageProvider3 == null) {
            imageProvider3 = (ImageProvider) uz8Var.c.getValue();
        }
        if (imageProvider2 != null) {
            f4c0Var.y(imageProvider2);
        } else if (imageProvider == null || !jl40.l(imageProvider.getId(), imageProvider3.getId())) {
            f4c0Var.y(imageProvider3);
        }
        float min = Math.min(Math.max(0.0f, this.f / 9.0f), 2.0f) - 1.0f;
        if (min < 0.24f) {
            min = 0.24f;
        }
        f4c0Var.D(iconStyle.setScale(Float.valueOf(min)).setVisible(Boolean.valueOf(pb30Var.c)));
        f4c0Var.k(3.0f);
    }
}
