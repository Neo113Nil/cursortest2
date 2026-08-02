package defpackage;

import com.yandex.go.places.impl.ui.main.map.overlay.a;
import com.yandex.go.places.impl.ui.main.map.overlay.b;
import com.yandex.go.places.impl.ui.main.map.overlay.c;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes13.dex */
public final class pac0 implements oac0 {
    public final /* synthetic */ c a;

    public pac0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.oac0
    public final void deselectGeoObject() {
        MapWindow mapWindow;
        Map map;
        TaxiMapView h = ((gh00) ((ah00) this.a.b)).h();
        if (h == null || (mapWindow = h.getMapWindow()) == null || (map = mapWindow.getMap()) == null) {
            return;
        }
        map.deselectGeoObject();
    }

    @Override // defpackage.oac0
    public final void q9(boolean z) {
        c cVar = this.a;
        a aVar = cVar.B;
        b bVar = cVar.A;
        ah00 ah00Var = (ah00) cVar.b;
        if (z) {
            ((gh00) ah00Var).d(bVar);
            ((gh00) ah00Var).c(aVar);
        } else {
            ((gh00) ah00Var).t(bVar);
            ((gh00) ah00Var).s(aVar);
        }
    }

    @Override // defpackage.oac0
    public final void selectGeoObject(GeoObjectSelectionMetadata geoObjectSelectionMetadata) {
        MapWindow mapWindow;
        Map map;
        TaxiMapView h = ((gh00) ((ah00) this.a.b)).h();
        if (h == null || (mapWindow = h.getMapWindow()) == null || (map = mapWindow.getMap()) == null) {
            return;
        }
        map.selectGeoObject(geoObjectSelectionMetadata);
    }
}
