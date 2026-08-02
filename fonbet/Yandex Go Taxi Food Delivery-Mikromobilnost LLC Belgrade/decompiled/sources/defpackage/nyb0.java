package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.mapkit.geometry.Point;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.wrap.MapObjectAccessibilityPlaceMarkView;

/* loaded from: classes6.dex */
public final class nyb0 {
    public final lyb0 a;
    public final h3y b;
    public final jyb0 c;
    public f4c0 d;
    public f4c0 e;
    public f4c0 f;
    public Integer g;

    public nyb0(lyb0 lyb0Var, h3y h3yVar, jyb0 jyb0Var) {
        this.a = lyb0Var;
        this.b = h3yVar;
        this.c = jyb0Var;
    }

    public final Bitmap a(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        lyb0 lyb0Var = this.a;
        lyb0Var.getClass();
        View view = new View(lyb0Var.a);
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        view.setMinimumWidth(width);
        view.setMinimumHeight(height);
        xw31.r(view);
        return xw31.t(view);
    }

    public final void b() {
        TaxiMapView taxiMapView;
        TaxiMapView taxiMapView2;
        TaxiMapView taxiMapView3;
        f4c0 f4c0Var = this.d;
        jyb0 jyb0Var = this.c;
        if (f4c0Var != null && (taxiMapView3 = jyb0Var.b) != null) {
            f4c0Var.u(taxiMapView3);
        }
        f4c0 f4c0Var2 = this.e;
        if (f4c0Var2 != null && (taxiMapView2 = jyb0Var.b) != null) {
            f4c0Var2.u(taxiMapView2);
        }
        f4c0 f4c0Var3 = this.f;
        if (f4c0Var3 == null || (taxiMapView = jyb0Var.b) == null) {
            return;
        }
        f4c0Var3.u(taxiMapView);
    }

    public final void c(f4c0 f4c0Var, Rect rect, String str, Integer num, sls slsVar) {
        TaxiMapView taxiMapView;
        Size size = new Size(rect.width(), rect.height());
        jyb0 jyb0Var = this.c;
        Context context = jyb0Var.a;
        if (tje.J(context) && (taxiMapView = jyb0Var.b) != null) {
            f4c0Var.E(context, taxiMapView, size, new ijs(24, slsVar));
            MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView = f4c0Var.r;
            if (mapObjectAccessibilityPlaceMarkView != null) {
                mapObjectAccessibilityPlaceMarkView.setContentDescription(str);
            }
            vyi vyiVar = new vyi(1, num);
            MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView2 = f4c0Var.r;
            if (mapObjectAccessibilityPlaceMarkView2 != null) {
                b.p(mapObjectAccessibilityPlaceMarkView2, vyiVar);
            }
        }
        jyb0Var.a(f4c0Var, (Point) f4c0Var.h);
    }

    public final void d(boolean z) {
        f4c0 f4c0Var = this.e;
        if (f4c0Var != null) {
            f4c0Var.i(z);
        }
        f4c0 f4c0Var2 = this.f;
        if (f4c0Var2 != null) {
            f4c0Var2.i(z);
        }
        if (z) {
            return;
        }
        b();
    }

    public final void e() {
        f4c0 f4c0Var = this.d;
        jyb0 jyb0Var = this.c;
        if (f4c0Var != null) {
            jyb0Var.a(f4c0Var, (Point) f4c0Var.h);
        }
        f4c0 f4c0Var2 = this.e;
        if (f4c0Var2 != null) {
            jyb0Var.a(f4c0Var2, (Point) f4c0Var2.h);
        }
        f4c0 f4c0Var3 = this.f;
        if (f4c0Var3 != null) {
            jyb0Var.a(f4c0Var3, (Point) f4c0Var3.h);
        }
    }

    public final void f() {
        f4c0 f4c0Var;
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView;
        f4c0 f4c0Var2;
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView2;
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView3;
        Integer num = this.g;
        if (num != null) {
            int intValue = num.intValue();
            f4c0 f4c0Var3 = this.d;
            if (f4c0Var3 != null && (mapObjectAccessibilityPlaceMarkView3 = f4c0Var3.r) != null) {
                mapObjectAccessibilityPlaceMarkView3.setAccessibilityTraversalAfter(intValue);
            }
        }
        f4c0 f4c0Var4 = this.d;
        if (f4c0Var4 != null && (f4c0Var2 = this.e) != null && (mapObjectAccessibilityPlaceMarkView2 = f4c0Var4.r) != null) {
            int id = mapObjectAccessibilityPlaceMarkView2.getId();
            MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView4 = f4c0Var2.r;
            if (mapObjectAccessibilityPlaceMarkView4 != null) {
                mapObjectAccessibilityPlaceMarkView4.setAccessibilityTraversalAfter(id);
            }
        }
        f4c0 f4c0Var5 = this.e;
        if (f4c0Var5 == null || (f4c0Var = this.f) == null || (mapObjectAccessibilityPlaceMarkView = f4c0Var5.r) == null) {
            return;
        }
        int id2 = mapObjectAccessibilityPlaceMarkView.getId();
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView5 = f4c0Var.r;
        if (mapObjectAccessibilityPlaceMarkView5 != null) {
            mapObjectAccessibilityPlaceMarkView5.setAccessibilityTraversalAfter(id2);
        }
    }
}
