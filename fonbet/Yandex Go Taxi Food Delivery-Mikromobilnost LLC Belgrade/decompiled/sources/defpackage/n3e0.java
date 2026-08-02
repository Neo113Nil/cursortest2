package defpackage;

import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PolygonMapObject;

/* loaded from: classes6.dex */
public final class n3e0 extends y3r {
    public n3e0(Polygon polygon) {
        super(polygon, PolygonMapObject.class);
    }

    @Override // defpackage.u15
    public final MapObject l(BaseMapObjectCollection baseMapObjectCollection, Object obj) {
        return ((MapObjectCollection) baseMapObjectCollection).addPolygon((Polygon) obj);
    }

    @Override // defpackage.u15
    public final void n(MapObject mapObject, Object obj) {
        PolygonMapObject polygonMapObject = (PolygonMapObject) mapObject;
        Polygon polygon = (Polygon) obj;
        if (polygon.getOuterRing().getPoints().size() > 2) {
            polygonMapObject.setGeometry(polygon);
        }
    }

    @Override // defpackage.lvu0
    public final void q(MapObject mapObject, float f) {
        ((PolygonMapObject) mapObject).setStrokeWidth(f);
    }

    @Override // defpackage.y3r
    public final void s(MapObject mapObject, int i) {
        ((PolygonMapObject) mapObject).setFillColor(i);
    }

    @Override // defpackage.y3r
    public final void t(MapObject mapObject, boolean z) {
        ((PolygonMapObject) mapObject).setGeodesic(z);
    }

    @Override // defpackage.y3r
    public final void v(MapObject mapObject, int i) {
        ((PolygonMapObject) mapObject).setStrokeColor(i);
    }
}
