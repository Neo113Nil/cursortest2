package defpackage;

import com.yandex.go.pickuppoints.impl.l;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes13.dex */
public final class crb0 implements brb0 {
    public final l a;
    public final ah00 b;

    public crb0(l lVar, ah00 ah00Var) {
        this.a = lVar;
        this.b = ah00Var;
    }

    public final void a(zzs zzsVar, List list, float f, m8t0 m8t0Var) {
        MapWindow mapWindow;
        Map map;
        CameraPosition cameraPosition;
        MapWindow mapWindow2;
        Map map2;
        MapWindow mapWindow3;
        Iterator it = list.iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        while (it.hasNext()) {
            wpb0 wpb0Var = (wpb0) it.next();
            double abs = Math.abs(zzsVar.a - wpb0Var.b.a);
            double abs2 = Math.abs(zzsVar.b - wpb0Var.b.b);
            if (abs > d) {
                d = abs;
            }
            if (abs2 > d2) {
                d2 = abs2;
            }
        }
        double d3 = zzsVar.a;
        double d4 = zzsVar.b;
        BoundingBox boundingBox = new BoundingBox(new Point(d3 - d, d4 - d2), new Point(zzsVar.a + d, d4 + d2));
        gh00 gh00Var = (gh00) this.b;
        TaxiMapView h = gh00Var.h();
        ScreenRect screenRect = null;
        ScreenRect focusRect = (h == null || (mapWindow3 = h.getMapWindow()) == null) ? null : mapWindow3.getFocusRect();
        if (focusRect != null) {
            float y = focusRect.getBottomRight().getY() - focusRect.getTopLeft().getY();
            float x = focusRect.getBottomRight().getX() - focusRect.getTopLeft().getX();
            if (y > x) {
                screenRect = focusRect;
            } else {
                ScreenPoint screenPoint = new ScreenPoint(focusRect.getTopLeft().getX(), Float.max(0.0f, (((focusRect.getBottomRight().getY() - focusRect.getTopLeft().getY()) / 2.0f) + focusRect.getTopLeft().getY()) - (x / 2.0f)));
                screenRect = new ScreenRect(screenPoint, new ScreenPoint(screenPoint.getX() + x, screenPoint.getY() + x));
            }
        }
        if (screenRect != null) {
            TaxiMapView h2 = gh00Var.h();
            if (h2 == null || (mapWindow2 = h2.getMapWindow()) == null || (map2 = mapWindow2.getMap()) == null || (cameraPosition = map2.cameraPosition(Geometry.fromBoundingBox(boundingBox), screenRect)) == null) {
                return;
            }
        } else {
            TaxiMapView h3 = gh00Var.h();
            if (h3 == null || (mapWindow = h3.getMapWindow()) == null || (map = mapWindow.getMap()) == null || (cameraPosition = map.cameraPosition(Geometry.fromBoundingBox(boundingBox))) == null) {
                return;
            }
        }
        if (cameraPosition.getZoom() < f || cameraPosition.getZoom() > 17.0f) {
            if (cameraPosition.getZoom() >= f) {
                f = 17.0f;
            }
            cameraPosition = new CameraPosition(cameraPosition.getTarget(), f, cameraPosition.getAzimuth(), cameraPosition.getTilt());
        }
        gh00Var.H(cameraPosition);
        if (m8t0Var != null) {
            m8t0Var.run();
        }
    }
}
