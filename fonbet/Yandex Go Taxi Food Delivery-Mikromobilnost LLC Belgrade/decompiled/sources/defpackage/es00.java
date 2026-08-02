package defpackage;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.VisibleRegion;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes9.dex */
public final class es00 {
    public static final /* synthetic */ kgx[] f = {new MutablePropertyReference1Impl(PolicyMappingsExtension.MAP, 0, "getMap()Lcom/yandex/mapkit/map/Map;", es00.class), new MutablePropertyReference1Impl("mapView", 0, "getMapView()Lru/yandex/taxi/map_common/map/TaxiMapView;", es00.class)};
    public static final CameraPosition g;
    public static final VisibleRegion h;
    public final au50 a;
    public final au50 b;
    public volatile CameraPosition c;
    public CameraPosition d;
    public Long e;

    static {
        Point point = new Point(0.0d, 0.0d);
        g = new CameraPosition(point, 0.0f, 0.0f, 0.0f);
        h = new VisibleRegion(point, point, point, point);
    }

    public es00() {
        CameraPosition cameraPosition;
        CameraPosition cameraPosition2;
        au50 au50Var = new au50(20);
        this.a = au50Var;
        this.b = new au50(20);
        kgx[] kgxVarArr = f;
        Map map = (Map) au50Var.getValue(this, kgxVarArr[0]);
        this.c = (map == null || (cameraPosition2 = map.getCameraPosition()) == null) ? g : cameraPosition2;
        Map map2 = (Map) au50Var.getValue(this, kgxVarArr[0]);
        this.d = (map2 == null || (cameraPosition = map2.getCameraPosition()) == null) ? g : cameraPosition;
    }

    public final VisibleRegion a() {
        MapWindow mapWindow;
        VisibleRegion focusRegion;
        TaxiMapView c = c();
        return (c == null || (mapWindow = c.getMapWindow()) == null || (focusRegion = mapWindow.getFocusRegion()) == null) ? h : focusRegion;
    }

    public final zzs b() {
        return a.E(this.c.getTarget(), this.e);
    }

    public final TaxiMapView c() {
        return (TaxiMapView) this.b.getValue(this, f[1]);
    }

    public final Point d(ScreenPoint screenPoint) {
        TaxiMapView c = c();
        if (c != null) {
            return c.screenToWorld(screenPoint);
        }
        return null;
    }

    public final ScreenPoint e(Point point) {
        TaxiMapView c = c();
        if (c != null) {
            return c.worldToScreen(point);
        }
        return null;
    }

    public final VisibleRegion f() {
        CameraPosition cameraPosition = this.c;
        Map map = (Map) this.a.getValue(this, f[0]);
        VisibleRegion visibleRegion = map != null ? map.visibleRegion(cameraPosition) : null;
        return visibleRegion == null ? h : visibleRegion;
    }
}
