package defpackage;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.GestureFocusPointMode;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes15.dex */
public final /* synthetic */ class eh00 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh00 b;
    public final /* synthetic */ zzs c;

    public /* synthetic */ eh00(gh00 gh00Var, zzs zzsVar, int i) {
        this.a = i;
        this.b = gh00Var;
        this.c = zzsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TaxiMapView c;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zzs zzsVar = this.c;
        gh00 gh00Var = this.b;
        switch (i) {
            case 0:
                ut7 ut7Var = gh00Var.g;
                ScreenPoint screenPoint = null;
                if (zzsVar != null && (c = ut7Var.c()) != null) {
                    Polyline polyline = a.b;
                    screenPoint = c.worldToScreen(new Point(zzsVar.a, zzsVar.b));
                }
                TaxiMapView c2 = ut7Var.c();
                if (c2 != null) {
                    c2.setGestureFocusPoint(screenPoint);
                }
                TaxiMapView c3 = ut7Var.c();
                if (c3 != null) {
                    c3.setGestureFocusPointMode(GestureFocusPointMode.AFFECTS_ALL_GESTURES);
                    break;
                }
                break;
            default:
                ut7 ut7Var2 = gh00Var.g;
                ut7Var2.getClass();
                if (zzsVar != null) {
                    Polyline polyline2 = a.b;
                    ut7Var2.l(new Point(zzsVar.a, zzsVar.b));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
