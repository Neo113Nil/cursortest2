package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import java.util.Map;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class ozs implements GeoObjectTapListener {
    public final /* synthetic */ pzs a;

    public ozs(pzs pzsVar) {
        this.a = pzsVar;
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapListener
    public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
        yeo yeoVar;
        pzs pzsVar = this.a;
        try {
            GeoObject geoObject = geoObjectTapEvent.getGeoObject();
            Map d = rsq0.d(pzsVar.d.a(ReferenceType.GEO_OBJECT, geoObject), geoObject);
            if ((d instanceof zy11) || (yeoVar = pzsVar.b) == null) {
                return false;
            }
            yeoVar.success(d);
            return false;
        } catch (Throwable th) {
            yeo yeoVar2 = pzsVar.b;
            if (yeoVar2 == null) {
                return false;
            }
            yeoVar2.error(pzs.class.getSimpleName(), ljo.b(th), null);
            return false;
        }
    }
}
