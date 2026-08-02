package defpackage;

import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.transport.masstransit.MasstransitLayerListener;
import com.yandex.mapkit.transport.masstransit.VehicleData;
import java.util.LinkedHashMap;
import ru.yandex.taxi.masstransit.overlay.e;

/* loaded from: classes6.dex */
public final class j631 implements MasstransitLayerListener {
    public final /* synthetic */ e a;

    public j631(e eVar) {
        this.a = eVar;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayerListener
    public final void onVehiclePlacemarkAdded(PlacemarkMapObject placemarkMapObject, VehicleData vehicleData) {
        e eVar = this.a;
        LinkedHashMap linkedHashMap = eVar.n;
        if (!vehicleData.isValid() || !placemarkMapObject.isValid()) {
            linkedHashMap.remove(placemarkMapObject);
        } else {
            e.a(eVar, placemarkMapObject, vehicleData);
            linkedHashMap.put(placemarkMapObject, vehicleData);
        }
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayerListener
    public final void onVehiclePlacemarkDirectionUpdated(PlacemarkMapObject placemarkMapObject, VehicleData vehicleData) {
        e eVar = this.a;
        LinkedHashMap linkedHashMap = eVar.n;
        if (!vehicleData.isValid() || !placemarkMapObject.isValid()) {
            linkedHashMap.remove(placemarkMapObject);
        } else {
            e.a(eVar, placemarkMapObject, vehicleData);
            linkedHashMap.put(placemarkMapObject, vehicleData);
        }
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayerListener
    public final void onVehiclePlacemarkRemoved(PlacemarkMapObject placemarkMapObject, VehicleData vehicleData) {
        this.a.n.remove(placemarkMapObject);
    }
}
