package defpackage;

import android.content.Context;
import com.yandex.mapkit.directions.driving.RouteHelper;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamStyle;
import com.yandex.mapkit.navigation.JamType;
import com.yandex.mapkit.navigation.JamTypeColor;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes6.dex */
public abstract class a35 extends zyg {
    public final ah00 a;
    public final zuj0 b;
    public final Context c;
    public JamStyle d;
    public int e;
    public js00 f;

    public a35(ah00 ah00Var, zuj0 zuj0Var, Context context) {
        Integer S;
        this.a = ah00Var;
        this.b = zuj0Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        e(hashSet);
        this.d = !el00.a ? null : new JamStyle((List<JamTypeColor>) a.J0(hashSet));
        js00 d = d();
        String str = d != null ? d.e : null;
        int t = qje.t(xng0.bgMain, context);
        if (str != null) {
            String str2 = evu0.J(str) ? null : str;
            if (str2 != null && (S = q5z.S(str2)) != null) {
                t = S.intValue();
            }
        }
        this.e = t;
    }

    @Override // defpackage.zyg
    public void b(w4e0 w4e0Var, int i) {
        js00 d = d();
        if (d == null) {
            return;
        }
        JamStyle jamStyle = this.d;
        if (jamStyle != null) {
            w4e0Var.y = jamStyle;
            MapObject mapObject = w4e0Var.g;
            if (mapObject != w4e0Var.a) {
                PolylineMapObject polylineMapObject = (PolylineMapObject) mapObject;
                if (el00.a) {
                    RouteHelper.applyJamStyle(polylineMapObject, jamStyle);
                }
            } else {
                jst.e.r("delegate is empty! Attach this object to collection", new IllegalStateException());
            }
        }
        w4e0Var.y(this.e);
        w4e0Var.v(d.f);
        w4e0Var.p(d.c);
        w4e0Var.z(d.d);
    }

    public final JamTypeColor c(JamType jamType, int i) {
        Integer S;
        js00 d = d();
        String str = d == null ? null : (String) d.g.get(jamType.name().toLowerCase(Locale.getDefault()));
        int a = ((avj0) this.b).a(i);
        if (str != null) {
            String str2 = evu0.J(str) ? null : str;
            if (str2 != null && (S = q5z.S(str2)) != null) {
                a = S.intValue();
            }
        }
        return new JamTypeColor(jamType, a);
    }

    public final js00 d() {
        js00 js00Var = this.f;
        if (js00Var == null) {
            TaxiMapView h = ((gh00) this.a).h();
            js00Var = h != null ? h.getMapStyleConfig() : null;
        }
        this.f = js00Var;
        return js00Var;
    }

    public void e(HashSet hashSet) {
        hashSet.add(c(JamType.FREE, qqg0.route_jams_free));
        hashSet.add(c(JamType.LIGHT, qqg0.route_jams_free));
        hashSet.add(c(JamType.HARD, qqg0.route_jams_hard));
        hashSet.add(c(JamType.VERY_HARD, qqg0.route_jams_very_hard));
        hashSet.add(c(JamType.BLOCKED, qqg0.route_jams_blocked));
        hashSet.add(c(JamType.UNKNOWN, qqg0.route_jams_unknown));
    }
}
