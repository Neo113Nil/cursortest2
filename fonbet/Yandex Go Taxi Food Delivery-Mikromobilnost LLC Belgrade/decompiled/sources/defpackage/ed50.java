package defpackage;

import com.yandex.go.navigator.ui.NavigatorMapStyleRepository$attach$$inlined$safeCollectIn$1;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.style.domain.a;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes12.dex */
public final class ed50 implements wa50 {
    public final bt00 a;
    public final ah00 b;
    public final a c;
    public final hbp0 d;
    public String e;

    public ed50(bt00 bt00Var, ah00 ah00Var, a aVar) {
        this.a = bt00Var;
        this.b = ah00Var;
        this.c = aVar;
        String name = (2 & 1) != 0 ? null : ed50.class.getName();
        this.d = new hbp0(new czo0(14), name == null ? "" : name, null);
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void attach() {
        js00 mapStyleConfig;
        TaxiMapView h = ((gh00) this.b).h();
        this.e = (h == null || (mapStyleConfig = h.getMapStyleConfig()) == null) ? null : mapStyleConfig.b;
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        ((e) this.a).d("default");
        tje.N(hbp0Var.c(), null, null, new NavigatorMapStyleRepository$attach$$inlined$safeCollectIn$1(this.c.a(), null, this), 3);
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void detach() {
        MapWindow mapWindow;
        Map map;
        this.d.b();
        gh00 gh00Var = (gh00) this.b;
        TaxiMapView h = gh00Var.h();
        if (h != null) {
            h.restoreDefaultMode();
        }
        TaxiMapView h2 = gh00Var.h();
        if (h2 != null && (mapWindow = h2.getMapWindow()) != null && (map = mapWindow.getMap()) != null) {
            map.setHdModeEnabled(false);
            String str = this.e;
            if (str != null) {
                map.setMapStyle(str);
            }
        }
        ((e) this.a).b();
    }
}
