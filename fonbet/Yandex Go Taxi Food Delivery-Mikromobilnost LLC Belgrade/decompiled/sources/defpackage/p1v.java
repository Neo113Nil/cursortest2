package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.LocalizedValueParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitWeightData;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.transport.masstransit.Weight;

/* loaded from: classes14.dex */
public final class p1v {
    public static HubRideTimeParam a(ServiceLevel.RideTime rideTime) {
        String str = rideTime.a;
        Integer num = rideTime.b;
        if (str == null || str.length() == 0 || num == null || num.intValue() <= 0) {
            return null;
        }
        int intValue = num.intValue();
        String str2 = rideTime.a;
        if (str2 == null) {
            str2 = "";
        }
        return new HubRideTimeParam(intValue, str2);
    }

    public static MapkitWeightData b(Weight weight, boolean z) {
        LocalizedValue time = weight.getTime();
        LocalizedValueParam localizedValueParam = new LocalizedValueParam(time.getValue(), time.getText());
        LocalizedValue walkingDistance = weight.getWalkingDistance();
        LocalizedValueParam localizedValueParam2 = new LocalizedValueParam(walkingDistance.getValue(), walkingDistance.getText());
        Integer valueOf = Integer.valueOf(weight.getTransfersCount());
        if (!z) {
            valueOf = null;
        }
        return new MapkitWeightData(localizedValueParam, localizedValueParam2, valueOf);
    }
}
